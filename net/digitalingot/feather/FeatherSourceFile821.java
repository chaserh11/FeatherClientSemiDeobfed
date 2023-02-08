package net.digitalingot.feather;

public class FeatherSourceFile821 {
   public static int oe(float var0, float var1, float var2, float var3) {
      return as((int)((double)(var0 * 255.0F) + 0.5), (int)((double)(var1 * 255.0F) + 0.5), (int)((double)(var2 * 255.0F) + 0.5), (int)((double)(var3 * 255.0F) + 0.5));
   }

   public static int as(int var0, int var1, int var2, int var3) {
      return (var3 & 255) << 24 | (var0 & 255) << 16 | (var1 & 255) << 8 | var2 & 255;
   }
}
