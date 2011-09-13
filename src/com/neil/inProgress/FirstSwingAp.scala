package com.neil.inProgress

/**
 * Created by IntelliJ IDEA.
 * User: neilwatters
 * Date: 12/09/2011
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */

import scala.swing._

object FirstSwingAp extends SimpleGUIApplication {
         def top = new MainFrame{
              title = "First Swing App"
              contents = new Button{
                text = "Click Me"
              }

         }

}