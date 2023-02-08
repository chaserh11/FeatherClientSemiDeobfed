package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile841 {
   public static final int PE = 12;
   private static final FeatherSourceFile817 PF = new FeatherSourceFile817();
   private static final FontRenderer PG;
   public static final ResourceLocation PH;
   private static final FeatherSourceFile528 PI;
   private static FeatherSourceFile841 PJ;
   private FeatherSourceFile486 Cl = null;
   private double PK = 1.0;
   private double PL = 0.0;
   private double PM = 0.0;

   protected FeatherSourceFile841() {
      Minecraft.func_71410_x().func_175599_af().field_77023_b = 200.0F;
   }

   private FeatherSourceFile486 vI() {
      if (this.Cl == null) {
         this.Cl = (FeatherSourceFile486)((FeatherSourceFile665)FeatherSourceFile487.mq().getInstance(FeatherSourceFile665.class)).xj(FeatherSourceFile486.class);
      }

      return this.Cl;
   }

   private FeatherSourceFile$lh133 vJ() {
      return (FeatherSourceFile$lh133)this.vI().pr();
   }

   public static FeatherSourceFile841 vK() {
      if (PJ == null) {
         PJ = new FeatherSourceFile841();
      }

      return PJ;
   }

   public static FeatherSourceFile817 vL() {
      return PF;
   }

   public final void nc(int var1, int var2, int var3, int var4, int var5, float var6) {
      float var7;
      float var8;
      float var9;
      float var10;
      if (var5 != -1) {
         var7 = (float)(var5 >> 24 & 255) / 255.0F;
         var8 = (float)(var5 >> 16 & 255) / 255.0F;
         var9 = (float)(var5 >> 8 & 255) / 255.0F;
         var10 = (float)(var5 & 255) / 255.0F;
      } else {
         var10 = 1.0F;
         var9 = 1.0F;
         var8 = 1.0F;
         var7 = 1.0F;
      }

      int var11 = this.vI().gy(var4);
      if (var11 > 0) {
         FeatherSourceFile843.nc(var8, var9, var10, var7);
         this.lh((float)var1, (float)var2, (float)var3, (float)var4, (float)var11, var6);
         FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.xj(var1, var2, var3, var4, var5, var6);
      }

   }

   public final void lh(int var1, int var2, int var3, int var4, int var5) {
      this.lh(var1, var2, var3, var4, var5, FeatherSourceFile839.ALL);
   }

   public final void xj(int var1, int var2, int var3, int var4, int var5, float var6) {
      this.lh(var1, var2, var3, var4, var5, var6, FeatherSourceFile839.ALL);
   }

   public final void lh(int var1, int var2, int var3, int var4, int var5, FeatherSourceFile839 var6) {
      this.lh(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public final void lh(int var1, int var2, int var3, int var4, int var5, float var6, FeatherSourceFile839 var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      float var10;
      float var11;
      float var12;
      float var13;
      if (var5 != -1) {
         var10 = (float)(var5 >> 24 & 255) / 255.0F;
         var11 = (float)(var5 >> 16 & 255) / 255.0F;
         var12 = (float)(var5 >> 8 & 255) / 255.0F;
         var13 = (float)(var5 & 255) / 255.0F;
      } else {
         var13 = 1.0F;
         var12 = 1.0F;
         var11 = 1.0F;
         var10 = 1.0F;
      }

      boolean var14 = var6 != 1.0F;
      if (var14) {
         FeatherSourceFile843.gr(var6);
      }

      FeatherSourceFile843.hO();
      var7.draw(var1, var2, var8, var9, var11, var12, var13, var10);
      FeatherSourceFile843.hP();
      if (var14) {
         FeatherSourceFile843.gr(1.0F);
      }

   }

   public final void nc(int var1, int var2, int var3, int var4, int var5) {
      this.xj(var1, var2, var3, var4, var5, ((FeatherSourceFile$lh133)this.vI().pr()).tN);
   }

   public final void lh(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      this.lh(var1, var2, var3, var4, var5, ((FeatherSourceFile$lh133)this.vI().pr()).tN, var6);
   }

   public final void xj(int var1, int var2, int var3, int var4, int var5) {
      this.xj(var1, var2, var3, var4, var5, 0);
   }

   public final void xj(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.lh(var1, var2, var3, var4, var5, var6, false);
   }

   public final void lh(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var7) {
         FeatherSourceFile$lh133 var8 = this.vJ();
         if (var8.tI == FeatherSourceFile840.NORMAL) {
            double var9 = var8.tJ;
            long var11 = System.currentTimeMillis();
            float var13 = (float)(((double)var11 - (double)(var1 * 100) / var9 - (double)(var2 * 100) / var9) % (50000.0 / var9) / (50000.0 / var9));
            int var14 = Math.abs(var3 - var1);
            float var15 = (float)(((double)var11 - (double)((var1 + var14) * 100) / var9 - (double)(var2 * 100) / var9) % (50000.0 / var9) / (50000.0 / var9));
            int var16 = Color.HSBtoRGB(var13, 0.8F, 0.8F);
            int var17 = Color.HSBtoRGB(var15, 0.8F, 0.8F);
            this.ou(var1, var2, var3, var4, var16, var17);
         } else {
            this.oe(var1, var2, var3, var4, this.vM(), var6);
         }
      } else {
         this.oe(var1, var2, var3, var4, var5, var6);
      }

   }

   private void oe(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var1 < var3) {
         var7 = var1;
         var1 = var3;
         var3 = var7;
      }

      if (var2 < var4) {
         var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      float var8 = (float)(var5 >> 24 & 255) / 255.0F;
      float var9 = (float)(var5 >> 16 & 255) / 255.0F;
      float var10 = (float)(var5 >> 8 & 255) / 255.0F;
      float var11 = (float)(var5 & 255) / 255.0F;
      var6 = this.vI().oy(var6, var2 - var4);
      if (var6 > 0) {
         FeatherSourceFile843.nc(var9, var10, var11, var8);
         PI.ug(true);
         PI.setColor(var9, var10, var11, var8);
         PI.lh(var3, var4, var1 - var3, var2 - var4, var6, 1.0F);
         FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         FeatherSourceFile843.wq();
         FeatherSourceFile843.ou(770, 771, 1, 0);
         FeatherSourceFile843.hO();
         FeatherSourceFile443 var12 = FeatherSourceFile443.RM;
         var12.nc(7, DefaultVertexFormats.field_181706_f);
         var12.as((float)var1, (float)var4, 0.0F).qy(var9, var10, var11, var8).xZ();
         var12.as((float)var3, (float)var4, 0.0F).qy(var9, var10, var11, var8).xZ();
         var12.as((float)var3, (float)var2, 0.0F).qy(var9, var10, var11, var8).xZ();
         var12.as((float)var1, (float)var2, 0.0F).qy(var9, var10, var11, var8).xZ();
         var12.lx();
         FeatherSourceFile843.hP();
         FeatherSourceFile843.jz();
      }

   }

   public void qy(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var3;
      int var8 = var2 + var4;
      this.ou(var1, var2, var7, var8, var5, var6);
   }

   private void ou(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var1 < var3) {
         var7 = var1;
         var1 = var3;
         var3 = var7;
      }

      if (var2 < var4) {
         var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      var7 = var5 >> 24 & 255;
      int var8 = var5 >> 16 & 255;
      int var9 = var5 >> 8 & 255;
      int var10 = var5 & 255;
      int var11 = var6 >> 24 & 255;
      int var12 = var6 >> 16 & 255;
      int var13 = var6 >> 8 & 255;
      int var14 = var6 & 255;
      FeatherSourceFile843.hO();
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hE();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      FeatherSourceFile843.yh(7425);
      FeatherSourceFile443 var15 = FeatherSourceFile443.RM;
      var15.nc(5, DefaultVertexFormats.field_181706_f);
      var15.as((float)var3, (float)var4, 0.0F).km(var8, var9, var10, var7).xZ();
      var15.as((float)var3, (float)var2, 0.0F).km(var8, var9, var10, var7).xZ();
      var15.as((float)var1, (float)var4, 0.0F).km(var12, var13, var14, var11).xZ();
      var15.as((float)var1, (float)var2, 0.0F).km(var12, var13, var14, var11).xZ();
      var15.lx();
      FeatherSourceFile843.yh(7424);
      FeatherSourceFile843.jz();
      FeatherSourceFile843.hF();
      FeatherSourceFile843.hP();
   }

   public void lh(float var1, float var2, float var3, float var4, float var5, float var6) {
      byte var7 = 12;
      int var8 = 90 / var7;
      FeatherSourceFile843.hO();
      FeatherSourceFile843.wq();
      GL11.glEnable(2848);
      FeatherSourceFile843.gr(var6);
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(3, DefaultVertexFormats.field_181705_e);

      int var10;
      double var11;
      for(var10 = var7; var10 > -1; --var10) {
         var11 = Math.toRadians((double)(270 - var10 * var8));
         var9.as((float)((double)(var1 + var5) + (double)var5 * Math.cos(var11)), (float)((double)(var2 + var5) + (double)var5 * Math.sin(var11)), 0.0F).xZ();
      }

      for(var10 = 0; var10 <= var7; ++var10) {
         var11 = Math.toRadians((double)(90 - var10 * var8));
         var9.as(var3 - var5 + var5 * (float)Math.cos(var11), var2 + var5 - var5 * (float)Math.sin(var11), 0.0F).xZ();
      }

      for(var10 = var7; var10 > -1; --var10) {
         var11 = Math.toRadians((double)(var10 * var8 + 270));
         var9.as(var3 - var5 + var5 * (float)Math.cos(var11), var4 - var5 - var5 * (float)Math.sin(var11), 0.0F).xZ();
      }

      for(var10 = 0; var10 <= var7; ++var10) {
         var11 = Math.toRadians((double)(var10 * var8 + 90));
         var9.as((float)((double)(var1 + var5) + (double)var5 * Math.cos(var11)), (float)((double)(var4 - var5) + (double)var5 * Math.sin(var11)), 0.0F).xZ();
      }

      var9.as(var1, var4 - var5, 0.0F).xZ();
      var9.as(var1, var2 + var5, 0.0F).xZ();
      var9.lx();
      GL11.glDisable(2848);
      FeatherSourceFile843.gr(1.0F);
      FeatherSourceFile843.jz();
      FeatherSourceFile843.hP();
   }

   public void pq(int var1, int var2, int var3, int var4) {
      int var5 = this.vI().gy(var3 - var2);
      if (var5 > 0) {
         this.nc((float)var1, (float)var2, (float)var3, (float)var4, (float)var5);
      } else {
         FeatherSourceFile843.wq();
         FeatherSourceFile843.ly(770, 771);
         this.lh(var1, var2, (float)var1, (float)var2, var2, var4, var2, var4, (float)var2, (float)var4);
      }

   }

   public void nc(float var1, float var2, float var3, float var4, float var5) {
      byte var6 = 12;
      float var7 = 90.0F / (float)var6;
      FeatherSourceFile843.wq();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      float var8 = var3 - var1;
      float var9 = var4 - var2;
      float var10 = 1.0F / var8;
      float var11 = 1.0F / var9;
      FeatherSourceFile443 var12 = FeatherSourceFile443.RM;
      FeatherSourceFile843.hM();
      var12.nc(6, DefaultVertexFormats.field_181707_g);
      var12.as(var1 + var8 / 2.0F, var2 + var9 / 2.0F, 0.0F).ou(var8 / 2.0F * var10, var9 / 2.0F * var11).xZ();

      int var13;
      double var14;
      for(var13 = var6; var13 > -1; --var13) {
         var14 = Math.toRadians((double)(270.0F - (float)var13 * var7));
         var12.as((float)((double)(var1 + var5) + (double)var5 * Math.cos(var14)), (float)((double)(var2 + var5) + (double)var5 * Math.sin(var14)), 0.0F).ou((float)(((double)var5 + (double)var5 * Math.cos(var14)) * (double)var10), (float)(((double)var5 + (double)var5 * Math.sin(var14)) * (double)var11)).xZ();
      }

      for(var13 = 0; var13 <= var6; ++var13) {
         var14 = Math.toRadians((double)(90.0F - (float)var13 * var7));
         var12.as(var3 - var5 + var5 * (float)Math.cos(var14), var2 + var5 - var5 * (float)Math.sin(var14), 0.0F).ou((float)(((double)(var8 - var5) + (double)var5 * Math.cos(var14)) * (double)var10), (float)(((double)var5 - (double)var5 * Math.sin(var14)) * (double)var11)).xZ();
      }

      for(var13 = var6; var13 > -1; --var13) {
         var14 = Math.toRadians((double)((float)var13 * var7 + 270.0F));
         var12.as(var3 - var5 + var5 * (float)Math.cos(var14), var4 - var5 - var5 * (float)Math.sin(var14), 0.0F).ou((float)(((double)(var8 - var5) + (double)var5 * Math.cos(var14)) * (double)var10), (float)(((double)(var9 - var5) - (double)var5 * Math.sin(var14)) * (double)var11)).xZ();
      }

      for(var13 = 0; var13 <= var6; ++var13) {
         var14 = Math.toRadians((double)((float)var13 * var7 + 90.0F));
         var12.as((float)((double)(var1 + var5) + (double)var5 * Math.cos(var14)), (float)((double)(var4 - var5) + (double)var5 * Math.sin(var14)), 0.0F).ou((float)(((double)var5 + (double)var5 * Math.cos(var14)) * (double)var10), (float)(((double)(var9 - var5) + (double)var5 * Math.sin(var14)) * (double)var11)).xZ();
      }

      var12.as(var1, var2 + var5, 0.0F).ou(0.0F, var5 * var11).xZ();
      var12.lx();
      FeatherSourceFile843.hN();
      FeatherSourceFile843.jz();
   }

   public void lh(int var1, int var2, float var3, int var4) {
      float var5 = (float)(var4 >> 24 & 255) / 255.0F;
      float var6 = (float)(var4 >> 16 & 255) / 255.0F;
      float var7 = (float)(var4 >> 8 & 255) / 255.0F;
      float var8 = (float)(var4 & 255) / 255.0F;
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hO();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      GL11.glEnable(2848);
      FeatherSourceFile843.gr(2.5F);
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(3, DefaultVertexFormats.field_181706_f);

      for(int var10 = 0; var10 <= 360; var10 += 10) {
         double var11 = Math.toRadians((double)var10);
         var9.as((float)((double)var1 + FeatherSourceFile846.mq(var11) * (double)var3), (float)((double)var2 + FeatherSourceFile846.km(var11) * (double)var3), 0.0F).qy(var6, var7, var8, var5).xZ();
      }

      var9.lx();
      FeatherSourceFile843.gr(1.0F);
      GL11.glDisable(2848);
      FeatherSourceFile843.jz();
      FeatherSourceFile843.hP();
   }

   public void lh(String var1, float var2, float var3, int var4, boolean var5) {
      if (var1 != null) {
         PG.func_175065_a(var1, var2, var3, var4, var5);
      }
   }

   public void lh(String var1, float var2, float var3, FeatherSourceFile225 var4, boolean var5) {
      this.lh(var1, var2, var3, var4.lm(), var5, var4.on());
   }

   public void lh(String var1, float var2, float var3, int var4, boolean var5, boolean var6) {
      if (var6) {
         int var7 = var4 >> 24 & 255;
         this.nc(var1, var2, var3, var7, var5);
      } else {
         this.lh(var1, var2, var3, var4, var5);
      }

   }

   protected void nc(String var1, float var2, float var3, int var4, boolean var5) {
      var1 = FeatherSourceFile341.px(var1);
      FeatherSourceFile$lh133 var6 = this.vJ();
      switch (var6.tI) {
         case BREATHING:
            Color var15 = new Color(this.vM(), true);
            var15 = new Color(var15.getRed(), var15.getGreen(), var15.getBlue(), var15.getAlpha() * var4 / 255);
            this.lh(var1, var2, var3, var15.getRGB(), var5, false);
            break;
         case NORMAL:
            char[] var7 = var1.toCharArray();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               char var10 = var7[var9];
               float var11 = (float)(((double)System.currentTimeMillis() - ((double)var2 * this.PK - this.PL) * 100.0 / var6.tJ - ((double)var3 * this.PK - this.PM) * 100.0 / var6.tJ) % (50000.0 / var6.tJ) / (50000.0 / var6.tJ));
               int var12 = Color.HSBtoRGB(var11, 0.8F, 0.8F);
               Color var13 = new Color(var12, true);
               var13 = new Color(var13.getRed(), var13.getGreen(), var13.getBlue(), var13.getAlpha() * var4 / 255);
               String var14 = String.valueOf(var10);
               this.lh(var14, var2, var3, var13.getRGB(), var5, false);
               var2 += (float)this.vr(var14);
            }
      }

   }

   public int vM() {
      double var1 = 50000.0 / this.vJ().tJ;
      double var3 = (double)System.currentTimeMillis() % var1 / var1;
      return Color.HSBtoRGB((float)var3, 0.8F, 0.8F);
   }

   public int vr(String var1) {
      return PF.func_78256_a(var1);
   }

   public void lh(ItemStack var1, int var2, int var3, boolean var4, boolean var5) {
      FeatherSourceFile843.hK();
      RenderHelper.func_74519_b();
      RenderHelper.func_74520_c();
      Minecraft.func_71410_x().func_175599_af().func_180450_b(var1, var2, var3);
      RenderHelper.func_74518_a();
      FeatherSourceFile843.hL();
   }

   public void pq(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.lh(var1, var2, (float)var3, (float)var4, var5, var6, var5, var6, 256.0F, 256.0F);
   }

   public void lh(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      this.lh(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -1);
   }

   public void lh(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10, int var11) {
      this.lh(var1, var2, 0.0F, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public void lh(int var1, int var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12) {
      float var13 = 1.0F / var10;
      float var14 = 1.0F / var11;
      float var15 = (float)(var12 >> 24 & 255) / 255.0F;
      float var16 = (float)(var12 >> 16 & 255) / 255.0F;
      float var17 = (float)(var12 >> 8 & 255) / 255.0F;
      float var18 = (float)(var12 & 255) / 255.0F;
      FeatherSourceFile443 var19 = FeatherSourceFile443.RM;
      var19.nc(7, DefaultVertexFormats.field_181709_i);
      var19.as((float)var1, (float)(var2 + var9), var3).ou(var4 * var13, (var5 + (float)var7) * var14).qy(var16, var17, var18, var15).xZ();
      var19.as((float)(var1 + var8), (float)(var2 + var9), var3).ou((var4 + (float)var6) * var13, (var5 + (float)var7) * var14).qy(var16, var17, var18, var15).xZ();
      var19.as((float)(var1 + var8), (float)var2, var3).ou((var4 + (float)var6) * var13, var5 * var14).qy(var16, var17, var18, var15).xZ();
      var19.as((float)var1, (float)var2, var3).ou(var4 * var13, var5 * var14).qy(var16, var17, var18, var15).xZ();
      var19.lx();
   }

   public void lh(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10, int var11, int var12) {
      float var13 = 1.0F / var9;
      float var14 = 1.0F / var10;
      int var15 = var11 >> 24 & 255;
      int var16 = var11 >> 16 & 255;
      int var17 = var11 >> 8 & 255;
      int var18 = var11 >> 0 & 255;
      int var19 = var12 >> 24 & 255;
      int var20 = var12 >> 16 & 255;
      int var21 = var12 >> 8 & 255;
      int var22 = var12 >> 0 & 255;
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hE();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      FeatherSourceFile843.yh(7425);
      boolean var23 = GL11.glIsEnabled(2848);
      if (!var23) {
         GL11.glEnable(2848);
      }

      FeatherSourceFile443 var24 = FeatherSourceFile443.RM;
      var24.nc(5, DefaultVertexFormats.field_181709_i);
      var24.as((float)(var1 + var7), (float)(var2 + var8), 0.0F).ou((var3 + (float)var5) * var13, (var4 + (float)var6) * var14).km(var20, var21, var22, var19).xZ();
      var24.as((float)(var1 + var7), (float)var2, 0.0F).ou((var3 + (float)var5) * var13, var4 * var14).km(var20, var21, var22, var19).xZ();
      var24.as((float)var1, (float)(var2 + var8), 0.0F).ou(var3 * var13, (var4 + (float)var6) * var14).km(var16, var17, var18, var15).xZ();
      var24.as((float)var1, (float)var2, 0.0F).ou(var3 * var13, var4 * var14).km(var16, var17, var18, var15).xZ();
      var24.lx();
      if (!var23) {
         GL11.glDisable(2848);
      }

      FeatherSourceFile843.yh(7424);
      FeatherSourceFile843.jz();
      FeatherSourceFile843.hF();
      FeatherSourceFile843.hP();
   }

   public void vN() {
      this.PK = 1.0;
      this.PL = 0.0;
      this.PM = 0.0;
   }

   public void xj(double var1, double var3, double var5) {
      this.PK = var1;
      this.PL = var3;
      this.PM = var5;
   }

   protected float yl(float var1) {
      return var1;
   }

   protected float ai(float var1) {
      return var1;
   }

   static {
      PG = Minecraft.func_71410_x().field_71466_p;
      PH = new ResourceLocation("feather:ui/background.png");
      PI = new FeatherSourceFile528(PH, 110, 104, 54, 54, 56, 50);
   }
}
