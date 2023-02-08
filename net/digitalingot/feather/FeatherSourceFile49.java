package net.digitalingot.feather;

import java.util.function.Function;

public final class FeatherSourceFile49 {
   private static boolean xo = true;

   private FeatherSourceFile49() {
   }

   public static boolean qs() {
      return xo;
   }

   public static void zl() {
      FeatherSourceFile416.zl();
   }

   public static FeatherSourceFile519 lh(Class var0, Function var1) {
      return FeatherSourceFile416.lh(var0, var1);
   }

   public static FeatherSourceFile519 lh(Class var0, Object var1, Function var2) {
      return lh(var0, (var2x) -> {
         if (var2x.length == 0) {
            return var1;
         } else {
            return var2x.length == 1 ? var2x[0] : var2.apply(var2x);
         }
      });
   }

   public static String qy(Object var0) {
      return var0.getClass().getName();
   }
}
