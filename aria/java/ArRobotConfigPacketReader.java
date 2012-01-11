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

public class ArRobotConfigPacketReader {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArRobotConfigPacketReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRobotConfigPacketReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArRobotConfigPacketReader(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArRobotConfigPacketReader(ArRobot robot, boolean onlyOneRequest, ArFunctor packetedArrivedCB) {
    this(AriaJavaJNI.new_ArRobotConfigPacketReader__SWIG_0(ArRobot.getCPtr(robot), robot, onlyOneRequest, ArFunctor.getCPtr(packetedArrivedCB), packetedArrivedCB), true);
  }

  public ArRobotConfigPacketReader(ArRobot robot, boolean onlyOneRequest) {
    this(AriaJavaJNI.new_ArRobotConfigPacketReader__SWIG_1(ArRobot.getCPtr(robot), robot, onlyOneRequest), true);
  }

  public ArRobotConfigPacketReader(ArRobot robot) {
    this(AriaJavaJNI.new_ArRobotConfigPacketReader__SWIG_2(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean requestPacket() {
    return AriaJavaJNI.ArRobotConfigPacketReader_requestPacket(swigCPtr, this);
  }

  public boolean hasPacketBeenRequested() {
    return AriaJavaJNI.ArRobotConfigPacketReader_hasPacketBeenRequested(swigCPtr, this);
  }

  public boolean hasPacketArrived() {
    return AriaJavaJNI.ArRobotConfigPacketReader_hasPacketArrived(swigCPtr, this);
  }

  public void log() {
    AriaJavaJNI.ArRobotConfigPacketReader_log(swigCPtr, this);
  }

  public void logMovement() {
    AriaJavaJNI.ArRobotConfigPacketReader_logMovement(swigCPtr, this);
  }

  public String buildString() {
    return AriaJavaJNI.ArRobotConfigPacketReader_buildString(swigCPtr, this);
  }

  public String buildStringMovement() {
    return AriaJavaJNI.ArRobotConfigPacketReader_buildStringMovement(swigCPtr, this);
  }

  public String getType() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getType(swigCPtr, this);
  }

  public String getSubType() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getSubType(swigCPtr, this);
  }

  public String getSerialNumber() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getSerialNumber(swigCPtr, this);
  }

  public int getRotVelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotVelTop(swigCPtr, this);
  }

  public int getTransVelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransVelTop(swigCPtr, this);
  }

  public int getRotAccelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotAccelTop(swigCPtr, this);
  }

  public int getTransAccelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransAccelTop(swigCPtr, this);
  }

  public int getPwmMax() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getPwmMax(swigCPtr, this);
  }

  public String getName() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getName(swigCPtr, this);
  }

  public int getSipCycleTime() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getSipCycleTime(swigCPtr, this);
  }

  public int getHostBaud() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getHostBaud(swigCPtr, this);
  }

  public int getAux1Baud() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getAux1Baud(swigCPtr, this);
  }

  public boolean getHasGripper() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getHasGripper(swigCPtr, this);
  }

  public boolean getFrontSonar() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getFrontSonar(swigCPtr, this);
  }

  public boolean getRearSonar() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRearSonar(swigCPtr, this);
  }

  public int getLowBattery() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLowBattery(swigCPtr, this);
  }

  public int getRevCount() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRevCount(swigCPtr, this);
  }

  public int getWatchdog() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getWatchdog(swigCPtr, this);
  }

  public boolean getNormalMPacs() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getNormalMPacs(swigCPtr, this);
  }

  public int getStallVal() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getStallVal(swigCPtr, this);
  }

  public int getStallCount() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getStallCount(swigCPtr, this);
  }

  public int getJoyVel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getJoyVel(swigCPtr, this);
  }

  public int getJoyRotVel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getJoyRotVel(swigCPtr, this);
  }

  public int getRotVelMax() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotVelMax(swigCPtr, this);
  }

  public int getTransVelMax() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransVelMax(swigCPtr, this);
  }

  public int getRotAccel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotAccel(swigCPtr, this);
  }

  public int getRotDecel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotDecel(swigCPtr, this);
  }

  public int getRotKP() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotKP(swigCPtr, this);
  }

  public int getRotKV() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotKV(swigCPtr, this);
  }

  public int getRotKI() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRotKI(swigCPtr, this);
  }

  public int getTransAccel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransAccel(swigCPtr, this);
  }

  public int getTransDecel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransDecel(swigCPtr, this);
  }

  public int getTransKP() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransKP(swigCPtr, this);
  }

  public int getTransKV() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransKV(swigCPtr, this);
  }

  public int getTransKI() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTransKI(swigCPtr, this);
  }

  public int getFrontBumps() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getFrontBumps(swigCPtr, this);
  }

  public int getRearBumps() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getRearBumps(swigCPtr, this);
  }

  public int getHasCharger() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getHasCharger(swigCPtr, this);
  }

  public int getSonarCycle() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getSonarCycle(swigCPtr, this);
  }

  public boolean getResetBaud() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getResetBaud(swigCPtr, this);
  }

  public boolean getHasGyro() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getHasGyro(swigCPtr, this);
  }

  public int getGyroType() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getGyroType(swigCPtr, this);
  }

  public int getDriftFactor() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getDriftFactor(swigCPtr, this);
  }

  public int getAux2Baud() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getAux2Baud(swigCPtr, this);
  }

  public int getAux3Baud() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getAux3Baud(swigCPtr, this);
  }

  public int getTicksMM() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getTicksMM(swigCPtr, this);
  }

  public int getShutdownVoltage() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getShutdownVoltage(swigCPtr, this);
  }

  public String getFirmwareVersion() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getFirmwareVersion(swigCPtr, this);
  }

  public int getGyroCW() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getGyroCW(swigCPtr, this);
  }

  public int getGyroCCW() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getGyroCCW(swigCPtr, this);
  }

  public int getKinematicsDelay() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getKinematicsDelay(swigCPtr, this);
  }

  public int getLatVelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLatVelTop(swigCPtr, this);
  }

  public int getLatAccelTop() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLatAccelTop(swigCPtr, this);
  }

  public int getLatVelMax() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLatVelMax(swigCPtr, this);
  }

  public int getLatAccel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLatAccel(swigCPtr, this);
  }

  public int getLatDecel() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getLatDecel(swigCPtr, this);
  }

  public int getPowerbotChargeThreshold() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getPowerbotChargeThreshold(swigCPtr, this);
  }

  public short getPDBPort() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getPDBPort(swigCPtr, this);
  }

  public int getGyroRateLimit() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getGyroRateLimit(swigCPtr, this);
  }

  public char getHighTemperatureShutdown() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getHighTemperatureShutdown(swigCPtr, this);
  }

  public int getPowerBits() {
    return AriaJavaJNI.ArRobotConfigPacketReader_getPowerBits(swigCPtr, this);
  }

  public boolean packetHandler(ArRobotPacket packet) {
    return AriaJavaJNI.ArRobotConfigPacketReader_packetHandler(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public void connected() {
    AriaJavaJNI.ArRobotConfigPacketReader_connected(swigCPtr, this);
  }

}
