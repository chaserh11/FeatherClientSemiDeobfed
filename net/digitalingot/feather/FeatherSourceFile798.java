package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile798 {
   FeatherSourceFile519 vi = FeatherSourceFile49.lh(FeatherSourceFile798.class, (var0) -> {
      return (var1, var2, var4, var6) -> {
         FeatherSourceFile798[] var8 = var0;
         int var9 = var0.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            FeatherSourceFile798 var11 = var8[var10];
            var11.render(var1, var2, var4, var6);
         }

      };
   });
   FeatherSourceFile519 je = FeatherSourceFile49.lh(FeatherSourceFile798.class, (var0) -> {
      return (var1, var2, var4, var6) -> {
         FeatherSourceFile798[] var8 = var0;
         int var9 = var0.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            FeatherSourceFile798 var11 = var8[var10];
            var11.render(var1, var2, var4, var6);
         }

      };
   });

   @NotNull void render(@NotNull @NotNull Entity var1, double var2, double var4, double var6);
}
