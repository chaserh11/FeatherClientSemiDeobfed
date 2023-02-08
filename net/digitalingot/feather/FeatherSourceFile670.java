package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile670 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile670.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile670[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile670 var6 = var3[var5];
            var6.attack(var1, var2);
         }

      };
   });

   @NotNull @NotNull void attack(@NotNull @NotNull EntityPlayer var1, @NotNull @NotNull Entity var2);
}
