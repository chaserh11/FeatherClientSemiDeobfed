package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile314 implements FeatherSourceFile594 {
   private final FeatherSourceFile778 jz;

   @Inject
   FeatherSourceFile314(FeatherSourceFile778 var1) {
      this.jz = var1;
   }

   public void lh(FeatherSourceFile79 var1, Consumer var2, Consumer var3) {
      this.jz.lh(var1);
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PLAYER_STATUS_UPDATE;
   }
}
