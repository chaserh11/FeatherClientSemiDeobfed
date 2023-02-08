package net.digitalingot.feather;

import java.util.Collection;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile324 implements FeatherSourceFile576 {
   private final FeatherSourceFile562 MQ;
   private final FeatherSourceFile281 MR;

   @Inject
   FeatherSourceFile324(FeatherSourceFile562 var1, FeatherSourceFile281 var2) {
      this.MQ = var1;
      this.MR = var2;
   }

   public @NotNull void nc(boolean var1, @NotNull @NotNull Collection var2) {
      this.MQ.lh(var1, var2);
   }

   public @NotNull void oe(@NotNull @NotNull Collection var1) {
      this.MR.xj(var1);
   }
}
