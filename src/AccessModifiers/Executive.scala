package AccessModifiers

/**
  * Created by boki on 5/30/16.
  */
package society {
  package professional {
    class Executive {
      /*private[X] or protected[X] means that access is private or protected "up to" X,
      where X designates some enclosing package, class or singleton object.*/

      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another : Executive) {
        println(another.workDetails)
        // println(another.secrets) //ERROR
      }
    }
  }
}
