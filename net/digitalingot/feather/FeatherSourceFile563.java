package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile563 {
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile563(FeatherSourceFile253 var1) {
      this.nc = var1;
   }

   public @NotNull void nc(@NotNull @NotNull Color var1) {
      String var2 = this.xj(var1);
      String var3 = this.xj(FeatherSourceFile$lh71.oe(var1).ux(17).uy());
      String var4 = this.xj(FeatherSourceFile$lh71.oe(var1).ux(57).uy());
      FeatherSourceFile23 var5 = new FeatherSourceFile23(var2, var3, var4);
      this.nc.nc(var5);
   }

   private String xj(Color var1) {
      return String.format("%s,%s,%s", var1.getRed(), var1.getGreen(), var1.getBlue());
   }
}
