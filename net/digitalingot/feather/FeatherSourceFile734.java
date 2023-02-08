package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile734 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile693 pl;

   @Inject
   FeatherSourceFile734(@NotNull @NotNull FeatherSourceFile693 var1) {
      this.pl = var1;
   }

   public void lh(FeatherSourceFile751 var1, Consumer var2, Consumer var3) {
      if (var1.tm() != FeatherSourceFile33.OFFLINE) {
         this.pl.lh(var1.tm());
      }

      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CHANGE_STATUS_STATE;
   }
}
