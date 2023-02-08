package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile34 {
   FeatherSourceFile519 zw = FeatherSourceFile49.lh(FeatherSourceFile34.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile34[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile34 var5 = var2[var4];
            var5.track(var1);
         }

      };
   });
   FeatherSourceFile519 yv = FeatherSourceFile49.lh(FeatherSourceFile34.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile34[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile34 var5 = var2[var4];
            var5.track(var1);
         }

      };
   });

   @NotNull void track(@NotNull @NotNull Entity var1);
}
