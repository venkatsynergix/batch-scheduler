//package schedule
//
//
//
//class MyJob {
//    static triggers = {
//      simple repeatInterval: 5000l // execute job once in 5 seconds
//    }
//
//    def execute() {
//        // execute job
//    }
//}

package schedule


class MyJob {
	def batchService
	static triggers = {
//	  simple name: 'mySimpleTrigger', startDelay: 60000, repeatInterval: 36000000 
//		cron name: 'morningjob', startDelay:10000, cronExpression: '* 0/10 * * * ?'	
		
	}
	def group = "MyGroup"
	def description = "Example job with Simple Trigger"
	
	def execute(){
	  print "Job run!"

//	  println context.mergedJobDataMap.get(‘myData’)
	  batchService.updatePersonB();
//	  println context.mergedJobDataMap.get('foo')
	  
	  
	}
  }
  
  
  

