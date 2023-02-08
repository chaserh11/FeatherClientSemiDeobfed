package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile159 {
   FeatherSourceFile519 vi = FeatherSourceFile49.lh(FeatherSourceFile159.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile159[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile159 var6 = var3[var5];
            var6.render(var1, var2);
         }

      };
   });
   FeatherSourceFile519 ya = FeatherSourceFile49.lh(FeatherSourceFile159.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile159[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile159 var6 = var3[var5];
            var6.render(var1, var2);
         }

      };
   });

   @NotNull @NotNull void render(@NotNull @NotNull Entity var1, @NotNull @NotNull FeatherSourceFile$lh111 var2);
}
