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

public class ArActionGotoStraight extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionGotoStraight(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionGotoStraightUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionGotoStraight obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionGotoStraight(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionGotoStraight(String name, double speed) {
    this(AriaJavaJNI.new_ArActionGotoStraight__SWIG_0(name, speed), true);
  }

  public ArActionGotoStraight(String name) {
    this(AriaJavaJNI.new_ArActionGotoStraight__SWIG_1(name), true);
  }

  public ArActionGotoStraight() {
    this(AriaJavaJNI.new_ArActionGotoStraight__SWIG_2(), true);
  }

  public boolean haveAchievedGoal() {
    return AriaJavaJNI.ArActionGotoStraight_haveAchievedGoal(swigCPtr, this);
  }

  public void cancelGoal() {
    AriaJavaJNI.ArActionGotoStraight_cancelGoal(swigCPtr, this);
  }

  public void setGoal(ArPose goal, boolean backwards, boolean justDistance) {
    AriaJavaJNI.ArActionGotoStraight_setGoal__SWIG_0(swigCPtr, this, ArPose.getCPtr(goal), goal, backwards, justDistance);
  }

  public void setGoal(ArPose goal, boolean backwards) {
    AriaJavaJNI.ArActionGotoStraight_setGoal__SWIG_1(swigCPtr, this, ArPose.getCPtr(goal), goal, backwards);
  }

  public void setGoal(ArPose goal) {
    AriaJavaJNI.ArActionGotoStraight_setGoal__SWIG_2(swigCPtr, this, ArPose.getCPtr(goal), goal);
  }

  public void setGoalRel(double dist, double deltaHeading, boolean backwards, boolean justDistance) {
    AriaJavaJNI.ArActionGotoStraight_setGoalRel__SWIG_0(swigCPtr, this, dist, deltaHeading, backwards, justDistance);
  }

  public void setGoalRel(double dist, double deltaHeading, boolean backwards) {
    AriaJavaJNI.ArActionGotoStraight_setGoalRel__SWIG_1(swigCPtr, this, dist, deltaHeading, backwards);
  }

  public void setGoalRel(double dist, double deltaHeading) {
    AriaJavaJNI.ArActionGotoStraight_setGoalRel__SWIG_2(swigCPtr, this, dist, deltaHeading);
  }

  public ArPose getGoal() {
    return new ArPose(AriaJavaJNI.ArActionGotoStraight_getGoal(swigCPtr, this), true);
  }

  public boolean usingEncoderGoal() {
    return AriaJavaJNI.ArActionGotoStraight_usingEncoderGoal(swigCPtr, this);
  }

  public void setEncoderGoal(ArPose encoderGoal, boolean backwards, boolean justDistance) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoal__SWIG_0(swigCPtr, this, ArPose.getCPtr(encoderGoal), encoderGoal, backwards, justDistance);
  }

  public void setEncoderGoal(ArPose encoderGoal, boolean backwards) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoal__SWIG_1(swigCPtr, this, ArPose.getCPtr(encoderGoal), encoderGoal, backwards);
  }

  public void setEncoderGoal(ArPose encoderGoal) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoal__SWIG_2(swigCPtr, this, ArPose.getCPtr(encoderGoal), encoderGoal);
  }

  public void setEncoderGoalRel(double dist, double deltaHeading, boolean backwards, boolean justDistance) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoalRel__SWIG_0(swigCPtr, this, dist, deltaHeading, backwards, justDistance);
  }

  public void setEncoderGoalRel(double dist, double deltaHeading, boolean backwards) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoalRel__SWIG_1(swigCPtr, this, dist, deltaHeading, backwards);
  }

  public void setEncoderGoalRel(double dist, double deltaHeading) {
    AriaJavaJNI.ArActionGotoStraight_setEncoderGoalRel__SWIG_2(swigCPtr, this, dist, deltaHeading);
  }

  public ArPose getEncoderGoal() {
    return new ArPose(AriaJavaJNI.ArActionGotoStraight_getEncoderGoal(swigCPtr, this), true);
  }

  public void setSpeed(double speed) {
    AriaJavaJNI.ArActionGotoStraight_setSpeed(swigCPtr, this, speed);
  }

  public double getSpeed() {
    return AriaJavaJNI.ArActionGotoStraight_getSpeed(swigCPtr, this);
  }

  public void setCloseDist(double closeDist) {
    AriaJavaJNI.ArActionGotoStraight_setCloseDist__SWIG_0(swigCPtr, this, closeDist);
  }

  public void setCloseDist() {
    AriaJavaJNI.ArActionGotoStraight_setCloseDist__SWIG_1(swigCPtr, this);
  }

  public double getCloseDist() {
    return AriaJavaJNI.ArActionGotoStraight_getCloseDist(swigCPtr, this);
  }

  public boolean getBacking() {
    return AriaJavaJNI.ArActionGotoStraight_getBacking(swigCPtr, this);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionGotoStraight_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionGotoStraight_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

}
