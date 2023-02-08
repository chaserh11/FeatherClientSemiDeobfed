package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;

public class FeatherSourceFile772 implements FeatherSourceFile22 {
   private static final int Ls = 1024;
   private static final int Lt = 32;
   private static final float Lu = 5.0F;
   private float Lv;
   private float Lw;
   private float Lx;
   private float Ly;
   private float Lz;
   private float LA;
   private float LB;
   private float LC;
   private float LD;
   private float LE;
   private float LF;
   private float LG;
   private float LH;
   private float LI;
   private float LJ;
   private float wL;
   private float wK;
   private float LK;
   private float LL;
   private float LM;
   private float LN;
   private float LO;
   private int LP;
   private int LQ;
   private int LR;
   private float[] LS = new float[1024];

   @Inject
   FeatherSourceFile772() {
      this.lh(24000, 0.0F, -24.0F, 30.0F, 12.0F, 0.003F, 0.25F, 0.006F, 0.09F, 0.16F, 0.42F, 0.98F, 0.0F, 1.0F);
   }

   private static float wn(float var0) {
      return (float)Math.pow(10.0, (double)(0.05F * var0));
   }

   private static float jh(float var0) {
      return 20.0F * (float)Math.log10((double)var0);
   }

   private static float nc(float var0, float var1, float var2) {
      return var2 + (1.0F - (float)Math.exp((double)(-var1 * (var0 - var2)))) / var1;
   }

   private static float xj(float var0, float var1, float var2) {
      return var1 * var0 / ((var1 * var2 + 1.0F) * (float)Math.exp((double)(var1 * (var0 - var2))) - 1.0F);
   }

