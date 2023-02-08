package net.digitalingot.feather;

import java.util.UUID;

public interface FeatherSourceFile185 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile185.class, (var0) -> {
      return (var1, var2, var3, var4) -> {
         FeatherSourceFile185[] var5 = var0;
         int var6 = var0.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            FeatherSourceFile185 var8 = var5[var7];
            var8.renderLogo(var1, var2, var3, var4);
         }

      };
   });

   void renderLogo(UUID var1, int var2, int var3, int var4);
}
