package net.digitalingot.feather;

public interface FeatherSourceFile157 {
   FeatherSourceFile519 nk = FeatherSourceFile49.lh(FeatherSourceFile157.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile157[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile157 var5 = var2[var4];
            var1 = var5.onSetSubtitle(var1);
         }

         return var1;
      };
   });

   String onSetSubtitle(String var1);
}
