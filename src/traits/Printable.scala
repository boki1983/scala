/**
  * Created by bernie on 2016/6/22.
  */

class Printable {
  def hello() = println("Hello World in printable")
}

object Printable {
  def main(args: Array[String]) {
    trait Hello extends Printable {
      override def hello() = println("Hello World in Hello")
    }

    trait CapitalHello extends Printable {
      override def hello() = println("HELLO WORLD in CapitalHello")
    }

    // 若具有同名函式的 Trait 都使用了 extends 關鍵字定義了同一個基礎類別，那麼可以編譯過關，並且由最右邊的 Trait 贏得該函式的呼叫權
    val capital = new Printable with Hello with CapitalHello
    val normal  = new Printable with CapitalHello with Hello

    capital.hello()
    normal.hello()
  }
}
