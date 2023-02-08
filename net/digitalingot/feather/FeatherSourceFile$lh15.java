package net.digitalingot.feather;

import java.awt.Color;

public class FeatherSourceFile$lh15 extends FeatherSourceFile624 {
   // $FF: synthetic field
   final FeatherSourceFile233 DF;

   public FeatherSourceFile$lh15(FeatherSourceFile233 var1) {
      this.DF = var1;
   }

   public Object ov() {
      return this.DF.bL() + " ms";
   }

   public String uh() {
      return this.bp().hN == FeatherSourceFile95.BRACKETS ? "[888 ms]" : "888 ms";
   }

   public boolean vf() {
      return this.DF.bL() > 0;
   }

   public boolean mu() {
      return false;
   }

   protected void oe(FeatherSourceFile683 var1) {
      this.gD.lh(this.s, this.gW, this.gX, this.bM(), this.bp().hR, this.bp().hQ.on());
   }

   private int bM() {
      return ((FeatherSourceFile$nc4)FeatherSourceFile233.lh(this.DF)).DI ? this.xe(this.DF.bL()) : this.bp().hQ.lm();
   }

   public int xe(int var1) {
      return Color.getHSBColor(Math.max((125.0F - (float)var1 * 10.0F / (float)((FeatherSourceFile$nc4)FeatherSourceFile233.nc(this.DF)).DG) / 360.0F, 0.0F), 1.0F, 1.0F).getRGB();
   }

   public FeatherSourceFile374 bp() {
      return ((FeatherSourceFile$nc4)FeatherSourceFile233.xj(this.DF)).zW;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}
