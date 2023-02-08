package net.digitalingot.feather;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class FeatherSourceFile$oe5 {
   private final IntConsumer ps;
   private final IntSupplier xm;

   FeatherSourceFile$oe5(IntConsumer var1, IntSupplier var2) {
      this.ps = var1;
      this.xm = var2;
   }

   public void xj(int var1) {
      this.ps.accept(var1);
   }

   public int cc() {
      return this.xm.getAsInt();
   }
}
