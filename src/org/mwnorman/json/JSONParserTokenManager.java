/* Generated By:JJTree&JavaCC: Do not edit this line. JSONParserTokenManager.java */
/*
 * This software is licensed under the terms of the ISC License.
 * (ISCL http://www.opensource.org/licenses/isc-license.txt
 * It is functionally equivalent to the 2-clause BSD licence,
 * with language "made unnecessary by the Berne convention" removed).
 * 
 * Copyright (c) 2011, Mike Norman
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER
 * RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 * NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE
 * USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 */
package org.mwnorman.json;
//javase imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Token Manager. */
@SuppressWarnings("all")
public class JSONParserTokenManager implements JSONParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20000L) != 0L)
            return 1;
         if ((active0 & 0x80000L) != 0L)
            return 36;
         if ((active0 & 0x700L) != 0L)
         {
            jjmatchedKind = 29;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x700L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 29;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x700L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 29;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x700L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 29;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         return jjStopAtPos(0, 1);
      case 43:
         return jjStopAtPos(0, 18);
      case 44:
         return jjStopAtPos(0, 15);
      case 45:
         return jjStartNfaWithStates_0(0, 19, 36);
      case 46:
         return jjStartNfaWithStates_0(0, 17, 1);
      case 58:
         return jjStopAtPos(0, 16);
      case 91:
         return jjStopAtPos(0, 13);
      case 93:
         return jjStopAtPos(0, 14);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 123:
         return jjStopAtPos(0, 11);
      case 125:
         return jjStopAtPos(0, 12);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x600L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(3, 8);
         break;
      case 108:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(3, 10);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 64;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffb00000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAddStates(3, 6);
                  }
                  else if (curChar == 45)
                     jjAddStates(7, 16);
                  else if (curChar == 47)
                     jjAddStates(17, 18);
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(19, 23);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(51);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(40);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(60);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(57);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(49);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(43);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(38);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(4);
                  break;
               case 5:
               case 14:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if ((0xfffffffb00000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 13:
                  if (curChar == 34 && kind > 28)
                     kind = 28;
                  break;
               case 15:
                  if ((0xfffffffb00000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 22:
                  if (curChar == 34 && kind > 29)
                     kind = 29;
                  break;
               case 23:
                  if (curChar == 47)
                     jjAddStates(17, 18);
                  break;
               case 24:
                  if (curChar == 47)
                     jjCheckNAddStates(24, 26);
                  break;
               case 25:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(24, 26);
                  break;
               case 26:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 27:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 28:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 30:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 31:
                  if (curChar == 42)
                     jjCheckNAddStates(27, 29);
                  break;
               case 32:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 31);
                  break;
               case 33:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 31);
                  break;
               case 34:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 35:
                  if (curChar == 45)
                     jjAddStates(7, 16);
                  break;
               case 37:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(38);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(38);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if (curChar == 46)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(43);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(43, 40);
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 46:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(47);
                  break;
               case 48:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(49);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(49, 45);
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(51);
                  break;
               case 51:
                  if (curChar == 46)
                     jjCheckNAdd(52);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               case 54:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(55);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(55);
                  break;
               case 56:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(57);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(57, 51);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 59:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAdd(60);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(60);
                  break;
               case 61:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddStates(3, 6);
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(62);
                  break;
               case 63:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(19, 23);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  else if (curChar == 92)
                     jjAddStates(30, 31);
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(32, 33);
                  break;
               case 2:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(32, 33);
                  break;
               case 6:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if (curChar == 92)
                     jjAddStates(34, 35);
                  break;
               case 8:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 14:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 15:
                  if ((0xffffffffefffffffL & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 16:
                  if (curChar == 92)
                     jjAddStates(30, 31);
                  break;
               case 17:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x7e0000007eL & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 22:
                  if ((0x14404410000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 25:
                  jjAddStates(24, 26);
                  break;
               case 30:
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
               case 33:
                  jjCheckNAddTwoStates(33, 31);
                  break;
               case 45:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 53:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(38, 39);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 29)
                     kind = 29;
                  break;
               case 6:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(0, 2);
                  break;
               case 25:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(24, 26);
                  break;
               case 30:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
               case 33:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(33, 31);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 64 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   6, 7, 13, 40, 45, 51, 62, 36, 37, 39, 42, 44, 48, 50, 56, 58, 
   59, 24, 29, 38, 43, 49, 57, 60, 25, 26, 28, 31, 32, 34, 17, 22, 
   3, 4, 8, 14, 46, 47, 54, 55, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\164\162\165\145", 
"\146\141\154\163\145", "\156\165\154\154", "\173", "\175", "\133", "\135", "\54", "\72", "\56", 
"\53", "\55", null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3f8fff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[64];
private final int[] jjstateSet = new int[128];
protected char curChar;
/** Constructor. */
public JSONParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public JSONParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 64; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x3600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
