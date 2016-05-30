/**
  * Created by boki on 5/30/16.
  */
object Test {
  def main(args: Array[String]) {
    // invoking method
    println( "Returned Value : " + addInt(5,7) );
  }
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
}
