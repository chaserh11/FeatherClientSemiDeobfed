package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

class FeatherSourceFile$nc$lh1 {
   public final int zD;
   public final int zE;
   public final ItemStack zF;
   private final boolean zG;
   private final FeatherSourceFile.lh126 zH;
   private int zI;
   private String zJ;
   private int zK;
   private String zL;
   private int zM;
   // $FF: synthetic field
   final FeatherSourceFile.nc53 zN;

   FeatherSourceFile$nc$lh1(FeatherSourceFile.nc53 var1, ItemStack var2, int var3, int var4, boolean var5, FeatherSourceFile.lh126 var6) {
      this.zN = var1;
      this.zJ = "";
      this.zL = "";
      this.zF = var2;
      this.zE = var3;
      this.zD = var4;
      this.zG = var5;
      this.zH = var6;
      this.aE();
   }

   private void aE() {
      if (this.zF != null) {
         if ((this.zG && this.zH.yW || !this.zG && this.zH.zo) && this.zF.func_77984_f()) {
            int var2 = this.zF.func_77958_k();
            int var1 = var2 - this.zF.func_77952_i();
            switch (this.zH.yP) {
               case VALUE:
                  this.zJ = var1 + (this.zH.zA ? "/" + var2 : "");
                  break;
               case PERCENT:
                  this.zJ = var1 * 100 / var2 + "%";
            }
         }

         this.zK = FeatherSourceFile.nc53.lh(this.zN).vr(FeatherSourceFile341.px(this.zJ));
         this.zI = ((FeatherSourceFile.lh126)FeatherSourceFile.qr(this.zN.zC)).yS + this.zE + ((FeatherSourceFile.lh126)FeatherSourceFile.eg(this.zN.zC)).yS + this.zK;
         if (this.zH.yV) {
            this.zL = FeatherSourceFile341.px(this.zF.func_82833_r());
            this.zL = this.zL.replace("Splash ", "").replace("Potion of ", "");
            this.zI = ((FeatherSourceFile.lh126)FeatherSourceFile.oy(this.zN.zC)).yS + this.zE + ((FeatherSourceFile.lh126)FeatherSourceFile.ug(this.zN.zC)).yS + Math.max(FeatherSourceFile.nc53.nc(this.zN).vr(this.zL), this.zK);
         }

         this.zM = FeatherSourceFile.nc53.xj(this.zN).vr(this.zL);
      }
   }

   public void sm(int var1, int var2) {
      int var3 = 0;
      switch (this.zH.yQ) {
         case LEFT:
            var3 = Math.max(this.zK, this.zH.yV ? this.zM : 0);
            FeatherSourceFile.nc53.oe(this.zN).lh(this.zF, var1 - (2 * ((FeatherSourceFile.lh126)FeatherSourceFile.hv(this.zN.zC)).yS + this.zE + var3), var2, this.zH.yX, this.zH.yZ);
            if (this.zH.yV) {
               FeatherSourceFile.nc53.qy(this.zN).lh(this.zL + "§r", (float)(var1 - (var3 + ((FeatherSourceFile.lh126)FeatherSourceFile.sm(this.zN.zC)).yS)), (float)(var2 - 3), ((FeatherSourceFile.lh126)FeatherSourceFile.ly(this.zN.zC)).hQ, true);
            }

            FeatherSourceFile.nc53.ou(this.zN).lh(this.zJ + "§r", (float)(var1 - (var3 + ((FeatherSourceFile.lh126)FeatherSourceFile.rp(this.zN.zC)).yS)), (float)(var2 + (this.zH.yV ? 8 : 2)), ((FeatherSourceFile.lh126)FeatherSourceFile.tx(this.zN.zC)).hQ, true);
            break;
         case RIGHT:
            FeatherSourceFile.nc53.pq(this.zN).lh(this.zF, var1 - (this.zE + ((FeatherSourceFile.lh126)FeatherSourceFile.wn(this.zN.zC)).yS), var2, this.zH.yX, this.zH.yZ);
            if (this.zH.yV) {
               FeatherSourceFile.nc53.as(this.zN).lh(this.zL + "§r", (float)(var1 - (((FeatherSourceFile.lh126)FeatherSourceFile.jh(this.zN.zC)).yS + this.zE + ((FeatherSourceFile.lh126)FeatherSourceFile.gr(this.zN.zC)).yS) - this.zM), (float)(var2 - 3), ((FeatherSourceFile.lh126)FeatherSourceFile.oh(this.zN.zC)).hQ, true);
            }

            FeatherSourceFile.nc53.km(this.zN).lh(this.zJ + "§r", (float)(var1 - (((FeatherSourceFile.lh126)FeatherSourceFile.hg(this.zN.zC)).yS + this.zE + ((FeatherSourceFile.lh126)FeatherSourceFile.et(this.zN.zC)).yS) - this.zK), (float)(var2 + (this.zH.yV ? 8 : 2)), ((FeatherSourceFile.lh126)FeatherSourceFile.yl(this.zN.zC)).hQ, true);
      }

      if (((FeatherSourceFile.lh126)FeatherSourceFile.ai(this.zN.zC)).yX && this.zF.func_77984_f()) {
         GlStateManager.func_179097_i();
         GlStateManager.func_179084_k();
         GlStateManager.func_179090_x();
         int var4 = MathHelper.func_181758_c(Math.max(0.0F, (float)(1.0 - this.zF.func_77973_b().getDurabilityForDisplay(this.zF))) / 3.0F, 1.0F, 1.0F);
         double var5 = this.zF.func_77973_b().getDurabilityForDisplay(this.zF);
         int var7 = Math.round(13.0F - (float)var5 * 13.0F);
         if (this.zH.yQ == FeatherSourceFile$lh$nc5.RIGHT) {
            var1 += 2;
         }

         FeatherSourceFile.nc53.mq(this.zN).xj(var1 - (2 * ((FeatherSourceFile.lh126)FeatherSourceFile.ja(this.zN.zC)).yS + this.zE + var3) + 2, var2 + this.zD - 3, var1 - (2 * ((FeatherSourceFile.lh126)FeatherSourceFile.qn(this.zN.zC)).yS + this.zE + var3) + 15, var2 + this.zD - 1, -16777216);
         FeatherSourceFile.nc53.mr(this.zN).xj(var1 - (2 * ((FeatherSourceFile.lh126)FeatherSourceFile.er(this.zN.zC)).yS + this.zE + var3) + 2, var2 + this.zD - 3, var1 - (2 * ((FeatherSourceFile.lh126)FeatherSourceFile.zd(this.zN.zC)).yS + this.zE + var3) + var7 + 2, var2 + this.zD - 2, var4 | -16777216);
         GlStateManager.func_179098_w();
         GlStateManager.func_179147_l();
         GlStateManager.func_179126_j();
      }

      if (((FeatherSourceFile.lh126)FeatherSourceFile.ps(this.zN.zC)).yZ && this.zF.field_77994_a != 1) {
         String var8 = String.valueOf(this.zF.field_77994_a);
         var1 -= 4;
         GlStateManager.func_179097_i();
         FeatherSourceFile.nc53.ux(this.zN).lh(var8, (float)(var1 + 1 - Minecraft.func_71410_x().field_71466_p.func_78256_a(var8)), (float)(var2 + 9), Color.WHITE.getRGB(), true);
         GlStateManager.func_179126_j();
      }

      FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: synthetic method
   static int lh(FeatherSourceFile$nc$lh1 var0) {
      return var0.zI;
   }
}
