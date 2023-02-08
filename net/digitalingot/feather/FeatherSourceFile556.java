package net.digitalingot.feather;

import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile556 implements FeatherSourceFile540 {
   @NotNull
   private final @NotNull FeatherSourceFile70 JT;

   @Inject
   FeatherSourceFile556(@NotNull @NotNull FeatherSourceFile70 var1) {
      this.JT = var1;
   }

   public void eT() {
   }

   public void lh(UUID var1, byte[] var2, FeatherSourceFile$nc var3) {
      FeatherSourceFile526 var4 = new FeatherSourceFile526(var3, var2);
      this.JT.lh(var1, var4);
   }
}
