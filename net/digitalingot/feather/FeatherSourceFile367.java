package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile367 extends FeatherSourceFile369 implements Serializable {
   private static final long Th = 1L;
   public float Ti;
   public float Tj;
   public float Tk;
   public float Tl;

   public FeatherSourceFile367() {
      this.yZ();
   }

   public FeatherSourceFile367(FeatherSourceFile367 var1) {
      this.lh(var1);
   }

   public FeatherSourceFile367 lh(FeatherSourceFile367 var1) {
      return lh(var1, this);
   }

   public static FeatherSourceFile367 lh(FeatherSourceFile367 var0, FeatherSourceFile367 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile367();
      }

      var1.Ti = var0.Ti;
      var1.Tj = var0.Tj;
      var1.Tk = var0.Tk;
      var1.Tl = var0.Tl;
      return var1;
   }

   public FeatherSourceFile369 nc(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tj = var1.get();
      this.Tk = var1.get();
      this.Tl = var1.get();
      return this;
   }

   public FeatherSourceFile369 xj(FloatBuffer var1) {
      this.Ti = var1.get();
      this.Tk = var1.get();
      this.Tj = var1.get();
      this.Tl = var1.get();
      return this;
   }

   public FeatherSourceFile369 oe(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tj);
      var1.put(this.Tk);
      var1.put(this.Tl);
      return this;
   }

   public FeatherSourceFile369 qy(FloatBuffer var1) {
      var1.put(this.Ti);
      var1.put(this.Tk);
      var1.put(this.Tj);
      var1.put(this.Tl);
      return this;
   }

   public static FeatherSourceFile367 lh(FeatherSourceFile367 var0, FeatherSourceFile367 var1, FeatherSourceFile367 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile367();
      }

      var2.Ti = var0.Ti + var1.Ti;
      var2.Tj = var0.Tj + var1.Tj;
      var2.Tk = var0.Tk + var1.Tk;
      var2.Tl = var0.Tl + var1.Tl;
      return var2;
   }

   public static FeatherSourceFile367 nc(FeatherSourceFile367 var0, FeatherSourceFile367 var1, FeatherSourceFile367 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile367();
      }

      var2.Ti = var0.Ti - var1.Ti;
      var2.Tj = var0.Tj - var1.Tj;
      var2.Tk = var0.Tk - var1.Tk;
      var2.Tl = var0.Tl - var1.Tl;
      return var2;
   }

   public static FeatherSourceFile367 xj(FeatherSourceFile367 var0, FeatherSourceFile367 var1, FeatherSourceFile367 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile367();
      }

      float var3 = var0.Ti * var1.Ti + var0.Tk * var1.Tj;
      float var4 = var0.Tj * var1.Ti + var0.Tl * var1.Tj;
      float var5 = var0.Ti * var1.Tk + var0.Tk * var1.Tl;
      float var6 = var0.Tj * var1.Tk + var0.Tl * var1.Tl;
      var2.Ti = var3;
      var2.Tj = var4;
      var2.Tk = var5;
      var2.Tl = var6;
      return var2;
   }

   public static FeatherSourceFile403 lh(FeatherSourceFile367 var0, FeatherSourceFile403 var1, FeatherSourceFile403 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile403();
      }

      float var3 = var0.Ti * var1.Td + var0.Tk * var1.Te;
      float var4 = var0.Tj * var1.Td + var0.Tl * var1.Te;
      var2.Td = var3;
      var2.Te = var4;
      return var2;
   }

   public FeatherSourceFile369 zB() {
      return this.nc(this);
   }

   public FeatherSourceFile367 nc(FeatherSourceFile367 var1) {
      return nc(this, var1);
   }

   public static FeatherSourceFile367 nc(FeatherSourceFile367 var0, FeatherSourceFile367 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile367();
      }

      float var2 = var0.Tk;
      float var3 = var0.Tj;
      var1.Tj = var2;
      var1.Tk = var3;
      return var1;
   }

   public FeatherSourceFile369 zo() {
      return xj(this, this);
   }

   public static FeatherSourceFile367 xj(FeatherSourceFile367 var0, FeatherSourceFile367 var1) {
      float var2 = var0.zD();
      if (var2 != 0.0F) {
         if (var1 == null) {
            var1 = new FeatherSourceFile367();
         }

         float var3 = 1.0F / var2;
         float var4 = var0.Tl * var3;
         float var5 = -var0.Tj * var3;
         float var6 = var0.Ti * var3;
         float var7 = -var0.Tk * var3;
         var1.Ti = var4;
         var1.Tj = var5;
         var1.Tk = var7;
         var1.Tl = var6;
         return var1;
      } else {
         return null;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.Ti).append(' ').append(this.Tk).append(' ').append('\n');
      var1.append(this.Tj).append(' ').append(this.Tl).append(' ').append('\n');
      return var1.toString();
   }

   public FeatherSourceFile369 zA() {
      return this.xj(this);
   }

   public FeatherSourceFile367 xj(FeatherSourceFile367 var1) {
      return oe(this, var1);
   }

   public static FeatherSourceFile367 oe(FeatherSourceFile367 var0, FeatherSourceFile367 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile367();
      }

      var1.Ti = -var0.Ti;
      var1.Tj = -var0.Tj;
      var1.Tk = -var0.Tk;
      var1.Tl = -var0.Tl;
      return var1;
   }

   public FeatherSourceFile369 yZ() {
      return oe(this);
   }

   public static FeatherSourceFile367 oe(FeatherSourceFile367 var0) {
      var0.Ti = 1.0F;
      var0.Tj = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 1.0F;
      return var0;
   }

   public FeatherSourceFile369 zC() {
      return qy(this);
   }

   public static FeatherSourceFile367 qy(FeatherSourceFile367 var0) {
      var0.Ti = 0.0F;
      var0.Tj = 0.0F;
      var0.Tk = 0.0F;
      var0.Tl = 0.0F;
      return var0;
   }

   public float zD() {
      return this.Ti * this.Tl - this.Tj * this.Tk;
   }
}
