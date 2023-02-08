package net.digitalingot.feather;

import net.minecraft.util.IChatComponent;

public interface FeatherSourceFile618 {
   FeatherSourceFile519 zy = FeatherSourceFile49.lh(FeatherSourceFile$nc1.class, (var0) -> {
      return () -> {
         FeatherSourceFile$nc1[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FeatherSourceFile$nc1 var4 = var1[var3];
            var4.screenshot();
         }

      };
   });
   FeatherSourceFile519 je = FeatherSourceFile49.lh(FeatherSourceFile$lh.class, (var0) -> {
      return (var1, var2) -> {
         IChatComponent var3 = var2;
         FeatherSourceFile$lh[] var4 = var0;
         int var5 = var0.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            FeatherSourceFile$lh var7 = var4[var6];
            var3 = var7.screenshot(var1, var3);
         }

         return var3;
      };
   });
}
