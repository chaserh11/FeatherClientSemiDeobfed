package net.digitalingot.feather;

import java.util.List;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile380 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile380.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile380[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile380 var6 = var3[var5];
            var6.showTooltip(var1, var2);
         }

      };
   });

   @NotNull @NotNull void showTooltip(@NotNull @NotNull ItemStack var1, @NotNull @NotNull List var2);
}
