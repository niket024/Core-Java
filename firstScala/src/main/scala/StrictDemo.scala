package src.main.scala

object StrictDemo extends App {
  var s = 5
  //it will call 4 times check1
  def twice1 (f: =>Int) = {
    println("I am from twice")
    f+f
  }
  //it will call 2 times check1
  //here the parameter value is cached
  def twice2 (f: =>Int) = {
    lazy val i = f
    println("I am from twice")
    i+i
  }
  println(twice1({check1(12)/check1(4)}))
  println(twice2({check1(12)/check1(4)}))


  def check1( param1: Int): Int = {
    println(s"parameter 1: ${param1}")
    return param1
  }

}
