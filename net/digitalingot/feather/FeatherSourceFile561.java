package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class FeatherSourceFile561 {
   private static void km(Color var0) {
      FeatherSourceFile843.wq();
      FeatherSourceFile843.hO();
      FeatherSourceFile843.ou(770, 771, 1, 0);
   }

   public static void lh(float var0, float var1, int var2, Color var3) {
      int var4 = var3.getRed();
      int var5 = var3.getGreen();
      int var6 = var3.getBlue();
      int var7 = var3.getAlpha();
      km(var3);
      FeatherSourceFile443 var8 = FeatherSourceFile443.RM;
      var8.nc(3, DefaultVertexFormats.field_181706_f);

      for(int var9 = 0; var9 <= 360; ++var9) {
         float var10 = (float)((double)var9 * 0.017453292519943295);
         var8.as(var0 + (float)Math.cos((double)var10) * (float)var2, var1 + (float)Math.sin((double)var10) * (float)var2, 0.0F).km(var4, var5, var6, var7).xZ();
      }

      var8.lx();
      FeatherSourceFile843.hP();
      FeatherSourceFile843.jz();
   }

   public static void lh(int var0, int var1, int var2, int var3, Color var4) {
      int var5 = var4.getRed();
      int var6 = var4.getBlue();
      int var7 = var4.getGreen();
      int var8 = var4.getAlpha();
      km(var4);
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(3, DefaultVertexFormats.field_181706_f);
      var9.as((float)var0, (float)var1, 0.0F).km(var5, var7, var6, var8).xZ();
      var9.as((float)var2, (float)var3, 0.0F).km(var5, var7, var6, var8).xZ();
      var9.lx();
      FeatherSourceFile843.hP();
      FeatherSourceFile843.jz();
   }

   public static void nc(int var0, int var1, int var2, int var3, Color var4) {
      int var5;
      if (var0 < var2) {
         var5 = var0;
         var0 = var2;
         var2 = var5;
      }

      if (var1 < var3) {
         var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      var5 = var4.getRed();
      int var6 = var4.getGreen();
      int var7 = var4.getBlue();
      int var8 = var4.getAlpha();
      km(var4);
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(7, DefaultVertexFormats.field_181706_f);
      var9.as((float)var0, (float)var3, 0.0F).km(var5, var6, var7, var8).xZ();
      var9.as((float)var2, (float)var3, 0.0F).km(var5, var6, var7, var8).xZ();
      var9.as((float)var2, (float)var1, 0.0F).km(var5, var6, var7, var8).xZ();
      var9.as((float)var0, (float)var1, 0.0F).km(var5, var6, var7, var8).xZ();
      var9.lx();
      FeatherSourceFile843.hP();
      FeatherSourceFile843.jz();
   }

   public static void lh(int var0, int var1, int var2, Color var3, int var4) {
      nc(var1, var0, var2 + var4, var0 + var4, var3);
   }

   public static void nc(int var0, int var1, int var2, Color var3, int var4) {
      nc(var0, var1, var0 + var4, var2 + var4, var3);
   }

   public static void lh(int var0, int var1, int var2, int var3, Color var4, int var5) {
      lh(var1, var0, var2, var4, var5);
      lh(var3, var0, var2, var4, var5);
      nc(var0, var1, var3, var4, var5);
      nc(var2, var1, var3, var4, var5);
   }

   public static void nc(int var0, int var1, int var2, int var3, int var4, int var5) {
      FeatherSourceFile841.vK().pq(var0, var1, var2, var3, var4, var5);
   }

   public static int vr(String var0) {
      return FeatherSourceFile841.vL().func_78256_a(var0);
   }
}
