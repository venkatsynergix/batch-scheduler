import grails.util.GrailsUtil
import schedule.JobInterval
import schedule.PersonA

class BootStrap {

    def init = { servletContext ->
		
		
		
		
				switch(GrailsUtil.environment){
					case "development":
						def jane = new PersonA(
						firstName:"Jane",
						lastName:"Doe",
						dateOfBirth:(new Date() - 365*30),
						gender:"F",
						address:"123 Main St"
						)
						jane.save()
						if(jane.hasErrors()){
							println jane.errors
						}
		
						def venkat = new PersonA(
								firstName:"Venkata",
								lastName:"Siva",
								dateOfBirth:(new Date() - 365*30),
								gender:"M",
								address:"Whitefiled"
								)
						venkat.save()
						if(venkat.hasErrors()){
							println venkat.errors
						}
		
						def batch1 = new JobInterval(
								batchName:"MorningBatch",
								intervalTime:11,
		
								)
						batch1.save()
						if(batch1.hasErrors()){
							println batch1.errors
						}
						def batch2 = new JobInterval(
								batchName:"EveningBatch",
								intervalTime:16,
		
								)
						batch2.save()
						if(batch2.hasErrors()){
							println batch2.errors
						}
		
						break
					case "production" : break
				}
    }
    def destroy = {
    }
}
