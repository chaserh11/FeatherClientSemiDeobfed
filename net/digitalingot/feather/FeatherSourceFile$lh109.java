package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class FeatherSourceFile$lh109 extends FeatherSourceFile479 {
   // $FF: synthetic field
   final FeatherSourceFile759 Dr;

   public FeatherSourceFile$lh109(FeatherSourceFile759 var1) {
      this.Dr = var1;
   }

   public void lh(FeatherSourceFile683 var1) {
      int var2 = this.zb;
      int var3 = this.pp;
      long var4 = System.currentTimeMillis();
      FeatherSourceFile759.lh(this.Dr, FeatherSourceFile759.lh(this.Dr).lh(var4, 0.0F));
      FeatherSourceFile759.nc(this.Dr, FeatherSourceFile759.nc(this.Dr).lh(var4, 0.0F));
      int var6 = ((FeatherSourceFile$nc45)FeatherSourceFile759.xj(this.Dr)).hH.getRGB();
      float var7 = (float)(var6 >> 24 & 255) / 255.0F;
      float var8 = (float)(var6 >> 16 & 255) / 255.0F;
      float var9 = (float)(var6 >> 8 & 255) / 255.0F;
      float var10 = (float)(var6 & 255) / 255.0F;
      int var11 = ((FeatherSourceFile$nc45)FeatherSourceFile759.oe(this.Dr)).tE.getRGB();
      float var12 = (float)(var11 >> 24 & 255) / 255.0F;
      float var13 = (float)(var11 >> 16 & 255) / 255.0F;
      float var14 = (float)(var11 >> 8 & 255) / 255.0F;
      float var15 = (float)(var11 & 255) / 255.0F;
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hO();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      FeatherSourceFile443 var16 = FeatherSourceFile443.RM;
      var16.nc(7, DefaultVertexFormats.field_181706_f);
      var16.as((float)var2, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2, 0.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as(0.0F, 0.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as(0.0F, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2 / 2.0F - 0.25F, (float)var3 / 2.0F + 0.25F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2 / 2.0F + 0.25F, (float)var3 / 2.0F + 0.25F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2 / 2.0F + 0.25F, (float)var3 / 2.0F - 0.25F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2 / 2.0F - 0.25F, (float)var3 / 2.0F - 0.25F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.lx();
      var16.nc(5, DefaultVertexFormats.field_181706_f);
      var16.as(0.0F, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2 / 4.0F, (float)var3, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2 / 4.0F, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2, (float)var3, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.as((float)var2, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var8, var9, var10, var7).xZ();
      var16.lx();
      FeatherSourceFile843.gr(1.0F);
      var16.nc(3, DefaultVertexFormats.field_181706_f);
      var16.as((float)var2, (float)var3, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2 / 4.0F, (float)var3, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as(0.0F, (float)var3 / 3.0F * 2.0F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as(0.0F, 0.0F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2, 0.0F, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.as((float)var2, (float)var3, 0.0F).qy(var13, var14, var15, var12).xZ();
      var16.lx();
      FeatherSourceFile843.hP();
      FeatherSourceFile843.jz();
      FeatherSourceFile841.vK().lh((int)((float)(var2 / 2) + FeatherSourceFile759.qy(this.Dr)), (int)((float)(var3 / 2) + FeatherSourceFile759.ou(this.Dr)), 3.5F, ((FeatherSourceFile$nc45)FeatherSourceFile759.pq(this.Dr)).tE.getRGB());
   }

   public int rl() {
      return this.zb = this.Dr.rl();
   }

   public int fv() {
      return this.pp = this.Dr.fv();
   }

   public int zf() {
      return 60;
   }

   public int ok() {
      return 120;
   }

   public int xk() {
      return 30;
   }

   public int cp() {
      return 60;
   }

   public void xi(int var1) {
      super.xi(var1);
      ((FeatherSourceFile$nc45)this.Dr.pr()).zb = var1;
   }

   public void cg(int var1) {
      super.cg(var1);
      ((FeatherSourceFile$nc45)this.Dr.pr()).pp = var1;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$nc45)FeatherSourceFile759.as(this.Dr)).yT;
   }
}
