package net.digitalingot.feather;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class FeatherSourceFile21 implements Comparator {
   private static final List aD = Arrays.asList(18, 17, 16, 10018, 10017, 10016, 524, 10, 10524, 10010);

   public int lh(Integer var1, Integer var2) {
      Integer var3 = FeatherSourceFile766.xy(var1).zv();
      Integer var4 = FeatherSourceFile766.xy(var2).zv();
      boolean var5 = aD.stream().anyMatch((var1x) -> {
         return Objects.equals(var1x, var3);
      });
      boolean var6 = aD.stream().anyMatch((var1x) -> {
         return Objects.equals(var1x, var4);
      });
      if (var5 && var6) {
         int var7 = aD.indexOf(var3) - aD.indexOf(var4);
         return var7 != 0 ? var7 : var3.compareTo(var4);
      } else if (var5) {
         return -1;
      } else {
         return var6 ? 1 : var3.compareTo(var4);
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.lh((Integer)var1, (Integer)var2);
   }
}
