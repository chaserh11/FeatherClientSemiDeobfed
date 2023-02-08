package net.digitalingot.feather;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum FeatherSourceFile716 {
   INSTANCE;

   public @NotNull @Nullable @Nullable FeatherSourceFile548 create(@NotNull @NotNull Class var1, @Nullable @Nullable Map var2, @Nullable @Nullable String var3) {
      return this.create(var1, var2, var3, (FeatherSourceFile712)null);
   }

   public @NotNull @Nullable @Nullable FeatherSourceFile548 create(@NotNull @NotNull FeatherSourceFile712 var1, @Nullable @Nullable Map var2, @Nullable @Nullable String var3) {
      return this.create(var1.ad().getType(), var2, var3, var1);
   }

   private @NotNull @Nullable @Nullable @Nullable FeatherSourceFile548 create(@NotNull @NotNull Class var1, @Nullable @Nullable Map var2, @Nullable @Nullable String var3, @Nullable @Nullable FeatherSourceFile712 var4) {
      String var5 = var3 != null && !var3.isEmpty() ? var3 + ":" : "";
      if (FeatherSourceFile89.class.isAssignableFrom(var1)) {
         if (var4 == null) {
            throw new IllegalArgumentException("Field cannot be null for HUDElementSubconfig");
         } else {
            return new FeatherSourceFile593(var1, var2, var5, var4);
         }
      } else {
         return new FeatherSourceFile548(var1, var2, var5);
      }
   }

   // $FF: synthetic method
   private static FeatherSourceFile716[] $values() {
      return new FeatherSourceFile716[]{INSTANCE};
   }
}
