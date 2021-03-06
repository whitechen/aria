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

public class ArJoyVec3i {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArJoyVec3i(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArJoyVec3i obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArJoyVec3i(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setX(int value) {
    AriaJavaJNI.ArJoyVec3i_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return AriaJavaJNI.ArJoyVec3i_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    AriaJavaJNI.ArJoyVec3i_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return AriaJavaJNI.ArJoyVec3i_y_get(swigCPtr, this);
  }

  public void setZ(int value) {
    AriaJavaJNI.ArJoyVec3i_z_set(swigCPtr, this, value);
  }

  public int getZ() {
    return AriaJavaJNI.ArJoyVec3i_z_get(swigCPtr, this);
  }

  public ArJoyVec3i() {
    this(AriaJavaJNI.new_ArJoyVec3i(), true);
  }

}
