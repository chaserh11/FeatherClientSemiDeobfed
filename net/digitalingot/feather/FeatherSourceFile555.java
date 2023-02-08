package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile555 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile555.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile555[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile555 var6 = var3[var5];
            var6.joinLevel(var1, var2);
         }

      };
   });

   @NotNull @NotNull void joinLevel(@NotNull @NotNull Entity var1, @NotNull @NotNull World var2);
}
