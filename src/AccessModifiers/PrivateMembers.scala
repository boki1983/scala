package AccessModifiers

/**
  * Created by boki on 5/30/16.
  */
class PrivateMembers {
  class Inner {
    // private member is visible only inside the class or object that contains the member definition
    private def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  // (new Inner).f() // Error: f is not accessible
}
