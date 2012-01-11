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

public class ArStringInfoGroup {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArStringInfoGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArStringInfoGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArStringInfoGroup(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArStringInfoGroup() {
    this(AriaJavaJNI.new_ArStringInfoGroup(), true);
  }

  public boolean addString(String name, int maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t functor) {
    return AriaJavaJNI.ArStringInfoGroup_addString(swigCPtr, this, name, maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t.getCPtr(functor));
  }

  public boolean addStringInt(String name, int maxLen, ArRetFunctor_Int functor, String format) {
    return AriaJavaJNI.ArStringInfoGroup_addStringInt__SWIG_0(swigCPtr, this, name, maxLen, ArRetFunctor_Int.getCPtr(functor), functor, format);
  }

  public boolean addStringInt(String name, int maxLen, ArRetFunctor_Int functor) {
    return AriaJavaJNI.ArStringInfoGroup_addStringInt__SWIG_1(swigCPtr, this, name, maxLen, ArRetFunctor_Int.getCPtr(functor), functor);
  }

  public boolean addStringDouble(String name, int maxLen, ArRetFunctor_Double functor, String format) {
    return AriaJavaJNI.ArStringInfoGroup_addStringDouble__SWIG_0(swigCPtr, this, name, maxLen, ArRetFunctor_Double.getCPtr(functor), functor, format);
  }

  public boolean addStringDouble(String name, int maxLen, ArRetFunctor_Double functor) {
    return AriaJavaJNI.ArStringInfoGroup_addStringDouble__SWIG_1(swigCPtr, this, name, maxLen, ArRetFunctor_Double.getCPtr(functor), functor);
  }

  public boolean addStringBool(String name, int maxLen, ArRetFunctor_Bool functor, String format) {
    return AriaJavaJNI.ArStringInfoGroup_addStringBool__SWIG_0(swigCPtr, this, name, maxLen, ArRetFunctor_Bool.getCPtr(functor), functor, format);
  }

  public boolean addStringBool(String name, int maxLen, ArRetFunctor_Bool functor) {
    return AriaJavaJNI.ArStringInfoGroup_addStringBool__SWIG_1(swigCPtr, this, name, maxLen, ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public boolean addStringString(String name, int maxLen, SWIGTYPE_p_ArRetFunctorT_char_const_p_t functor, String format) {
    return AriaJavaJNI.ArStringInfoGroup_addStringString__SWIG_0(swigCPtr, this, name, maxLen, SWIGTYPE_p_ArRetFunctorT_char_const_p_t.getCPtr(functor), format);
  }

  public boolean addStringString(String name, int maxLen, SWIGTYPE_p_ArRetFunctorT_char_const_p_t functor) {
    return AriaJavaJNI.ArStringInfoGroup_addStringString__SWIG_1(swigCPtr, this, name, maxLen, SWIGTYPE_p_ArRetFunctorT_char_const_p_t.getCPtr(functor));
  }

  public void addAddStringCallback(SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t functor, ArListPos.Pos position) {
    AriaJavaJNI.ArStringInfoGroup_addAddStringCallback__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t.getCPtr(functor), position.swigValue());
  }

  public void addAddStringCallback(SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t functor) {
    AriaJavaJNI.ArStringInfoGroup_addAddStringCallback__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t.getCPtr(functor));
  }

}
