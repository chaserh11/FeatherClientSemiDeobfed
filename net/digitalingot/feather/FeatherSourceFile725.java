package net.digitalingot.feather;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile725 {
   FeatherSourceFile519 ar = FeatherSourceFile49.lh(FeatherSourceFile725.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile725[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile725 var6 = var3[var5];
            var6.on(var1, var2);
         }

      };
   });
   FeatherSourceFile519 wi = FeatherSourceFile49.lh(FeatherSourceFile725.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile725[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile725 var6 = var3[var5];
            var6.on(var1, var2);
         }

      };
   });

   @NotNull @NotNull void on(@NotNull @NotNull EntityPlayer var1, @NotNull @NotNull NetHandlerPlayClient var2);
}
