package net.digitalingot.feather;

public final class FeatherSourceFile2 {
   public static final FeatherSourceFile519 xh = FeatherSourceFile49.lh(FeatherSourceFile$lh83.class, (var0) -> {
      return (var1, var2) -> {
         Float var3 = null;
         FeatherSourceFile$lh83[] var4 = var0;
         int var5 = var0.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            FeatherSourceFile$lh83 var7 = var4[var6];
            var3 = var7.setupFogDensity(var1, var3 == null ? var2 : var3);
         }

         return var3;
      };
   });

   private FeatherSourceFile2() {
   }
}
