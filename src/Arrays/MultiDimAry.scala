/**
  * Created by boki on 6/6/16.
  */

// _ is wildcard
import Array._

object MultiDimAry {
  def main(args: Array[String]) {

    var myMatrix = Array.ofDim[Int](3,3);
    // build a matrix
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix = j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
}