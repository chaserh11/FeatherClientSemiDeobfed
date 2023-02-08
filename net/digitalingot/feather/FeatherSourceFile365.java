package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile365 extends FeatherSourceFile369 implements Serializable {
   private static final long Th = 1L;
   public float Ti;
   public float Tj;
   public float Tm;
   public float Tk;
   public float Tl;
   public float Tn;
   public float To;
   public float Tp;
   public float Tq;

   public FeatherSourceFile365() {
      this.yZ();
   }

   public FeatherSourceFile365 lh(FeatherSourceFile365 var1) {
      return lh(var1, this);
   }

   public static FeatherSourceFile365 lh(FeatherSourceFile365 var0, FeatherSourceFile365 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile365();
      }

      var1.Ti = var0.Ti;
      var1.Tk = var0.Tk;
      var1.To = var0.To;
      var1.Tj = var0.Tj;
      var1.Tl = var0.Tl;
      var1.Tp = var0.Tp;
      var1.Tm = var0.Tm;
      var1.Tn = var0.Tn;
      var1.Tq = var0.Tq;
      return var1;
   }

   public FeatherSourceFile369 nc(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tj = var1.get();
      this.Tm = var1.get();
      this.Tk = var1.get();
      this.Tl = var1.get();
      this.Tn = var1.get();
      this.To = var1.get();
      this.Tp = var1.get();
      this.Tq = var1.get();
      return this;
   }

   public FeatherSourceFile369 xj(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tk = var1.get();
      this.To = var1.get();
      this.Tj = var1.get();
      this.Tl = var1.get();
      this.Tp = var1.get();
      this.Tm = var1.get();
      this.Tn = var1.get();
      this.Tq = var1.get();
      return this;
   }

   public FeatherSourceFile369 oe(FloatBuffer var1) {
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

   public FeatherSourceFile369 qy(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tk);
      var1.put(this.To);
      var1.put(this.Tj);
      var1.put(this.Tl);
      var1.put(this.Tp);
      var1.put(this.Tm);
      var1.put(this.Tn);
      var1.put(this.Tq);
      return this;
   }

   public static FeatherSourceFile365 lh(FeatherSourceFile365 var0, FeatherSourceFile365 var1, FeatherSourceFile365 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile365();
      }

      var2.Ti = var0.Ti + var1.Ti;
      var2.Tj = var0.Tj + var1.Tj;
      var2.Tm = var0.Tm + var1.Tm;
      var2.Tk = var0.Tk + var1.Tk;
      var2.Tl = var0.Tl + var1.Tl;
      var2.Tn = var0.Tn + var1.Tn;
      var2.To = var0.To + var1.To;
      var2.Tp = var0.Tp + var1.Tp;
      var2.Tq = var0.Tq + var1.Tq;
      return var2;
   }

   public static FeatherSourceFile365 nc(FeatherSourceFile365 var0, FeatherSourceFile365 var1, FeatherSourceFile365 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile365();
      }

      var2.Ti = var0.Ti - var1.Ti;
      var2.Tj = var0.Tj - var1.Tj;
      var2.Tm = var0.Tm - var1.Tm;
      var2.Tk = var0.Tk - var1.Tk;
      var2.Tl = var0.Tl - var1.Tl;
      var2.Tn = var0.Tn - var1.Tn;
      var2.To = var0.To - var1.To;
      var2.Tp = var0.Tp - var1.Tp;
      var2.Tq = var0.Tq - var1.Tq;
      return var2;
   }

   public static FeatherSourceFile365 xj(FeatherSourceFile365 var0, FeatherSourceFile365 var1, FeatherSourceFile365 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile365();
      }

      float var3 = var0.Ti * var1.Ti + var0.Tk * var1.Tj + var0.To * var1.Tm;
      float var4 = var0.Tj * var1.Ti + var0.Tl * var1.Tj + var0.Tp * var1.Tm;
      float var5 = var0.Tm * var1.Ti + var0.Tn * var1.Tj + var0.Tq * var1.Tm;
      float var6 = var0.Ti * var1.Tk + var0.Tk * var1.Tl + var0.To * var1.Tn;
      float var7 = var0.Tj * var1.Tk + var0.Tl * var1.Tl + var0.Tp * var1.Tn;
      float var8 = var0.Tm * var1.Tk + var0.Tn * var1.Tl + var0.Tq * var1.Tn;
      float var9 = var0.Ti * var1.To + var0.Tk * var1.Tp + var0.To * var1.Tq;
      float var10 = var0.Tj * var1.To + var0.Tl * var1.Tp + var0.Tp * var1.Tq;
      float var11 = var0.Tm * var1.To + var0.Tn * var1.Tp + var0.Tq * var1.Tq;
      var2.Ti = var3;
      var2.Tj = var4;
      var2.Tm = var5;
      var2.Tk = var6;
      var2.Tl = var7;
      var2.Tn = var8;
      var2.To = var9;
      var2.Tp = var10;
      var2.Tq = var11;
      return var2;
   }

   public static FeatherSourceFile401 lh(FeatherSourceFile365 var0, FeatherSourceFile401 var1, FeatherSourceFile401 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile401();
      }

      float var3 = var0.Ti * var1.Td + var0.Tk * var1.Te + var0.To * var1.Ty;
      float var4 = var0.Tj * var1.Td + var0.Tl * var1.Te + var0.Tp * var1.Ty;
      float var5 = var0.Tm * var1.Td + var0.Tn * var1.Te + var0.Tq * var1.Ty;
      var2.Td = var3;
      var2.Te = var4;
      var2.Ty = var5;
      return var2;
   }

   public FeatherSourceFile369 zB() {
      return nc(this, this);
   }

   public FeatherSourceFile365 nc(FeatherSourceFile365 var1) {
      return nc(this, var1);
   }

   public static FeatherSourceFile365 nc(FeatherSourceFile365 var0, FeatherSourceFile365 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile365();
      }

      float var2 = var0.Ti;
      float var3 = var0.Tk;
      float var4 = var0.To;
      float var5 = var0.Tj;
      float var6 = var0.Tl;
      float var7 = var0.Tp;
      float var8 = var0.Tm;
      float var9 = var0.Tn;
      float var10 = var0.Tq;
      var1.Ti = var2;
      var1.Tj = var3;
      var1.Tm = var4;
      var1.Tk = var5;
      var1.Tl = var6;
      var1.Tn = var7;
      var1.To = var8;
      var1.Tp = var9;
      var1.Tq = var10;
      return var1;
   }

   public float zD() {
      float var1 = this.Ti * (this.Tl * this.Tq - this.Tn * this.Tp) + this.Tj * (this.Tn * this.To - this.Tk * this.Tq) + this.Tm * (this.Tk * this.Tp - this.Tl * this.To);
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.Ti).append(' ').append(this.Tk).append(' ').append(this.To).append(' ').append('\n');
      var1.append(this.Tj).append(' ').append(this.Tl).append(' ').append(this.Tp).append(' ').append('\n');
      var1.append(this.Tm).append(' ').append(this.Tn).append(' ').append(this.Tq).append(' ').append('\n');
      return var1.toString();
   }

   public FeatherSourceFile369 zo() {
      return xj(this, this);
   }

   public static FeatherSourceFile365 xj(FeatherSourceFile365 var0, FeatherSourceFile365 var1) {
      float var2 = var0.zD();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new FeatherSourceFile365();
         }

         float var3 = 1.0F / var2;
         float var4 = var0.Tl * var0.Tq - var0.Tn * var0.Tp;
         float var5 = -var0.Tk * var0.Tq + var0.Tn * var0.To;
         float var6 = var0.Tk * var0.Tp - var0.Tl * var0.To;
         float var7 = -var0.Tj * var0.Tq + var0.Tm * var0.Tp;
         float var8 = var0.Ti * var0.Tq - var0.Tm * var0.To;
         float var9 = -var0.Ti * var0.Tp + var0.Tj * var0.To;
         float var10 = var0.Tj * var0.Tn - var0.Tm * var0.Tl;
         float var11 = -var0.Ti * var0.Tn + var0.Tm * var0.Tk;
         float var12 = var0.Ti * var0.Tl - var0.Tj * var0.Tk;
         var1.Ti = var4 * var3;
         var1.Tl = var8 * var3;
         var1.Tq = var12 * var3;
         var1.Tj = var7 * var3;
         var1.Tk = var5 * var3;
         var1.To = var6 * var3;
         var1.Tm = var10 * var3;
         var1.Tn = var11 * var3;
         var1.Tp = var9 * var3;
         return var1;
      } else {
         return null;
      }
   }

   public FeatherSourceFile369 zA() {
      return this.xj(this);
   }

   public FeatherSourceFile365 xj(FeatherSourceFile365 var1) {
      return oe(this, var1);
   }

   public static FeatherSourceFile365 oe(FeatherSourceFile365 var0, FeatherSourceFile365 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile365();
      }

      var1.Ti = -var0.Ti;
      var1.Tj = -var0.Tm;
      var1.Tm = -var0.Tj;
      var1.Tk = -var0.Tk;
      var1.Tl = -var0.Tn;
      var1.Tn = -var0.Tl;
      var1.To = -var0.To;
      var1.Tp = -var0.Tq;
      var1.Tq = -var0.Tp;
      return var1;
   }

   public FeatherSourceFile369 yZ() {
      return oe(this);
   }

   public static FeatherSourceFile365 oe(FeatherSourceFile365 var0) {
      var0.Ti = 1.0F;
      var0.Tj = 0.0F;
      var0.Tm = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 1.0F;
      var0.Tn = 0.0F;
      var0.To = 0.0F;
      var0.Tp = 0.0F;
      var0.Tq = 1.0F;
      return var0;
   }

   public FeatherSourceFile369 zC() {
      return qy(this);
   }

   public static FeatherSourceFile365 qy(FeatherSourceFile365 var0) {
      var0.Ti = 0.0F;
      var0.Tj = 0.0F;
      var0.Tm = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 0.0F;
      var0.Tn = 0.0F;
      var0.To = 0.0F;
      var0.Tp = 0.0F;
      var0.Tq = 0.0F;
      return var0;
   }
}
