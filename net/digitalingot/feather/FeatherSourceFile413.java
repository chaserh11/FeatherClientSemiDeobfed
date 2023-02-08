package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile413 implements FeatherSourceFile685 {
   @NotNull
   protected final @NotNull FeatherSourceFile852 gD = new FeatherSourceFile852(this);
   protected FeatherSourceFile360 gE;
   protected int zb;
   protected int pp;

   public void pu() {
   }

   public double zm() {
      return this.hk().getX(this.nt());
   }

   public double rq() {
      return this.hk().getY(this.jf());
   }

   public int rl() {
      return this.zb;
   }

   public void xi(int var1) {
      this.zb = var1;
   }

   public int fv() {
      return this.pp;
   }

   public void cg(int var1) {
      this.pp = var1;
   }

   public int yi() {
      return this.rl();
   }

   public int zu() {
      return this.fv();
   }

   public int no() {
      return this.yi();
   }

   public int sv() {
      return this.zu();
   }

   public final double nt() {
      return (double)(FeatherSourceFile776.ny().zj() == FeatherSourceFile683.HUD_OVERLAY ? this.rl() : this.yi()) * this.hk().ee();
   }

   public final double jf() {
      return (double)(FeatherSourceFile776.ny().zj() == FeatherSourceFile683.HUD_OVERLAY ? this.fv() : this.zu()) * this.hk().ee();
   }

   public void lh(FeatherSourceFile683 var1) {
   }

   public void sy() {
      this.lh(FeatherSourceFile683.MOD_LAYOUT);
   }

   public boolean ti() {
      return true;
   }

   public abstract FeatherSourceFile89 hk();

   public FeatherSourceFile852 yb() {
      return this.gD;
   }

   public void nc(FeatherSourceFile360 var1) {
      this.gE = var1;
   }

   public FeatherSourceFile360 rf() {
      return this.gE;
   }
}
