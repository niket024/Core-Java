package src.main.scala

object PrintDemo extends App {
  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")
  println("\nStep 2: Using String interpolation on object properties")

  case class Donut(name: String, tasteLevel: String)

  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")

  println("Step 1: How to escape a Json String")
  //val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"

  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")

  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin
  println(s"donutJson4 = $donutJson4")

  println("\nTip: stripMargin using a different character")
  val donutJson5: String =
    """
  #{
  #"donut_name":"Glazed Donut",
  #"taste_level":"Very Tasty",
  #"price":2.50
  #}
  """.stripMargin('#')
  println(s"donutJson5 = $donutJson5")

}
