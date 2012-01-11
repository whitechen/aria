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

public class ArRangeDevice {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRangeDevice(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRangeDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArRangeDevice(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArRangeDevice(long currentBufferSize, long cumulativeBufferSize, String name, long maxRange, int maxSecondsToKeepCurrent, int maxSecondsToKeepCumulative, double maxDistToKeepCumulative, boolean locationDependent) {
    this(AriaJavaJNI.new_ArRangeDevice__SWIG_0(currentBufferSize, cumulativeBufferSize, name, maxRange, maxSecondsToKeepCurrent, maxSecondsToKeepCumulative, maxDistToKeepCumulative, locationDependent), true);
  }

  public ArRangeDevice(long currentBufferSize, long cumulativeBufferSize, String name, long maxRange, int maxSecondsToKeepCurrent, int maxSecondsToKeepCumulative, double maxDistToKeepCumulative) {
    this(AriaJavaJNI.new_ArRangeDevice__SWIG_1(currentBufferSize, cumulativeBufferSize, name, maxRange, maxSecondsToKeepCurrent, maxSecondsToKeepCumulative, maxDistToKeepCumulative), true);
  }

  public ArRangeDevice(long currentBufferSize, long cumulativeBufferSize, String name, long maxRange, int maxSecondsToKeepCurrent, int maxSecondsToKeepCumulative) {
    this(AriaJavaJNI.new_ArRangeDevice__SWIG_2(currentBufferSize, cumulativeBufferSize, name, maxRange, maxSecondsToKeepCurrent, maxSecondsToKeepCumulative), true);
  }

  public ArRangeDevice(long currentBufferSize, long cumulativeBufferSize, String name, long maxRange, int maxSecondsToKeepCurrent) {
    this(AriaJavaJNI.new_ArRangeDevice__SWIG_3(currentBufferSize, cumulativeBufferSize, name, maxRange, maxSecondsToKeepCurrent), true);
  }

  public ArRangeDevice(long currentBufferSize, long cumulativeBufferSize, String name, long maxRange) {
    this(AriaJavaJNI.new_ArRangeDevice__SWIG_4(currentBufferSize, cumulativeBufferSize, name, maxRange), true);
  }

  public String getName() {
    return AriaJavaJNI.ArRangeDevice_getName(swigCPtr, this);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArRangeDevice_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public ArRobot getRobot() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getRobot(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

  public void setCurrentBufferSize(long size) {
    AriaJavaJNI.ArRangeDevice_setCurrentBufferSize(swigCPtr, this, size);
  }

  public void setCumulativeBufferSize(long size) {
    AriaJavaJNI.ArRangeDevice_setCumulativeBufferSize(swigCPtr, this, size);
  }

  public void addReading(double x, double y) {
    AriaJavaJNI.ArRangeDevice_addReading(swigCPtr, this, x, y);
  }

  public boolean isLocationDependent() {
    return AriaJavaJNI.ArRangeDevice_isLocationDependent(swigCPtr, this);
  }

  public double currentReadingPolar(double startAngle, double endAngle, SWIGTYPE_p_double angle) {
    return AriaJavaJNI.ArRangeDevice_currentReadingPolar__SWIG_0(swigCPtr, this, startAngle, endAngle, SWIGTYPE_p_double.getCPtr(angle));
  }

  public double currentReadingPolar(double startAngle, double endAngle) {
    return AriaJavaJNI.ArRangeDevice_currentReadingPolar__SWIG_1(swigCPtr, this, startAngle, endAngle);
  }

  public double cumulativeReadingPolar(double startAngle, double endAngle, SWIGTYPE_p_double angle) {
    return AriaJavaJNI.ArRangeDevice_cumulativeReadingPolar__SWIG_0(swigCPtr, this, startAngle, endAngle, SWIGTYPE_p_double.getCPtr(angle));
  }

  public double cumulativeReadingPolar(double startAngle, double endAngle) {
    return AriaJavaJNI.ArRangeDevice_cumulativeReadingPolar__SWIG_1(swigCPtr, this, startAngle, endAngle);
  }

  public double currentReadingBox(double x1, double y1, double x2, double y2, ArPose readingPos) {
    return AriaJavaJNI.ArRangeDevice_currentReadingBox__SWIG_0(swigCPtr, this, x1, y1, x2, y2, ArPose.getCPtr(readingPos), readingPos);
  }

  public double currentReadingBox(double x1, double y1, double x2, double y2) {
    return AriaJavaJNI.ArRangeDevice_currentReadingBox__SWIG_1(swigCPtr, this, x1, y1, x2, y2);
  }

  public double cumulativeReadingBox(double x1, double y1, double x2, double y2, ArPose readingPos) {
    return AriaJavaJNI.ArRangeDevice_cumulativeReadingBox__SWIG_0(swigCPtr, this, x1, y1, x2, y2, ArPose.getCPtr(readingPos), readingPos);
  }

  public double cumulativeReadingBox(double x1, double y1, double x2, double y2) {
    return AriaJavaJNI.ArRangeDevice_cumulativeReadingBox__SWIG_1(swigCPtr, this, x1, y1, x2, y2);
  }

  public ArRangeBuffer getCurrentRangeBuffer() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCurrentRangeBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRangeBuffer(cPtr, false);
  }

  public ArRangeBuffer getCumulativeRangeBuffer() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCumulativeRangeBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRangeBuffer(cPtr, false);
  }

  public ArPoseWithTimePtrList getCurrentBuffer() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCurrentBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new ArPoseWithTimePtrList(cPtr, false);
  }

  public ArPoseWithTimeVector getCurrentBufferAsVector() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCurrentBufferAsVector(swigCPtr, this);
    return (cPtr == 0) ? null : new ArPoseWithTimeVector(cPtr, false);
  }

