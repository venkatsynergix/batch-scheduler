package schedule

import java.util.Date;

class PersonB {
	String firstName
	String lastName
	Date dateOfBirth
	String gender
	String address

	static constraints = {
		firstName(blank:false,, unique:true)
		lastName(blank:false)
		dateOfBirth()
		gender(inList:["M", "F"])
		address()
	}
	
	String toString(){
		"${lastName}, ${firstName}"
	}
    
}
