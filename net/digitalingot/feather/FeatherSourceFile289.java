package net.digitalingot.feather;

import java.util.HashMap;
import java.util.Iterator;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
class FeatherSourceFile289 {
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile289(FeatherSourceFile665 var1, FeatherSourceFile253 var2) {
      this.hb = var1;
      this.nc = var2;
   }

   public void tk() {
      HashMap var1 = new HashMap();
      Iterator var2 = this.hb.dx().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile495 var3 = (FeatherSourceFile495)var2.next();
         FeatherSourceFile414 var4 = var3.li().kl();
         if (!var4.ds().jc().isEmpty()) {
            FeatherSourceFile97 var5 = new FeatherSourceFile97(var3.pr());
            var1.put(var3.fg(), var5);
         }
      }

      FeatherSourceFile608 var6 = new FeatherSourceFile608(var1);
      this.nc.nc(var6);
   }
}
