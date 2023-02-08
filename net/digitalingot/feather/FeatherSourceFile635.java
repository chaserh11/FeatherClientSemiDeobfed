package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
class FeatherSourceFile635 {
   private final Provider py;
   private final TreeSet dp = new TreeSet();
   private final TreeSet ed = new TreeSet();
   private FeatherSourceFile$lh37 tf;
   private FeatherSourceFile$nc13 na;
   private FeatherSourceFile$lh37 wu;
   private FeatherSourceFile$nc13 cs;
   private final FeatherSourceFile445 gi = new FeatherSourceFile445();
   private final FeatherSourceFile445 ey = new FeatherSourceFile445();

   @Inject
   FeatherSourceFile635(Provider var1) {
      this.py = var1;
   }

   public void oe(FeatherSourceFile413 var1) {
      if (this.na != null || this.tf != null) {
         double var2 = this.na == null ? var1.zm() + var1.nt() / 2.0 : this.na.pl();
         double var4 = this.tf == null ? var1.rq() + var1.jf() / 2.0 : this.tf.jg();
         var1.hk().nc(var1, var2, var4);
      }
   }

   public void rh() {
      FeatherSourceFile$lh133 var1 = (FeatherSourceFile$lh133)((FeatherSourceFile486)this.py.get()).pr();
      int var2;
      int var3;
      int var4;
      if (this.tf != null) {
         if (this.wu == null || Math.abs(FeatherSourceFile$lh37.nc(this.tf) - FeatherSourceFile$lh37.nc(this.wu)) > var1.uA) {
            this.wu = this.tf;
            this.gi.lh(System.currentTimeMillis(), 250L, 0, (var0) -> {
               return var0;
            }, 1.0F);
         }

         var2 = var1.tZ;
         var3 = var1.tY.getRGB();
         var4 = (int)(this.gi.er(0.0F) * (float)var1.tY.getAlpha());
         var3 = 16777215 & var3 | var4 << 24;
         FeatherSourceFile841.vK().xj(0, FeatherSourceFile$lh37.nc(this.tf) - (var2 + 1) / 2, (int)((double)FeatherSourceFile851.iJ() / FeatherSourceFile851.iN() + 1.0), FeatherSourceFile$lh37.nc(this.tf) + var2 / 2, var3);
      } else {
         this.wu = null;
      }

      if (this.na != null) {
         if (this.cs == null || Math.abs(FeatherSourceFile$nc13.nc(this.na) - FeatherSourceFile$nc13.nc(this.cs)) > var1.uA) {
            this.cs = this.na;
            this.ey.lh(System.currentTimeMillis(), 250L, 0, (var0) -> {
               return var0;
            }, 1.0F);
         }

         var2 = var1.tZ;
         var3 = var1.tY.getRGB();
         var4 = (int)(this.ey.er(0.0F) * (float)var1.tY.getAlpha());
         var3 = 16777215 & var3 | var4 << 24;
         FeatherSourceFile841.vK().xj(FeatherSourceFile$nc13.nc(this.na) - (var2 + 1) / 2, 0, FeatherSourceFile$nc13.nc(this.na) + var2 / 2, (int)((double)FeatherSourceFile851.iK() / FeatherSourceFile851.iN() + 1.0), var3);
      } else {
         this.cs = null;
      }

   }

   public int[] qe() {
      int var1 = (int)((double)FeatherSourceFile851.iK() / FeatherSourceFile851.iN());
      return new int[]{1, var1 / 2, var1};
   }

   public int[] yd() {
      int var1 = (int)((double)FeatherSourceFile851.iJ() / FeatherSourceFile851.iN());
      return new int[]{1, var1 / 2, var1};
   }

   public void lh(FeatherSourceFile413 var1, List var2) {
      this.dp.clear();
      this.ed.clear();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile413 var4 = (FeatherSourceFile413)var3.next();
         if (var4 != var1) {
            this.dp.add(new FeatherSourceFile$lh37(var1, (int)var4.rq(), false));
            this.dp.add(new FeatherSourceFile$lh37(var1, (int)(var4.rq() + var4.jf() / 2.0), true));
            this.dp.add(new FeatherSourceFile$lh37(var1, (int)(var4.rq() + var4.jf()), false));
            this.ed.add(new FeatherSourceFile$nc13(var1, (int)var4.zm(), false));
            this.ed.add(new FeatherSourceFile$nc13(var1, (int)(var4.zm() + var4.nt() / 2.0), true));
            this.ed.add(new FeatherSourceFile$nc13(var1, (int)(var4.zm() + var4.nt()), false));
         }
      }

      int[] var6 = this.yd();
      this.ed.add(new FeatherSourceFile$nc13(var1, var6[0], false));
      this.ed.add(new FeatherSourceFile$nc13(var1, var6[1], true));
      this.ed.add(new FeatherSourceFile$nc13(var1, var6[2], false));
      int[] var7 = this.qe();
      this.dp.add(new FeatherSourceFile$lh37(var1, var7[0], false));
      this.dp.add(new FeatherSourceFile$lh37(var1, var7[1], true));
      this.dp.add(new FeatherSourceFile$lh37(var1, var7[2], false));
      int var5 = ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.py.get()).pr()).uA;
      this.tf = (FeatherSourceFile$lh37)this.dp.iterator().next();
      if (this.tf != null && FeatherSourceFile$lh37.xj(this.tf) > var5) {
         this.tf = null;
      }

      this.na = (FeatherSourceFile$nc13)this.ed.iterator().next();
      if (this.na != null && FeatherSourceFile$nc13.xj(this.na) > var5) {
         this.na = null;
      }

   }

   public void ir() {
      this.dp.clear();
      this.ed.clear();
      this.tf = null;
      this.na = null;
   }
}
