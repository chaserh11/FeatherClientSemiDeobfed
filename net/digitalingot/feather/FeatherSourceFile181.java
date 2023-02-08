package net.digitalingot.feather;

import net.minecraft.entity.EntityLivingBase;
import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile181 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile181.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile181[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile181 var5 = var2[var4];
            var5.hurt(var1);
         }

      };
   });

   @NotNull void hurt(@NotNull @NotNull EntityLivingBase var1);
}
