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

public class ArAMPTU extends ArPTZ {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArAMPTU(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArAMPTUUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArAMPTU obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArAMPTU(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArAMPTU(ArRobot robot, int unitNumber) {
    this(AriaJavaJNI.new_ArAMPTU__SWIG_0(ArRobot.getCPtr(robot), robot, unitNumber), true);
  }

  public ArAMPTU(ArRobot robot) {
    this(AriaJavaJNI.new_ArAMPTU__SWIG_1(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean init() {
    return AriaJavaJNI.ArAMPTU_init(swigCPtr, this);
  }

  public boolean pan(double deg) {
    return AriaJavaJNI.ArAMPTU_pan(swigCPtr, this, deg);
  }

  public boolean panRel(double deg) {
    return AriaJavaJNI.ArAMPTU_panRel(swigCPtr, this, deg);
  }

  public boolean tilt(double deg) {
    return AriaJavaJNI.ArAMPTU_tilt(swigCPtr, this, deg);
  }

  public boolean tiltRel(double deg) {
    return AriaJavaJNI.ArAMPTU_tiltRel(swigCPtr, this, deg);
  }

  public boolean panTilt(double panDeg, double tiltDeg) {
    return AriaJavaJNI.ArAMPTU_panTilt(swigCPtr, this, panDeg, tiltDeg);
  }

  public boolean panTiltRel(double panDeg, double tiltDeg) {
    return AriaJavaJNI.ArAMPTU_panTiltRel(swigCPtr, this, panDeg, tiltDeg);
  }

  public boolean panSlew(double deg) {
    return AriaJavaJNI.ArAMPTU_panSlew(swigCPtr, this, deg);
  }

  public boolean tiltSlew(double deg) {
    return AriaJavaJNI.ArAMPTU_tiltSlew(swigCPtr, this, deg);
  }

  public boolean canZoom() {
    return AriaJavaJNI.ArAMPTU_canZoom(swigCPtr, this);
  }

  public double getMaxPosPan() {
    return AriaJavaJNI.ArAMPTU_getMaxPosPan(swigCPtr, this);
  }

  public double getMaxNegPan() {
    return AriaJavaJNI.ArAMPTU_getMaxNegPan(swigCPtr, this);
  }

  public double getMaxPosTilt() {
    return AriaJavaJNI.ArAMPTU_getMaxPosTilt(swigCPtr, this);
  }

  public double getMaxNegTilt() {
    return AriaJavaJNI.ArAMPTU_getMaxNegTilt(swigCPtr, this);
  }

  public boolean pause() {
    return AriaJavaJNI.ArAMPTU_pause(swigCPtr, this);
  }

  public boolean resume() {
    return AriaJavaJNI.ArAMPTU_resume(swigCPtr, this);
  }

  public boolean purge() {
    return AriaJavaJNI.ArAMPTU_purge(swigCPtr, this);
  }

  public boolean requestStatus() {
    return AriaJavaJNI.ArAMPTU_requestStatus(swigCPtr, this);
  }

  public double getPan() {
    return AriaJavaJNI.ArAMPTU_getPan(swigCPtr, this);
  }

  public double getTilt() {
    return AriaJavaJNI.ArAMPTU_getTilt(swigCPtr, this);
  }

  public final static int MIN_SLEW = AriaJavaJNI.ArAMPTU_MIN_SLEW_get();
  public final static int MAX_TILT_SLEW = AriaJavaJNI.ArAMPTU_MAX_TILT_SLEW_get();
  public final static int MAX_PAN_SLEW = AriaJavaJNI.ArAMPTU_MAX_PAN_SLEW_get();

}
