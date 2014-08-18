package schedule



class DynamicJob {
    def batchService
    static triggers = {
//      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute(context) {
        println context.mergedJobDataMap.get('batch')
		if("MorningBatch" == context.mergedJobDataMap.get('batch'))
		{
			print "inside morningbatch"
			batchService.updatePersonB();
		}
		else if("EveningBatch" == context.mergedJobDataMap.get('batch'))
		{
			print "inside eveningbatch"
			batchService.updatePersonC();
		}
    }
}
