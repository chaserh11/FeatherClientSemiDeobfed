package net.digitalingot.feather;

import java.awt.Color;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile$lh71 {
   private int lc;
   private int iy;
   private int uk;

   private FeatherSourceFile$lh71(int var1, int var2, int var3) {
      this.lc = var1;
      this.iy = var2;
      this.uk = var3;
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile$lh71 oe(@NotNull @NotNull Color var0) {
      float[] var1 = new float[3];
      Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
      return new FeatherSourceFile$lh71(Math.round(var1[0] * 100.0F), Math.round(var1[1] * 100.0F), Math.round(var1[2] * 100.0F));
   }

   @NotNull
   public @NotNull Color uy() {
      return Color.getHSBColor((float)this.lc / 100.0F, (float)this.iy / 100.0F, (float)this.uk / 100.0F);
   }

   public FeatherSourceFile$lh71 ux(int var1) {
      int var2 = this.uk >= 50 ? -1 : 1;
      this.uk = Math.min(Math.max(this.uk + var2 * var1, 0), 100);
      return this;
   }

   public int fc() {
      return this.lc;
   }

   public void si(int var1) {
      this.lc = var1;
   }

   public int we() {
      return this.iy;
   }

   public void wz(int var1) {
      this.iy = var1;
   }

   public int vm() {
      return this.uk;
   }

   public void lt(int var1) {
      this.uk = var1;
   }
}
