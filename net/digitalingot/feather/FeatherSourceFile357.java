package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile357 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile357.class, (var0) -> {
      return (var1, var2, var3) -> {
         FeatherSourceFile357[] var4 = var0;
         int var5 = var0.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            FeatherSourceFile357 var7 = var4[var6];
            var7.login(var1, var2, var3);
         }

      };
   });

   @NotNull @NotNull void login(@NotNull EntityPlayer var1, @NotNull String var2, short var3);
}
