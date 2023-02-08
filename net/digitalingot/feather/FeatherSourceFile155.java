package net.digitalingot.feather;

import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile155 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile358 AC;

   public FeatherSourceFile155(@NotNull @NotNull FeatherSourceFile358 var1) {
      this.AC = var1;
   }

   public void lh(FeatherSourceFile123 var1, Consumer var2, Consumer var3) {
      String var4 = var1.ky();
      Optional var5 = this.AC.gV().stream().filter((var1x) -> {
         return var1x.getName().equals(var4);
      }).findAny();
      if (!var5.isPresent()) {
         var3.accept(new FeatherSourceFile4("Waypoint not found"));
      } else {
         this.AC.nc((FeatherSourceFile201)var5.get());
         var2.accept(new FeatherSourceFile12("success"));
      }
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_WAYPOINT;
   }
}
