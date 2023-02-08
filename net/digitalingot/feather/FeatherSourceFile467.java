package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile467 implements FeatherSourceFile594 {
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile467(FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   public void lh(FeatherSourceFile758 var1, Consumer var2, Consumer var3) {
      if (this.qr.ko().fh(var1.vc())) {
         var3.accept(new FeatherSourceFile4("Invalid character in profile name"));
      } else {
         this.qr.ko().xy(var1.vc());
         var2.accept(new FeatherSourceFile12("success"));
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_MOD_PROFILE;
   }
}
