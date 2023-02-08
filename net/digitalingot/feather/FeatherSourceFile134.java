package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile134 {
   FeatherSourceFile519 je = FeatherSourceFile49.lh(FeatherSourceFile134.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile134[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile134 var5 = var2[var4];
            var5.render(var1);
         }

      };
   });

   @NotNull void render(@NotNull @NotNull GuiScreen var1);
}
