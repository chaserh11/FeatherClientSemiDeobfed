package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile399 extends FeatherSourceFile405 implements Serializable, FeatherSourceFile407, FeatherSourceFile242 {
   private static final long Th = 1L;
   public float Td;
   public float Te;
   public float Ty;
   public float Tz;

   public FeatherSourceFile399() {
   }

   public FeatherSourceFile399(FeatherSourceFile407 var1) {
      this.nc(var1);
   }

   public FeatherSourceFile399(float var1, float var2, float var3, float var4) {
      this.pq(var1, var2, var3, var4);
   }

   public void pq(float var1, float var2) {
      this.Td = var1;
      this.Te = var2;
   }

   public void si(float var1, float var2, float var3) {
      this.Td = var1;
      this.Te = var2;
      this.Ty = var3;
   }

   public void pq(float var1, float var2, float var3, float var4) {
      this.Td = var1;
      this.Te = var2;
      this.Ty = var3;
      this.Tz = var4;
   }

   public FeatherSourceFile399 nc(FeatherSourceFile407 var1) {
      this.Td = var1.yV();
      this.Te = var1.yW();
      this.Ty = var1.zH();
      this.Tz = var1.zI();
      return this;
   }

   public float zF() {
      return this.Td * this.Td + this.Te * this.Te + this.Ty * this.Ty + this.Tz * this.Tz;
   }

   public FeatherSourceFile399 as(float var1, float var2, float var3, float var4) {
      this.Td += var1;
      this.Te += var2;
      this.Ty += var3;
      this.Tz += var4;
      return this;
   }

   public static FeatherSourceFile399 lh(FeatherSourceFile399 var0, FeatherSourceFile399 var1, FeatherSourceFile399 var2) {
      if (var2 == null) {
         return new FeatherSourceFile399(var0.Td + var1.Td, var0.Te + var1.Te, var0.Ty + var1.Ty, var0.Tz + var1.Tz);
      } else {
         var2.pq(var0.Td + var1.Td, var0.Te + var1.Te, var0.Ty + var1.Ty, var0.Tz + var1.Tz);
         return var2;
      }
   }

   public static FeatherSourceFile399 nc(FeatherSourceFile399 var0, FeatherSourceFile399 var1, FeatherSourceFile399 var2) {
      if (var2 == null) {
         return new FeatherSourceFile399(var0.Td - var1.Td, var0.Te - var1.Te, var0.Ty - var1.Ty, var0.Tz - var1.Tz);
      } else {
         var2.pq(var0.Td - var1.Td, var0.Te - var1.Te, var0.Ty - var1.Ty, var0.Tz - var1.Tz);
         return var2;
      }
   }

   public FeatherSourceFile405 zG() {
      this.Td = -this.Td;
      this.Te = -this.Te;
      this.Ty = -this.Ty;
      this.Tz = -this.Tz;
      return this;
   }

   public FeatherSourceFile399 nc(FeatherSourceFile399 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile399();
      }

      var1.Td = -this.Td;
      var1.Te = -this.Te;
      var1.Ty = -this.Ty;
      var1.Tz = -this.Tz;
      return var1;
   }

   public FeatherSourceFile399 xj(FeatherSourceFile399 var1) {
      float var2 = this.zJ();
      if (var1 == null) {
         var1 = new FeatherSourceFile399(this.Td / var2, this.Te / var2, this.Ty / var2, this.Tz / var2);
      } else {
         var1.pq(this.Td / var2, this.Te / var2, this.Ty / var2, this.Tz / var2);
      }

      return var1;
   }

   public static float lh(FeatherSourceFile399 var0, FeatherSourceFile399 var1) {
      return var0.Td * var1.Td + var0.Te * var1.Te + var0.Ty * var1.Ty + var0.Tz * var1.Tz;
   }

   public static float nc(FeatherSourceFile399 var0, FeatherSourceFile399 var1) {
      float var2 = lh(var0, var1) / (var0.zJ() * var1.zJ());
      if (var2 < -1.0F) {
         var2 = -1.0F;
      } else if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return (float)Math.acos((double)var2);
   }

   public FeatherSourceFile405 pq(FloatBuffer var1) {
      this.Td = var1.get();
      this.Te = var1.get();
      this.Ty = var1.get();
      this.Tz = var1.get();
      return this;
   }

   public FeatherSourceFile405 ku(float var1) {
      this.Td *= var1;
      this.Te *= var1;
      this.Ty *= var1;
      this.Tz *= var1;
      return this;
   }

   public FeatherSourceFile405 as(FloatBuffer var1) {
      var1.put(this.Td);
      var1.put(this.Te);
      var1.put(this.Ty);
      var1.put(this.Tz);
      return this;
   }

   public String toString() {
      return "Vector4f: " + this.Td + " " + this.Te + " " + this.Ty + " " + this.Tz;
   }

   public final float yV() {
      return this.Td;
   }

   public final float yW() {
      return this.Te;
   }

   public final void vt(float var1) {
      this.Td = var1;
   }

   public final void ck(float var1) {
      this.Te = var1;
   }

   public void xy(float var1) {
      this.Ty = var1;
   }

   public float zH() {
      return this.Ty;
   }

   public void fh(float var1) {
      this.Tz = var1;
   }

   public float zI() {
      return this.Tz;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         FeatherSourceFile399 var2 = (FeatherSourceFile399)var1;
         return this.Td == var2.Td && this.Te == var2.Te && this.Ty == var2.Ty && this.Tz == var2.Tz;
      }
   }
}
