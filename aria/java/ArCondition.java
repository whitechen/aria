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

public class ArCondition {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArCondition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArCondition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArCondition(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArCondition() {
    this(AriaJavaJNI.new_ArCondition(), true);
  }

  public int signal() {
    return AriaJavaJNI.ArCondition_signal(swigCPtr, this);
  }

  public int broadcast() {
    return AriaJavaJNI.ArCondition_broadcast(swigCPtr, this);
  }

  public int waitFor() {
    return AriaJavaJNI.ArCondition_waitFor(swigCPtr, this);
  }

  public int timedWait(long msecs) {
    return AriaJavaJNI.ArCondition_timedWait(swigCPtr, this, msecs);
  }

  public String getError(int messageNumber) {
    return AriaJavaJNI.ArCondition_getError(swigCPtr, this, messageNumber);
  }

  public final static int STATUS_FAILED = AriaJavaJNI.ArCondition_STATUS_FAILED_get();
  public final static int STATUS_FAILED_DESTROY = AriaJavaJNI.ArCondition_STATUS_FAILED_DESTROY_get();
  public final static int STATUS_FAILED_INIT = AriaJavaJNI.ArCondition_STATUS_FAILED_INIT_get();
  public final static int STATUS_WAIT_TIMEDOUT = AriaJavaJNI.ArCondition_STATUS_WAIT_TIMEDOUT_get();
  public final static int STATUS_WAIT_INTR = AriaJavaJNI.ArCondition_STATUS_WAIT_INTR_get();
  public final static int STATUS_MUTEX_FAILED_INIT = AriaJavaJNI.ArCondition_STATUS_MUTEX_FAILED_INIT_get();
  public final static int STATUS_MUTEX_FAILED = AriaJavaJNI.ArCondition_STATUS_MUTEX_FAILED_get();

}
