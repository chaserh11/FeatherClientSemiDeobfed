package net.digitalingot.feather;

import java.util.Collection;
import net.digitalingot.vendor.com.google.inject.ImplementedBy;
import org.jetbrains.annotations.NotNull;

@ImplementedBy(FeatherSourceFile697.class)
public interface FeatherSourceFile665 {
   @NotNull
   static @NotNull @NotNull FeatherSourceFile465 nc(@NotNull final @NotNull Class var0) {
      return new FeatherSourceFile465() {
         private FeatherSourceFile495 gT;

         public FeatherSourceFile495 ag() {
            if (this.gT != null) {
               return this.gT;
            } else if (!FeatherSourceFile747.ou()) {
               return null;
            } else {
               this.gT = ((FeatherSourceFile665)FeatherSourceFile487.mq().getInstance(FeatherSourceFile665.class)).xj(var0);
               return this.gT;
            }
         }
      };
   }

   @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile243 var1, @NotNull @NotNull FeatherSourceFile495 var2);

   @NotNull
   @NotNull @NotNull FeatherSourceFile495 xj(@NotNull @NotNull FeatherSourceFile243 var1);

   @NotNull
   @NotNull @NotNull FeatherSourceFile495 xj(@NotNull @NotNull Class var1);

   @NotNull
   @NotNull Collection dx();
}
