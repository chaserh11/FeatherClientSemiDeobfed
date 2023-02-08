package net.digitalingot.feather;

public interface FeatherSourceFile48 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile48.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile48[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile48 var6 = var3[var5];
            var6.resize(var1, var2);
         }

      };
   });

   void resize(int var1, int var2);
}
