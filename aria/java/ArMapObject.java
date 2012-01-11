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

public class ArMapObject {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArMapObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArMapObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArMapObject(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static ArMapObject createMapObject(ArArgumentBuilder arg) {
    long cPtr = AriaJavaJNI.ArMapObject_createMapObject(ArArgumentBuilder.getCPtr(arg), arg);
    return (cPtr == 0) ? null : new ArMapObject(cPtr, false);
  }

  public ArMapObject(String type, ArPose pose, String description, String iconName, String name, boolean hasFromTo, ArPose fromPose, ArPose toPose) {
    this(AriaJavaJNI.new_ArMapObject__SWIG_0(type, ArPose.getCPtr(pose), pose, description, iconName, name, hasFromTo, ArPose.getCPtr(fromPose), fromPose, ArPose.getCPtr(toPose), toPose), true);
  }

  public ArMapObject(ArMapObject mapObject) {
    this(AriaJavaJNI.new_ArMapObject__SWIG_1(ArMapObject.getCPtr(mapObject), mapObject), true);
  }

  public String getType() {
    return AriaJavaJNI.ArMapObject_getType(swigCPtr, this);
  }

  public String getBaseType() {
    return AriaJavaJNI.ArMapObject_getBaseType(swigCPtr, this);
  }

  public String getName() {
    return AriaJavaJNI.ArMapObject_getName(swigCPtr, this);
  }

  public String getDescription() {
    return AriaJavaJNI.ArMapObject_getDescription(swigCPtr, this);
  }

  public String getIconName() {
    return AriaJavaJNI.ArMapObject_getIconName(swigCPtr, this);
  }

  public void setDescription(String description) {
    AriaJavaJNI.ArMapObject_setDescription(swigCPtr, this, description);
  }

  public ArPose getPose() {
    return new ArPose(AriaJavaJNI.ArMapObject_getPose(swigCPtr, this), true);
  }

  public boolean hasFromTo() {
    return AriaJavaJNI.ArMapObject_hasFromTo(swigCPtr, this);
  }

  public ArPose getFromPose() {
    return new ArPose(AriaJavaJNI.ArMapObject_getFromPose(swigCPtr, this), true);
  }

  public ArPose getToPose() {
    return new ArPose(AriaJavaJNI.ArMapObject_getToPose(swigCPtr, this), true);
  }

  public double getFromToRotation() {
    return AriaJavaJNI.ArMapObject_getFromToRotation(swigCPtr, this);
  }

  public ArLineSegmentList getFromToSegments() {
    return new ArLineSegmentList(AriaJavaJNI.ArMapObject_getFromToSegments(swigCPtr, this), true);
  }

  public ArPose findCenter() {
    return new ArPose(AriaJavaJNI.ArMapObject_findCenter(swigCPtr, this), true);
  }

  public String toString() {
    return AriaJavaJNI.ArMapObject_toString(swigCPtr, this);
  }

  public String getStringRepresentation() {
    return AriaJavaJNI.ArMapObject_getStringRepresentation(swigCPtr, this);
  }

  public void log(String intro) {
    AriaJavaJNI.ArMapObject_log__SWIG_0(swigCPtr, this, intro);
  }

  public void log() {
    AriaJavaJNI.ArMapObject_log__SWIG_1(swigCPtr, this);
  }

  public String getFileName() {
    return AriaJavaJNI.ArMapObject_getFileName(swigCPtr, this);
  }

}