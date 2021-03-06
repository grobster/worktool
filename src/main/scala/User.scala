package info

import PhoneNumber._

case class User(lastName: String, firstName: String, emailAddress: String, phoneNumber: String)

case class Asset(make: String, model: String, serialNumber: String, assetNumber: String)

case class Request(number: Long, user: User, asset: Asset, problem: String, notes: Option[String])

object User {
	def findByLastName(lastName: String, users: List[User]): List[User] = users.filter(u => u.lastName.toLowerCase == lastName.toLowerCase)
	
	def findByFirstName(firstName: String, users: List[User]): List[User] = users.filter(u => u.firstName.toLowerCase == firstName.toLowerCase)
	
	def findByEmailAddress(emailAddress: String, users: List[User]): Option[User] = users.filter(u => u.emailAddress.toLowerCase == emailAddress.toLowerCase).headOption
	
	def findByPhoneNumber(number: String, users: List[User]): List[User] = users.filter(u => parseNumber(u.phoneNumber) == parseNumber(number))

}

object PhoneNumber {
	def parseNumber(text: String): String = text.filter(c => Character.isDigit(c)).foldRight("")(_ + _)

}