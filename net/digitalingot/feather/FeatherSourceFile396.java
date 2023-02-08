package net.digitalingot.feather;

public interface FeatherSourceFile396 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile396.class, (var0) -> {
      return (var1, var2) -> {
         float var3 = var2;
         FeatherSourceFile396[] var4 = var0;
         int var5 = var0.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            FeatherSourceFile396 var7 = var4[var6];
            var3 = var7.updateFOV(var1, var3);
         }

         return var3;
      };
   });

   float updateFOV(float var1, float var2);
}
