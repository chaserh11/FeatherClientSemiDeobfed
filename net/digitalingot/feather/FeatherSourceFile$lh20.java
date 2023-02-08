package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile$lh20 extends FeatherSourceFile413 {
   // $FF: synthetic field
   final FeatherSourceFile121 JZ;

   public FeatherSourceFile$lh20(FeatherSourceFile121 var1) {
      this.JZ = var1;
   }

   public boolean ti() {
      return ((FeatherSourceFile$nc8)FeatherSourceFile121.lh(this.JZ)).Kb;
   }

   public void lh(FeatherSourceFile683 var1) {
      List var2 = FeatherSourceFile121.nc(this.JZ).eK();
      FeatherSourceFile843.wq();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      boolean var3 = true;
      float var4 = 6.5F;
      int var5 = 0;
      if (FeatherSourceFile121.xj(this.JZ).gA()) {
         String var6 = FeatherSourceFile121.oe(this.JZ).field_71439_g.func_70005_c_();
         this.lh(FeatherSourceFile121.oe(this.JZ).field_71439_g.func_110124_au(), var6, 0.0F, 0.0F, 32, 6.5F);
         ++var5;
      }

      Iterator var8 = var2.iterator();

      while(var8.hasNext()) {
         FeatherSourceFile632 var7 = (FeatherSourceFile632)var8.next();
         this.lh(var7.oa(), var7.getName(), 0.0F, (float)(var5++) * 15.0F, 32, 6.5F);
      }

      FeatherSourceFile843.jz();
   }

   private void lh(UUID var1, String var2, float var3, float var4, int var5, float var6) {
      FeatherSourceFile843.hM();
      FeatherSourceFile443 var7 = FeatherSourceFile443.RM;
      NetworkPlayerInfo var8 = FeatherSourceFile121.oe(this.JZ).func_147114_u().func_175102_a(var1);
      if (var8 != null) {
         ResourceLocation var9 = var8.func_178837_g();
         Minecraft.func_71410_x().func_110434_K().func_110577_a(var9);
         var7.nc(6, DefaultVertexFormats.field_181707_g);
         float var10 = 0.1875F;
         float var11 = 0.1875F;
         float var12 = 0.0625F;

         float var18;
         float var19;
         float var20;
         float var21;
         float var22;
         float var23;
         for(int var13 = 0; var13 <= var5; ++var13) {
            double var14 = (double)((float)var13 * 360.0F / (float)var5) * Math.PI / 180.0;
            float var16 = (float)Math.cos(var14);
            float var17 = (float)Math.sin(var14);
            var18 = var3 + var6 + var16 * var6;
            var19 = var4 + var6 + var17 * var6;
            var20 = var12 * var16;
            var21 = var12 * var17;
            var22 = var10 + var20;
            var23 = var11 + var21;
            var7.as(var18, var19, 0.0F).ou(var22, var23).xZ();
         }

         var7.lx();
         float var26 = 0.6875F;
         float var27 = 0.1875F;
         var7.nc(6, DefaultVertexFormats.field_181707_g);

         int var15;
         double var28;
         for(var15 = 0; var15 <= var5; ++var15) {
            var28 = (double)((float)var15 * 360.0F / (float)var5) * Math.PI / 180.0;
            var18 = (float)Math.cos(var28);
            var19 = (float)Math.sin(var28);
            var20 = var3 + var6 + var18 * var6;
            var21 = var4 + var6 + var19 * var6;
            var22 = var12 * var18;
            var23 = var12 * var19;
            float var24 = var26 + var22;
            float var25 = var27 + var23;
            var7.as(var20, var21, 0.0F).ou(var24, var25).xZ();
         }

         var7.lx();
         var7.nc(3, DefaultVertexFormats.field_181706_f);

         for(var15 = 0; var15 <= var5; ++var15) {
            var28 = (double)((float)var15 * 360.0F / (float)var5) * Math.PI / 180.0;
            var18 = var6 + (float)Math.cos(var28) * var6;
            var19 = var6 + (float)Math.sin(var28) * var6;
            var7.as(var3 + var18, var4 + var19, 0.0F).qy(0.0F, 1.0F, 0.0F, 1.0F).xZ();
         }

         var7.lx();
         FeatherSourceFile843.hN();
         FeatherSourceFile841.vK().lh(var2, var3 + var6 * 2.0F + 3.0F, var4 + var6 - (float)(FeatherSourceFile121.oe(this.JZ).field_71466_p.field_78288_b / 2), -1, true);
      }
   }

   public int rl() {
      return 125;
   }

   public int fv() {
      return 50;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$nc8)FeatherSourceFile121.qy(this.JZ)).yT;
   }
}
