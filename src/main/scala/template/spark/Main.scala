package template.spark

import org.apache.spark.sql.functions._

import person._
import bank._
import stack._

object Main extends InitSpark {
  def main(args: Array[String]) = {
    import spark.implicits._

    val stack = new Stack[Person]
    val person = new Person("Giovane", "Cardoso", "Brasil", 18, BankAccount(1, 500) )

    stack.push(person)

    val data = Array(stack.pop().account.id,2, 3, 4, 5)
    val distData = sc.parallelize(data, 10)

    println(distData)

    close
  }
}
