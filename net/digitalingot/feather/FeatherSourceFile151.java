package net.digitalingot.feather;

public interface FeatherSourceFile151 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile151.class, (var0) -> {
      return () -> {
         FeatherSourceFile151[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FeatherSourceFile151 var4 = var1[var3];
            var4.ready();
         }

      };
   });

   void ready();
}
