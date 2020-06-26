package src.main.scala.work

import scala.io.Source
import java.lang.Long

object ConvertAccountIdForBank extends App {

  //TODO:update the file location
  val matchedSuppliers = Source.fromFile("D:\\Niket\\bankSupplierMatchedList").getLines.toList
  val rejectedSuppliers = Source.fromFile("D:\\Niket\\bankSupplierRejectedList").getLines.toList

  def convertAccountIdForCDC(supplier: String, accountId: String): String = {
    val result = "Result: "
    if (rejectedSuppliers.contains(supplier)) {
      result + "Rejected"
    } else {
      if (accountId != null && !accountId.isEmpty) {
        var hex: String = ""
        if (accountId.length > 70) {
          hex = accountId.substring(0, 24)
        } else {
          hex = accountId
        }
        if (matchedSuppliers.contains(supplier)) {
          val str = Long.parseLong(hex.substring(16, hex.length), 16) + ""

          var str1 = "0"
          1 to (7 - str.length) foreach { _ => str1 += "0" }
          result + toAscii(hex.substring(0, 4)) + hex.substring(4, 15) + str1 + str
        } else {
          result + toAscii(hex)
        }
      } else {
        result + "Empty AccountId"
      }
    }
  }

  def toAscii(hex: String): String = {
    val len = hex.length
    val data = new Array[Byte](len / 2)
    var i = 0
    while ( {
      i < len
    }) {
      data(i / 2) = ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16)).toByte

      i += 2
    }
    new String(data, "Cp273")
  }

  import scala.io.Source

  //TODO:update the file location
  //Testing: file should be in hex, supplier format eg.
  val filename = "D:\\Niket\\accoundId.txt"
  for (line <- Source.fromFile(filename).getLines) {
    if (line != null && !line.isEmpty) {
      val input = line.split(",")
      //println(convertAccountIdForCDC(input(1), input(0)))
    }
  }
  //println(convertAccountIdForCDC("800571", "F0F073250534151F000055F340404040404040404040404040404040404040404040404040404040"))
  //println(convertAccountIdForCDC("800572", "C1C6F0F0F0F1"))
  //exceptional accountId = F0F2F5F5F8F9F6F7E3D3404040404040404040404040404040404040404040404040404040404040
  println(convertAccountIdForCDC("800571", "F0F2F5F5F8F9F6F7E3D3404040404040404040404040404040404040404040404040404040404040"))
  println(convertAccountIdForCDC("800571", "F0F073250534151F000055F340404040404040404040404040404040404040404040404040404040"))


}


