package net.digitalingot.feather;

import java.util.BitSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;

public class FeatherSourceFile802 {
   private static final FeatherSourceFile465 PERFORMANCE = FeatherSourceFile665.nc(FeatherSourceFile125.class);
   public static int Qm = 0;
   public static int Qn = 0;
   private final Minecraft Qf = Minecraft.func_71410_x();
   private final FeatherSourceFile803 Qo;
   private final FeatherSourceFile806 Qp;
   private final int Qq = 128;
   private final double Qr = 0.5;
   private long Qs;
   private int Qt;
   private final BitSet Qu;
   private final FeatherSourceFile808 Qv;
   private final FeatherSourceFile801 Qw;
   private final FeatherSourceFile801[] Qx;
   private boolean Qy = false;

   public FeatherSourceFile802(FeatherSourceFile803 var1, FeatherSourceFile806 var2) {
      this.Qo = var1;
      this.Qp = var2;
      this.Qu = new BitSet();
      this.Qv = new FeatherSourceFile808();
      this.Qw = new FeatherSourceFile801();
      this.Qx = new FeatherSourceFile801[8];

      for(int var3 = 0; var3 < this.Qx.length; ++var3) {
         this.Qx[var3] = new FeatherSourceFile801();
      }

      FeatherSourceFile335.lh(() -> {
         int var0 = Qm;
         Qm = 0;
         return "[Feather Culling] Skipped entities: " + var0;
      });
      FeatherSourceFile335.lh(() -> {
         if (Qn != 0) {
            this.Qt = Qn;
            Qn = 0;
         }

         return "[Feather Culling] Skipped part ticks: " + this.Qt;
      });
      FeatherSourceFile335.lh(() -> {
         return "[Feather Culling] Last pass: " + this.Qs;
      });
      FeatherSourceFile335.yC();
   }

   public void wy() {
      FeatherSourceFile149.oc.oe((var1) -> {
         this.Qy = true;
      });
   }

   public void wA() {
      Thread var1 = new Thread(() -> {
         FeatherSourceFile311.Sb.info("Starting culler");

         while(true) {
            while(true) {
               try {
                  Thread.sleep(50L);
                  if (((FeatherSourceFile$lh52)((FeatherSourceFile125)PERFORMANCE.ag()).pr()).pA && this.Qf.func_175606_aa() != null && this.Qf.field_71441_e != null && this.Qf.field_71439_g != null && this.Qf.field_71439_g.field_70173_aa > 10) {
                     FeatherSourceFile801 var1 = new FeatherSourceFile801(this.Qf.field_71439_g.field_70165_t, this.Qf.field_71439_g.field_70163_u + (double)this.Qf.field_71439_g.func_70047_e(), this.Qf.field_71439_g.field_70161_v);
                     if (this.Qy || var1.zm() != this.Qw.zm() || var1.rq() != this.Qw.rq() || var1.wG() != this.Qw.wG()) {
                        long var2 = System.currentTimeMillis();
                        this.Qy = false;
                        this.Qw.ou(var1.zm(), var1.rq(), var1.wG());
                        this.Qp.ir();
                        Iterator var4 = this.Qf.field_71441_e.func_72910_y().iterator();

                        while(var4.hasNext()) {
                           Entity var5;
                           try {
                              var5 = (Entity)var4.next();
                           } catch (ConcurrentModificationException | NullPointerException var7) {
                              break;
                           }

                           FeatherSourceFile804 var6 = (FeatherSourceFile804)var5;
                           if (!var6.forceVisible() && var5.func_180425_c().func_177954_c(var1.zm(), var1.rq(), var1.wG()) < 4096.0) {
                              var6.setCulled(!this.lh(var5.func_174813_aQ(), this.Qw));
                           }
                        }

                        this.Qs = System.currentTimeMillis() - var2;
                     }
                  }
               } catch (Exception var8) {
                  var8.printStackTrace();
               }
            }
         }
      }, "Culling Thread");
      var1.setUncaughtExceptionHandler((var0, var1x) -> {
         FeatherSourceFile311.Sb.error("Culling Thread crashed", var1x);
      });
      var1.start();
   }

   public static void wB() {
      ++Qm;
   }

