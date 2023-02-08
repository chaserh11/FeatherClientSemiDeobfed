package net.digitalingot.feather;

public class FeatherSourceFile60 {
   public static boolean ck(int var0) {
      return var0 < 0 ? FeatherSourceFile845.kx(var0 + 100) : FeatherSourceFile704.lh(var0);
   }

   public static boolean oe(int... var0) {
      int[] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1[var3];
         if (!ck(var4)) {
            return false;
         }
      }

      return true;
   }
}
