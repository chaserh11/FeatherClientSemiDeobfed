package net.digitalingot.feather;

public interface FeatherSourceFile572 {
   FeatherSourceFile519 uo = FeatherSourceFile49.lh(FeatherSourceFile$lh119.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile$lh119[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile$lh119 var5 = var2[var4];
            var5.onAdded(var1);
         }

      };
   });
   FeatherSourceFile519 um = FeatherSourceFile49.lh(FeatherSourceFile$nc54.class, (var0) -> {
      return (var1) -> {
         FeatherSourceFile$nc54[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            FeatherSourceFile$nc54 var5 = var2[var4];
            var5.onRemoved(var1);
         }

      };
   });
}
