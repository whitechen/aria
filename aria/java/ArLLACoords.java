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

public class ArLLACoords extends Ar3DPoint {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLLACoords(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLLACoordsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLLACoords obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArLLACoords(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArLLACoords() {
    this(AriaJavaJNI.new_ArLLACoords__SWIG_0(), true);
  }

  public ArLLACoords(double x, double y, double z) {
    this(AriaJavaJNI.new_ArLLACoords__SWIG_1(x, y, z), true);
  }

  public ArECEFCoords LLA2ECEF() {
    return new ArECEFCoords(AriaJavaJNI.ArLLACoords_LLA2ECEF(swigCPtr, this), true);
  }

  public double getLatitude() {
    return AriaJavaJNI.ArLLACoords_getLatitude(swigCPtr, this);
  }

  public double getLongitude() {
    return AriaJavaJNI.ArLLACoords_getLongitude(swigCPtr, this);
  }

  public double getAltitude() {
    return AriaJavaJNI.ArLLACoords_getAltitude(swigCPtr, this);
  }

}
