/**
  * Created by bernie on 2016/6/24.
  */

object tupleDemo {
  def main(args: Array[String]) {
    // Tuple 是一種固定長度，但每個元素可以是不同型別的容器
    val quadUsingTuple = ("Hello", 0.5, 300, 'C')
    val quadUsingNew = new Tuple4[String, Double, Int, Char]("Hello", 0.5, 300, 'C')

    println(quadUsingTuple)
    println(quadUsingNew)
    println(quadUsingTuple == quadUsingNew)

    // Tuple 物件的每一個元素都對應到一個成員變數：第一個元素的名稱叫 _1 ...
    println(quadUsingTuple._1)
    println(quadUsingTuple._4)


    val (myString, myDobule, myInt, myChar) = ("Hello", 0.5, 300, 'C')
    println(myString)
    println(myInt)


  }
}