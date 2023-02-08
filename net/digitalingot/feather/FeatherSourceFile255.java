package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile255 implements FeatherSourceFile594 {
   private final Provider jM;
   private final FeatherSourceFile665 hb;

   @Inject
   FeatherSourceFile255(Provider var1, FeatherSourceFile665 var2) {
      this.jM = var1;
      this.hb = var2;
   }

   public void lh(FeatherSourceFile672 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile243 var4 = var1.bb();
      FeatherSourceFile495 var5 = this.hb.xj(var4);
      ((FeatherSourceFile596)this.jM.get()).lh(var5, var1.cq());
      ((FeatherSourceFile596)this.jM.get()).mq(var5);
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_SIDEBAR_SETTINGS;
   }
}
