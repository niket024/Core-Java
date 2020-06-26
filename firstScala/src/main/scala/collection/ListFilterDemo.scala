package src.main.scala.collection

object ListFilterDemo extends App {
  val list = List.range(1, 100)
  //println(list)

  //filter only square root no.
  val list1 = list.filter(number => Math.sqrt(number).isWhole())
  println(list1)

  //filter only square root no.
  val list2 = list.filterNot(number => Math.sqrt(number).isWhole())
  println(list2)

  val books = List(new Book("Scala become easy", 30.89),
    new Book("Scala good to learn", 22.89),
    new Book("Scala only", 44.89),
    new Book("Scala fun", 12.89),
    new Book("Scala with scaling", 34.89))
  val filteredBook = books.filter(book => book.price < 30).map(inst => inst.name)
  println(filteredBook)

  val notFilteredBook = books.filter(book => book.price < 30).map(inst => inst.name)
  println(notFilteredBook)

  //it will return the first occurrence if not found return none
  books.find(book=>book.price<30).map(book=>book.name).foreach(println)
  //return true if exist else false
  println(books.exists(book=>book.price<30))

  val list3 = list.partition(number=>Math.sqrt(number).isWhole)
  println(list3)
  println(list3._1)


}

class Book(val name: String, val price: Double) {

}
