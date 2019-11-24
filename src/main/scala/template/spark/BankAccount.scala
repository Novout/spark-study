package bank

abstract class Bank {
  def id: Int
  def balance: Int
}

case class BankAccount(id: Int, balance: Int) extends Bank