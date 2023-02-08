package net.digitalingot.feather;

public class FeatherSourceFile$nc13 implements Comparable {
   private final boolean mp;
   private final int cw;
   private final FeatherSourceFile413 xd;
   private final boolean gv;
   private final int kj;

   public FeatherSourceFile$nc13(FeatherSourceFile413 var1, int var2, boolean var3) {
      this.xd = var1;
      this.kj = var2;
      this.mp = var3;
      if (var3) {
         this.cw = Math.abs(var2 - (int)Math.round(var1.zm() + var1.nt() / 2.0));
         this.gv = false;
      } else {
         int var4 = Math.abs(var2 - (int)var1.zm());
         int var5 = Math.abs(var2 - (int)(var1.zm() + var1.nt()));
         this.gv = var5 < var4;
         this.cw = this.gv ? var5 : var4;
      }
   }

   public int lh(FeatherSourceFile$nc13 var1) {
      return Integer.compare(this.cw, var1.cw);
   }

   public double pl() {
      return this.mp ? (double)this.kj : (double)this.kj * 1.0 + (double)(this.gv ? -1 : 1) * this.xd.nt() / 2.0;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.lh((FeatherSourceFile$nc13)var1);
   }

   // $FF: synthetic method
   static int nc(FeatherSourceFile$nc13 var0) {
      return var0.kj;
   }

   // $FF: synthetic method
   static int xj(FeatherSourceFile$nc13 var0) {
      return var0.cw;
   }
}
