package src.main.scala

object LazyEvalDemo extends App {
  val s1 = check1(4)+check1(3)
  //if you not used s2 then no evaluation

  lazy val s2 = check1(4)+check1(3)

  def check1( param1: Int): Int = {
    println(s"parameter 1: ${param1}")
    return param1
  }
  println(s2)
  //this time it will not evaluate check1
  println(s2)

}
