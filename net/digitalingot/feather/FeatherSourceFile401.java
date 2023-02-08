package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile401 extends FeatherSourceFile405 implements Serializable, FeatherSourceFile409, FeatherSourceFile244 {
   private static final long Th = 1L;
   public float Td;
   public float Te;
   public float Ty;

   public FeatherSourceFile401() {
   }

   public FeatherSourceFile401(FeatherSourceFile409 var1) {
      this.lh(var1);
   }

   public FeatherSourceFile401(float var1, float var2, float var3) {
      this.si(var1, var2, var3);
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

   public FeatherSourceFile401 lh(FeatherSourceFile409 var1) {
      this.Td = var1.yV();
      this.Te = var1.yW();
      this.Ty = var1.zH();
      return this;
   }

   public void wz(float var1, float var2, float var3) {
      this.Td += var1;
      this.Te += var2;
      this.Ty += var3;
   }

   public void nc(FeatherSourceFile409 var1) {
      this.Td += var1.yV();
      this.Te += var1.yW();
      this.Ty += var1.zH();
   }

   public float zF() {
      return this.Td * this.Td + this.Te * this.Te + this.Ty * this.Ty;
   }

   public FeatherSourceFile401 lt(float var1, float var2, float var3) {
      this.Td += var1;
      this.Te += var2;
      this.Ty += var3;
      return this;
   }

   public static FeatherSourceFile401 lh(FeatherSourceFile401 var0, FeatherSourceFile401 var1, FeatherSourceFile401 var2) {
      if (var2 == null) {
         return new FeatherSourceFile401(var0.Td + var1.Td, var0.Te + var1.Te, var0.Ty + var1.Ty);
      } else {
         var2.si(var0.Td + var1.Td, var0.Te + var1.Te, var0.Ty + var1.Ty);
         return var2;
      }
   }

   public static FeatherSourceFile401 nc(FeatherSourceFile401 var0, FeatherSourceFile401 var1, FeatherSourceFile401 var2) {
      if (var2 == null) {
         return new FeatherSourceFile401(var0.Td - var1.Td, var0.Te - var1.Te, var0.Ty - var1.Ty);
      } else {
         var2.si(var0.Td - var1.Td, var0.Te - var1.Te, var0.Ty - var1.Ty);
         return var2;
      }
   }

   public static FeatherSourceFile401 xj(FeatherSourceFile401 var0, FeatherSourceFile401 var1, FeatherSourceFile401 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile401();
      }

      var2.si(var0.Te * var1.Ty - var0.Ty * var1.Te, var1.Td * var0.Ty - var1.Ty * var0.Td, var0.Td * var1.Te - var0.Te * var1.Td);
      return var2;
   }

   public FeatherSourceFile405 zG() {
      this.Td = -this.Td;
      this.Te = -this.Te;
      this.Ty = -this.Ty;
      return this;
   }

   public FeatherSourceFile401 xj(FeatherSourceFile401 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile401();
      }

      var1.Td = -this.Td;
      var1.Te = -this.Te;
      var1.Ty = -this.Ty;
      return var1;
   }

   public FeatherSourceFile401 oe(FeatherSourceFile401 var1) {
      float var2 = this.zJ();
      if (var1 == null) {
         var1 = new FeatherSourceFile401(this.Td / var2, this.Te / var2, this.Ty / var2);
      } else {
         var1.si(this.Td / var2, this.Te / var2, this.Ty / var2);
      }

      return var1;
   }

   public FeatherSourceFile401 jr(float var1) {
      var1 *= (float)FeatherSourceFile846.Nf / 180.0F;
      float var2 = FeatherSourceFile846.hg(var1 / 2.0F);
      this.Td *= var2;
      this.Te *= var2;
      this.Ty *= var2;
      return this;
   }

   public static float lh(FeatherSourceFile401 var0, FeatherSourceFile401 var1) {
      return var0.Td * var1.Td + var0.Te * var1.Te + var0.Ty * var1.Ty;
   }

   public static float nc(FeatherSourceFile401 var0, FeatherSourceFile401 var1) {
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
      return this;
   }

   public FeatherSourceFile405 ku(float var1) {
      this.Td *= var1;
      this.Te *= var1;
      this.Ty *= var1;
      return this;
   }

   public FeatherSourceFile405 as(FloatBuffer var1) {
      var1.put(this.Td);
      var1.put(this.Te);
      var1.put(this.Ty);
      return this;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("Vector3f[");
      var1.append(this.Td);
      var1.append(", ");
      var1.append(this.Te);
      var1.append(", ");
      var1.append(this.Ty);
      var1.append(']');
      return var1.toString();
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

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         FeatherSourceFile401 var2 = (FeatherSourceFile401)var1;
         return this.Td == var2.Td && this.Te == var2.Te && this.Ty == var2.Ty;
      }
   }
}
