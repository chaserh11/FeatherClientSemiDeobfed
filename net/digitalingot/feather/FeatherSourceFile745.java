package net.digitalingot.feather;

import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile745 implements FeatherSourceFile730 {
   private final FeatherSourceFile350 GC;
   private final FeatherSourceFile295 GD;

   @Inject
   FeatherSourceFile745(FeatherSourceFile350 var1, FeatherSourceFile295 var2) {
      this.GC = var1;
      this.GD = var2;
   }

   public void dA() {
      this.GC.tk();
   }

   public @NotNull void ux(@NotNull @NotNull List var1) {
      this.GD.si(var1);
   }
}
