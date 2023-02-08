package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile715 {
   private final Provider gw;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile715(Provider var1, FeatherSourceFile253 var2) {
      this.gw = var1;
      this.nc = var2;
   }

   public void tk() {
      FeatherSourceFile700 var1 = ((FeatherSourceFile486)this.gw.get()).b();
      FeatherSourceFile302 var2 = var1.wj();
      this.nc.nc(new FeatherSourceFile156(var2.wb, var2.ls, var2.jv, var1.ru(), var1.rn()));
   }
}
