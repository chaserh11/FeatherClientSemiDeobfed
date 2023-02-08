package net.digitalingot.feather;

public class FeatherSourceFile387 {
   private float width;
   private final float height;
   private final int SP;

   public FeatherSourceFile387(float var1, float var2, int var3) {
      this.width = var1;
      this.height = var2;
      this.SP = var3;
   }

   public float yL() {
      return this.width;
   }

   public void ps(float var1) {
      this.width = var1;
   }

   public float yM() {
      return this.height;
   }

   public int yN() {
      return this.SP;
   }

   public static int lh(String var0, float var1, float var2, float var3, float var4, boolean var5) {
      int var6 = 1;
      var6 = 31 * var6 + (var0 == null ? 0 : var0.hashCode());
      var6 = 31 * var6 + Float.floatToIntBits(var1);
      var6 = 31 * var6 + Float.floatToIntBits(var2);
      var6 = 31 * var6 + Float.floatToIntBits(var3);
      var6 = 31 * var6 + Float.floatToIntBits(var4);
      var6 = 31 * var6 + (var5 ? 1231 : 1237);
      return var6;
   }
}
