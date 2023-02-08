package net.digitalingot.feather;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

public class FeatherSourceFile$xj7 {
   private final DoubleConsumer er;
   private final DoubleSupplier zd;

   FeatherSourceFile$xj7(DoubleConsumer var1, DoubleSupplier var2) {
      this.er = var1;
      this.zd = var2;
   }

   public void ou(double var1) {
      this.er.accept(var1);
   }

   public double td() {
      return this.zd.getAsDouble();
   }
}
