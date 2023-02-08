package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile103 implements FeatherSourceFile594 {
   private final FeatherSourceFile850 jN;
   private final FeatherSourceFile207 hf;
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile103(FeatherSourceFile850 var1, FeatherSourceFile207 var2, FeatherSourceFile144 var3) {
      this.jN = var1;
      this.hf = var2;
      this.qr = var3;
   }

   public void lh(FeatherSourceFile332 var1, Consumer var2, Consumer var3) {
      String var4 = this.jN.me(var1.getCode());
      if (var4 != null) {
         FeatherSourceFile82 var5 = this.qr.ko();
         FeatherSourceFile11 var6 = new FeatherSourceFile11(var5, var1.vc());
         FeatherSourceFile815.ux(var6.gh()).wU().qp(var4);
         this.hf.zb();
         var2.accept(new FeatherSourceFile12("success"));
      } else {
         var3.accept(new FeatherSourceFile4("error"));
      }

   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DOWNLOAD_MOD_PROFILE;
   }
}
