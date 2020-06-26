package src.main.scala.main.scala.functions

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.{Calendar, Date}

object DateFormatTest extends App {
  val DATE_FORMAT = "MMM YYYY"

  val format = new SimpleDateFormat("MMM yyyy")
  val currentDate = format.format(Calendar.getInstance().getTime())
 val milliseconds = format.parse(currentDate).getTime-format.parse("Dec 2020").getTime
  println(milliseconds)
  val c = Calendar.getInstance()
  c.setTimeInMillis(milliseconds)
  println(c.get(Calendar.YEAR))
  //ChronoUnit.DAYS.between(format.parse("Dec 2020"),format.parse(currentDate))

  def validateArchivedate(archiveDate: String, establishMentDate: String): Long = {
    val format1 = new SimpleDateFormat("MMMyyyy")
    val format2 = new SimpleDateFormat("MM/DD/yyyy")
    return format1.parse(archiveDate).getYear - format2.parse(establishMentDate).getYear
  }
  println(validateArchivedate("Dec 2020", "5/29/2045"))

}