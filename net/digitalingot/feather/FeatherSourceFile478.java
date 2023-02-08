package net.digitalingot.feather;

public interface FeatherSourceFile478 {
   FeatherSourceFile519 dq = FeatherSourceFile49.lh(FeatherSourceFile478.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile478[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile478 var5 = var2[var4];
            var1 = var5.onSetTitle(var1);
         }

         return var1;
      };
   });

   String onSetTitle(String var1);
}
