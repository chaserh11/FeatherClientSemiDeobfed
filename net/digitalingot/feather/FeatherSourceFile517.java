package net.digitalingot.feather;

class FeatherSourceFile517 {
   private static final long en = 500L;
   private static final int yo = 2;
   private int ah;
   private int lj;
   private int ap;
   private long ma;
   private int aw;

   private boolean lh(int var1, int var2, long var3) {
      return Math.abs(this.ah - var1) > 2 || Math.abs(this.lj - var2) > 2 || var3 - this.ma > 500L;
   }

   void lh(int var1, int var2, int var3) {
      long var4 = FeatherSourceFile844.iG();
      if (!this.lh(var1, var2, var4) && var3 == this.aw) {
         ++this.ap;
      } else {
         this.ap = 1;
         this.ah = var1;
         this.lj = var2;
      }

      this.ma = var4;
      this.aw = var3;
   }

   void xj(int var1, int var2) {
      if (this.lh(var1, var2, FeatherSourceFile844.iG())) {
         this.ap = 1;
         this.ah = 0;
         this.lj = 0;
         this.ma = 0L;
      }

   }

   int sf() {
      return this.ap;
   }
}
