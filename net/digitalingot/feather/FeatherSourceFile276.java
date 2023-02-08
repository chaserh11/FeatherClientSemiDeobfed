package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FeatherSourceFile276 extends FeatherSourceFile282 {
   public static FeatherSourceFile373 UG = new FeatherSourceFile373(0.54545456F, 0.05882353F, 0.45454547F, 0.9411765F);
   public static FeatherSourceFile373 UH = new FeatherSourceFile373(0.045454547F, 0.05882353F, 0.45454547F, 0.9411765F);
   public static FeatherSourceFile373 UI = new FeatherSourceFile373(0.0F, 0.05882353F, 0.045454547F, 0.9411765F);
   public static FeatherSourceFile373 UJ = new FeatherSourceFile373(0.95454544F, 0.05882353F, 0.045454547F, 0.9411765F);
   public static FeatherSourceFile373 UK = new FeatherSourceFile373(0.045454547F, 0.0F, 0.45454547F, 0.05882353F);
   public static FeatherSourceFile373 UL = new FeatherSourceFile373(0.5F, 0.0F, 0.45454547F, 0.05882353F);
   public static FeatherSourceFile373 UM = new FeatherSourceFile373(0.0F, 0.0F, 0.8333333F, 0.8919861F);
   public static FeatherSourceFile373 UN = new FeatherSourceFile373(0.083333336F, 0.05574913F, 0.8333333F, 0.8919861F);
   public static FeatherSourceFile373 UO = new FeatherSourceFile373(0.0F, 0.05574913F, 0.083333336F, 0.8919861F);
   public static FeatherSourceFile373 UQ = new FeatherSourceFile373(0.9166667F, 0.05574913F, 0.083333336F, 0.8919861F);
   public static FeatherSourceFile373 UR = new FeatherSourceFile373(0.083333336F, 0.0F, 0.8333333F, 0.05574913F);
   public static FeatherSourceFile373 US = new FeatherSourceFile373(0.0F, 0.945993F, 0.8333333F, 0.05574913F);
   private static final int UT = 50;
   public int UU = 0;
   public int UV = 0;
   public static final int UW = 416;
   private FloatBuffer UX;

   public FeatherSourceFile276(int var1) {
      super(var1);
   }

   public void qr(int var1, int var2, int var3) {
      this.UU = (int)Math.ceil((double)((float)var1 * 0.54545456F));
      this.UV = (int)Math.ceil((double)((float)var2 * 1.055147F));
      this.Uu = (int)Math.floor((double)((float)this.Ux / (float)this.UU));
      this.textureWidth = this.Uu * this.UU;
      this.textureHeight = this.Ux;
      int var5 = var3;

      for(int var6 = 0; var6 < 50; var5 += this.Uu) {
         ++var6;
         float var4 = (float)(Math.ceil((double)((float)var5 / (float)this.Uu)) * (double)this.UV);
         this.Ut = (int)Math.ceil((double)(var4 / (float)this.Ux));
         this.textureHeight = (int)(var4 / (float)this.Ut);
         this.Uv = (int)Math.floor((double)((float)this.textureHeight / (float)this.UV));
         this.Uw = this.Uu * this.Uv;
         if (this.Ut * (this.Uw - 1) >= var3) {
            break;
         }
      }

      this.textureHeight = FeatherSourceFile363.ep(this.textureHeight, this.UV, this.Ux);
      this.Uv = (int)Math.floor((double)((float)this.textureHeight / (float)this.UV));
      this.Uw = this.Uu * this.Uv;
      this.Uy = (float)this.UU / (float)this.textureWidth;
      this.Uz = (float)this.UV / (float)this.textureHeight;
      this.Ur = var1;
      this.Us = var2;
   }

   public long Ac() {
      if (this.UA != -1L) {
         return this.UA;
      } else {
         MessageDigest var1;
         try {
            var1 = MessageDigest.getInstance("SHA-256");
         } catch (NoSuchAlgorithmException var7) {
            throw new RuntimeException(var7);
         }

         ByteBuffer var2 = ByteBuffer.allocate(24);
         var2.putInt(0, this.Ux);
         var2.putInt(4, this.Ur);
         var2.putInt(8, this.Us);
         var2.putInt(12, this.UV);
         var2.putInt(16, this.UV);
         var2.putInt(20, this.textureHeight);
         var1.update(var2);
         byte[] var3 = var1.digest();
         long var4 = 0L;

         for(int var6 = 0; var6 < 8; ++var6) {
            var4 = (var4 << 8) + (long)(var3[var6] & 255);
         }

         this.UA = var4;
         return var4;
      }
   }

   public void lh(int var1, FloatBuffer var2) {
      int var3;
      for(var3 = 0; var3 < FeatherSourceFile239.gn * 2; ++var3) {
         var2.put(var3 + 0, this.UX.get(var3 + 0));
         var2.put(var3 + 1, this.UX.get(var3 + 1));
      }

      var3 = this.Uw - 1;
      int var4 = var1 % var3 + 1;
      int var5 = var4 % this.Uu;
      int var6 = var4 / this.Uu;

      for(int var7 = FeatherSourceFile239.gn * 2; var7 < this.UX.capacity(); var7 += 2) {
         float var8 = this.UX.get(var7);
         float var9 = this.UX.get(var7 + 1);
         var2.put(var7, var8 + (float)var5 * this.Uy);
         var2.put(var7 + 1, var9 + (float)var6 * this.Uz);
      }

   }

   public void Af() {
      this.UX = FloatBuffer.allocate(416);
      float var1 = (float)this.UU / (float)this.textureWidth;
      float var2 = (float)this.UV / (float)this.textureHeight;
      this.lh(this.UX, UM, var1, var2);
      this.lh(this.UX, UN, var1, var2);
      this.nc(this.UX, UO, var1, var2);
      this.xj(this.UX, UQ, var1, var2);
      this.oe(this.UX, UR, var1, var2);
      this.oe(this.UX, US, var1, var2);
   }

   private void lh(FloatBuffer var1, FeatherSourceFile373 var2, float var3, float var4) {
      float var5 = var2.Td;

      for(int var6 = 0; var6 < 4; ++var6) {
         float var7 = var2.Te;

         for(int var8 = 0; var8 < 16; ++var8) {
            float var9 = var5 * var3;
            float var10 = var7 * var4;
            var1.put(var9).put(var10);
            var7 += var2.height / 15.0F;
         }

         var5 += var2.width / 3.0F;
      }

   }

   private void nc(FloatBuffer var1, FeatherSourceFile373 var2, float var3, float var4) {
      float var5 = var2.Te;

      for(int var6 = 0; var6 < 16; ++var6) {
         float var7 = var2.Td;

         for(int var8 = 0; var8 < 2; ++var8) {
            float var9 = var7 * var3;
            float var10 = var5 * var4;
            var1.put(var9).put(var10);
            var7 += var2.width;
         }

         var5 += var2.height / 15.0F;
      }

   }

   private void xj(FloatBuffer var1, FeatherSourceFile373 var2, float var3, float var4) {
      float var5 = var2.Te;

      for(int var6 = 0; var6 < 16; ++var6) {
         float var7 = var2.Td + var2.width;

         for(int var8 = 1; var8 >= 0; --var8) {
            float var9 = var7 * var3;
            float var10 = var5 * var4;
            var1.put(var9).put(var10);
            var7 -= var2.width;
         }

         var5 += var2.height / 15.0F;
      }

   }

   private void oe(FloatBuffer var1, FeatherSourceFile373 var2, float var3, float var4) {
      float var5 = var2.Td;

      for(int var6 = 0; var6 < 4; ++var6) {
         float var7 = var2.Te;

         for(int var8 = 0; var8 < 2; ++var8) {
            float var9 = var5 * var3;
            float var10 = var7 * var4;
            var1.put(var9).put(var10);
            var7 += var2.height;
         }

         var5 += var2.width / 3.0F;
      }

   }
}
