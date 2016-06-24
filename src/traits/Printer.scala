/**
  * Created by bernie on 2016/6/23.
  */

// 基礎類別
class Printer {
  def print(content: String) = println(content)
}

object Printer {
  def main(args: Array[String]) {
    // 因為這些是裝飾者物件，我們只能讓他們可以被 Printer 類別引用
    trait Repeat extends Printer {
      override def print(content: String) = {
        super.print(content + "\n" + content + "\n" + content)
      }
    }

    trait UpperCase extends Printer {
      override def print(content: String) = {
        super.print(content.toUpperCase)
      }
    }

    trait LowerCase extends Printer {
      override def print(content: String) = {
        super.print(content.toLowerCase)
      }
    }

    trait Filter extends Printer {
      override def print(content: String) = {
        super.print(content.replace("shit", "XXXX"))
      }
    }

    // 大寫並且印三次
    val upperAndRepeat = new Printer with Repeat with UpperCase
    upperAndRepeat.print("Hello World")

    // 小寫並且過濾
    val filterAndLower = new Printer with LowerCase with Filter
    filterAndLower.print("It looks like a shit")

    val upperAndFilter = new Printer with Filter with UpperCase

    // 會印出 IT LOOKS LIKE A SHIT
    upperAndFilter.print("It looks like a shit")

  }
}