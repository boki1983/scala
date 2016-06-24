/**
  * Created by bernie on 2016/6/23.
  */

object ReDemo {
  def main(args: Array[String]) {
    // r() converts the String to a RichString and invokes that method to get an instance of Regex
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"

    println(pattern replaceFirstIn(str, "Java"))
  }
}