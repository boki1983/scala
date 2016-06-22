/**
  * Created by bernie on 2016/6/7.
  */

object CollectionsTest {
  def main(args: Array[String]) {
    // Lazy collections have elements that may not consume memory until they are accessed, like Ranges
    val r = 1 to 10 by 2
    println(r)

    // mutable collection
    var mutableSet = scala.collection.mutable.Set(1,2,3)
    mutableSet += 4

    // immutable collection
    val immutableSet = scala.collection.immutable.Set(3,2,1)
    // immutableSet += 0

    println(immutableSet, mutableSet)
  }
}