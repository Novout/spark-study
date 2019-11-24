package person

import bank.BankAccount

final case class Person(firstName: String, lastName: String,
                        country: String, age: Int, 
                        account: BankAccount)