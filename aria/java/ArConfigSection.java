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

public class ArConfigSection {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArConfigSection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArConfigSection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArConfigSection(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArConfigSection(String name, String comment) {
    this(AriaJavaJNI.new_ArConfigSection__SWIG_0(name, comment), true);
  }

  public ArConfigSection(String name) {
    this(AriaJavaJNI.new_ArConfigSection__SWIG_1(name), true);
  }

  public ArConfigSection() {
    this(AriaJavaJNI.new_ArConfigSection__SWIG_2(), true);
  }

  public ArConfigSection(ArConfigSection section) {
    this(AriaJavaJNI.new_ArConfigSection__SWIG_3(ArConfigSection.getCPtr(section), section), true);
  }

  public String getName() {
    return AriaJavaJNI.ArConfigSection_getName(swigCPtr, this);
  }

  public String getComment() {
    return AriaJavaJNI.ArConfigSection_getComment(swigCPtr, this);
  }

  public String getFlags() {
    return AriaJavaJNI.ArConfigSection_getFlags(swigCPtr, this);
  }

  public boolean hasFlag(String flag) {
    return AriaJavaJNI.ArConfigSection_hasFlag(swigCPtr, this, flag);
  }

  public SWIGTYPE_p_std__listT_ArConfigArg_t getParams() {
    long cPtr = AriaJavaJNI.ArConfigSection_getParams(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArConfigArg_t(cPtr, false);
  }

  public void setName(String name) {
    AriaJavaJNI.ArConfigSection_setName(swigCPtr, this, name);
  }

  public void setComment(String comment) {
    AriaJavaJNI.ArConfigSection_setComment(swigCPtr, this, comment);
  }

  public boolean addFlags(String flags, boolean isQuiet) {
    return AriaJavaJNI.ArConfigSection_addFlags__SWIG_0(swigCPtr, this, flags, isQuiet);
  }

  public boolean addFlags(String flags) {
    return AriaJavaJNI.ArConfigSection_addFlags__SWIG_1(swigCPtr, this, flags);
  }

  public boolean remFlag(String dataFlag) {
    return AriaJavaJNI.ArConfigSection_remFlag(swigCPtr, this, dataFlag);
  }

  public ArConfigArg findParam(String paramName) {
    long cPtr = AriaJavaJNI.ArConfigSection_findParam(swigCPtr, this, paramName);
    return (cPtr == 0) ? null : new ArConfigArg(cPtr, false);
  }

  public boolean remStringHolder(String paramName) {
    return AriaJavaJNI.ArConfigSection_remStringHolder(swigCPtr, this, paramName);
  }

}
