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

public class ArSystemStatus {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArSystemStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSystemStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArSystemStatus(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static void startPeriodicUpdate(int refreshFrequency) {
    AriaJavaJNI.ArSystemStatus_startPeriodicUpdate__SWIG_0(refreshFrequency);
  }

  public static void startPeriodicUpdate() {
    AriaJavaJNI.ArSystemStatus_startPeriodicUpdate__SWIG_1();
  }

  public static void stopPeriodicUpdate() {
    AriaJavaJNI.ArSystemStatus_stopPeriodicUpdate();
  }

  public static void runRefreshThread(int refreshFrequency) {
    AriaJavaJNI.ArSystemStatus_runRefreshThread__SWIG_0(refreshFrequency);
  }

  public static void runRefreshThread() {
    AriaJavaJNI.ArSystemStatus_runRefreshThread__SWIG_1();
  }

  public static double getCPU() {
    return AriaJavaJNI.ArSystemStatus_getCPU();
  }

  public static double getCPUPercent() {
    return AriaJavaJNI.ArSystemStatus_getCPUPercent();
  }

  public static String getCPUPercentAsString() {
    return AriaJavaJNI.ArSystemStatus_getCPUPercentAsString();
  }

  public static long getUptime() {
    return AriaJavaJNI.ArSystemStatus_getUptime();
  }

  public static double getUptimeHours() {
    return AriaJavaJNI.ArSystemStatus_getUptimeHours();
  }

  public static String getUptimeHoursAsString() {
    return AriaJavaJNI.ArSystemStatus_getUptimeHoursAsString();
  }

  public static ArRetFunctor_Double getCPUPercentFunctor() {
    long cPtr = AriaJavaJNI.ArSystemStatus_getCPUPercentFunctor();
    return (cPtr == 0) ? null : new ArRetFunctor_Double(cPtr, false);
  }

  public static ArRetFunctor_Double getUptimeHoursFunctor() {
    long cPtr = AriaJavaJNI.ArSystemStatus_getUptimeHoursFunctor();
    return (cPtr == 0) ? null : new ArRetFunctor_Double(cPtr, false);
  }

  public static int getWirelessLinkQuality() {
    return AriaJavaJNI.ArSystemStatus_getWirelessLinkQuality();
  }

  public static int getWirelessLinkSignal() {
    return AriaJavaJNI.ArSystemStatus_getWirelessLinkSignal();
  }

  public static int getWirelessLinkNoise() {
    return AriaJavaJNI.ArSystemStatus_getWirelessLinkNoise();
  }

  public static int getWirelessDiscardedPackets() {
    return AriaJavaJNI.ArSystemStatus_getWirelessDiscardedPackets();
  }

  public static int getWirelessDiscardedPacketsBecauseNetConflict() {
    return AriaJavaJNI.ArSystemStatus_getWirelessDiscardedPacketsBecauseNetConflict();
  }

  public static ArRetFunctor_Int getWirelessLinkQualityFunctor() {
    long cPtr = AriaJavaJNI.ArSystemStatus_getWirelessLinkQualityFunctor();
    return (cPtr == 0) ? null : new ArRetFunctor_Int(cPtr, false);
  }

  public static ArRetFunctor_Int getWirelessLinkNoiseFunctor() {
    long cPtr = AriaJavaJNI.ArSystemStatus_getWirelessLinkNoiseFunctor();
    return (cPtr == 0) ? null : new ArRetFunctor_Int(cPtr, false);
  }

  public static ArRetFunctor_Int getWirelessLinkSignalFunctor() {
    long cPtr = AriaJavaJNI.ArSystemStatus_getWirelessLinkSignalFunctor();
    return (cPtr == 0) ? null : new ArRetFunctor_Int(cPtr, false);
  }

  public static void invalidate() {
    AriaJavaJNI.ArSystemStatus_invalidate();
  }

  public static void refresh() {
    AriaJavaJNI.ArSystemStatus_refresh();
  }

  public ArSystemStatus() {
    this(AriaJavaJNI.new_ArSystemStatus(), true);
  }

}