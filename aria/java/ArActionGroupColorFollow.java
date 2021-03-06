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

public class ArActionGroupColorFollow extends ArActionGroup {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionGroupColorFollow(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionGroupColorFollowUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionGroupColorFollow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionGroupColorFollow(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionGroupColorFollow(ArRobot robot, ArACTS_1_2 acts, ArPTZ camera) {
    this(AriaJavaJNI.new_ArActionGroupColorFollow(ArRobot.getCPtr(robot), robot, ArACTS_1_2.getCPtr(acts), acts, ArPTZ.getCPtr(camera), camera), true);
  }

  public void setCamera(ArPTZ camera) {
    AriaJavaJNI.ArActionGroupColorFollow_setCamera(swigCPtr, this, ArPTZ.getCPtr(camera), camera);
  }

  public void setChannel(int channel) {
    AriaJavaJNI.ArActionGroupColorFollow_setChannel(swigCPtr, this, channel);
  }

  public void startMovement() {
    AriaJavaJNI.ArActionGroupColorFollow_startMovement(swigCPtr, this);
  }

  public void stopMovement() {
    AriaJavaJNI.ArActionGroupColorFollow_stopMovement(swigCPtr, this);
  }

  public void setAcquire(boolean acquire) {
    AriaJavaJNI.ArActionGroupColorFollow_setAcquire(swigCPtr, this, acquire);
  }

  public int getChannel() {
    return AriaJavaJNI.ArActionGroupColorFollow_getChannel(swigCPtr, this);
  }

  public boolean getAcquire() {
    return AriaJavaJNI.ArActionGroupColorFollow_getAcquire(swigCPtr, this);
  }

  public boolean getMovement() {
    return AriaJavaJNI.ArActionGroupColorFollow_getMovement(swigCPtr, this);
  }

  public boolean getBlob() {
    return AriaJavaJNI.ArActionGroupColorFollow_getBlob(swigCPtr, this);
  }

}
