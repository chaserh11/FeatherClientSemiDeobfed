package net.digitalingot.feather;

public interface FeatherSourceFile197 {
   FeatherSourceFile519 bd = FeatherSourceFile49.lh(FeatherSourceFile197.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile197[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile197 var5 = var2[var4];
            var1 = var5.onSetMessageOverlay(var1);
         }

         return var1;
      };
   });

   String onSetMessageOverlay(String var1);
}
