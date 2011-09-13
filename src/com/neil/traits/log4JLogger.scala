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

trait log4JLogger {

    BasicConfigurator.configure()
    private [this] val loggerName = this.getClass.getName
    private [this] lazy val logger = Logger.getLogger(loggerName)

      def trace(msg : String) : Unit = if(logger.isTraceEnabled) logger.trace(msg)
      def debug(msg : String) : Unit = if(logger.isDebugEnabled) logger.debug(msg)
      def info(msg : String) : Unit =  if(logger.isInfoEnabled)  logger.info(msg)
      def warn(msg : String) : Unit =  logger.warn(msg)
      def error(msg : String) : Unit = logger.error(msg)

}