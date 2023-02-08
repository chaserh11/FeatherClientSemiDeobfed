package net.digitalingot.feather;

import java.nio.file.Path;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile543 {
   private final Path uK;
   private final FeatherSourceFile$lh117 uL;

   @Inject
   FeatherSourceFile543(@FeatherSourceFile$xj15 Path var1) {
      this.uK = var1.resolve("gui_override.json");
      FeatherSourceFile$lh117 var2 = null;

      try {
         if (this.uK.toFile().exists()) {
            var2 = (FeatherSourceFile$lh117)FeatherSourceFile815.ou(this.uK).km(FeatherSourceFile$lh117.class);
         }
      } catch (Exception var4) {
      }

      this.uL = var2 != null ? var2 : new FeatherSourceFile$lh117();
   }

   private void rp() {
      FeatherSourceFile815.ou(this.uK).wz(this.uL);
   }

   public void f() {
      FeatherSourceFile$lh117.lh(this.uL, true);
      this.rp();
   }

   public void g() {
      FeatherSourceFile$lh117.lh(this.uL, false);
      this.rp();
   }

   public void h() {
      FeatherSourceFile$lh117.nc(this.uL, true);
      this.rp();
   }

   public void i() {
      FeatherSourceFile$lh117.nc(this.uL, false);
      this.rp();
   }

   public boolean j() {
      return FeatherSourceFile$lh117.lh(this.uL);
   }

   public boolean k() {
      return FeatherSourceFile$lh117.nc(this.uL);
   }
}
