package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;

public interface FeatherSourceFile490 {
   FeatherSourceFile519 je = FeatherSourceFile49.lh(FeatherSourceFile490.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile490[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile490 var5 = var2[var4];
            var5.postInitialization(var1);
         }

      };
   });

   void postInitialization(GuiScreen var1);
}
