package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;

public class FeatherSourceFile239 implements LayerRenderer {
   private static final FeatherSourceFile465 tq = FeatherSourceFile665.nc(FeatherSourceFile784.class);
   public static final int sx = 16;
   public static final float qs = 1.0F;
   public static final int zl = 4;
   public static final float an = 0.625F;
   public static final float tt = 0.0625F;
   public static final float vp = 31.0F;
   public static final float nw = 0.01F;
   public static final float md = 0.17F;
   public static final float fx = -0.02F;
   public static final float at = 0.016666668F;
   public static int po;
   public static int gn;
   public static int yq;
   public static int es;
   public static int vw;
   public static int mn;
   public static int ea = 0;
   private final FeatherSourceFile498 wh;

   public FeatherSourceFile239() {
      byte var1 = 16;
      byte var2 = 4;
      int var3 = var1 * var2;
      int var4 = var1 * 2;
      int var5 = var2 * 2;
      po = 0;
      gn = var3;
      yq = gn + var3;
      es = yq + var4;
      vw = es + var4;
      mn = vw + var5;
      ea = mn + var5;
      short var6 = 756;
      this.wh = new FeatherSourceFile498(ea, var6);
   }

   public void lh(AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (((FeatherSourceFile$lh21)((FeatherSourceFile784)tq.ag()).pr()).lC) {
         FeatherSourceFile284 var9 = FeatherSourceFile707.nc(var1.func_110124_au());
         if (var9 != null) {
            if (!var1.func_82150_aj()) {
               GlStateManager.func_179094_E();
               GlStateManager.func_179109_b(0.0F, 0.0F, 0.01F);
               FeatherSourceFile484 var10 = (FeatherSourceFile484)var1;
               FeatherSourceFile178[] var11 = var10.getSimulationCloak();
               FeatherSourceFile178[] var12 = var10.getRenderCloak();
               FeatherSourceFile178 var16;
               FeatherSourceFile178[] var13;
               int var14;
               int var15;
               if (var1.func_70093_af()) {
                  GlStateManager.func_179137_b(0.0, 0.17000000178813934, 0.1);
                  if (!var10.getCrouchState()) {
                     var10.setCrouchState(true);
                     var13 = var11;
                     var14 = var11.length;

                     for(var15 = 0; var15 < var14; ++var15) {
                        var16 = var13[var15];
                        var16.nc(31.0F);
                     }
                  }
               } else if (var10.getCrouchState()) {
                  var10.setCrouchState(false);
                  var13 = var11;
                  var14 = var11.length;

                  for(var15 = 0; var15 < var14; ++var15) {
                     var16 = var13[var15];
                     var16.nc(10.0F);
                  }
               }

               if (!Minecraft.func_71410_x().func_147113_T()) {
                  this.lh(var1, var11);
               }

               FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
               this.wh.lh(var11, var12, var9, 0);
               GlStateManager.func_179121_F();
            }
         }
      }
   }

   private void lh(AbstractClientPlayer var1, FeatherSourceFile178[] var2) {
      FeatherSourceFile484 var3 = (FeatherSourceFile484)var1;
      long var4 = System.currentTimeMillis();
      if (var3.getCurrentTime() == 0L) {
         var3.setCurrentTime(var4);
      }

      long var6 = var4 - var3.getCurrentTime();
      var3.setCurrentTime(var4);
      var3.setAccumulator(var6 + var3.getAccumulator());

      while((float)var3.getAccumulator() >= 16.666668F) {
         FeatherSourceFile178[] var8 = var2;
         int var9 = var2.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            FeatherSourceFile178 var11 = var8[var10];
            var11.lh(var1);
            var11.lh(0.016666668F);
         }

         var3.setAccumulator(var3.getAccumulator() - 16L);
      }

   }

   public boolean func_177142_b() {
      return false;
   }

   // $FF: synthetic method
   public void func_177141_a(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.lh((AbstractClientPlayer)var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
