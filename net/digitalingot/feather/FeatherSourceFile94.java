package net.digitalingot.feather;

import java.util.Map;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile94 implements FeatherSourceFile594 {
   @NotNull
   private final @NotNull Provider jM;
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   @NotNull
   private final @NotNull FeatherSourceFile718 lg;

   @Inject
   FeatherSourceFile94(@NotNull @NotNull Provider var1, @NotNull @NotNull FeatherSourceFile665 var2, @NotNull @NotNull FeatherSourceFile718 var3) {
      this.jM = var1;
      this.hb = var2;
      this.lg = var3;
   }

   public void lh(FeatherSourceFile476 var1, Consumer var2, Consumer var3) {
      FeatherSourceFile243 var4 = var1.rs();
      FeatherSourceFile495 var5 = this.hb.xj(var4);
      FeatherSourceFile136 var6 = var5.pr();
      if (var1.ev() != null) {
         var6.enabled = var1.ev();
      }

      if (var1.ft() != null) {
         var6.eP = var1.ft();
         FeatherSourceFile171 var7 = this.lg.hp().af();
         if (var1.ft()) {
            var7.sq().add(var1.rs());
         } else {
            var7.sq().remove(var1.rs());
         }

         this.lg.rp();
      }

      if (var1.ow() != null) {
         this.lg.rp();
      }

      Map var8 = var1.cq();
      if (var8 != null) {
         ((FeatherSourceFile596)this.jM.get()).lh(var5, var8);
      }

      ((FeatherSourceFile596)this.jM.get()).mq(var5);
      var2.accept(new FeatherSourceFile12("success"));
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_MOD_SETTINGS;
   }
}
