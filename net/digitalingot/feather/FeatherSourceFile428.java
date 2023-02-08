package net.digitalingot.feather;

import java.util.Optional;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile428 {
   private FeatherSourceFile429 Rn;

   @Inject
   FeatherSourceFile428() {
   }

   public void fe() {
      this.xJ();
   }

   private void xJ() {
      FeatherSourceFile357.ws.oe((var1, var2, var3) -> {
         if (var2.toLowerCase().contains("hypixel.net")) {
            this.Rn = new FeatherSourceFile429(FeatherSourceFile424.HYPIXEL);
         } else {
            this.Rn = new FeatherSourceFile429(FeatherSourceFile424.OTHER);
         }

      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.Rn = null;
      });
   }

   public boolean xK() {
      return this.Rn != null && this.Rn.xG() == FeatherSourceFile424.HYPIXEL;
   }

   public Optional xL() {
      return Optional.ofNullable(this.Rn);
   }
}
