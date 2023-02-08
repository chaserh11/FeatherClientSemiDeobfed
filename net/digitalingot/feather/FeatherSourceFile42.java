package net.digitalingot.feather;

import java.nio.file.Files;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile42 implements FeatherSourceFile594 {
   private final FeatherSourceFile144 qr;

   @Inject
   FeatherSourceFile42(FeatherSourceFile144 var1) {
      this.qr = var1;
   }

   public void lh(FeatherSourceFile631 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile82 var4 = this.qr.ko();
      FeatherSourceFile11 var5 = new FeatherSourceFile11(var4, var1.vc());
      FeatherSourceFile11 var6 = new FeatherSourceFile11(var4, var1.da());
      if (var6.gh().exists()) {
         throw new IllegalArgumentException("Profile already exists");
      } else {
         Files.copy(var5.gh().toPath(), var6.gh().toPath());
         var2.accept(new FeatherSourceFile12("success"));
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CLONE_MOD_PROFILE;
   }
}
