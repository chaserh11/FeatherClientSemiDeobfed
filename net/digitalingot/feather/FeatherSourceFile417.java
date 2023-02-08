package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile417 extends FeatherSourceFile369 implements Serializable {
   private static final long Th = 1L;
   public float Ti;
   public float Tj;
   public float Tm;
   public float Tr;
   public float Tk;
   public float Tl;
   public float Tn;
   public float Ts;
   public float To;
   public float Tp;
   public float Tq;
   public float Tt;
   public float Tu;
   public float Tv;
   public float Tw;
   public float Tx;

   public FeatherSourceFile417() {
      this.yZ();
   }

   public FeatherSourceFile417(FeatherSourceFile417 var1) {
      this.xj(var1);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.Ti).append(' ').append(this.Tk).append(' ').append(this.To).append(' ').append(this.Tu).append('\n');
      var1.append(this.Tj).append(' ').append(this.Tl).append(' ').append(this.Tp).append(' ').append(this.Tv).append('\n');
      var1.append(this.Tm).append(' ').append(this.Tn).append(' ').append(this.Tq).append(' ').append(this.Tw).append('\n');
      var1.append(this.Tr).append(' ').append(this.Ts).append(' ').append(this.Tt).append(' ').append(this.Tx).append('\n');
      return var1.toString();
   }

   public FeatherSourceFile369 yZ() {
      return lh(this);
   }

   public static FeatherSourceFile417 lh(FeatherSourceFile417 var0) {
      var0.Ti = 1.0F;
      var0.Tj = 0.0F;
      var0.Tm = 0.0F;
      var0.Tr = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 1.0F;
      var0.Tn = 0.0F;
      var0.Ts = 0.0F;
      var0.To = 0.0F;
      var0.Tp = 0.0F;
      var0.Tq = 1.0F;
      var0.Tt = 0.0F;
      var0.Tu = 0.0F;
      var0.Tv = 0.0F;
      var0.Tw = 0.0F;
      var0.Tx = 1.0F;
      return var0;
   }

   public FeatherSourceFile369 zC() {
      return nc(this);
   }

   public static FeatherSourceFile417 nc(FeatherSourceFile417 var0) {
      var0.Ti = 0.0F;
      var0.Tj = 0.0F;
      var0.Tm = 0.0F;
      var0.Tr = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 0.0F;
      var0.Tn = 0.0F;
      var0.Ts = 0.0F;
      var0.To = 0.0F;
      var0.Tp = 0.0F;
      var0.Tq = 0.0F;
      var0.Tt = 0.0F;
      var0.Tu = 0.0F;
      var0.Tv = 0.0F;
      var0.Tw = 0.0F;
      var0.Tx = 0.0F;
      return var0;
   }

   public FeatherSourceFile417 xj(FeatherSourceFile417 var1) {
      return lh(var1, this);
   }

   public static FeatherSourceFile417 lh(FeatherSourceFile417 var0, FeatherSourceFile417 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile417();
      }

      var1.Ti = var0.Ti;
      var1.Tj = var0.Tj;
      var1.Tm = var0.Tm;
      var1.Tr = var0.Tr;
      var1.Tk = var0.Tk;
      var1.Tl = var0.Tl;
      var1.Tn = var0.Tn;
      var1.Ts = var0.Ts;
      var1.To = var0.To;
      var1.Tp = var0.Tp;
      var1.Tq = var0.Tq;
      var1.Tt = var0.Tt;
      var1.Tu = var0.Tu;
      var1.Tv = var0.Tv;
      var1.Tw = var0.Tw;
      var1.Tx = var0.Tx;
      return var1;
   }

   public FeatherSourceFile369 nc(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tj = var1.get();
      this.Tm = var1.get();
      this.Tr = var1.get();
      this.Tk = var1.get();
      this.Tl = var1.get();
      this.Tn = var1.get();
      this.Ts = var1.get();
      this.To = var1.get();
      this.Tp = var1.get();
      this.Tq = var1.get();
      this.Tt = var1.get();
      this.Tu = var1.get();
      this.Tv = var1.get();
      this.Tw = var1.get();
      this.Tx = var1.get();
      return this;
   }

   public FeatherSourceFile369 xj(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tk = var1.get();
      this.To = var1.get();
      this.Tu = var1.get();
      this.Tj = var1.get();
      this.Tl = var1.get();
      this.Tp = var1.get();
      this.Tv = var1.get();
      this.Tm = var1.get();
      this.Tn = var1.get();
      this.Tq = var1.get();
      this.Tw = var1.get();
      this.Tr = var1.get();
      this.Ts = var1.get();
      this.Tt = var1.get();
      this.Tx = var1.get();
      return this;
   }

   public FeatherSourceFile369 oe(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tj);
      var1.put(this.Tm);
      var1.put(this.Tr);
      var1.put(this.Tk);
      var1.put(this.Tl);
      var1.put(this.Tn);
      var1.put(this.Ts);
      var1.put(this.To);
      var1.put(this.Tp);
      var1.put(this.Tq);
      var1.put(this.Tt);
      var1.put(this.Tu);
      var1.put(this.Tv);
      var1.put(this.Tw);
      var1.put(this.Tx);
      return this;
   }

   public FeatherSourceFile369 qy(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tk);
      var1.put(this.To);
      var1.put(this.Tu);
      var1.put(this.Tj);
      var1.put(this.Tl);
      var1.put(this.Tp);
      var1.put(this.Tv);
      var1.put(this.Tm);
      var1.put(this.Tn);
      var1.put(this.Tq);
      var1.put(this.Tw);
      var1.put(this.Tr);
      var1.put(this.Ts);
      var1.put(this.Tt);
      var1.put(this.Tx);
      return this;
   }

   public FeatherSourceFile369 ou(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tj);
      var1.put(this.Tm);
      var1.put(this.Tk);
      var1.put(this.Tl);
      var1.put(this.Tn);
      var1.put(this.To);
      var1.put(this.Tp);
      var1.put(this.Tq);
      return this;
   }

   public static FeatherSourceFile417 lh(FeatherSourceFile417 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      var2.Ti = var0.Ti + var1.Ti;
      var2.Tj = var0.Tj + var1.Tj;
      var2.Tm = var0.Tm + var1.Tm;
      var2.Tr = var0.Tr + var1.Tr;
      var2.Tk = var0.Tk + var1.Tk;
      var2.Tl = var0.Tl + var1.Tl;
      var2.Tn = var0.Tn + var1.Tn;
      var2.Ts = var0.Ts + var1.Ts;
      var2.To = var0.To + var1.To;
      var2.Tp = var0.Tp + var1.Tp;
      var2.Tq = var0.Tq + var1.Tq;
      var2.Tt = var0.Tt + var1.Tt;
      var2.Tu = var0.Tu + var1.Tu;
      var2.Tv = var0.Tv + var1.Tv;
      var2.Tw = var0.Tw + var1.Tw;
      var2.Tx = var0.Tx + var1.Tx;
      return var2;
   }

   public static FeatherSourceFile417 nc(FeatherSourceFile417 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      var2.Ti = var0.Ti - var1.Ti;
      var2.Tj = var0.Tj - var1.Tj;
      var2.Tm = var0.Tm - var1.Tm;
      var2.Tr = var0.Tr - var1.Tr;
      var2.Tk = var0.Tk - var1.Tk;
      var2.Tl = var0.Tl - var1.Tl;
      var2.Tn = var0.Tn - var1.Tn;
      var2.Ts = var0.Ts - var1.Ts;
      var2.To = var0.To - var1.To;
      var2.Tp = var0.Tp - var1.Tp;
      var2.Tq = var0.Tq - var1.Tq;
      var2.Tt = var0.Tt - var1.Tt;
      var2.Tu = var0.Tu - var1.Tu;
      var2.Tv = var0.Tv - var1.Tv;
      var2.Tw = var0.Tw - var1.Tw;
      var2.Tx = var0.Tx - var1.Tx;
      return var2;
   }

   public static FeatherSourceFile417 xj(FeatherSourceFile417 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      float var3 = var0.Ti * var1.Ti + var0.Tk * var1.Tj + var0.To * var1.Tm + var0.Tu * var1.Tr;
      float var4 = var0.Tj * var1.Ti + var0.Tl * var1.Tj + var0.Tp * var1.Tm + var0.Tv * var1.Tr;
      float var5 = var0.Tm * var1.Ti + var0.Tn * var1.Tj + var0.Tq * var1.Tm + var0.Tw * var1.Tr;
      float var6 = var0.Tr * var1.Ti + var0.Ts * var1.Tj + var0.Tt * var1.Tm + var0.Tx * var1.Tr;
      float var7 = var0.Ti * var1.Tk + var0.Tk * var1.Tl + var0.To * var1.Tn + var0.Tu * var1.Ts;
      float var8 = var0.Tj * var1.Tk + var0.Tl * var1.Tl + var0.Tp * var1.Tn + var0.Tv * var1.Ts;
      float var9 = var0.Tm * var1.Tk + var0.Tn * var1.Tl + var0.Tq * var1.Tn + var0.Tw * var1.Ts;
      float var10 = var0.Tr * var1.Tk + var0.Ts * var1.Tl + var0.Tt * var1.Tn + var0.Tx * var1.Ts;
      float var11 = var0.Ti * var1.To + var0.Tk * var1.Tp + var0.To * var1.Tq + var0.Tu * var1.Tt;
      float var12 = var0.Tj * var1.To + var0.Tl * var1.Tp + var0.Tp * var1.Tq + var0.Tv * var1.Tt;
      float var13 = var0.Tm * var1.To + var0.Tn * var1.Tp + var0.Tq * var1.Tq + var0.Tw * var1.Tt;
      float var14 = var0.Tr * var1.To + var0.Ts * var1.Tp + var0.Tt * var1.Tq + var0.Tx * var1.Tt;
      float var15 = var0.Ti * var1.Tu + var0.Tk * var1.Tv + var0.To * var1.Tw + var0.Tu * var1.Tx;
      float var16 = var0.Tj * var1.Tu + var0.Tl * var1.Tv + var0.Tp * var1.Tw + var0.Tv * var1.Tx;
      float var17 = var0.Tm * var1.Tu + var0.Tn * var1.Tv + var0.Tq * var1.Tw + var0.Tw * var1.Tx;
      float var18 = var0.Tr * var1.Tu + var0.Ts * var1.Tv + var0.Tt * var1.Tw + var0.Tx * var1.Tx;
      var2.Ti = var3;
      var2.Tj = var4;
      var2.Tm = var5;
      var2.Tr = var6;
      var2.Tk = var7;
      var2.Tl = var8;
      var2.Tn = var9;
      var2.Ts = var10;
      var2.To = var11;
      var2.Tp = var12;
      var2.Tq = var13;
      var2.Tt = var14;
      var2.Tu = var15;
      var2.Tv = var16;
      var2.Tw = var17;
      var2.Tx = var18;
      return var2;
   }

   public static FeatherSourceFile399 lh(FeatherSourceFile417 var0, FeatherSourceFile399 var1, FeatherSourceFile399 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile399();
      }

      float var3 = var0.Ti * var1.Td + var0.Tk * var1.Te + var0.To * var1.Ty + var0.Tu * var1.Tz;
      float var4 = var0.Tj * var1.Td + var0.Tl * var1.Te + var0.Tp * var1.Ty + var0.Tv * var1.Tz;
      float var5 = var0.Tm * var1.Td + var0.Tn * var1.Te + var0.Tq * var1.Ty + var0.Tw * var1.Tz;
      float var6 = var0.Tr * var1.Td + var0.Ts * var1.Te + var0.Tt * var1.Ty + var0.Tx * var1.Tz;
      var2.Td = var3;
      var2.Te = var4;
      var2.Ty = var5;
      var2.Tz = var6;
      return var2;
   }

   public FeatherSourceFile369 zB() {
      return this.oe(this);
   }

   public FeatherSourceFile417 nc(FeatherSourceFile403 var1) {
      return this.lh(var1, this);
   }

   public FeatherSourceFile417 lh(FeatherSourceFile401 var1) {
      return this.lh(var1, this);
   }

   public FeatherSourceFile417 nc(FeatherSourceFile401 var1) {
      return lh(var1, this, this);
   }

   public static FeatherSourceFile417 lh(FeatherSourceFile401 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      var2.Ti = var1.Ti * var0.Td;
      var2.Tj = var1.Tj * var0.Td;
      var2.Tm = var1.Tm * var0.Td;
      var2.Tr = var1.Tr * var0.Td;
      var2.Tk = var1.Tk * var0.Te;
      var2.Tl = var1.Tl * var0.Te;
      var2.Tn = var1.Tn * var0.Te;
      var2.Ts = var1.Ts * var0.Te;
      var2.To = var1.To * var0.Ty;
      var2.Tp = var1.Tp * var0.Ty;
      var2.Tq = var1.Tq * var0.Ty;
      var2.Tt = var1.Tt * var0.Ty;
      return var2;
   }

   public FeatherSourceFile417 lh(float var1, FeatherSourceFile401 var2) {
      return this.lh(var1, var2, this);
   }

   public FeatherSourceFile417 lh(float var1, FeatherSourceFile401 var2, FeatherSourceFile417 var3) {
      return lh(var1, var2, this, var3);
   }

   public static FeatherSourceFile417 lh(float var0, FeatherSourceFile401 var1, FeatherSourceFile417 var2, FeatherSourceFile417 var3) {
      if (var3 == null) {
         var3 = new FeatherSourceFile417();
      }

      float var4 = (float)Math.cos((double)var0);
      float var5 = (float)Math.sin((double)var0);
      float var6 = 1.0F - var4;
      float var7 = var1.Td * var1.Te;
      float var8 = var1.Te * var1.Ty;
      float var9 = var1.Td * var1.Ty;
      float var10 = var1.Td * var5;
      float var11 = var1.Te * var5;
      float var12 = var1.Ty * var5;
      float var13 = var1.Td * var1.Td * var6 + var4;
      float var14 = var7 * var6 + var12;
      float var15 = var9 * var6 - var11;
      float var16 = var7 * var6 - var12;
      float var17 = var1.Te * var1.Te * var6 + var4;
      float var18 = var8 * var6 + var10;
      float var19 = var9 * var6 + var11;
      float var20 = var8 * var6 - var10;
      float var21 = var1.Ty * var1.Ty * var6 + var4;
      float var22 = var2.Ti * var13 + var2.Tk * var14 + var2.To * var15;
      float var23 = var2.Tj * var13 + var2.Tl * var14 + var2.Tp * var15;
      float var24 = var2.Tm * var13 + var2.Tn * var14 + var2.Tq * var15;
      float var25 = var2.Tr * var13 + var2.Ts * var14 + var2.Tt * var15;
      float var26 = var2.Ti * var16 + var2.Tk * var17 + var2.To * var18;
      float var27 = var2.Tj * var16 + var2.Tl * var17 + var2.Tp * var18;
      float var28 = var2.Tm * var16 + var2.Tn * var17 + var2.Tq * var18;
      float var29 = var2.Tr * var16 + var2.Ts * var17 + var2.Tt * var18;
      var3.To = var2.Ti * var19 + var2.Tk * var20 + var2.To * var21;
      var3.Tp = var2.Tj * var19 + var2.Tl * var20 + var2.Tp * var21;
      var3.Tq = var2.Tm * var19 + var2.Tn * var20 + var2.Tq * var21;
      var3.Tt = var2.Tr * var19 + var2.Ts * var20 + var2.Tt * var21;
      var3.Ti = var22;
      var3.Tj = var23;
      var3.Tm = var24;
      var3.Tr = var25;
      var3.Tk = var26;
      var3.Tl = var27;
      var3.Tn = var28;
      var3.Ts = var29;
      return var3;
   }

   public FeatherSourceFile417 lh(FeatherSourceFile401 var1, FeatherSourceFile417 var2) {
      return nc(var1, this, var2);
   }

   public static FeatherSourceFile417 nc(FeatherSourceFile401 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      var2.Tu += var1.Ti * var0.Td + var1.Tk * var0.Te + var1.To * var0.Ty;
      var2.Tv += var1.Tj * var0.Td + var1.Tl * var0.Te + var1.Tp * var0.Ty;
      var2.Tw += var1.Tm * var0.Td + var1.Tn * var0.Te + var1.Tq * var0.Ty;
      var2.Tx += var1.Tr * var0.Td + var1.Ts * var0.Te + var1.Tt * var0.Ty;
      return var2;
   }

   public FeatherSourceFile417 lh(FeatherSourceFile403 var1, FeatherSourceFile417 var2) {
      return lh(var1, this, var2);
   }

   public static FeatherSourceFile417 lh(FeatherSourceFile403 var0, FeatherSourceFile417 var1, FeatherSourceFile417 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile417();
      }

      var2.Tu += var1.Ti * var0.Td + var1.Tk * var0.Te;
      var2.Tv += var1.Tj * var0.Td + var1.Tl * var0.Te;
      var2.Tw += var1.Tm * var0.Td + var1.Tn * var0.Te;
      var2.Tx += var1.Tr * var0.Td + var1.Ts * var0.Te;
      return var2;
   }

   public FeatherSourceFile417 oe(FeatherSourceFile417 var1) {
      return nc(this, var1);
   }

   public static FeatherSourceFile417 nc(FeatherSourceFile417 var0, FeatherSourceFile417 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile417();
      }

      float var2 = var0.Ti;
      float var3 = var0.Tk;
      float var4 = var0.To;
      float var5 = var0.Tu;
      float var6 = var0.Tj;
      float var7 = var0.Tl;
      float var8 = var0.Tp;
      float var9 = var0.Tv;
      float var10 = var0.Tm;
      float var11 = var0.Tn;
      float var12 = var0.Tq;
      float var13 = var0.Tw;
      float var14 = var0.Tr;
      float var15 = var0.Ts;
      float var16 = var0.Tt;
      float var17 = var0.Tx;
      var1.Ti = var2;
      var1.Tj = var3;
      var1.Tm = var4;
      var1.Tr = var5;
      var1.Tk = var6;
      var1.Tl = var7;
      var1.Tn = var8;
      var1.Ts = var9;
      var1.To = var10;
      var1.Tp = var11;
      var1.Tq = var12;
      var1.Tt = var13;
      var1.Tu = var14;
      var1.Tv = var15;
      var1.Tw = var16;
      var1.Tx = var17;
      return var1;
   }

   public float zD() {
      float var1 = this.Ti * (this.Tl * this.Tq * this.Tx + this.Tn * this.Tt * this.Tv + this.Ts * this.Tp * this.Tw - this.Ts * this.Tq * this.Tv - this.Tl * this.Tt * this.Tw - this.Tn * this.Tp * this.Tx);
      var1 -= this.Tj * (this.Tk * this.Tq * this.Tx + this.Tn * this.Tt * this.Tu + this.Ts * this.To * this.Tw - this.Ts * this.Tq * this.Tu - this.Tk * this.Tt * this.Tw - this.Tn * this.To * this.Tx);
      var1 += this.Tm * (this.Tk * this.Tp * this.Tx + this.Tl * this.Tt * this.Tu + this.Ts * this.To * this.Tv - this.Ts * this.Tp * this.Tu - this.Tk * this.Tt * this.Tv - this.Tl * this.To * this.Tx);
      var1 -= this.Tr * (this.Tk * this.Tp * this.Tw + this.Tl * this.Tq * this.Tu + this.Tn * this.To * this.Tv - this.Tn * this.Tp * this.Tu - this.Tk * this.Tq * this.Tv - this.Tl * this.To * this.Tw);
      return var1;
   }

   private static float lh(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return var0 * (var4 * var8 - var5 * var7) + var1 * (var5 * var6 - var3 * var8) + var2 * (var3 * var7 - var4 * var6);
   }

   public FeatherSourceFile369 zo() {
      return xj(this, this);
   }

   public static FeatherSourceFile417 xj(FeatherSourceFile417 var0, FeatherSourceFile417 var1) {
      float var2 = var0.zD();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new FeatherSourceFile417();
         }

         float var3 = 1.0F / var2;
         float var4 = lh(var0.Tl, var0.Tn, var0.Ts, var0.Tp, var0.Tq, var0.Tt, var0.Tv, var0.Tw, var0.Tx);
         float var5 = -lh(var0.Tk, var0.Tn, var0.Ts, var0.To, var0.Tq, var0.Tt, var0.Tu, var0.Tw, var0.Tx);
         float var6 = lh(var0.Tk, var0.Tl, var0.Ts, var0.To, var0.Tp, var0.Tt, var0.Tu, var0.Tv, var0.Tx);
         float var7 = -lh(var0.Tk, var0.Tl, var0.Tn, var0.To, var0.Tp, var0.Tq, var0.Tu, var0.Tv, var0.Tw);
         float var8 = -lh(var0.Tj, var0.Tm, var0.Tr, var0.Tp, var0.Tq, var0.Tt, var0.Tv, var0.Tw, var0.Tx);
         float var9 = lh(var0.Ti, var0.Tm, var0.Tr, var0.To, var0.Tq, var0.Tt, var0.Tu, var0.Tw, var0.Tx);
         float var10 = -lh(var0.Ti, var0.Tj, var0.Tr, var0.To, var0.Tp, var0.Tt, var0.Tu, var0.Tv, var0.Tx);
         float var11 = lh(var0.Ti, var0.Tj, var0.Tm, var0.To, var0.Tp, var0.Tq, var0.Tu, var0.Tv, var0.Tw);
         float var12 = lh(var0.Tj, var0.Tm, var0.Tr, var0.Tl, var0.Tn, var0.Ts, var0.Tv, var0.Tw, var0.Tx);
         float var13 = -lh(var0.Ti, var0.Tm, var0.Tr, var0.Tk, var0.Tn, var0.Ts, var0.Tu, var0.Tw, var0.Tx);
         float var14 = lh(var0.Ti, var0.Tj, var0.Tr, var0.Tk, var0.Tl, var0.Ts, var0.Tu, var0.Tv, var0.Tx);
         float var15 = -lh(var0.Ti, var0.Tj, var0.Tm, var0.Tk, var0.Tl, var0.Tn, var0.Tu, var0.Tv, var0.Tw);
         float var16 = -lh(var0.Tj, var0.Tm, var0.Tr, var0.Tl, var0.Tn, var0.Ts, var0.Tp, var0.Tq, var0.Tt);
         float var17 = lh(var0.Ti, var0.Tm, var0.Tr, var0.Tk, var0.Tn, var0.Ts, var0.To, var0.Tq, var0.Tt);
         float var18 = -lh(var0.Ti, var0.Tj, var0.Tr, var0.Tk, var0.Tl, var0.Ts, var0.To, var0.Tp, var0.Tt);
         float var19 = lh(var0.Ti, var0.Tj, var0.Tm, var0.Tk, var0.Tl, var0.Tn, var0.To, var0.Tp, var0.Tq);
         var1.Ti = var4 * var3;
         var1.Tl = var9 * var3;
         var1.Tq = var14 * var3;
         var1.Tx = var19 * var3;
         var1.Tj = var8 * var3;
         var1.Tk = var5 * var3;
         var1.To = var6 * var3;
         var1.Tm = var12 * var3;
         var1.Tn = var13 * var3;
         var1.Tp = var10 * var3;
         var1.Tr = var16 * var3;
         var1.Tu = var7 * var3;
         var1.Ts = var17 * var3;
         var1.Tv = var11 * var3;
         var1.Tw = var15 * var3;
         var1.Tt = var18 * var3;
         return var1;
      } else {
         return null;
      }
   }

   public FeatherSourceFile369 zA() {
      return this.qy(this);
   }

   public FeatherSourceFile417 qy(FeatherSourceFile417 var1) {
      return oe(this, var1);
   }

   public static FeatherSourceFile417 oe(FeatherSourceFile417 var0, FeatherSourceFile417 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile417();
      }

      var1.Ti = -var0.Ti;
      var1.Tj = -var0.Tj;
      var1.Tm = -var0.Tm;
      var1.Tr = -var0.Tr;
      var1.Tk = -var0.Tk;
      var1.Tl = -var0.Tl;
      var1.Tn = -var0.Tn;
      var1.Ts = -var0.Ts;
      var1.To = -var0.To;
      var1.Tp = -var0.Tp;
      var1.Tq = -var0.Tq;
      var1.Tt = -var0.Tt;
      var1.Tu = -var0.Tu;
      var1.Tv = -var0.Tv;
      var1.Tw = -var0.Tw;
      var1.Tx = -var0.Tx;
      return var1;
   }
}
