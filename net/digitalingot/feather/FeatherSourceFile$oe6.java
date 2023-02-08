package net.digitalingot.feather;

class FeatherSourceFile$oe6 {
   protected final int kj;
   protected final int yu;
   protected final int zb;
   protected final int pp;

   public FeatherSourceFile$oe6(int var1, int var2, int var3, int var4) {
      this.kj = var1;
      this.yu = var2;
      this.zb = var3;
      this.pp = var4;
   }

   public int wa() {
      return this.kj + this.zb;
   }

   public int my() {
      return this.yu + this.pp;
   }

   public boolean ux(int var1, int var2) {
      int var3 = this.zb;
      int var4 = this.pp;
      if ((var3 | var4) < 0) {
         return false;
      } else {
         int var5 = this.kj;
         int var6 = this.yu;
         if (var1 >= var5 && var2 >= var6) {
            var3 += var5;
            var4 += var6;
            return (var3 < var5 || var3 > var1) && (var4 < var6 || var4 > var2);
         } else {
            return false;
         }
      }
   }
}
