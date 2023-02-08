package net.digitalingot.feather;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import net.minecraft.client.Minecraft;

public class FeatherSourceFile466 {
   private static Rectangle sS;
   private static boolean sT;

   private static Rectangle eg(int var0, int var1) {
      GraphicsEnvironment var2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[] var3 = var2.getScreenDevices();
      GraphicsDevice[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         GraphicsDevice var7 = var4[var6];
         GraphicsConfiguration var8 = var7.getDefaultConfiguration();
         Rectangle var9 = var8.getBounds();
         if (var9.contains(var0, var1)) {
            return var9;
         }
      }

      return new Rectangle(0, 0, FeatherSourceFile704.lt(), FeatherSourceFile704.hb());
   }

   private static Rectangle nb(int var0) {
      if (var0 < 1) {
         return null;
      } else {
         GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice[] var2 = var1.getScreenDevices();
         return var2 != null && var2.length != 0 && var2.length >= var0 ? var2[var0 - 1].getDefaultConfiguration().getBounds() : null;
      }
   }

   private static Rectangle lh(Rectangle var0) {
      Point var1 = new Point((int)(var0.getMinX() + var0.getWidth() / 2.0), (int)(var0.getMinY() + var0.getHeight() / 2.0));
      return eg((int)var1.getX(), (int)var1.getY());
   }

   public static void et(boolean var0) {
      if (FeatherSourceFile704.ug()) {
         sT = true;
      }

      if (sT != var0 || FeatherSourceFile704.ug() || FeatherSourceFile704.hv() != var0) {
         Rectangle var1 = new Rectangle(FeatherSourceFile704.ep(), FeatherSourceFile704.qr(), FeatherSourceFile704.eg(), FeatherSourceFile704.oy());
         if (var0 && !FeatherSourceFile704.ug()) {
            sS = var1;
         }

         Minecraft var2 = Minecraft.func_71410_x();
         boolean var3 = FeatherSourceFile845.iA();
         if (var3) {
            FeatherSourceFile845.fh(false);
         }

         FeatherSourceFile704.lh(var0);
         Rectangle var4 = lh(var1);
         Rectangle var5 = var0 ? var4 : sS;
         if (var5 == null) {
            var5 = var4;
         }

         sT = var0;
         FeatherSourceFile93 var6 = FeatherSourceFile93.ly();
         if (var6.hg().xe() != sT) {
            var6.hg().pq(sT);
            var6.rp();
         }

         FeatherSourceFile704.lh(false, var5.x, var5.y, (int)var5.getWidth(), (int)var5.getHeight(), var6.et().xe());
         FeatherSourceFile704.nc(!var0);
         if (!var0) {
            FeatherSourceFile704.nc(false);
            FeatherSourceFile704.nc(true);
            Dimension var7 = Toolkit.getDefaultToolkit().getScreenSize();
            int var8 = (int)((var7.getWidth() - (double)FeatherSourceFile704.eg()) / 2.0);
            int var9 = (int)((var7.getHeight() - (double)FeatherSourceFile704.oy()) / 2.0);
            FeatherSourceFile704.lh(var8, var9);
         }

         var2.field_71443_c = (int)var5.getWidth();
         var2.field_71440_d = (int)var5.getHeight();
         if (var2.field_71462_r != null) {
            var2.func_71370_a((int)var5.getWidth(), (int)var5.getHeight());
         } else {
            ((net.digitalingot.feather.mixin.client.FeatherSourceFile109)var2).invokeUpdateFramebufferSize();
         }

         var2.func_175601_h();
         FeatherSourceFile845.tx(FeatherSourceFile704.ep() + FeatherSourceFile704.eg() >> 1, FeatherSourceFile704.qr() + FeatherSourceFile704.oy() >> 1);
         if (var3) {
            FeatherSourceFile845.fh(true);
         }

         FeatherSourceFile704.nc(false);
         FeatherSourceFile704.nc(true);
      }
   }
}
