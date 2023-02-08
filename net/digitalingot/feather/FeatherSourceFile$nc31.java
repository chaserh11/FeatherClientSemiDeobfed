package net.digitalingot.feather;

import java.util.function.BooleanSupplier;

public class FeatherSourceFile$nc31 {
   private final FeatherSourceFile377 ja;
   private final BooleanSupplier qn;

   public FeatherSourceFile$nc31(FeatherSourceFile377 var1, BooleanSupplier var2) {
      this.ja = var1;
      this.qn = var2;
   }

   public void pq(boolean var1) {
      this.ja.accept(var1);
   }

   public boolean xe() {
      return this.qn.getAsBoolean();
   }
}
