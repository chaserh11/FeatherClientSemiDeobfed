package net.digitalingot.feather;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FeatherSourceFile$lh84 {
   private final Consumer yl;
   private final Supplier ai;

   FeatherSourceFile$lh84(Consumer var1, Supplier var2) {
      this.yl = var1;
      this.ai = var2;
   }

   public void lh(Object var1) {
      this.yl.accept(var1);
   }

   public Object mm() {
      return this.ai.get();
   }
}
