package net.digitalingot.feather;

public class FeatherSourceFile$nc6 extends FeatherSourceFile211 {
   private boolean Gv;
   private final int yS;
   private final int Gw;
   private final int Gx;
   private final int Gy;
   private final int Gz;
   // $FF: synthetic field
   final FeatherSourceFile39 FO;

   public FeatherSourceFile$nc6(FeatherSourceFile39 var1) {
      this.FO = var1;
      this.Gv = false;
      this.yS = 8;
      this.Gw = 180;
      this.Gx = 20;
      this.Gy = 320;
      this.Gz = 40;
   }

   public void lh(FeatherSourceFile683 var1) {
      if (var1 == FeatherSourceFile683.MOD_LAYOUT) {
         ((FeatherSourceFile$lh14)FeatherSourceFile39.lh(this.FO)).FQ = (int)Math.round(this.zm());
         ((FeatherSourceFile$lh14)FeatherSourceFile39.nc(this.FO)).FR = (int)Math.round((double)(FeatherSourceFile851.iM() - 40) - this.rq() - this.jf());
         if (!this.Gv) {
            super.cg((int)(160.0 * FeatherSourceFile93.ly().ja().td() + 20.0));
            super.xi((int)(280.0 * FeatherSourceFile93.ly().ai().td()) + 40 + 8);
            this.Gv = true;
            return;
         }

         double var2 = ((double)this.fv() * this.hk().gJ - 20.0) / 160.0;
         double var4 = ((double)this.rl() * this.hk().gJ - 40.0 - 8.0) / 280.0;
         FeatherSourceFile93.ly().ja().ou(Math.max(Math.min(var2, 1.0), 0.0));
         FeatherSourceFile93.ly().ai().ou(Math.max(Math.min(var4, 1.0), 0.0));
      }

   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh14)FeatherSourceFile39.xj(this.FO)).yT;
   }

   public int zf() {
      return (int)(48.0 / this.hk().gJ);
   }

   public int ok() {
      return (int)(320.0 / this.hk().gJ);
   }

   public int xk() {
      return (int)(20.0 / this.hk().gJ);
   }

   public int cp() {
      return (int)(180.0 / this.hk().gJ);
   }

   public double vd() {
      double var1 = ((double)this.fv() - 20.0) / 160.0;
      double var3 = ((double)this.rl() - 40.0 - 8.0) / 280.0;
      return var1 >= var3 ? 1.0 / var1 : 1.0 / var3;
   }

   public double mk() {
      return 0.0;
   }
}
