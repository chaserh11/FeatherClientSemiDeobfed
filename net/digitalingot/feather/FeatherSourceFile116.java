package net.digitalingot.feather;

import java.util.function.Supplier;

public class FeatherSourceFile116 {
   public static FeatherSourceFile713 lh(FeatherSourceFile713 var0) {
      return lh(FeatherSourceFile713::new, var0, 0, 0, true, true);
   }

   public static FeatherSourceFile713 lh(FeatherSourceFile713 var0, boolean var1, boolean var2) {
      return lh(FeatherSourceFile713::new, var0, 0, 0, var1, var2);
   }

   public static FeatherSourceFile713 lh(FeatherSourceFile713 var0, int var1, int var2) {
      return lh(FeatherSourceFile713::new, var0, var1, var2, true, true);
   }

   public static FeatherSourceFile713 lh(FeatherSourceFile713 var0, int var1, int var2, boolean var3, boolean var4) {
      return lh(FeatherSourceFile713::new, var0, var1, var2, var3, var4);
   }

   public static FeatherSourceFile713 lh(Supplier var0, FeatherSourceFile713 var1, int var2, int var3) {
      return lh(var0, var1, var2, var3, true, true);
   }

   public static FeatherSourceFile713 lh(Supplier var0, FeatherSourceFile713 var1, int var2, int var3, boolean var4, boolean var5) {
      if (var0 == null) {
         return null;
      } else {
         FeatherSourceFile713 var6 = (FeatherSourceFile713)var0.get();
         var6.xm(var1.aw() + var2);
         var6.ku(var1.zn() + var3);
         var1.sm(var5);
         var1.hv(var4);
         var6.nc(var1);
         return var6;
      }
   }
}
