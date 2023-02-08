package net.digitalingot.feather;

public class FeatherSourceFile$lh136 extends FeatherSourceFile713 {
   protected float o;
   protected float p;
   protected FeatherSourceFile528 q;
   // $FF: synthetic field
   final FeatherSourceFile511 r;

   public FeatherSourceFile$lh136(FeatherSourceFile511 var1, int var2, int var3) {
      super((FeatherSourceFile475)null, var2, var3);
      this.r = var1;
      FeatherSourceFile528 var4 = new FeatherSourceFile528(FeatherSourceFile841.PH, 110, 104, 54, 54, 56, 50);
      var4.ug(true);
      var4.setColor(0.6F, 0.6F, 0.6F, 1.0F);
      var4.lh(1, 1, 1, 1);
      this.v = var4;
      this.q = new FeatherSourceFile528(var4);
      this.q.ug(true);
      this.q.setColor(0.8F, 0.8F, 0.8F, 1.0F);
   }

   protected void lh(int var1, int var2, float var3) {
      this.o = FeatherSourceFile363.zd(var3 / (float)var2);
      this.p = FeatherSourceFile363.zd((float)var1 / (float)var2);
   }

   protected boolean tj() {
      return this.t.L;
   }

   protected void si(float var1) {
      super.si(var1);
      this.q.lh(this.z, this.A + (int)((float)this.zn() * this.o), this.aw(), (int)((float)this.zn() * this.p), var1);
   }
}
