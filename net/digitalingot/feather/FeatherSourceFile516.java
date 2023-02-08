package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface FeatherSourceFile516 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile516.class, (var0) -> {
      return (var1) -> {
         String var2 = var1;
         FeatherSourceFile516[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile516 var6 = var3[var5];
            var2 = var6.sendChat(var2);
            if (var2 == null) {
               return null;
            }
         }

         return var2;
      };
   });

   @Nullable
   @Nullable @NotNull String sendChat(@NotNull @NotNull String var1);
}
