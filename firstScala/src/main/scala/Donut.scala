package src.main.scala

object Donut extends Enumeration {

  type Donut = Value

  val Glazed      = Value("Glazed")
  val Strawberry  = Value("Strawberry")
  val Plain       = Value("Plain")
  val Vanilla     = Value("Vanilla")
  def main(args: Array[String]): Unit = {
    println("\nStep 2: How to print the String value of the enumeration")
    println(s"Vanilla Donut string value = ${Donut.Vanilla}")
  }

}
