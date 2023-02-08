package net.digitalingot.feather;

import java.text.DecimalFormat;

public class FeatherSourceFile$nc46 extends FeatherSourceFile624 {
   private static final String Er = " | ";
   private final DecimalFormat CU;
   // $FF: synthetic field
   final FeatherSourceFile205 GL;

   public FeatherSourceFile$nc46(FeatherSourceFile205 var1) {
      this.GL = var1;
      this.CU = FeatherSourceFile333.gj("#.#");
   }

   public Object ov() {
      return this.CU.format(FeatherSourceFile205.lh(this.GL).dC()) + (((FeatherSourceFile$lh108)FeatherSourceFile205.nc(this.GL)).GI ? " | " + this.CU.format(FeatherSourceFile205.lh(this.GL).dD()) : "") + (((FeatherSourceFile$lh108)FeatherSourceFile205.xj(this.GL)).GJ ? " CPS" : "");
   }

   public boolean mu() {
      return false;
   }

   public void pu() {
      FeatherSourceFile333.lh(this.CU, ((FeatherSourceFile$lh108)FeatherSourceFile205.oe(this.GL)).Ej);
      super.pu();
   }

   public FeatherSourceFile374 bp() {
      return ((FeatherSourceFile$lh108)FeatherSourceFile205.qy(this.GL)).zW;
   }

   // $FF: synthetic method
   public FeatherSourceFile89 hk() {
      return this.bp();
   }
}
