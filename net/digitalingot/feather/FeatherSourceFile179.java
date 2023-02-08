package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile179 implements FeatherSourceFile594 {
   private final Provider jM;
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile179(Provider var1, FeatherSourceFile144 var2) {
      this.jM = var1;
      this.qr = var2;
   }

   public void lh(FeatherSourceFile661 var1, Consumer var2, Consumer var3) {
      this.qr.ko().xy(var1.vc());
      ((FeatherSourceFile596)this.jM.get()).sw();
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SELECT_MOD_PROFILE;
   }
}
