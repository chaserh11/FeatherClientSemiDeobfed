package net.digitalingot.feather;

import java.util.List;

public interface FeatherSourceFile524 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile524.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile524[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile524 var5 = var2[var4];
            var5.onPageUpdate(var1);
         }

      };
   });

   void onPageUpdate(List var1);
}
