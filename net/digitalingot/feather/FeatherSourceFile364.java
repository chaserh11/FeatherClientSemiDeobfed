package net.digitalingot.feather;

public class FeatherSourceFile364 {
   public static FeatherSourceFile519 vi = FeatherSourceFile49.lh(FeatherSourceFile$nc3.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile$nc3[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile$nc3 var6 = var3[var5];
            FeatherSourceFile133 var7 = var6.render(var1, var2);
            if (var7 != FeatherSourceFile133.PASS) {
               return var7;
            }
         }

         return FeatherSourceFile133.PASS;
      };
   });
   public static FeatherSourceFile519 ya = FeatherSourceFile49.lh(FeatherSourceFile$lh13.class, (var0) -> {
      return (var1, var2) -> {
         FeatherSourceFile$lh13[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            FeatherSourceFile$lh13 var6 = var3[var5];
            var6.render(var1, var2);
         }

      };
   });
}
