package AccessModifiers

/**
  * Created by boki on 5/30/16.
  */
class PublicMembers {
  class Inner {
    // if not specify any modifer, default is public
    def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  (new Inner).f() // OK because now f() is public
}