  public ArPoseWithTimePtrList getCumulativeBuffer() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCumulativeBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new ArPoseWithTimePtrList(cPtr, false);
  }

  public ArPoseWithTimeVector getCumulativeBufferAsVector() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCumulativeBufferAsVector(swigCPtr, this);
    return (cPtr == 0) ? null : new ArPoseWithTimeVector(cPtr, false);
  }

  public SWIGTYPE_p_std__listT_ArSensorReading_p_t getRawReadings() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getRawReadings(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArSensorReading_p_t(cPtr, false);
  }

  public ArSensorReadingVector getRawReadingsAsVector() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getRawReadingsAsVector(swigCPtr, this);
    return (cPtr == 0) ? null : new ArSensorReadingVector(cPtr, false);
  }

  public SWIGTYPE_p_std__listT_ArSensorReading_p_t getAdjustedRawReadings() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getAdjustedRawReadings(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArSensorReading_p_t(cPtr, false);
  }

  public ArSensorReadingVector getAdjustedRawReadingsAsVector() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getAdjustedRawReadingsAsVector(swigCPtr, this);
    return (cPtr == 0) ? null : new ArSensorReadingVector(cPtr, false);
  }

  public void setMaxSecondsToKeepCurrent(int maxSecondsToKeepCurrent) {
    AriaJavaJNI.ArRangeDevice_setMaxSecondsToKeepCurrent(swigCPtr, this, maxSecondsToKeepCurrent);
  }

  public int getMaxSecondsToKeepCurrent() {
    return AriaJavaJNI.ArRangeDevice_getMaxSecondsToKeepCurrent(swigCPtr, this);
  }

  public void setMinDistBetweenCurrent(double minDistBetweenCurrent) {
    AriaJavaJNI.ArRangeDevice_setMinDistBetweenCurrent(swigCPtr, this, minDistBetweenCurrent);
  }

  public double getMinDistBetweenCurrent() {
    return AriaJavaJNI.ArRangeDevice_getMinDistBetweenCurrent(swigCPtr, this);
  }

  public void setMaxSecondsToKeepCumulative(int maxSecondsToKeepCumulative) {
    AriaJavaJNI.ArRangeDevice_setMaxSecondsToKeepCumulative(swigCPtr, this, maxSecondsToKeepCumulative);
  }

  public int getMaxSecondsToKeepCumulative() {
    return AriaJavaJNI.ArRangeDevice_getMaxSecondsToKeepCumulative(swigCPtr, this);
  }

  public void setMaxDistToKeepCumulative(double maxDistToKeepCumulative) {
    AriaJavaJNI.ArRangeDevice_setMaxDistToKeepCumulative(swigCPtr, this, maxDistToKeepCumulative);
  }

  public double getMaxDistToKeepCumulative() {
    return AriaJavaJNI.ArRangeDevice_getMaxDistToKeepCumulative(swigCPtr, this);
  }

  public void setMinDistBetweenCumulative(double minDistBetweenCumulative) {
    AriaJavaJNI.ArRangeDevice_setMinDistBetweenCumulative(swigCPtr, this, minDistBetweenCumulative);
  }

  public double getMinDistBetweenCumulative() {
    return AriaJavaJNI.ArRangeDevice_getMinDistBetweenCumulative(swigCPtr, this);
  }

  public void setMaxInsertDistCumulative(double maxInsertDistCumulative) {
    AriaJavaJNI.ArRangeDevice_setMaxInsertDistCumulative(swigCPtr, this, maxInsertDistCumulative);
  }

  public double getMaxInsertDistCumulative() {
    return AriaJavaJNI.ArRangeDevice_getMaxInsertDistCumulative(swigCPtr, this);
  }

  public void clearCurrentReadings() {
    AriaJavaJNI.ArRangeDevice_clearCurrentReadings(swigCPtr, this);
  }

  public void clearCumulativeReadings() {
    AriaJavaJNI.ArRangeDevice_clearCumulativeReadings(swigCPtr, this);
  }

  public void clearCumulativeOlderThan(int milliSeconds) {
    AriaJavaJNI.ArRangeDevice_clearCumulativeOlderThan(swigCPtr, this, milliSeconds);
  }

  public void clearCumulativeOlderThanSeconds(int seconds) {
    AriaJavaJNI.ArRangeDevice_clearCumulativeOlderThanSeconds(swigCPtr, this, seconds);
  }

  public long getMaxRange() {
    return AriaJavaJNI.ArRangeDevice_getMaxRange(swigCPtr, this);
  }

  public void setMaxRange(long maxRange) {
    AriaJavaJNI.ArRangeDevice_setMaxRange(swigCPtr, this, maxRange);
  }

  public void applyTransform(ArTransform trans, boolean doCumulative) {
    AriaJavaJNI.ArRangeDevice_applyTransform__SWIG_0(swigCPtr, this, ArTransform.getCPtr(trans), trans, doCumulative);
  }

  public void applyTransform(ArTransform trans) {
    AriaJavaJNI.ArRangeDevice_applyTransform__SWIG_1(swigCPtr, this, ArTransform.getCPtr(trans), trans);
  }

  public ArDrawingData getCurrentDrawingData() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCurrentDrawingData(swigCPtr, this);
    return (cPtr == 0) ? null : new ArDrawingData(cPtr, false);
  }

  public ArDrawingData getCumulativeDrawingData() {
    long cPtr = AriaJavaJNI.ArRangeDevice_getCumulativeDrawingData(swigCPtr, this);
    return (cPtr == 0) ? null : new ArDrawingData(cPtr, false);
  }

  public void setCurrentDrawingData(ArDrawingData data, boolean takeOwnershipOfData) {
    AriaJavaJNI.ArRangeDevice_setCurrentDrawingData(swigCPtr, this, ArDrawingData.getCPtr(data), data, takeOwnershipOfData);
  }

  public void setCumulativeDrawingData(ArDrawingData data, boolean takeOwnershipOfData) {
    AriaJavaJNI.ArRangeDevice_setCumulativeDrawingData(swigCPtr, this, ArDrawingData.getCPtr(data), data, takeOwnershipOfData);
  }

  public int lockDevice() {
    return AriaJavaJNI.ArRangeDevice_lockDevice(swigCPtr, this);
  }

  public int tryLockDevice() {
    return AriaJavaJNI.ArRangeDevice_tryLockDevice(swigCPtr, this);
  }

  public int unlockDevice() {
    return AriaJavaJNI.ArRangeDevice_unlockDevice(swigCPtr, this);
  }

}
