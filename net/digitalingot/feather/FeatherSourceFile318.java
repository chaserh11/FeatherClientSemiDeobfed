package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@Singleton
class FeatherSourceFile318 implements FeatherSourceFile489 {
   private static final ResourceLocation fi = new ResourceLocation("feather:textures/gui/modlayout/remove.png");
   private static final ResourceLocation cy = new ResourceLocation("feather:textures/gui/modlayout/settings.png");
   private FeatherSourceFile413 xd;
   private long il;

   public void lh(FeatherSourceFile413 var1) {
      this.xd = var1;
   }

   public void lx() {
      this.xd = null;
   }

   public void tx(int var1) {
      this.xd.yb().xj(0, 0, (int)Math.round(this.xd.nt()), (int)Math.round(this.xd.jf()), var1);
   }

   public void oo() {
      int var1 = FeatherSourceFile851.iJ();
      int var2 = FeatherSourceFile851.iK();
      int var3 = var1 / 4;
      int var4 = var2 / 4;
      double var5 = this.xd.zm();
      double var7 = this.xd.rq();
      int var9 = (int)(this.xd.jf() + 4.0);
      String var10 = FeatherSourceFile37.nc(this.xd.rf().li().kl().jc());
      FeatherSourceFile852 var11 = this.xd.yb();
      int var12 = var11.vr(var10);
      int var13 = (int)Math.round(this.xd.nt() - (double)var12);
      if (var5 < (double)var3) {
         if (var7 < (double)var4) {
            var11.lh(var10, 0.0F, (float)var9, -1, false, false);
         } else {
            var11.lh(var10, 0.0F, -13.0F, -1, false, false);
         }
      } else if (var7 < (double)var4) {
         var11.lh(var10, (float)var13, (float)var9, -1, false, false);
      } else {
         var11.lh(var10, (float)var13, -13.0F, -1, false, false);
      }

   }

   public void wn(int var1) {
      int var2 = (int)Math.round(this.xd.nt());
      int var3 = (int)Math.round(this.xd.jf());
      FeatherSourceFile852 var4 = this.xd.yb();
      var4.xj(-2, -2, 2, 2, var1);
      var4.xj(var2 - 2, -2, var2 + 2, 2, var1);
      var4.xj(-2, var3 - 2, 2, var3 + 2, var1);
      var4.xj(var2 - 2, var3 - 2, var2 + 2, var3 + 2, var1);
   }

   public void lh(int var1, FeatherSourceFile$nc39 var2) {
      int var3 = (int)Math.round(this.xd.nt());
      int var4 = (int)Math.round(this.xd.jf());
      FeatherSourceFile852 var5 = this.xd.yb();
      var5.lh(0, 0, var3, var4, var1, 1.0F, var2 == null ? FeatherSourceFile839.ALL : var2.toOutlineRenderer());
   }

   public void lh(double var1, double var3, int var5, int var6, FeatherSourceFile$nc39 var7) {
      if (var5 != 0) {
         if (var7 != FeatherSourceFile$nc39.LEFT && var7 != FeatherSourceFile$nc39.RIGHT && var7 != FeatherSourceFile$nc39.TOP && var7 != FeatherSourceFile$nc39.BOTTOM) {
            if (var7 != FeatherSourceFile$nc39.NONE) {
               FeatherSourceFile337.yB();
            }
         } else {
            FeatherSourceFile337.sb(var7 != FeatherSourceFile$nc39.LEFT && var7 != FeatherSourceFile$nc39.RIGHT);
         }

         this.lh(var5, var7);
      }

      if (var6 != 0) {
         this.wn(var6);
      }

   }

   public void rk() {
      float var1 = (float)FeatherSourceFile851.iN() * 2.0F;
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / var1, 1.0F / var1, 1.0F);
      boolean var2 = true;
      int var3 = (int)Math.round(this.xd.nt() * (double)var1) - 48;
      int var4 = (int)Math.round(this.xd.jf() * (double)var1) - 48;
      FeatherSourceFile852 var5 = this.xd.yb();
      FeatherSourceFile843.lh(0, cy);
      var5.lh(0, var4, 0.0F, 0.0F, 48, 48, 48, 48, 48.0F, 48.0F);
      FeatherSourceFile843.lh(0, fi);
      var5.lh(var3, var4, 0.0F, 0.0F, 48, 48, 48, 48, 48.0F, 48.0F);
      GL11.glPopMatrix();
   }
}
