package net.digitalingot.feather;

public final class FeatherSourceFile363 {
   private FeatherSourceFile363() {
      throw new AssertionError();
   }

   public static int ep(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static float mq(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double as(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static float zd(float var0) {
      return mq(var0, 0.0F, 1.0F);
   }

   public static float mr(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static double km(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static float ux(float var0, float var1, float var2) {
      return (var1 - var0 * var2) / (1.0F - var0);
   }

   public static float[] lh(float[] var0, float var1) {
      float var2 = (var0[0] + var0[2]) / 2.0F;
      float var3 = (var0[1] + var0[3]) / 2.0F;
      var0[0] = ux(var1, var0[0], var2);
      var0[2] = ux(var1, var0[2], var2);
      var0[1] = ux(var1, var0[1], var3);
      var0[3] = ux(var1, var0[3], var3);
      return var0;
   }

   public static boolean mq(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) < var4;
   }
}
