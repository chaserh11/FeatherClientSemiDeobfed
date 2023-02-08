package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile339 {
   public static @NotNull @NotNull String lt(@NotNull @NotNull String var0, @NotNull @NotNull String var1) {
      String var2 = System.getenv(var0);
      return var2 != null ? var2 : var1;
   }
}
