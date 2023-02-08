package net.digitalingot.feather;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import org.apache.logging.log4j.Level;

public class FeatherSourceFile$nc41 {
   private final FeatherSourceFile813 Jj;
   private long Jk;
   private int Jl;
   private int Jm;
   private float Jn;
   private boolean Jo;
   private boolean Jp;
   // $FF: synthetic field
   final FeatherSourceFile659 Jq;

   FeatherSourceFile$nc41(FeatherSourceFile659 var1, FeatherSourceFile420 var2) {
      this.Jq = var1;
      this.Jj = new FeatherSourceFile813(new byte[0], false, false);
      this.Jk = 0L;
      this.Jl = 0;
      this.Jm = 0;
      this.Jn = 1.0F;
      this.Jo = false;
      this.Jp = false;
      var2.lh(FeatherSourceFile659.dW(), () -> {
         return this.Jj;
      });
   }

   public void ou(File var1) {
      try {
         FileInputStream var2 = new FileInputStream(var1);
         BufferedImage var3 = ImageIO.read(var2);
         var2.close();
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         ImageIO.write(var3, "PNG", var4);
         byte[] var5 = var4.toByteArray();
         var4.close();
         this.Jj.hb(var5);
         this.Jl = var3.getHeight();
         this.Jm = var3.getWidth();
         this.Jn = (float)(new ScaledResolution(Minecraft.func_71410_x())).func_78325_e();
         this.Jo = true;
         this.Jp = true;
         this.Jk = System.currentTimeMillis();
      } catch (IOException var6) {
         FeatherSourceFile311.Sb.log(Level.WARN, "IO Exception trying to read screenshot! - \n" + var6.getMessage());
      }

   }

   private float dX() {
      long var1 = System.currentTimeMillis() - this.Jk;
      long var3 = (long)Math.ceil(1000.0 * ((FeatherSourceFile$lh99)FeatherSourceFile659.lh(this.Jq)).IY) + (long)Math.ceil(1000.0 * ((FeatherSourceFile$lh99)FeatherSourceFile659.nc(this.Jq)).qF);
      long var5 = var3 + (long)Math.ceil(1000.0 * ((FeatherSourceFile$lh99)FeatherSourceFile659.xj(this.Jq)).qF);
      if (var1 > var5) {
         this.Jp = false;
      }

      return var1 > var3 ? 1.0F - Math.min((float)(var1 - var3) / (1000.0F * (float)((FeatherSourceFile$lh99)FeatherSourceFile659.oe(this.Jq)).qF), 1.0F) : Math.min((float)var1 / (1000.0F * (float)((FeatherSourceFile$lh99)FeatherSourceFile659.qy(this.Jq)).qF), 1.0F);
   }

   public void render() {
      if (this.Jp) {
         if (this.Jo) {
            FeatherSourceFile843.oe(FeatherSourceFile659.dW());
            this.Jo = false;
         }

         int var1 = (new ScaledResolution(Minecraft.func_71410_x())).func_78326_a();
         int var2 = (new ScaledResolution(Minecraft.func_71410_x())).func_78328_b();
         FeatherSourceFile843.lh(0, FeatherSourceFile659.dW());
         float var3 = 0.25F * (float)((FeatherSourceFile$lh99)FeatherSourceFile659.ou(this.Jq)).gJ * (1.0F / this.Jn);
         float var4 = 0.25F * (float)((FeatherSourceFile$lh99)FeatherSourceFile659.pq(this.Jq)).gJ * (1.0F / this.Jn);
         int var5 = (int)Math.ceil((double)(var3 * (float)this.Jm));
         int var6 = (int)Math.ceil((double)(var4 * (float)this.Jl));
         float var7 = this.dX();
         if (((FeatherSourceFile$lh99)FeatherSourceFile659.as(this.Jq)).IZ) {
            var1 = -var5;
         }

         if (((FeatherSourceFile$lh99)FeatherSourceFile659.km(this.Jq)).Ja) {
            var2 = -var6;
         }

         byte var8 = 1;
         byte var9 = 1;
         if (((FeatherSourceFile$lh99)FeatherSourceFile659.mq(this.Jq)).IZ) {
            var8 = -1;
         }

         if (((FeatherSourceFile$lh99)FeatherSourceFile659.mr(this.Jq)).Ja) {
            var9 = -1;
         }

         GlStateManager.func_179094_E();
         GlStateManager.func_179109_b((float)var1 - (float)(var5 + 4) * var7 * (float)var8 + (float)((FeatherSourceFile$lh99)FeatherSourceFile659.ux(this.Jq)).xOffset, (float)(var2 - (var6 + 24) * var9 + ((FeatherSourceFile$lh99)FeatherSourceFile659.si(this.Jq)).yOffset), 400.0F);
         GlStateManager.func_179152_a(var3, var4, 1.0F);
         FeatherSourceFile841.vK().lh(0, 0, 0.0F, 0.0F, this.Jm, this.Jl, this.Jm, this.Jl, (float)this.Jm, (float)this.Jl);
         FeatherSourceFile841.vK().nc(0, 0, this.Jm, this.Jl, ((FeatherSourceFile$lh99)FeatherSourceFile659.wz(this.Jq)).Jb.lm(), 1.0F);
         GlStateManager.func_179121_F();
      }

   }
}