   private static float lh(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var0 < var3) {
         return var0;
      } else if (var6 <= 0.0F) {
         return wn(var5 + var2 * (jh(var0) - var5));
      } else {
         return var0 < var4 ? nc(var0, var1, var3) : wn(var7 + var2 * (jh(var0) - var5 - var6));
      }
   }

   private void lh(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14) {
      int var15 = (int)((float)var1 * var8);
      if (var15 < 1) {
         var15 = 1;
      } else if (var15 > 1024) {
         var15 = 1024;
      }

      for(int var16 = 0; var16 < var15; ++var16) {
         this.LS[var16] = 0.0F;
      }

      float var41 = wn(var2);
      float var17 = wn(var3);
      float var18 = 1.0F / var5;
      float var19 = (float)var1 * var6;
      float var20 = 1.0F / var19;
      float var21 = (float)var1 * var7;
      float var22 = 0.0025F;
      float var23 = 1.0F / ((float)var1 * var22);
      float var24 = 1.0F - var14;
      float var25 = 1.0F;
      float var26 = 0.325F;
      float var27 = 1.0F - (float)Math.exp((double)(-1.0F / ((float)var1 * var26)));
      float var28 = 5.0F;
      float var29 = 0.0F;
      float var30 = 0.0F;
      float var31;
      float var32;
      float var33;
      if (var4 > 0.0F) {
         var31 = wn(var3 + var4);
         var32 = 0.1F;
         var33 = 10000.0F;

         for(int var34 = 0; var34 < 15; ++var34) {
            if (xj(var31, var28, var17) < var18) {
               var33 = var28;
            } else {
               var32 = var28;
            }

            var28 = (float)Math.sqrt((double)(var32 * var33));
         }

         var29 = jh(nc(var31, var28, var17));
         var30 = wn(var3 + var4);
      }

      var31 = lh(1.0F, var28, var18, var17, var30, var3, var4, var29);
      var32 = wn(var13) * (float)Math.pow((double)(1.0F / var31), 0.6000000238418579);
      var33 = var21 * var9;
      float var42 = var21 * var10;
      float var35 = var21 * var11;
      float var36 = var21 * var12;
      float var37 = (-var33 + 3.0F * var42 - 3.0F * var35 + var36) / 6.0F;
      float var38 = var33 - 2.5F * var42 + 2.0F * var35 - 0.5F * var36;
      float var39 = (-11.0F * var33 + 18.0F * var42 - 9.0F * var35 + 2.0F * var36) / 6.0F;
      this.Lv = 1.0F;
      this.Lw = var27;
      this.Lx = var3;
      this.Ly = var4;
      this.LE = var14;
      this.Lz = var41;
      this.LA = var17;
      this.LB = var18;
      this.LC = var20;
      this.LD = var23;
      this.LF = var24;
      this.LG = var28;
      this.LH = var29;
      this.LI = var30;
      this.LJ = var32;
      this.wL = var37;
      this.wK = var38;
      this.LK = var39;
      this.LL = var33;
      this.LM = 0.0F;
      this.LN = 1.0F;
      this.LO = -1.0F;
      this.LP = var15;
      this.LQ = 0;
      this.LR = var15 > 1 ? 1 : 0;
   }

   private static float lh(float var0, float var1, float var2, float var3, float var4) {
      float var5 = var0 * var0;
      return var1 * var5 * var0 + var2 * var5 + var3 * var0 + var4;
   }

   private static float oe(float var0, float var1) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) ? var0 : var1;
   }

   public byte[] pq(byte[] var1) {
      float[] var2 = FeatherSourceFile651.qy(var1);
      int var3 = var2.length / 32;
      float var4 = 1.5707964F;
      float var5 = 0.63661975F;
      int var6 = 0;

      for(int var7 = 0; var7 < var3; ++var7) {
         this.LM = oe(this.LM, 1.0F);
         float var8 = this.LM;
         float var9 = (float)Math.asin((double)var8) * var5;
         float var10 = jh(this.LN / var9);
         float var11;
         float var12;
         float var13;
         if (var10 < 0.0F) {
            var10 = oe(var10, -1.0F);
            this.LO = -1.0F;
            var12 = (FeatherSourceFile363.mq(var10, -12.0F, 0.0F) + 12.0F) * 0.25F;
            var13 = lh(var12, this.wL, this.wK, this.LK, this.LL);
            var11 = wn(5.0F / var13);
         } else {
            var10 = oe(var10, 1.0F);
            if (this.LO == -1.0F || this.LO < var10) {
               this.LO = var10;
            }

            var12 = this.LO;
            if (var12 < 0.5F) {
               var12 = 0.5F;
            }

            var11 = 1.0F - (float)Math.pow((double)(0.25F / var12), (double)this.LC);
         }

         for(int var20 = 0; var20 < 32; this.LQ = (this.LQ + 1) % this.LP) {
            var13 = var2[var6] * this.Lz;
            this.LS[this.LQ] = var13;
            var13 = Math.abs(var13);
            float var15;
            float var16;
            if (var13 < 1.0E-4F) {
               var15 = 1.0F;
            } else {
               var16 = lh(var13, this.LG, this.LB, this.LA, this.LI, this.Lx, this.Ly, this.LH);
               var15 = var16 / var13;
            }

            float var17;
            float var18;
            if (var15 > this.LM) {
               var17 = -jh(var15);
               if (var17 < 2.0F) {
                  var17 = 2.0F;
               }

               var18 = var17 * this.LD;
               var16 = wn(var18) - 1.0F;
            } else {
               var16 = 1.0F;
            }

            this.LM += (var15 - this.LM) * var16;
            if (this.LM > 1.0F) {
               this.LM = 1.0F;
            }

            this.LM = oe(this.LM, 1.0F);
            if (var11 < 1.0F) {
               this.LN += (var9 - this.LN) * var11;
            } else {
               this.LN *= var11;
               if (this.LN > 1.0F) {
                  this.LN = 1.0F;
               }
            }

            var17 = (float)Math.sin((double)(var4 * this.LN));
            var18 = this.LF + this.LE * this.LJ * var17;
            float var19 = jh(var17);
            if (var19 < this.Lv) {
               this.Lv = var19;
            } else {
               this.Lv += (var19 - this.Lv) * this.Lw;
            }

            var2[var6] = this.LS[this.LR] * var18;
            ++var20;
            ++var6;
            this.LR = (this.LR + 1) % this.LP;
         }
      }

      return FeatherSourceFile651.lh(var2);
   }

   public int io() {
      return 1;
   }

   public void close() {
   }
}
