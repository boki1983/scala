/**
  * Created by bernie on 2016/6/23.
  */

object ExtractorDemo1 {
  def main(args: Array[String]) {
    //
    println ("Apply method : " + apply("Zara", "gmail.com"));
    // unapply method is to match a value and take it apart
    println ("Unapply method : " + unapply("Zara@gmail.com"));
    println ("Unapply method : " + unapply("Zara Ali"));



    // The injection method (optional)
    def apply(user: String, domain: String) = {
      user +"@"+ domain
    }

    // The extraction method (mandatory)
    def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"

      if (parts.length == 2){
        Some(parts(0), parts(1))
      } else {
        None
      }
    }
  }
}