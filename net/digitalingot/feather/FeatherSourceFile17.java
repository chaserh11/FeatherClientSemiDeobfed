package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile17 implements FeatherSourceFile594 {
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile17(FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   public void lh(FeatherSourceFile471 var1, Consumer var2, Consumer var3) {
      if (this.qr.ko().fh(var1.da())) {
         var3.accept(new FeatherSourceFile4("Invalid character in profile name"));
      } else {
         FeatherSourceFile82 var4 = this.qr.ko();
         FeatherSourceFile11 var5 = new FeatherSourceFile11(var4, var1.vc());
         FeatherSourceFile11 var6 = new FeatherSourceFile11(var4, var1.da());
         var5.gh().renameTo(var6.gh());
         if (var4.xa().getName().equals(var1.vc())) {
            var4.xy(var1.da());
         }

         var2.accept(new FeatherSourceFile12("success"));
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RENAME_MOD_PROFILE;
   }
}
