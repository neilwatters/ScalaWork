package com.neil.inProgress

/**
 * Created by IntelliJ IDEA.
 * User: neilwatters
 * Date: 08/09/2011
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */

class Person (name :   String){
    //private var name = "Daniel Spiewak"
  val ssn = 1234567890    // public constant field

  def firstName() = splitName()(0)   // public method

  private def splitName() = name.split(" ")    // private method

  protected def guessAge() = {
    import Math._
    round(random * 20)
    val ttest = 1.0
  }

}