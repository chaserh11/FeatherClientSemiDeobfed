package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile400 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile400.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile400[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile400 var5 = var2[var4];
            var5.connect(var1);
         }

      };
   });

   @NotNull void connect(@NotNull @NotNull FeatherSourceFile848 var1);
}
