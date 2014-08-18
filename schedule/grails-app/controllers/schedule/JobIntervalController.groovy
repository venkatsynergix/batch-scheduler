package schedule


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class JobIntervalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond JobInterval.list(params), model:[jobIntervalInstanceCount: JobInterval.count()]
    }

    def show(JobInterval jobIntervalInstance) {
        respond jobIntervalInstance
    }

    def create() {
        respond new JobInterval(params)
    }

    @Transactional
    def save(JobInterval jobIntervalInstance) {
        if (jobIntervalInstance == null) {
            notFound()
            return
        }

        if (jobIntervalInstance.hasErrors()) {
            respond jobIntervalInstance.errors, view:'create'
            return
        }

        jobIntervalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'jobInterval.label', default: 'JobInterval'), jobIntervalInstance.id])
                redirect jobIntervalInstance
            }
            '*' { respond jobIntervalInstance, [status: CREATED] }
        }
    }

    def edit(JobInterval jobIntervalInstance) {
        respond jobIntervalInstance
    }

    @Transactional
    def update(JobInterval jobIntervalInstance) {
        if (jobIntervalInstance == null) {
            notFound()
            return
        }

        if (jobIntervalInstance.hasErrors()) {
            respond jobIntervalInstance.errors, view:'edit'
            return
        }

        jobIntervalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'JobInterval.label', default: 'JobInterval'), jobIntervalInstance.id])
                redirect jobIntervalInstance
            }
			
			print "before corn"
//			def inter = JobInterval.findAll()
			def inter =  JobInterval.first()
//			print jobIntervalInstance.id
			print inter.intervalTime
			if(1 == jobIntervalInstance.id )
			{
			 DynamicJob.schedule(inter.intervalTime+' * * * * ?',[batch:"MorningBatch"])
			}
			else if(2 == jobIntervalInstance.id )
			{
			 DynamicJob.schedule('0 '+inter.intervalTime+' * * * ?',[batch:"EveningBatch"])
			}
			
            '*'{ respond jobIntervalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(JobInterval jobIntervalInstance) {

        if (jobIntervalInstance == null) {
            notFound()
            return
        }

        jobIntervalInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'JobInterval.label', default: 'JobInterval'), jobIntervalInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'jobInterval.label', default: 'JobInterval'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
