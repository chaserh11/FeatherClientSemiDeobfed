package net.digitalingot.feather;

import net.minecraft.util.MathHelper;

public final class FeatherSourceFile846 {
   public static double Nf = Math.PI;

   private FeatherSourceFile846() {
      throw new AssertionError();
   }

   public static float oh(float var0) {
      int var1 = Float.floatToIntBits(var0);
      var1 = 1419967116 - var1 / 3;
      float var2 = Float.intBitsToFloat(var1);
      var2 = 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
      var2 = 0.6666667F * var2 + 1.0F / (3.0F * var2 * var2 * var0);
      return var2;
   }

   public static float hg(float var0) {
      return MathHelper.func_76126_a(var0);
   }

   public static double km(double var0) {
      return (double)MathHelper.func_76126_a((float)var0);
   }

   public static float et(float var0) {
      return MathHelper.func_76134_b(var0);
   }

   public static double mq(double var0) {
      return (double)MathHelper.func_76134_b((float)var0);
   }
}
