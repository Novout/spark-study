package template.spark

import org.apache.spark.sql.functions._

import area.{AreaGovernment => Area}

object Main extends InitSpark {
  def main(args: Array[String]) = {
    import spark.implicits._

    val js = sqlContext.read.json("users.json")

    js.select("color").show(1)

    close
  }
}
