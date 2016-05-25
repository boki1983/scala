/**
  * Created by boki on 5/25/16.
  */

object DataTest {
  def main(args: Array[String]) {
    /* Scala has all the same data types as Java
     * There are no primitive types like in Java
     */
    // Integer Literals
    println("========Int Literals=======")
    println(0xFFFFFFFF)
    println(777L)
    // Floating Point Literals
    println("========Float Literals=======")
    println(1e30f)
    println(3.14159f)
    println(.1)
    println("========Boolean Literals=======")
    println(true)
    println("========Symbol Literals=======")
    println("'z")
    println("========Character Literals=======")
    println('\u0041')
    println('a')
    println('\t')
    println("========String Literals=======")
    println("\"This string contains a \\\" character.\"")
    println("========Multi-Line Literals=======")
    // A multi-line string literal is a sequence of characters enclosed in triple quotes """ ... """
    println("""the present string
            spans three
            lines.""")
    println("========null value=======")
    // The null value is of type scala.Null and is thus compatible with every reference type
    println(None)
    println(null)
  }
}