package net.digitalingot.feather;

import java.nio.FloatBuffer;

public class FeatherSourceFile415 extends FeatherSourceFile405 implements FeatherSourceFile407 {
   private static final long Th = 1L;
   public float Td;
   public float Te;
   public float Ty;
   public float Tz;

   public FeatherSourceFile415() {
      this.zE();
   }

   public FeatherSourceFile415(FeatherSourceFile407 var1) {
      this.lh(var1);
   }

   public FeatherSourceFile415(float var1, float var2, float var3, float var4) {
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

   public FeatherSourceFile415 lh(FeatherSourceFile407 var1) {
      this.Td = var1.yV();
      this.Te = var1.yW();
      this.Ty = var1.zH();
      this.Tz = var1.zI();
      return this;
   }

   public FeatherSourceFile415 zE() {
      return lh(this);
   }

   public static FeatherSourceFile415 lh(FeatherSourceFile415 var0) {
      var0.Td = 0.0F;
      var0.Te = 0.0F;
      var0.Ty = 0.0F;
      var0.Tz = 1.0F;
      return var0;
   }

   public float zF() {
      return this.Td * this.Td + this.Te * this.Te + this.Ty * this.Ty + this.Tz * this.Tz;
   }

   public static FeatherSourceFile415 lh(FeatherSourceFile415 var0, FeatherSourceFile415 var1) {
      float var2 = 1.0F / var0.zJ();
      if (var1 == null) {
         var1 = new FeatherSourceFile415();
      }

      var1.pq(var0.Td * var2, var0.Te * var2, var0.Ty * var2, var0.Tz * var2);
      return var1;
   }

   public FeatherSourceFile415 nc(FeatherSourceFile415 var1) {
      return lh(this, var1);
   }

   public static float nc(FeatherSourceFile415 var0, FeatherSourceFile415 var1) {
      return var0.Td * var1.Td + var0.Te * var1.Te + var0.Ty * var1.Ty + var0.Tz * var1.Tz;
   }

   public FeatherSourceFile415 xj(FeatherSourceFile415 var1) {
      return xj(this, var1);
   }

   public static FeatherSourceFile415 xj(FeatherSourceFile415 var0, FeatherSourceFile415 var1) {
      if (var1 == null) {
         var1 = new FeatherSourceFile415();
      }

      var1.Td = -var0.Td;
      var1.Te = -var0.Te;
      var1.Ty = -var0.Ty;
      var1.Tz = var0.Tz;
      return var1;
   }

   public FeatherSourceFile405 zG() {
      return xj(this, this);
   }

   public FeatherSourceFile405 pq(FloatBuffer var1) {
      this.Td = var1.get();
      this.Te = var1.get();
      this.Ty = var1.get();
      this.Tz = var1.get();
      return this;
   }

   public FeatherSourceFile405 ku(float var1) {
      return lh(var1, this, this);
   }

   public static FeatherSourceFile415 lh(float var0, FeatherSourceFile415 var1, FeatherSourceFile415 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile415();
      }

      var2.Td = var1.Td * var0;
      var2.Te = var1.Te * var0;
      var2.Ty = var1.Ty * var0;
      var2.Tz = var1.Tz * var0;
      return var2;
   }

