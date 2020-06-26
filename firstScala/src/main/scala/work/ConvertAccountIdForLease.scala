package src.main.scala.work

import scala.io.Source

object ConvertAccountIdForLease extends App {

  def convertAccountIdForLease(supplier: String, accountId: String): String = {
    val result = "Result: "
    if (Source.fromFile("D:\\Niket\\leaseSupplierRejectedList") != null && !Source.fromFile("D:\\Niket\\leaseSupplierRejectedList").isEmpty) {
      val leaseCompressedSuppliers = Source.fromFile("D:\\Niket\\leaseSupplierRejectedList").getLines.toList
      if (leaseCompressedSuppliers.contains(supplier)) {
        result + "Rejected"
      } else {
        result + accountId
      }
    } else {
      result + "Lease supplier list is empty"
    }

  }

  println(convertAccountIdForLease("902017", "01"))
}
