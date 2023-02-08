package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;

public class FeatherSourceFile613 implements FeatherSourceFile594 {
   private final FeatherSourceFile850 jN;
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile613(FeatherSourceFile850 var1, FeatherSourceFile144 var2) {
      this.jN = var1;
      this.qr = var2;
   }

   public void lh(FeatherSourceFile795 var1, Consumer var2, Consumer var3) {
      try {
         FeatherSourceFile82 var4 = this.qr.ko();
         FeatherSourceFile11 var5 = new FeatherSourceFile11(var4, var1.vc());
         String var6 = FeatherSourceFile815.ux(var5.gh()).wR();
         String var7 = this.jN.ye(var6);
         if (var7 != null) {
            FeatherSourceFile844.ik(var7);
            var2.accept(new FeatherSourceFile12("success"));
            return;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      var3.accept(new FeatherSourceFile4("Failed to load or upload file"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SHARE_MOD_PROFILE;
   }
}
