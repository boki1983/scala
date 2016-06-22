/**
  * Created by bernie on 2016/6/22.
  */

/*A trait encapsulates method and field definitions, which can then be reused by mixing them into classes
Scala also allows traits to be partially implemented but traits may not have constructor parameters.*/
// like java 8 interface default method
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  // isInstanceOf == java is instance of
  // asInstanceOf == java (T) obj
  // ??
  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
}

object TraitDemo {
  def main(args: Array[String]) {
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

  }
}



