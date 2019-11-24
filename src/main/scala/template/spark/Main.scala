package template.spark

import org.apache.spark.sql.functions._

import area.{AreaGovernment => Area}

object Main extends InitSpark {
  def main(args: Array[String]) = {
    import spark.implicits._

    val area = reader.csv("LAG.csv").as[Area]
    area.show(953)

    close
  }
}
