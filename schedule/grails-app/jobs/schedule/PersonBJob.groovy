package schedule



class PersonBJob {
    def batchService
	static triggers = {
//	  simple name: 'mySimpleTrigger', startDelay: 60000, repeatInterval: 36000000 
//		cron name: 'eveningjob', startDelay:10000, cronExpression: '* 0/2 * * * ?'	
		
	}
	def group = "MyGroup"
	def description = "Example job with Simple Trigger"
	
	def execute(){
	  print "Job run!"

//	  println context.mergedJobDataMap.get(‘myData’)
	  batchService.updatePersonC();
//	  println context.mergedJobDataMap.get('foo')
	  
	  
	}
}
