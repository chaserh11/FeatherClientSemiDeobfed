package net.digitalingot.feather;

import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface FeatherSourceFile645 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile645.class, (var0) -> {
      return (var1) -> {
         IChatComponent var2 = var1;
         FeatherSourceFile645[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile645 var6 = var3[var5];
            var2 = var6.receiveMessage(var2);
            if (var2 == null) {
               return null;
            }
         }

         return var2;
      };
   });

   @Nullable
   @Nullable @NotNull IChatComponent receiveMessage(@NotNull @NotNull IChatComponent var1);
}
