package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile$nc51 extends FeatherSourceFile413 {
   private ResourceLocation texture;
   private int textureWidth;
   private int textureHeight;
   private float pixelsPerDegree;
   private int AR;
   private int AS;
   private int AT;
   private int AU;
   private int zb;
   private int pp;
   private int AV;
   private int AW;
   private float AX;
   private float AY;
   private int AZ;
   private int Ba;
   // $FF: synthetic field
   final FeatherSourceFile102 Bb;

   public FeatherSourceFile$nc51(FeatherSourceFile102 var1) {
      this.Bb = var1;
      this.AZ = (int)(0.33330002F * this.AX);
      this.Ba = (int)(0.33335F * this.AX);
   }

   public void lh(FeatherSourceFile683 var1) {
      this.oy(FeatherSourceFile102.lh(this.Bb).field_71439_g.field_70177_z);
   }

   public void sy() {
      this.oy(90.0F);
   }

   public void oy(float var1) {
      this.ug(var1);
      this.hv(var1);
   }

   private void ug(float var1) {
      boolean var2 = false;
      boolean var3 = false;
      float var4 = var1;
      if (var1 < 0.0F) {
         var4 = var1 + 360.0F;
      }

      float var5 = (-this.AY + var4 * this.pixelsPerDegree + 7.5F * this.pixelsPerDegree) % (float)this.textureWidth;
      FeatherSourceFile843.lh(0, this.texture);
      this.gD.qy(0, 0, this.AW, this.pp, this.AR, this.AS);
      this.gD.lh(0, 0, var5, 0.0F, this.Ba, this.textureHeight, this.AW, this.pp, (float)this.textureWidth, (float)this.textureHeight, this.AT, this.AU);
      this.gD.qy(0 + this.AW, 0, this.AV, this.pp, this.AS, this.AS);
      this.gD.lh(0 + this.AW, 0, var5 + (float)this.Ba, 0.0F, this.AZ, this.textureHeight, this.AV, this.pp, (float)this.textureWidth, (float)this.textureHeight, this.AU, this.AU);
      this.gD.qy(0 + this.AW + this.AV, 0, this.AW, this.pp, this.AS, this.AR);
      this.gD.lh(0 + this.AW + this.AV, 0, var5 + (float)this.Ba + (float)this.AZ, 0.0F, this.Ba, this.textureHeight, this.AW, this.pp, (float)this.textureWidth, (float)this.textureHeight, this.AU, this.AT);
   }

   private void hv(float var1) {
      FeatherSourceFile$lh122 var2 = (FeatherSourceFile$lh122)FeatherSourceFile102.nc(this.Bb).pr();
      float var3 = (float)(this.zb - ((FeatherSourceFile$lh123)FeatherSourceFile102.xj(this.Bb)).AJ) / 2.0F;
      float var4 = -1.0F;
      float var5 = var4 - (float)((FeatherSourceFile$lh123)FeatherSourceFile102.oe(this.Bb)).AJ;
      int var6 = ((FeatherSourceFile$lh123)FeatherSourceFile102.qy(this.Bb)).AO.getRed();
      int var7 = ((FeatherSourceFile$lh123)FeatherSourceFile102.ou(this.Bb)).AO.getGreen();
      int var8 = ((FeatherSourceFile$lh123)FeatherSourceFile102.pq(this.Bb)).AO.getBlue();
      boolean var9 = true;
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hO();
      FeatherSourceFile843.ou(770, 771, 1, 0);
      FeatherSourceFile443 var10 = FeatherSourceFile443.RM;
      if (var2.enabled && ((FeatherSourceFile$lh123)FeatherSourceFile102.as(this.Bb)).AQ && FeatherSourceFile102.lh(this.Bb).field_71439_g != null) {
         FeatherSourceFile403 var11 = new FeatherSourceFile403();
         FeatherSourceFile403 var12 = new FeatherSourceFile403();
         float var13 = (var1 < 0.0F ? 360.0F + var1 : var1) % 360.0F;
         ArrayList var14 = new ArrayList();
         Iterator var15 = FeatherSourceFile102.nc(this.Bb).gV().iterator();

         while(true) {
            FeatherSourceFile201 var16;
            while(var15.hasNext()) {
               var16 = (FeatherSourceFile201)var15.next();
               var11.Te = (float)(-1.0 * ((double)var16.ei().ax() - FeatherSourceFile102.lh(this.Bb).field_71439_g.field_70169_q));
               var11.Td = (float)((double)var16.ei().gR() - FeatherSourceFile102.lh(this.Bb).field_71439_g.field_70166_s);
               double var17 = Math.toRadians((double)var13);
               if (var13 >= 0.0F && var13 < 90.0F) {
                  var12.Td = (float)Math.sin(1.5707963267948966 - var17);
                  var12.Te = (float)Math.cos(1.5707963267948966 - var17);
               } else if (var13 >= 90.0F && var13 < 180.0F) {
                  var12.Td = (float)(-1.0 * Math.sin(var17 - 1.5707963267948966));
                  var12.Te = (float)Math.cos(var17 - 1.5707963267948966);
               } else if (var13 >= 180.0F && var13 < 270.0F) {
                  var12.Td = (float)(-1.0 * Math.sin(4.71238898038469 - var17));
                  var12.Te = (float)(-1.0 * Math.cos(4.71238898038469 - var17));
               } else {
                  var12.Td = (float)Math.sin(var17 - 4.71238898038469);
                  var12.Te = (float)(-1.0 * Math.cos(var17 - 4.71238898038469));
               }

               if (var11.zJ() != 0.0F && var12.zJ() != 0.0F) {
                  var12.zK();
                  var11.zK();
                  double var19 = Math.toDegrees(Math.atan2((double)(var11.Td * var12.Te - var11.Te * var12.Td), (double)(var11.Td * var12.Td + var11.Te * var12.Te)));
                  var16.MF = var19;
                  if (Math.abs(var19) < (double)((FeatherSourceFile$lh123)FeatherSourceFile102.km(this.Bb)).AL / 2.0) {
                     var14.add(var16);
                  }
               } else {
                  var16.MF = 0.0;
                  var14.add(var16);
               }
            }

            var15 = var14.iterator();

            while(var15.hasNext()) {
               var16 = (FeatherSourceFile201)var15.next();
               float var30 = 3.0F;
               byte var18 = 4;
               float var31 = (float)(var16.MF * this.nt() / (double)((float)((FeatherSourceFile$lh123)FeatherSourceFile102.mq(this.Bb)).AL));
               int var20 = var16.qm().lm();
               float var21 = (float)(var20 >> 24 & 255) / 255.0F;
               float var22 = (float)(var20 >> 16 & 255) / 255.0F;
               float var23 = (float)(var20 >> 8 & 255) / 255.0F;
               float var24 = (float)(var20 & 255) / 255.0F;
               var10.nc(3, DefaultVertexFormats.field_181706_f);

               for(int var25 = 0; var25 <= var18; ++var25) {
                  double var26 = (double)((float)var25 * 360.0F / (float)var18) * Math.PI / 180.0;
                  float var28 = var30 + (float)Math.cos(var26) * var30;
                  float var29 = var30 + (float)Math.sin(var26) * var30;
                  var10.as(-var31 + var3 + var28 - var30, var29 + var5, 0.0F).qy(var22, var23, var24, var21).xZ();
               }

               var10.lx();
            }
            break;
         }
      }

      var10.nc(6, DefaultVertexFormats.field_181706_f);
      var10.as(var3, var4, 0.0F).km(var6, var7, var8, 255).xZ();
      var10.as(var3 + (float)((FeatherSourceFile$lh123)FeatherSourceFile102.mr(this.Bb)).AJ, var5, 0.0F).km(var6, var7, var8, 255).xZ();
      var10.as(var3 - (float)((FeatherSourceFile$lh123)FeatherSourceFile102.ux(this.Bb)).AJ, var5, 0.0F).km(var6, var7, var8, 255).xZ();
      var10.lx();
      FeatherSourceFile843.hP();
      FeatherSourceFile843.jz();
   }

   private void aQ() {
      this.texture = ((FeatherSourceFile$lh123)FeatherSourceFile102.si(this.Bb)).AI.texture;
      this.textureWidth = ((FeatherSourceFile$lh123)FeatherSourceFile102.wz(this.Bb)).AI.textureWidth;
      this.textureHeight = ((FeatherSourceFile$lh123)FeatherSourceFile102.lt(this.Bb)).AI.textureHeight;
      this.pixelsPerDegree = ((FeatherSourceFile$lh123)FeatherSourceFile102.hb(this.Bb)).AI.pixelsPerDegree;
   }

   private void aR() {
      this.AS = ((FeatherSourceFile$lh123)FeatherSourceFile102.ep(this.Bb)).hH.getRGB();
      this.AR = this.AS & 16777215;
      this.AU = ((FeatherSourceFile$lh123)FeatherSourceFile102.qr(this.Bb)).AN.lm();
      this.AT = this.AU & 16777215;
   }

   private void aS() {
      this.zb = ((FeatherSourceFile$lh123)FeatherSourceFile102.eg(this.Bb)).zb;
      this.pp = (int)((double)((FeatherSourceFile$lh123)FeatherSourceFile102.oy(this.Bb)).AJ * 0.75 + 18.0);
      this.AV = (int)(0.33330002F * (float)this.zb);
      this.AW = (int)(0.33335F * (float)this.zb);
      this.AX = (float)((FeatherSourceFile$lh123)FeatherSourceFile102.ug(this.Bb)).AL * this.pixelsPerDegree;
      this.AY = this.AX / 2.0F;
      this.AZ = (int)(0.33330002F * this.AX);
      this.Ba = (int)(0.33335F * this.AX);
   }

   public void pu() {
      this.aQ();
      this.aS();
      this.aR();
   }

   public int fv() {
      return this.pp;
   }

   public int rl() {
      return this.zb;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh123)FeatherSourceFile102.hv(this.Bb)).yT;
   }
}
