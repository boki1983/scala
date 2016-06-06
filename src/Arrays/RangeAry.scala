/**
  * Created by boki on 6/6/16.
  */
import Array._

object RangeAry {
  def main(args: Array[String]) {
    // range() method to generate an array containing a sequence of increasing integers in a given range
    var myList1 = range(10, 20, 2)
    var myList2 = range(10,20)

    // Print all the array elements
    for ( x <- myList1 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList2 ) {
      print( " " + x )
    }
  }
}
