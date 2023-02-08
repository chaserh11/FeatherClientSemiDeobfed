package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile686 {
   FeatherSourceFile519 zy = FeatherSourceFile49.lh(FeatherSourceFile$lh134.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile$lh134[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile$lh134 var5 = var2[var4];
            if (var5.load(var1) == FeatherSourceFile133.FAIL) {
               return FeatherSourceFile133.FAIL;
            }
         }

         return FeatherSourceFile133.PASS;
      };
   });
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile686.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile686[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile686 var5 = var2[var4];
            var5.load(var1);
         }

      };
   });

   @NotNull void load(@NotNull @NotNull FeatherSourceFile495 var1);
}
