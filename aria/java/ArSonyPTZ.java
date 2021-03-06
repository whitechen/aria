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

public class ArSonyPTZ extends ArPTZ {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArSonyPTZ(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArSonyPTZUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSonyPTZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArSonyPTZ(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArSonyPTZ(ArRobot robot) {
    this(AriaJavaJNI.new_ArSonyPTZ(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean init() {
    return AriaJavaJNI.ArSonyPTZ_init(swigCPtr, this);
  }

  public boolean pan(double degrees) {
    return AriaJavaJNI.ArSonyPTZ_pan(swigCPtr, this, degrees);
  }

  public boolean panRel(double degrees) {
    return AriaJavaJNI.ArSonyPTZ_panRel(swigCPtr, this, degrees);
  }

  public boolean tilt(double degrees) {
    return AriaJavaJNI.ArSonyPTZ_tilt(swigCPtr, this, degrees);
  }

  public boolean tiltRel(double degrees) {
    return AriaJavaJNI.ArSonyPTZ_tiltRel(swigCPtr, this, degrees);
  }

  public boolean panTilt(double degreesPan, double degreesTilt) {
    return AriaJavaJNI.ArSonyPTZ_panTilt(swigCPtr, this, degreesPan, degreesTilt);
  }

  public boolean panTiltRel(double degreesPan, double degreesTilt) {
    return AriaJavaJNI.ArSonyPTZ_panTiltRel(swigCPtr, this, degreesPan, degreesTilt);
  }

  public boolean canZoom() {
    return AriaJavaJNI.ArSonyPTZ_canZoom(swigCPtr, this);
  }

  public boolean zoom(int zoomValue) {
    return AriaJavaJNI.ArSonyPTZ_zoom(swigCPtr, this, zoomValue);
  }

  public boolean zoomRel(int zoomValue) {
    return AriaJavaJNI.ArSonyPTZ_zoomRel(swigCPtr, this, zoomValue);
  }

  public double getPan() {
    return AriaJavaJNI.ArSonyPTZ_getPan(swigCPtr, this);
  }

  public double getTilt() {
    return AriaJavaJNI.ArSonyPTZ_getTilt(swigCPtr, this);
  }

  public int getZoom() {
    return AriaJavaJNI.ArSonyPTZ_getZoom(swigCPtr, this);
  }

  public double getMaxPosPan() {
    return AriaJavaJNI.ArSonyPTZ_getMaxPosPan(swigCPtr, this);
  }

  public double getMaxNegPan() {
    return AriaJavaJNI.ArSonyPTZ_getMaxNegPan(swigCPtr, this);
  }

  public double getMaxPosTilt() {
    return AriaJavaJNI.ArSonyPTZ_getMaxPosTilt(swigCPtr, this);
  }

  public double getMaxNegTilt() {
    return AriaJavaJNI.ArSonyPTZ_getMaxNegTilt(swigCPtr, this);
  }

  public int getMaxZoom() {
    return AriaJavaJNI.ArSonyPTZ_getMaxZoom(swigCPtr, this);
  }

  public int getMinZoom() {
    return AriaJavaJNI.ArSonyPTZ_getMinZoom(swigCPtr, this);
  }

  public boolean canGetFOV() {
    return AriaJavaJNI.ArSonyPTZ_canGetFOV(swigCPtr, this);
  }

  public double getFOVAtMaxZoom() {
    return AriaJavaJNI.ArSonyPTZ_getFOVAtMaxZoom(swigCPtr, this);
  }

  public double getFOVAtMinZoom() {
    return AriaJavaJNI.ArSonyPTZ_getFOVAtMinZoom(swigCPtr, this);
  }

  public boolean backLightingOn() {
    return AriaJavaJNI.ArSonyPTZ_backLightingOn(swigCPtr, this);
  }

  public boolean backLightingOff() {
    return AriaJavaJNI.ArSonyPTZ_backLightingOff(swigCPtr, this);
  }

  public final static int MAX_PAN = AriaJavaJNI.ArSonyPTZ_MAX_PAN_get();
  public final static int MAX_TILT = AriaJavaJNI.ArSonyPTZ_MAX_TILT_get();
  public final static int MIN_ZOOM = AriaJavaJNI.ArSonyPTZ_MIN_ZOOM_get();
  public final static int MAX_ZOOM = AriaJavaJNI.ArSonyPTZ_MAX_ZOOM_get();

}
