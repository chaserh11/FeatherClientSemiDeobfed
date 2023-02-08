package net.digitalingot.feather;

import java.awt.Color;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile341 {
   public static final char RP = '§';
   private static final Pattern RQ = Pattern.compile("(?i)§[0-9A-FK-OR]");

   private FeatherSourceFile341() {
   }

   public static int hb(int var0, int var1, int var2) {
      return mq(var0, var1, var2, 255);
   }

   public static int mq(int var0, int var1, int var2, int var3) {
      return (var3 & 255) << 24 | (var0 & 255) << 16 | (var1 & 255) << 8 | var2 & 255;
   }

   public static int km(float var0, float var1, float var2) {
      return ou(var0, var1, var2, 1.0F);
   }

   public static int ou(float var0, float var1, float var2, float var3) {
      return mq((int)((double)(var0 * 255.0F) + 0.5), (int)((double)(var1 * 255.0F) + 0.5), (int)((double)(var2 * 255.0F) + 0.5), (int)((double)(var3 * 255.0F) + 0.5));
   }

   public static @NotNull @NotNull FeatherSourceFile225 lh(@NotNull @NotNull FeatherSourceFile225 var0, @NotNull @NotNull FeatherSourceFile225 var1, float var2) {
      var2 = FeatherSourceFile363.zd(var2);
      if (var0.on() && var1.on()) {
         return new FeatherSourceFile225(true, var0.dm());
      } else {
         Color var3 = var0.on() ? new Color(FeatherSourceFile841.vK().vM(), true) : var0.dm();
         Color var4 = var1.on() ? new Color(FeatherSourceFile841.vK().vM(), true) : var1.dm();
         return new FeatherSourceFile225(false, lh(var3, var4, var2));
      }
   }

   public static @NotNull @NotNull Color lh(@NotNull @NotNull Color var0, @NotNull @NotNull Color var1, float var2) {
      var2 = FeatherSourceFile363.zd(var2);
      return new Color((int)((float)var0.getRed() + (float)(var1.getRed() - var0.getRed()) * var2), (int)((float)var0.getGreen() + (float)(var1.getGreen() - var0.getGreen()) * var2), (int)((float)var0.getBlue() + (float)(var1.getBlue() - var0.getBlue()) * var2), (int)((float)var0.getAlpha() + (float)(var1.getAlpha() - var0.getAlpha()) * var2));
   }

   public static String px(String var0) {
      return var0 == null ? null : RQ.matcher(var0).replaceAll("");
   }
}
