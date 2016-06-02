/**
  * Created by boki on 6/2/16.
  */

object Test {
  def main(args: Array[String]) {
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }
/*  A closure is a function, whose return value depends on
  the value of one or more variables declared outside this function.*/
  var factor = 3
  val multiplier = (i:Int) => i * factor
}
