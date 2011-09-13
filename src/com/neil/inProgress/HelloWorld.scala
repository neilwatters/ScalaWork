package com.neil.inProgress

/**
 * Created by IntelliJ IDEA.
 * User: neilwatters
 * Date: 07/09/2011
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */

 import com.neil.traits._

object HelloWorld extends  log4JLogger {

  def main(args: Array[String]) {
    debug("******* Neil")
    printName()
    printFactorial(30)
    print("\n")
    var myPerson:Person  = new Person("Joe Watters")
    print(myPerson.firstName +"\n")
    debug("Neil in debbuger Lovely Jubbly")
    warn("Neil this is a warning lovely jubbly")
  }
  def printName() = {
      var name:String = "Joe"
      print("""Hello World and """ + name + " Help\n")

  }

  private [this] def printFactorial(x: Int) = {
    var result = factorial(x)
    print("result of factorial call is : "+ result)
  }

  private [this] def factorial(x : BigInt): BigInt = if (x == 0) 1 else x * factorial(x -1)

}