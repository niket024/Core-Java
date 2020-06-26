package src.main.scala

object ScalaDataTypesDemo extends App {
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()
  println("nikk")

  //declare with no initialization
  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"

  //Scala is smart to give the variables data type according to value
  println("\nStep 2: Scala Types")
  val donutsBoughtToday1 = 5
  val bigNumberOfDonuts1 = 100000000L
  val smallNumberOfDonuts1 = 1
  val priceOfDonut1 = 2.50
  val donutPrice1 = 2.50f
  val donutStoreName1 = "Allaboutscala Donut Store"
  val donutByte1 = 0xa
  val donutFirstLetter1 = 'D'
  val nothing1 = ()

  //Using Scala compiler to convert from one data type to another
  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts
  //Any data types
  val priceOfDonut11: Any = 2.50
  println(priceOfDonut11)
}
