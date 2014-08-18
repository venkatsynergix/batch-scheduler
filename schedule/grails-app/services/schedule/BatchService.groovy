package schedule

import grails.transaction.Transactional

@Transactional
class BatchService {

	def serviceMethod() {
	}



	def updatePersonB() {

		print "inside updateTableB"
		def persona = PersonA.findAll()

		print "before personB update"
		def personb
		for( perso in persona){
			println perso
			println perso.firstName
			personb = new PersonB(
					firstName:perso.firstName,
					lastName:perso.lastName,
					dateOfBirth:(new Date() - 365*30),
					gender:perso.gender,
					address:perso.address,
					)
			personb.save()
		}
		//	MyJob.triggerNow([foo:"It Works!"])

		print "after personb update"

	}

	def updatePersonC() {

		print "inside updatePersonC"
		def persona = PersonA.findAll()

		print "before personc update"
		def personc
		for( perso in persona){
			println perso
			println perso.firstName
			personc = new PersonC(
					firstName:perso.firstName,
					lastName:perso.lastName,
					dateOfBirth:(new Date() - 365*30),
					gender:perso.gender,
					address:perso.address,
					)
			personc.save()
		}
		//	MyJob.triggerNow([foo:"It Works!"])

		print "after personc update"

	}
	
}
