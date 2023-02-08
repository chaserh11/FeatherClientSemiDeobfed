package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile705 implements FeatherSourceFile594 {
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile705(FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   public void lh(FeatherSourceFile738 var1, Consumer var2, Consumer var3) {
      this.qr.ko().ck(var1.vc());
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_MOD_PROFILE;
   }
}
