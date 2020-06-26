package src.main.scala

object FibonacciDemo extends App {

    def fibForm(a: Int, b: Int): Stream[Int] = a #:: fibForm(b, a+b)
    //val f = fibForm(1,2)
    fibForm(1,2).takeWhile(_<2000) foreach println
}
