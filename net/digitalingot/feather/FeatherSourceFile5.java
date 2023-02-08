package net.digitalingot.feather;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.util.MathHelper;

public class FeatherSourceFile5 extends LayerCape {
   private static final FeatherSourceFile465 tq = FeatherSourceFile665.nc(FeatherSourceFile784.class);
   private final FeatherSourceFile553 hc = new FeatherSourceFile553();

   public FeatherSourceFile5(RenderPlayer var1) {
      super(var1);
   }

   public void func_177141_a(AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      FeatherSourceFile707 var9 = FeatherSourceFile707.vv();
      FeatherSourceFile165 var10 = var9.oe(var1.func_110124_au());
      if (var10 == null) {
         super.func_177141_a(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         FeatherSourceFile284 var11 = var9.hb(var10.getSlug());
         if (var11 != null) {
            if (!((FeatherSourceFile$lh21)((FeatherSourceFile784)tq.ag()).pr()).lC) {
               GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.func_179094_E();
               GlStateManager.func_179109_b(0.0F, -0.02F, 0.19F);
               double var12 = var1.field_71091_bM + (var1.field_71094_bP - var1.field_71091_bM) * (double)var4 - (var1.field_70169_q + (var1.field_70165_t - var1.field_70169_q) * (double)var4);
               double var14 = var1.field_71096_bN + (var1.field_71095_bQ - var1.field_71096_bN) * (double)var4 - (var1.field_70167_r + (var1.field_70163_u - var1.field_70167_r) * (double)var4);
               double var16 = var1.field_71097_bO + (var1.field_71085_bR - var1.field_71097_bO) * (double)var4 - (var1.field_70166_s + (var1.field_70161_v - var1.field_70166_s) * (double)var4);
               float var18 = var1.field_70760_ar + (var1.field_70761_aq - var1.field_70760_ar) * var4;
               double var19 = (double)MathHelper.func_76126_a(var18 * 0.017453292F);
               double var21 = (double)(-MathHelper.func_76134_b(var18 * 0.017453292F));
               float var23 = (float)var14 * 10.0F;
               var23 = MathHelper.func_76131_a(var23, -6.0F, 32.0F);
               float var24 = (float)(var12 * var19 + var16 * var21) * 100.0F;
               var24 = MathHelper.func_76131_a(var24, 0.0F, 150.0F);
               float var25 = (float)(var12 * var21 - var16 * var19) * 100.0F;
               var25 = MathHelper.func_76131_a(var25, -20.0F, 20.0F);
               float var26 = var1.field_71107_bF + (var1.field_71109_bG - var1.field_71107_bF) * var4;
               var23 += MathHelper.func_76126_a((var1.field_70141_P + (var1.field_70140_Q - var1.field_70141_P) * var4) * 6.0F) * 32.0F * var26;
               if (var1.func_70093_af()) {
                  var23 += 25.0F;
                  GlStateManager.func_179109_b(0.0F, 0.1F, 0.0F);
               }

               GlStateManager.func_179114_b(6.0F + var24 / 2.0F + var23, 1.0F, 0.0F, 0.0F);
               GlStateManager.func_179114_b(var25 / 2.0F, 0.0F, 0.0F, 1.0F);
               GlStateManager.func_179114_b(-var25 / 2.0F, 0.0F, 1.0F, 0.0F);
               GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
               this.hc.lh(var11, 0);
               GlStateManager.func_179121_F();
            }
         }
      }
   }
}
