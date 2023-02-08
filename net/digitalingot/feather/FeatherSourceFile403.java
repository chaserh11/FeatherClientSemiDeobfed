package net.digitalingot.feather;

import java.io.Serializable;
import java.nio.FloatBuffer;

public class FeatherSourceFile403 extends FeatherSourceFile405 implements Serializable, FeatherSourceFile411, FeatherSourceFile397 {
   private static final long Th = 1L;
   public float Td;
   public float Te;

   public FeatherSourceFile403() {
   }

   public FeatherSourceFile403(FeatherSourceFile411 var1) {
      this.lh(var1);
   }

   public FeatherSourceFile403(float var1, float var2) {
      this.pq(var1, var2);
   }

   public void pq(float var1, float var2) {
      this.Td = var1;
      this.Te = var2;
   }

   public FeatherSourceFile403 zL() {
      FeatherSourceFile403 var1 = new FeatherSourceFile403(this.Td, this.Te);
      return var1;
   }

   public FeatherSourceFile403 lh(FeatherSourceFile411 var1) {
      this.Td = var1.yV();
      this.Te = var1.yW();
      return this;
   }

   public void xi(float var1) {
      float var2 = (float)Math.toRadians((double)var1);
      this.Td = (float)((double)this.Td * Math.cos((double)var2) - (double)this.Te * Math.sin((double)var2));
      this.Te = (float)((double)this.Td * Math.sin((double)var2) + (double)this.Te * Math.cos((double)var2));
   }

   public float zF() {
      return this.Td * this.Td + this.Te * this.Te;
   }

   public FeatherSourceFile403 as(float var1, float var2) {
      this.Td += var1;
      this.Te += var2;
      return this;
   }

   public FeatherSourceFile405 zG() {
      this.Td = -this.Td;
      this.Te = -this.Te;
      return this;
   }

   public FeatherSourceFile403 xj(FeatherSourceFile403 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile403();
      }

      var1.Td = -this.Td;
      var1.Te = -this.Te;
      return var1;
   }

   public FeatherSourceFile403 oe(FeatherSourceFile403 var1) {
      float var2 = this.zJ();
      if (var1 == null) {
         var1 = new FeatherSourceFile403(this.Td / var2, this.Te / var2);
      } else {
         var1.pq(this.Td / var2, this.Te / var2);
      }

      return var1;
   }

   public static float xj(FeatherSourceFile403 var0, FeatherSourceFile403 var1) {
      return var0.Td * var1.Td + var0.Te * var1.Te;
   }

   public static float lh(FeatherSourceFile403 var0, FeatherSourceFile403 var1) {
      float var2 = xj(var0, var1) / (var0.zJ() * var1.zJ());
      if (var2 < -1.0F) {
         var2 = -1.0F;
      } else if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return (float)Math.acos((double)var2);
   }

   public static FeatherSourceFile403 lh(FeatherSourceFile403 var0, FeatherSourceFile403 var1, FeatherSourceFile403 var2) {
      if (var2 == null) {
         return new FeatherSourceFile403(var0.Td + var1.Td, var0.Te + var1.Te);
      } else {
         var2.pq(var0.Td + var1.Td, var0.Te + var1.Te);
         return var2;
      }
   }

   public static FeatherSourceFile403 oe(FeatherSourceFile403 var0, FeatherSourceFile403 var1) {
      return new FeatherSourceFile403(var0.Td + var1.Td, var0.Te + var1.Te);
   }

   public static FeatherSourceFile403 nc(FeatherSourceFile403 var0, FeatherSourceFile403 var1, FeatherSourceFile403 var2) {
      if (var2 == null) {
         return new FeatherSourceFile403(var0.Td - var1.Td, var0.Te - var1.Te);
      } else {
         var2.pq(var0.Td - var1.Td, var0.Te - var1.Te);
         return var2;
      }
   }

   public static FeatherSourceFile403 qy(FeatherSourceFile403 var0, FeatherSourceFile403 var1) {
      return new FeatherSourceFile403(var0.Td - var1.Td, var0.Te - var1.Te);
   }

   public FeatherSourceFile403 cg(float var1) {
      FeatherSourceFile403 var2 = new FeatherSourceFile403(this.Td, this.Te);
      var2.Td *= var1;
      var2.Te *= var1;
      return var2;
   }

   public void sb(float var1) {
      this.Td *= var1;
      this.Te *= var1;
   }

   public static FeatherSourceFile403 ou(FeatherSourceFile403 var0, FeatherSourceFile403 var1) {
      FeatherSourceFile403 var2 = qy(var0, var1);
      float var3 = var2.Td;
      var2.Td = -var2.Te;
      var2.Te = var3;
      var2 = (FeatherSourceFile403)var2.zK();
      return var2;
   }

   public FeatherSourceFile405 as(FloatBuffer var1) {
      var1.put(this.Td);
      var1.put(this.Te);
      return this;
   }

   public FeatherSourceFile405 pq(FloatBuffer var1) {
      this.Td = var1.get();
      this.Te = var1.get();
      return this;
   }

   public FeatherSourceFile405 ku(float var1) {
      this.Td *= var1;
      this.Te *= var1;
      return this;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("Vector2f[");
      var1.append(this.Td);
      var1.append(", ");
      var1.append(this.Te);
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

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         FeatherSourceFile403 var2 = (FeatherSourceFile403)var1;
         return this.Td == var2.Td && this.Te == var2.Te;
      }
   }
}
