package net.digitalingot.feather;

public interface FeatherSourceFile653 {
   FeatherSourceFile519 ws = FeatherSourceFile49.lh(FeatherSourceFile653.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile653[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile653 var5 = var2[var4];
            var5.registerCommands(var1);
         }

      };
   });

   void registerCommands(Void var1);
}
