package net.digitalingot.feather;

import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile76 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile779 rK;

   public FeatherSourceFile76(@NotNull @NotNull FeatherSourceFile779 var1) {
      this.rK = var1;
   }

   public void lh(FeatherSourceFile52 var1, Consumer var2, Consumer var3) {
      String var4 = var1.nu();
      Optional var5 = this.rK.ip().stream().filter((var1x) -> {
         return var1x.getName().equals(var4);
      }).findAny();
      if (!var5.isPresent()) {
         var3.accept(new FeatherSourceFile4("Macro not found"));
      } else {
         this.rK.nc((FeatherSourceFile340)var5.get());
         var2.accept(new FeatherSourceFile12("success"));
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_MACRO;
   }
}
