package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;

public class FeatherSourceFile623 {
   public static FeatherSourceFile519 iw = FeatherSourceFile49.lh(FeatherSourceFile$nc44.class, (var0) -> {
      return (var1) -> {
         GuiScreen var2 = var1;
         FeatherSourceFile$nc44[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile$nc44 var6 = var3[var5];
            var2 = var6.openScreen(var2);
         }

         return var2;
      };
   });
   public static FeatherSourceFile519 ir = FeatherSourceFile49.lh(FeatherSourceFile$lh105.class, (var0) -> {
      return () -> {
         FeatherSourceFile$lh105[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FeatherSourceFile$lh105 var4 = var1[var3];
            var4.closeScreen();
         }

      };
   });
}
