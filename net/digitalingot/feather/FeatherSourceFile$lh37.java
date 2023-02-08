package net.digitalingot.feather;

public class FeatherSourceFile$lh37 implements Comparable {
   private final boolean mp;
   private final int cw;
   private final boolean gv;
   private final FeatherSourceFile413 xd;
   private final int yu;

   public FeatherSourceFile$lh37(FeatherSourceFile413 var1, int var2, boolean var3) {
      this.xd = var1;
      this.yu = var2;
      this.mp = var3;
      if (var3) {
         this.cw = Math.abs(var2 - (int)Math.round(var1.rq() + var1.jf() / 2.0));
         this.gv = false;
      } else {
         int var4 = Math.abs(var2 - (int)var1.rq());
         int var5 = Math.abs(var2 - (int)(var1.rq() + var1.jf()));
         this.gv = var5 < var4;
         this.cw = this.gv ? var5 : var4;
      }
   }

   public int lh(FeatherSourceFile$lh37 var1) {
      return Integer.compare(this.cw, var1.cw);
   }

   public double jg() {
      return this.mp ? (double)this.yu : (double)this.yu * 1.0 + (double)(this.gv ? -1 : 1) * this.xd.jf() / 2.0;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.lh((FeatherSourceFile$lh37)var1);
   }

   // $FF: synthetic method
   static int nc(FeatherSourceFile$lh37 var0) {
      return var0.yu;
   }

   // $FF: synthetic method
   static int xj(FeatherSourceFile$lh37 var0) {
      return var0.cw;
   }
}
