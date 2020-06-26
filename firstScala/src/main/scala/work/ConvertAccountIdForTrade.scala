package src.main.scala.work

import java.text.SimpleDateFormat
import java.util.Calendar

import scala.io.Source


object ConvertAccountIdForTrade extends App {

  def convertAccountIdForTrade(supplier: String, accountId: String): String = {
    val result = "Result: "
    //TODO:update the file location
    if (Source.fromFile("D:\\Niket\\tradeSupplierCompressedList") != null && !Source.fromFile("D:\\Niket\\tradeSupplierCompressedList").isEmpty) {
      val tradeCompressedSuppliers = Source.fromFile("D:\\Niket\\tradeSupplierCompressedList").getLines.toList
      if (tradeCompressedSuppliers.contains(supplier)) {
        val format = new SimpleDateFormat("yyyyMMdd")
        result + "Rejected ("+supplier + "#" + format.format(Calendar.getInstance().getTime())+")"
      } else {
        result + accountId.replaceAll("[^\\p{ASCII}]", " ").replaceAll("\\s+$","")
      }
    } else {
      result + " Trade compressed supplier list is empty"
    }
  }

  println(convertAccountIdForTrade("800586", "00"))
  println(convertAccountIdForTrade("971065", "1234\u00DD\u00FB\u00C9"))
//TLSCORPÝGREA
  println(convertAccountIdForTrade("806788", "EVERTT-WTÝ"))
  println(convertAccountIdForTrade("801444", "TLSCORPÝGREA"))
  println(convertAccountIdForTrade("801444", "123\u00FB\u00C9\u00CD4"))



}
