package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile269 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile779 rK;

   public FeatherSourceFile269(@NotNull @NotNull FeatherSourceFile779 var1) {
      this.rK = var1;
   }

   public void lh(FeatherSourceFile162 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile340 var4 = var1.iu();
      if (var1.nu() != null) {
         FeatherSourceFile340 var5 = (FeatherSourceFile340)this.rK.ip().stream().filter((var1x) -> {
            return var1x.getName().equals(var1.nu());
         }).findAny().orElse((Object)null);
         if (var5 == null) {
            throw new IllegalArgumentException("Macro not found");
         }

         var5.xe(var4.getName());
         var5.td(var4.gl());
         var5.nc(var4.ay());
         this.rK.rp();
      } else {
         this.rK.lh(var4);
      }

      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_MACRO;
   }
}
