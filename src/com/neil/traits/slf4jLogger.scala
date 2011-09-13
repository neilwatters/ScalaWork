package com.neil.traits

/**
 * Created by IntelliJ IDEA.
 * User: neilwatters
 * Date: 13/09/2011
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */

import org.slf4j.LoggerFactory
import java.text._
import java.util.Date


trait slf4jLogger {

  protected val timeStampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ")
  private [this] val log = LoggerFactory.getLogger(getClass)

    def timeStamp = timeStampFormat.format(new Date)

    def trace(msg : String) : Unit = if(log.isTraceEnabled) log.trace("[ "+timeStamp+"] "+msg)
    def debug(msg : String) : Unit = if(log.isDebugEnabled) log.debug("[ "+timeStamp+"] "+msg)
    def info(msg : String) : Unit = if(log.isInfoEnabled) log.info("[ "+timeStamp+"] "+msg)
    def warn(msg : String) : Unit = if(log.isWarnEnabled) log.warn("[ "+timeStamp+"] "+msg)
    def error(msg : String) : Unit = if(log.isErrorEnabled) log.error("[ "+timeStamp+"] "+msg)
    def debug2(msg : String) : Unit = log.debug("[ "+timeStamp+"] "+msg)
}