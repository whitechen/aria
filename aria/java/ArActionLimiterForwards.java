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

public class ArActionLimiterForwards extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionLimiterForwards(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionLimiterForwardsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionLimiterForwards obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionLimiterForwards(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionLimiterForwards(String name, double stopDistance, double slowDistance, double slowSpeed, double widthRatio) {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_0(name, stopDistance, slowDistance, slowSpeed, widthRatio), true);
  }

  public ArActionLimiterForwards(String name, double stopDistance, double slowDistance, double slowSpeed) {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_1(name, stopDistance, slowDistance, slowSpeed), true);
  }

  public ArActionLimiterForwards(String name, double stopDistance, double slowDistance) {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_2(name, stopDistance, slowDistance), true);
  }

  public ArActionLimiterForwards(String name, double stopDistance) {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_3(name, stopDistance), true);
  }

  public ArActionLimiterForwards(String name) {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_4(name), true);
  }

  public ArActionLimiterForwards() {
    this(AriaJavaJNI.new_ArActionLimiterForwards__SWIG_5(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionLimiterForwards_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionLimiterForwards_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public void setParameters(double stopDistance, double slowDistance, double slowSpeed, double widthRatio) {
    AriaJavaJNI.ArActionLimiterForwards_setParameters__SWIG_0(swigCPtr, this, stopDistance, slowDistance, slowSpeed, widthRatio);
  }

  public void setParameters(double stopDistance, double slowDistance, double slowSpeed) {
    AriaJavaJNI.ArActionLimiterForwards_setParameters__SWIG_1(swigCPtr, this, stopDistance, slowDistance, slowSpeed);
  }

  public void setParameters(double stopDistance, double slowDistance) {
    AriaJavaJNI.ArActionLimiterForwards_setParameters__SWIG_2(swigCPtr, this, stopDistance, slowDistance);
  }

  public void setParameters(double stopDistance) {
    AriaJavaJNI.ArActionLimiterForwards_setParameters__SWIG_3(swigCPtr, this, stopDistance);
  }

  public void setParameters() {
    AriaJavaJNI.ArActionLimiterForwards_setParameters__SWIG_4(swigCPtr, this);
  }

}
