package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile166 implements FeatherSourceFile594 {
   private final FeatherSourceFile776 wz;

   @Inject
   FeatherSourceFile166(FeatherSourceFile776 var1) {
      this.wz = var1;
   }

   public void lh(FeatherSourceFile109 var1, Consumer var2, Consumer var3) {
      this.wz.lh((FeatherSourceFile19)null);
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.REMOVE_RENDER_MOD;
   }
}
