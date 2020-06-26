package src.main.scala.work

import scala.io.Source

object ConvertAccountIdForCollections extends App {

  def convertAccountIdForCollections(supplier: String, accountId: String): String = {
    val result = "Result: "
    //TODO:update the file location
    if (Source.fromFile("D:\\Niket\\collectionsSupplierRejectedList") != null && !Source.fromFile("D:\\Niket\\collectionsSupplierRejectedList").isEmpty) {
      val collectionsCompressedSuppliers = Source.fromFile("D:\\Niket\\collectionsSupplierRejectedList").getLines.toList
      if (collectionsCompressedSuppliers.contains(supplier)) {
        result + "Rejected"
      } else {
        result + accountId
      }
    } else {
      result + "Collections supplier list is empty"
    }
  }

  println(convertAccountIdForCollections("603821", "AA421620"))
}
