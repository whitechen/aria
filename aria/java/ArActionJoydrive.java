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

public class ArActionJoydrive extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionJoydrive(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionJoydriveUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionJoydrive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionJoydrive(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionJoydrive(String name, double transVelMax, double turnAmountMax, boolean stopIfNoButtonPressed, boolean useOSCalForJoystick) {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_0(name, transVelMax, turnAmountMax, stopIfNoButtonPressed, useOSCalForJoystick), true);
  }

  public ArActionJoydrive(String name, double transVelMax, double turnAmountMax, boolean stopIfNoButtonPressed) {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_1(name, transVelMax, turnAmountMax, stopIfNoButtonPressed), true);
  }

  public ArActionJoydrive(String name, double transVelMax, double turnAmountMax) {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_2(name, transVelMax, turnAmountMax), true);
  }

  public ArActionJoydrive(String name, double transVelMax) {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_3(name, transVelMax), true);
  }

  public ArActionJoydrive(String name) {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_4(name), true);
  }

  public ArActionJoydrive() {
    this(AriaJavaJNI.new_ArActionJoydrive__SWIG_5(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionJoydrive_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public boolean joystickInited() {
    return AriaJavaJNI.ArActionJoydrive_joystickInited(swigCPtr, this);
  }

  public void setSpeeds(double transVelMax, double turnAmountMax) {
    AriaJavaJNI.ArActionJoydrive_setSpeeds(swigCPtr, this, transVelMax, turnAmountMax);
  }

  public void setStopIfNoButtonPressed(boolean stopIfNoButtonPressed) {
    AriaJavaJNI.ArActionJoydrive_setStopIfNoButtonPressed(swigCPtr, this, stopIfNoButtonPressed);
  }

  public boolean getStopIfNoButtonPressed() {
    return AriaJavaJNI.ArActionJoydrive_getStopIfNoButtonPressed(swigCPtr, this);
  }

  public void setThrottleParams(double lowSpeed, double highSpeed) {
    AriaJavaJNI.ArActionJoydrive_setThrottleParams(swigCPtr, this, lowSpeed, highSpeed);
  }

  public void setUseOSCal(boolean useOSCal) {
    AriaJavaJNI.ArActionJoydrive_setUseOSCal(swigCPtr, this, useOSCal);
  }

  public boolean getUseOSCal() {
    return AriaJavaJNI.ArActionJoydrive_getUseOSCal(swigCPtr, this);
  }

  public ArJoyHandler getJoyHandler() {
    long cPtr = AriaJavaJNI.ArActionJoydrive_getJoyHandler(swigCPtr, this);
    return (cPtr == 0) ? null : new ArJoyHandler(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionJoydrive_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

}