   public boolean lh(AxisAlignedBB var1, FeatherSourceFile801 var2) {
      double var10000 = var1.field_72340_a;
      Objects.requireNonNull(this);
      int var3 = MathHelper.func_76128_c(var10000 - 0.5);
      var10000 = var1.field_72338_b;
      Objects.requireNonNull(this);
      int var4 = MathHelper.func_76128_c(var10000 - 0.5);
      var10000 = var1.field_72339_c;
      Objects.requireNonNull(this);
      int var5 = MathHelper.func_76128_c(var10000 - 0.5);
      var10000 = var1.field_72336_d;
      Objects.requireNonNull(this);
      int var6 = MathHelper.func_76128_c(var10000 + 0.5);
      var10000 = var1.field_72337_e;
      Objects.requireNonNull(this);
      int var7 = MathHelper.func_76128_c(var10000 + 0.5);
      var10000 = var1.field_72334_f;
      Objects.requireNonNull(this);
      int var8 = MathHelper.func_76128_c(var10000 + 0.5);
      this.Qv.ib(MathHelper.func_76128_c(var2.zm()));
      this.Qv.zt(MathHelper.func_76128_c(var2.rq()));
      this.Qv.ik(MathHelper.func_76128_c(var2.wG()));
      FeatherSourceFile$lh58 var9 = FeatherSourceFile$lh58.from(var3, var6, this.Qv.ax());
      FeatherSourceFile$lh58 var10 = FeatherSourceFile$lh58.from(var4, var7, this.Qv.ob());
      FeatherSourceFile$lh58 var11 = FeatherSourceFile$lh58.from(var5, var8, this.Qv.gR());
      if (var9 == FeatherSourceFile$lh58.INSIDE && var10 == FeatherSourceFile$lh58.INSIDE && var11 == FeatherSourceFile$lh58.INSIDE) {
         return true;
      } else {
         this.Qu.clear();
         int var12 = 0;

         int var13;
         int var16;
         for(var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var4; var14 <= var7; ++var14) {
               for(int var15 = var5; var15 <= var8; ++var15) {
                  var16 = this.ux(var13, var14, var15);
                  if (var16 == 1) {
                     return true;
                  }

                  if (var16 != 0) {
                     this.Qu.set(var12);
                  }

                  ++var12;
               }
            }
         }

         var12 = 0;

         for(var13 = var3; var13 <= var6; ++var13) {
            boolean var22 = var13 == var3;
            boolean var23 = var13 == var6;

            for(var16 = var4; var16 <= var7; ++var16) {
               boolean var17 = var16 == var4;
               boolean var18 = var16 == var7;

               for(int var19 = var5; var19 <= var8; ++var19) {
                  boolean var20 = var19 == var5;
                  boolean var21 = var19 == var8;
                  if (!this.Qu.get(var12)) {
                     if ((var22 && var9 == FeatherSourceFile$lh58.POSITIVE || var23 && var9 == FeatherSourceFile$lh58.NEGATIVE || var17 && var10 == FeatherSourceFile$lh58.POSITIVE || var18 && var10 == FeatherSourceFile$lh58.NEGATIVE || var20 && var11 == FeatherSourceFile$lh58.POSITIVE || var21 && var11 == FeatherSourceFile$lh58.NEGATIVE) && this.lh(var2, (double)var13, (double)var16, (double)var19)) {
                        return true;
                     }

                     ++var12;
                  }
               }
            }
         }

         return false;
      }
   }

   private boolean lh(FeatherSourceFile801 var1, double var2, double var4, double var6) {
      int var8 = 0;
      this.Qx[var8++].ou(0.05 + var2, 0.05 + var4, 0.05 + var6);
      this.Qx[var8++].ou(0.95 + var2, 0.05 + var4, 0.05 + var6);
      this.Qx[var8++].ou(0.05 + var2, 0.95 + var4, 0.05 + var6);
      this.Qx[var8++].ou(0.05 + var2, 0.05 + var4, 0.95 + var6);
      this.Qx[var8++].ou(0.95 + var2, 0.95 + var4, 0.05 + var6);
      this.Qx[var8++].ou(0.05 + var2, 0.95 + var4, 0.95 + var6);
      this.Qx[var8++].ou(0.95 + var2, 0.05 + var4, 0.95 + var6);
      this.Qx[var8++].ou(0.95 + var2, 0.95 + var4, 0.95 + var6);
      return this.lh(var1, this.Qx, var8);
   }

   private boolean lh(FeatherSourceFile801 var1, FeatherSourceFile801[] var2, int var3) {
      int var4 = this.Qv.ax();
      int var5 = this.Qv.ob();
      int var6 = this.Qv.gR();

      int var7;
      int var10000;
      for(var7 = 0; var7 < var3; ++var7) {
         FeatherSourceFile801 var8 = var2[var7];
         double var9 = var1.zm() - var8.zm();
         double var11 = var1.rq() - var8.rq();
         double var13 = var1.wG() - var8.wG();
         double var15 = Math.abs(var9);
         double var17 = Math.abs(var11);
         double var19 = Math.abs(var13);
         double var21 = 1.0 / var15;
         double var23 = 1.0 / var17;
         double var25 = 1.0 / var19;
         int var27 = 1;
         byte var28;
         double var33;
         if (var15 == 0.0) {
            var28 = 0;
            var33 = var21;
         } else if (var8.zm() > var1.zm()) {
            var28 = 1;
            var27 += this.mr(var8.zm()) - var4;
            var33 = (double)((float)(((double)(var4 + 1) - var1.zm()) * var21));
         } else {
            var28 = -1;
            var27 += var4 - this.mr(var8.zm());
            var33 = (double)((float)((var1.zm() - (double)var4) * var21));
         }

         byte var29;
         double var31;
         if (var17 == 0.0) {
            var29 = 0;
            var31 = var23;
         } else if (var8.rq() > var1.rq()) {
            var29 = 1;
            var27 += this.mr(var8.rq()) - var5;
            var31 = (double)((float)(((double)(var5 + 1) - var1.rq()) * var23));
         } else {
            var29 = -1;
            var27 += var5 - this.mr(var8.rq());
            var31 = (double)((float)((var1.rq() - (double)var5) * var23));
         }

         byte var30;
         double var35;
         if (var19 == 0.0) {
            var30 = 0;
            var35 = var25;
         } else if (var8.wG() > var1.wG()) {
            var30 = 1;
            var27 += this.mr(var8.wG()) - var6;
            var35 = (double)((float)(((double)(var6 + 1) - var1.wG()) * var25));
         } else {
            var30 = -1;
            var27 += var6 - this.mr(var8.wG());
            var35 = (double)((float)((var1.wG() - (double)var6) * var25));
         }

         boolean var37 = this.lh(var4, var5, var6, var21, var23, var25, var27, var28, var29, var30, var33, var31, var35);
         if (var37) {
            var10000 = this.mr(var2[0].zm()) - this.Qv.ax();
            Objects.requireNonNull(this);
            int var38 = var10000 + 128;
            var10000 = this.mr(var2[0].rq()) - this.Qv.ob();
            Objects.requireNonNull(this);
            int var39 = var10000 + 128;
            var10000 = this.mr(var2[0].wG()) - this.Qv.gR();
            Objects.requireNonNull(this);
            int var40 = var10000 + 128;
            this.Qp.si(var38, var39, var40);
            return true;
         }
      }

      var10000 = this.mr(var2[0].zm()) - this.Qv.ax();
      Objects.requireNonNull(this);
      var7 = var10000 + 128;
      var10000 = this.mr(var2[0].rq()) - this.Qv.ob();
      Objects.requireNonNull(this);
      int var41 = var10000 + 128;
      var10000 = this.mr(var2[0].wG()) - this.Qv.gR();
      Objects.requireNonNull(this);
      int var42 = var10000 + 128;
      this.Qp.wz(var7, var41, var42);
      return false;
   }

   private boolean lh(int var1, int var2, int var3, double var4, double var6, double var8, int var10, int var11, int var12, int var13, double var14, double var16, double var18) {
      for(; var10 > 1; --var10) {
         int var20 = this.ux(var1, var2, var3);
         if (var20 == 2) {
            return false;
         }

         if (var20 == 0) {
            int var21 = var1 >> 4;
            int var22 = var3 >> 4;
            if (!this.Qo.wn(var21, var22)) {
               return false;
            }

            if (this.Qo.oe((double)var1, (double)var2, (double)var3)) {
               this.Qp.wI();
               return false;
            }

            this.Qp.wH();
         }

         if (var16 < var14 && var16 < var18) {
            var2 += var12;
            var16 += var6;
         } else if (var14 < var16 && var14 < var18) {
            var1 += var11;
            var14 += var4;
         } else {
            var3 += var13;
            var18 += var8;
         }
      }

      return true;
   }

   private int ux(int var1, int var2, int var3) {
      var1 -= this.Qv.ax();
      var2 -= this.Qv.ob();
      var3 -= this.Qv.gR();
      return Math.abs(var1) <= 126 && Math.abs(var2) <= 126 && Math.abs(var3) <= 126 ? this.Qp.lt(var1 + 128, var2 + 128, var3 + 128) : -1;
   }

   private int mr(double var1) {
      int var3 = (int)var1;
      return var1 < (double)var3 ? var3 - 1 : var3;
   }
}
