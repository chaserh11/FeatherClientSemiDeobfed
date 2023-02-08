package net.digitalingot.feather;

import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile59 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile358 AC;

   public FeatherSourceFile59(@NotNull @NotNull FeatherSourceFile358 var1) {
      this.AC = var1;
   }

   public void lh(FeatherSourceFile195 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile201 var4 = var1.to();
      if (var1.ky() != null) {
         FeatherSourceFile201 var5 = (FeatherSourceFile201)this.AC.gV().stream().filter((var1x) -> {
            return var1x.getName().equals(var1.ky());
         }).findAny().orElse((Object)null);
         if (var5 == null) {
            throw new IllegalArgumentException("Waypoint not found");
         }

         var5.xe(var4.getName());
         var5.er(var4.cy());
         var5.nc(var4.qm());
         var5.lh(var4.ei());
         var5.hy(this.AC.gU());
         var5.ue(this.AC.gT());
      } else {
         var4.hy(this.AC.gU());
         var4.ue(this.AC.gT());
         this.AC.lh(var4);
      }

      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_WAYPOINT;
   }
}
