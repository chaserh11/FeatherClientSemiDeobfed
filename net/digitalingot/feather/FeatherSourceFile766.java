package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile766 {
   @NotNull
   private static final @NotNull ImmutableMap aO;
   @NotNull
   private static final @NotNull ImmutableMap aP;

   @NotNull
   public static @NotNull FeatherSourceFile473 xy(int var0) {
      FeatherSourceFile473 var1 = (FeatherSourceFile473)aO.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         return var0 >= 100000 ? FeatherSourceFile348.aM : FeatherSourceFile348.aL;
      }
   }

   @NotNull
   public static @NotNull FeatherSourceFile473 fh(int var0) {
      FeatherSourceFile473 var1 = (FeatherSourceFile473)aP.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         return var0 >= 100000 ? FeatherSourceFile348.aM : FeatherSourceFile348.aL;
      }
   }

   static {
      Builder var0 = ImmutableMap.builder();
      Builder var1 = ImmutableMap.builder();
      FeatherSourceFile473[] var2 = FeatherSourceFile348.aN;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         FeatherSourceFile473 var5 = var2[var4];
         var0.put(var5.ol(), var5);
         var1.put(var5.zv(), var5);
      }

      aO = var0.build();
      aP = var1.build();
   }
}
