package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile154 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile154.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile154[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile154 var5 = var2[var4];
            var5.unload(var1);
         }

      };
   });

   @NotNull void unload(@NotNull @NotNull FeatherSourceFile495 var1);
}
