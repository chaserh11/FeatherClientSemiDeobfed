package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile213 {
   private final FeatherSourceFile253 nc;
   private final Provider gw;

   @Inject
   public FeatherSourceFile213(FeatherSourceFile253 var1, Provider var2) {
      this.nc = var1;
      this.gw = var2;
   }

   public void mv() {
      int var1 = FeatherSourceFile851.iQ();
      int var2 = FeatherSourceFile851.iR();
      int var3 = FeatherSourceFile851.iJ();
      int var4 = Math.min(var1, var3);
      int var5 = FeatherSourceFile851.iJ();
      int var6 = Math.min(var2, var5);
      double var7 = (double)Math.min((float)var4 / 1920.0F, (float)var6 / 1080.0F) * ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.gw.get()).pr()).tU;
      this.nc.nc(new FeatherSourceFile667(var7));
   }
}
