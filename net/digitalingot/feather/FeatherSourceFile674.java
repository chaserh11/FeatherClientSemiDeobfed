package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile674 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull FeatherSourceFile718 gt;

   @Inject
   FeatherSourceFile674(@NotNull @NotNull FeatherSourceFile718 var1) {
      this.gt = var1;
   }

   public void lh(FeatherSourceFile699 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile171 var4 = var1.ci();
      if (var4 != null) {
         FeatherSourceFile171 var5 = this.gt.hp().af();
         if (var4.kk() != null) {
            var5.lh(var4.kk());
         }

         if (var4.qc() != null) {
            var5.nc(var4.qc());
         }

         if (var4.br() != null) {
            var5.xj(var4.br());
         }

         if (var4.dw() != null) {
            var5.xm(var4.dw());
         }
      }

      FeatherSourceFile8 var7 = var1.by();
      if (var7 != null) {
         FeatherSourceFile8 var6 = this.gt.hp().pv();
         if (var7.hs() != null) {
            var6.qy(var7.hs());
         }

         if (var7.uz() != null) {
            var6.oe(var7.uz());
         }
      }

      this.gt.rp();
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_CLIENT_PREFERENCES;
   }
}
