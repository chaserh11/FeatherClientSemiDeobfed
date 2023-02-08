package net.digitalingot.feather;

import java.util.function.Consumer;
import net.digitalingot.vendor.com.google.inject.ImplementedBy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ImplementedBy(FeatherSourceFile552.class)
public interface FeatherSourceFile253 {
   default @NotNull void lh(@NotNull @NotNull FeatherSourceFile706 var1) {
      this.lh(var1, (Consumer)null, (Consumer)null, FeatherSourceFile275.RUST_LAUNCHER);
   }

   default @NotNull @Nullable @Nullable void nc(@NotNull @NotNull FeatherSourceFile706 var1, @Nullable @Nullable Consumer var2, @Nullable @Nullable Consumer var3) {
      this.lh(var1, var2, var3, FeatherSourceFile275.RUST_LAUNCHER);
   }

   default @NotNull void nc(@NotNull @NotNull FeatherSourceFile706 var1) {
      this.lh(var1, (Consumer)null, (Consumer)null, FeatherSourceFile275.FRONTEND);
   }

   default @NotNull @Nullable @Nullable void xj(@NotNull @NotNull FeatherSourceFile706 var1, @Nullable @Nullable Consumer var2, @Nullable @Nullable Consumer var3) {
      this.lh(var1, var2, var3, FeatherSourceFile275.FRONTEND);
   }

   default @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile706 var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      this.lh(var1, (Consumer)null, (Consumer)null, var2);
   }

   @NotNull @Nullable @Nullable @NotNull void lh(@NotNull @NotNull FeatherSourceFile706 var1, @Nullable @Nullable Consumer var2, @Nullable @Nullable Consumer var3, @NotNull @NotNull FeatherSourceFile275 var4);
}
