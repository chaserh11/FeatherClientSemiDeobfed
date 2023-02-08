package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface FeatherSourceFile299 {
   FeatherSourceFile519 oq = FeatherSourceFile49.lh(FeatherSourceFile299.class, (var0) -> {
      return () -> {
         FeatherSourceFile299[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FeatherSourceFile299 var4 = var1[var3];
            FeatherSourceFile133 var5 = var4.drawHighlightBlock();
            if (var5 != FeatherSourceFile133.PASS) {
               return var5;
            }
         }

         return FeatherSourceFile133.PASS;
      };
   });

   @NotNull
   @NotNull FeatherSourceFile133 drawHighlightBlock();
}
