/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009 MobileRobots Inc.
Copyright (C) 2010, 2011 Adept Technology, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArThread {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArThread(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArThread obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArThread(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArThread(boolean blockAllSignals) {
    this(AriaJavaJNI.new_ArThread__SWIG_0(blockAllSignals), true);
  }

  public ArThread() {
    this(AriaJavaJNI.new_ArThread__SWIG_1(), true);
  }

  public ArThread(SWIGTYPE_p_pthread_t thread, boolean joinable, boolean blockAllSignals) {
    this(AriaJavaJNI.new_ArThread__SWIG_2(SWIGTYPE_p_pthread_t.getCPtr(thread), joinable, blockAllSignals), true);
  }

  public ArThread(SWIGTYPE_p_pthread_t thread, boolean joinable) {
    this(AriaJavaJNI.new_ArThread__SWIG_3(SWIGTYPE_p_pthread_t.getCPtr(thread), joinable), true);
  }

  public ArThread(ArFunctor func, boolean joinable, boolean blockAllSignals) {
    this(AriaJavaJNI.new_ArThread__SWIG_4(ArFunctor.getCPtr(func), func, joinable, blockAllSignals), true);
  }

  public ArThread(ArFunctor func, boolean joinable) {
    this(AriaJavaJNI.new_ArThread__SWIG_5(ArFunctor.getCPtr(func), func, joinable), true);
  }

  public ArThread(ArFunctor func) {
    this(AriaJavaJNI.new_ArThread__SWIG_6(ArFunctor.getCPtr(func), func), true);
  }

  public static void init() {
    AriaJavaJNI.ArThread_init();
  }

  public static ArThread self() {
    long cPtr = AriaJavaJNI.ArThread_self();
    return (cPtr == 0) ? null : new ArThread(cPtr, false);
  }

  public static SWIGTYPE_p_pthread_t osSelf() {
    return new SWIGTYPE_p_pthread_t(AriaJavaJNI.ArThread_osSelf(), true);
  }

  public static void stopAll() {
    AriaJavaJNI.ArThread_stopAll();
  }

  public static void cancelAll() {
    AriaJavaJNI.ArThread_cancelAll();
  }

  public static void joinAll() {
    AriaJavaJNI.ArThread_joinAll();
  }

  public static void yieldProcessor() {
    AriaJavaJNI.ArThread_yieldProcessor();
  }

  public static ArLog.LogLevel getLogLevel() {
    return ArLog.LogLevel.swigToEnum(AriaJavaJNI.ArThread_getLogLevel());
  }

  public static void setLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.ArThread_setLogLevel(level.swigValue());
  }

  public int create(ArFunctor func, boolean joinable, boolean lowerPriority) {
    return AriaJavaJNI.ArThread_create__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(func), func, joinable, lowerPriority);
  }

  public int create(ArFunctor func, boolean joinable) {
    return AriaJavaJNI.ArThread_create__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(func), func, joinable);
  }

  public int create(ArFunctor func) {
    return AriaJavaJNI.ArThread_create__SWIG_2(swigCPtr, this, ArFunctor.getCPtr(func), func);
  }

  public void stopRunning() {
    AriaJavaJNI.ArThread_stopRunning(swigCPtr, this);
  }

  public int join(SWIGTYPE_p_p_void ret) {
    return AriaJavaJNI.ArThread_join__SWIG_0(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(ret));
  }

  public int join() {
    return AriaJavaJNI.ArThread_join__SWIG_1(swigCPtr, this);
  }

  public int detach() {
    return AriaJavaJNI.ArThread_detach(swigCPtr, this);
  }

  public void cancel() {
    AriaJavaJNI.ArThread_cancel(swigCPtr, this);
  }

  public boolean getRunning() {
    return AriaJavaJNI.ArThread_getRunning(swigCPtr, this);
  }

  public boolean getRunningWithLock() {
    return AriaJavaJNI.ArThread_getRunningWithLock(swigCPtr, this);
  }

  public boolean getJoinable() {
    return AriaJavaJNI.ArThread_getJoinable(swigCPtr, this);
  }

  public SWIGTYPE_p_pthread_t getThread() {
    long cPtr = AriaJavaJNI.ArThread_getThread(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pthread_t(cPtr, false);
  }

  public SWIGTYPE_p_pthread_t getOSThread() {
    return new SWIGTYPE_p_pthread_t(AriaJavaJNI.ArThread_getOSThread(swigCPtr, this), true);
  }

  public ArFunctor getFunc() {
    long cPtr = AriaJavaJNI.ArThread_getFunc(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public void setRunning(boolean running) {
    AriaJavaJNI.ArThread_setRunning(swigCPtr, this, running);
  }

  public boolean getBlockAllSignals() {
    return AriaJavaJNI.ArThread_getBlockAllSignals(swigCPtr, this);
  }

  public String getThreadName() {
    return AriaJavaJNI.ArThread_getThreadName(swigCPtr, this);
  }

  public void setThreadName(String name) {
    AriaJavaJNI.ArThread_setThreadName(swigCPtr, this, name);
  }

  public String getThreadActivity() {
    return AriaJavaJNI.ArThread_getThreadActivity(swigCPtr, this);
  }

  public void threadStarted() {
    AriaJavaJNI.ArThread_threadStarted(swigCPtr, this);
  }

  public void threadFinished() {
    AriaJavaJNI.ArThread_threadFinished(swigCPtr, this);
  }

  public boolean isThreadStarted() {
    return AriaJavaJNI.ArThread_isThreadStarted(swigCPtr, this);
  }

  public boolean isThreadFinished() {
    return AriaJavaJNI.ArThread_isThreadFinished(swigCPtr, this);
  }

  public void logThreadInfo() {
    AriaJavaJNI.ArThread_logThreadInfo(swigCPtr, this);
  }

  public SWIGTYPE_p_pid_t getPID() {
    return new SWIGTYPE_p_pid_t(AriaJavaJNI.ArThread_getPID(swigCPtr, this), true);
  }

  public static String getThisThreadName() {
    return AriaJavaJNI.ArThread_getThisThreadName();
  }

  public static SWIGTYPE_p_pthread_t getThisThread() {
    long cPtr = AriaJavaJNI.ArThread_getThisThread();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pthread_t(cPtr, false);
  }

  public static SWIGTYPE_p_pthread_t getThisOSThread() {
    return new SWIGTYPE_p_pthread_t(AriaJavaJNI.ArThread_getThisOSThread(), true);
  }

  public final static class Status {
    public final static Status STATUS_FAILED = new Status("STATUS_FAILED", AriaJavaJNI.ArThread_STATUS_FAILED_get());
    public final static Status STATUS_NORESOURCE = new Status("STATUS_NORESOURCE");
    public final static Status STATUS_NO_SUCH_THREAD = new Status("STATUS_NO_SUCH_THREAD");
    public final static Status STATUS_INVALID = new Status("STATUS_INVALID");
    public final static Status STATUS_JOIN_SELF = new Status("STATUS_JOIN_SELF");
    public final static Status STATUS_ALREADY_DETATCHED = new Status("STATUS_ALREADY_DETATCHED");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Status swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    private Status(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Status(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Status(String swigName, Status swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Status[] swigValues = { STATUS_FAILED, STATUS_NORESOURCE, STATUS_NO_SUCH_THREAD, STATUS_INVALID, STATUS_JOIN_SELF, STATUS_ALREADY_DETATCHED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
