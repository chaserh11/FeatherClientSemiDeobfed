package net.digitalingot.feather;

import java.util.UUID;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$nc12 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile279 sO;

   FeatherSourceFile$nc12(@NotNull @NotNull FeatherSourceFile279 var1) {
      this.sO = var1;
   }

   public void lh(FeatherSourceFile150 var1, Consumer var2, Consumer var3) {
      UUID var4 = var1.ka();
      this.sO.km(var4);
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CHANGE_ACCOUNT;
   }
}