   public FeatherSourceFile405 as(FloatBuffer var1) {
      var1.put(this.Td);
      var1.put(this.Te);
      var1.put(this.Ty);
      var1.put(this.Tz);
      return this;
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

   public String toString() {
      return "Quaternion: " + this.Td + " " + this.Te + " " + this.Ty + " " + this.Tz;
   }

   public static FeatherSourceFile415 lh(FeatherSourceFile415 var0, FeatherSourceFile415 var1, FeatherSourceFile415 var2) {
      if (var2 == null) {
         var2 = new FeatherSourceFile415();
      }

      var2.pq(var0.Td * var1.Tz + var0.Tz * var1.Td + var0.Te * var1.Ty - var0.Ty * var1.Te, var0.Te * var1.Tz + var0.Tz * var1.Te + var0.Ty * var1.Td - var0.Td * var1.Ty, var0.Ty * var1.Tz + var0.Tz * var1.Ty + var0.Td * var1.Te - var0.Te * var1.Td, var0.Tz * var1.Tz - var0.Td * var1.Td - var0.Te * var1.Te - var0.Ty * var1.Ty);
      return var2;
   }

   public static FeatherSourceFile415 nc(FeatherSourceFile415 var0, FeatherSourceFile415 var1, FeatherSourceFile415 var2) {
      float var3 = var1.zF();
      var3 = (double)var3 == 0.0 ? var3 : 1.0F / var3;
      if (var2 == null) {
         var2 = new FeatherSourceFile415();
      }

      var2.pq((var0.Td * var1.Tz - var0.Tz * var1.Td - var0.Te * var1.Ty + var0.Ty * var1.Te) * var3, (var0.Te * var1.Tz - var0.Tz * var1.Te - var0.Ty * var1.Td + var0.Td * var1.Ty) * var3, (var0.Ty * var1.Tz - var0.Tz * var1.Ty - var0.Td * var1.Te + var0.Te * var1.Td) * var3, (var0.Tz * var1.Tz + var0.Td * var1.Td + var0.Te * var1.Te + var0.Ty * var1.Ty) * var3);
      return var2;
   }

   public final void lh(FeatherSourceFile399 var1) {
      this.Td = var1.Td;
      this.Te = var1.Te;
      this.Ty = var1.Ty;
      float var2 = (float)Math.sqrt((double)(this.Td * this.Td + this.Te * this.Te + this.Ty * this.Ty));
      float var3 = (float)(Math.sin(0.5 * (double)var1.Tz) / (double)var2);
      this.Td *= var3;
      this.Te *= var3;
      this.Ty *= var3;
      this.Tz = (float)Math.cos(0.5 * (double)var1.Tz);
   }

   public final FeatherSourceFile415 ou(FeatherSourceFile417 var1) {
      return lh(var1, this);
   }

   public static FeatherSourceFile415 lh(FeatherSourceFile417 var0, FeatherSourceFile415 var1) {
      return var1.nc(var0.Ti, var0.Tj, var0.Tm, var0.Tk, var0.Tl, var0.Tn, var0.To, var0.Tp, var0.Tq);
   }

   public final FeatherSourceFile415 ou(FeatherSourceFile365 var1) {
      return lh(var1, this);
   }

   public static FeatherSourceFile415 lh(FeatherSourceFile365 var0, FeatherSourceFile415 var1) {
      return var1.nc(var0.Ti, var0.Tj, var0.Tm, var0.Tk, var0.Tl, var0.Tn, var0.To, var0.Tp, var0.Tq);
   }

   private FeatherSourceFile415 nc(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var11 = var1 + var5 + var9;
      float var10;
      if ((double)var11 >= 0.0) {
         var10 = (float)Math.sqrt((double)var11 + 1.0);
         this.Tz = var10 * 0.5F;
         var10 = 0.5F / var10;
         this.Td = (var8 - var6) * var10;
         this.Te = (var3 - var7) * var10;
         this.Ty = (var4 - var2) * var10;
      } else {
         float var12 = Math.max(Math.max(var1, var5), var9);
         if (var12 == var1) {
            var10 = (float)Math.sqrt((double)(var1 - (var5 + var9)) + 1.0);
            this.Td = var10 * 0.5F;
            var10 = 0.5F / var10;
            this.Te = (var2 + var4) * var10;
            this.Ty = (var7 + var3) * var10;
            this.Tz = (var8 - var6) * var10;
         } else if (var12 == var5) {
            var10 = (float)Math.sqrt((double)(var5 - (var9 + var1)) + 1.0);
            this.Te = var10 * 0.5F;
            var10 = 0.5F / var10;
            this.Ty = (var6 + var8) * var10;
            this.Td = (var2 + var4) * var10;
            this.Tz = (var3 - var7) * var10;
         } else {
            var10 = (float)Math.sqrt((double)(var9 - (var1 + var5)) + 1.0);
            this.Ty = var10 * 0.5F;
            var10 = 0.5F / var10;
            this.Td = (var7 + var3) * var10;
            this.Te = (var6 + var8) * var10;
            this.Tz = (var4 - var2) * var10;
         }
      }

      return this;
   }
}
