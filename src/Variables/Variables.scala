/**
  * Created by boki on 5/30/16.
  * Because Scala is hybrid language(oo + fp), it supports mutable(var) and immutable(val)
  */

object Variables {
  def main(args: Array[String]) {
    // Variable Declaration
    // var or val VariableName : DataType [=  Initial Value]

    // mutable variable using the keyword var
    var myVar : String = "Foo"
    // immutable variable using the keyword val
    val myVal : String = "Foo"
    println(myVar)
    println(myVal)

    // Variable Type Inference
    // Scala compiler can figure out the type of the variable based on the value assigned to it
    var myVarA = 10;
    val myValA = "Hello, Scala!";
    println(myVarA)
    println(myValA)

    // Multiple assignments
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
    println(myVar1)
    println(myVar2)

    // three different scopes
    // Fields are variables that belong to an object.
    // Method parameters are variables, which are used to pass the value inside a method when the method is called
    // Local variables are variables declared inside a method
  }
}
