package com.neil.traits

/**
 * Created by IntelliJ IDEA.
 * User: neilwatters
 * Date: 12/09/2011
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 */

import org.apache.log4j._
import org.apache.log4j.BasicConfigurator
import java.text.SimpleDateFormat
import java.util.Date


trait MyLoggerHelper {

    BasicConfigurator.configure()
    val loggerName = this.getClass.getName
    lazy val logger = Logger.getLogger(loggerName)

    protected val timeStampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ")
    def timeStamp = timeStampFormat.format(new Date)

      def trace(msg : String) : Unit =  logger.trace("[ "+timeStamp+"] "+msg)
      def debug(msg : String) : Unit = logger.debug("[ "+timeStamp+"] "+msg)
      def info(msg : String) : Unit = logger.info("[ "+timeStamp+"] "+msg)
      def warn(msg : String) : Unit = logger.warn("[ "+timeStamp+"] "+msg)
      def error(msg : String) : Unit = logger.error("[ "+timeStamp+"] "+msg)

}