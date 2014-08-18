package schedule

class JobInterval {
	
	String batchName
	Integer intervalTime
	

    static constraints = {
		batchName(blank:false, unique:true)
		intervalTime(min:0, max:23)
    }
	
	String toString(){
		batchName
		}
}
