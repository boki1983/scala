package AccessModifiers

/**
  * Created by boki on 5/30/16.
  */
class ProtectedMembers {
  class Super {
    // protected member is only accessible from subclasses of the class in which the member is defined
    protected def f() { println("f") }
  }
  class Sub extends Super {
    f()
  }
  class Other {
    // (new Super).f() // Error: f is not accessible
  }
}
