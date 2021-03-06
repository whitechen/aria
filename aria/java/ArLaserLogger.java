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

public class ArLaserLogger {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArLaserLogger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLaserLogger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArLaserLogger(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals, ArJoyHandler joyHandler, String baseDirectory, boolean useReflectorValues, ArRobotJoyHandler robotJoyHandler, SWIGTYPE_p_std__mapT_std__string_ArRetFunctor2T_int_ArTime_ArPose_p_t_p_ArStrCaseCmpOp_t extraLocationData) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_0(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals, ArJoyHandler.getCPtr(joyHandler), joyHandler, baseDirectory, useReflectorValues, ArRobotJoyHandler.getCPtr(robotJoyHandler), robotJoyHandler, SWIGTYPE_p_std__mapT_std__string_ArRetFunctor2T_int_ArTime_ArPose_p_t_p_ArStrCaseCmpOp_t.getCPtr(extraLocationData)), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals, ArJoyHandler joyHandler, String baseDirectory, boolean useReflectorValues, ArRobotJoyHandler robotJoyHandler) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_1(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals, ArJoyHandler.getCPtr(joyHandler), joyHandler, baseDirectory, useReflectorValues, ArRobotJoyHandler.getCPtr(robotJoyHandler), robotJoyHandler), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals, ArJoyHandler joyHandler, String baseDirectory, boolean useReflectorValues) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_2(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals, ArJoyHandler.getCPtr(joyHandler), joyHandler, baseDirectory, useReflectorValues), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals, ArJoyHandler joyHandler, String baseDirectory) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_3(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals, ArJoyHandler.getCPtr(joyHandler), joyHandler, baseDirectory), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals, ArJoyHandler joyHandler) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_4(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals, ArJoyHandler.getCPtr(joyHandler), joyHandler), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName, boolean addGoals) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_5(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName, addGoals), true);
  }

  public ArLaserLogger(ArRobot robot, ArLaser laser, double distDiff, double degDiff, String fileName) {
    this(AriaJavaJNI.new_ArLaserLogger__SWIG_6(ArRobot.getCPtr(robot), robot, ArLaser.getCPtr(laser), laser, distDiff, degDiff, fileName), true);
  }

  public void addTagToLogPlain(String str) {
    AriaJavaJNI.ArLaserLogger_addTagToLogPlain(swigCPtr, this, str);
  }

  public void addInfoToLogPlain(String str) {
    AriaJavaJNI.ArLaserLogger_addInfoToLogPlain(swigCPtr, this, str);
  }

  public void setDistDiff(double distDiff) {
    AriaJavaJNI.ArLaserLogger_setDistDiff(swigCPtr, this, distDiff);
  }

  public double getDistDiff() {
    return AriaJavaJNI.ArLaserLogger_getDistDiff(swigCPtr, this);
  }

  public void setDegDiff(double degDiff) {
    AriaJavaJNI.ArLaserLogger_setDegDiff(swigCPtr, this, degDiff);
  }

  public double getDegDiff() {
    return AriaJavaJNI.ArLaserLogger_getDegDiff(swigCPtr, this);
  }

  public void takeReading() {
    AriaJavaJNI.ArLaserLogger_takeReading(swigCPtr, this);
  }

  public void addGoal() {
    AriaJavaJNI.ArLaserLogger_addGoal(swigCPtr, this);
  }

  public boolean wasFileOpenedSuccessfully() {
    return AriaJavaJNI.ArLaserLogger_wasFileOpenedSuccessfully(swigCPtr, this);
  }

  public boolean takingOldReadings() {
    return AriaJavaJNI.ArLaserLogger_takingOldReadings(swigCPtr, this);
  }

  public void takeOldReadings(boolean takeOld) {
    AriaJavaJNI.ArLaserLogger_takeOldReadings(swigCPtr, this, takeOld);
  }

  public boolean takingNewReadings() {
    return AriaJavaJNI.ArLaserLogger_takingNewReadings(swigCPtr, this);
  }

  public void takeNewReadings(boolean takeNew) {
    AriaJavaJNI.ArLaserLogger_takeNewReadings(swigCPtr, this, takeNew);
  }

}
