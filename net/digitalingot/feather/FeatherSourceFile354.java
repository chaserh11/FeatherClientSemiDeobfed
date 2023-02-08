package net.digitalingot.feather;

import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
class FeatherSourceFile354 {
   private final FeatherSourceFile144 qr;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile354(FeatherSourceFile144 var1, FeatherSourceFile253 var2) {
      this.qr = var1;
      this.nc = var2;
   }

   public void tk() {
      FeatherSourceFile82 var1 = this.qr.ko();
      String var2 = var1.xa().getName();
      List var3 = var1.mz();
      FeatherSourceFile601 var4 = new FeatherSourceFile601(var2, var3);
      this.nc.nc(var4);
   }
}
