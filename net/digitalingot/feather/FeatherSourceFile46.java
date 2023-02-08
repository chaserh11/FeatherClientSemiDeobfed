package net.digitalingot.feather;

import java.util.Iterator;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile46 implements FeatherSourceFile594 {
   private final Provider jM;
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile207 hf;

   @Inject
   FeatherSourceFile46(Provider var1, FeatherSourceFile665 var2, FeatherSourceFile207 var3) {
      this.jM = var1;
      this.hb = var2;
      this.hf = var3;
   }

   public void lh(FeatherSourceFile610 var1, Consumer var2, Consumer var3) {
      Iterator var4 = var1.jk().iterator();

      while(var4.hasNext()) {
         FeatherSourceFile243 var5 = (FeatherSourceFile243)var4.next();
         FeatherSourceFile495 var6 = this.hb.xj(var5);
         FeatherSourceFile414 var7 = var6.li().kl();
         if (!var7.ds().jc().isEmpty()) {
            ((FeatherSourceFile596)this.jM.get()).pq(var6);
         }
      }

      this.hf.rj();
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_SIDEBAR_SETTINGS;
   }
}
