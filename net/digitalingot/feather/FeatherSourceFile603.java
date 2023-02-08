package net.digitalingot.feather;

public interface FeatherSourceFile603 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile603.class, (var0) -> {
      return () -> {
         FeatherSourceFile603[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FeatherSourceFile603 var4 = var1[var3];
            var4.disconnect();
         }

      };
   });

   void disconnect();
}
