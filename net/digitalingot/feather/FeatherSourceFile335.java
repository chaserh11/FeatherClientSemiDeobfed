package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.List;

public class FeatherSourceFile335 {
   private static final List RV = Lists.newArrayList();
   private static boolean RW = true;

   public static void lh(FeatherSourceFile$lh7 var0) {
      if (RW) {
         RV.add(() -> {
            return "";
         });
      }

      RW = false;
      RV.add(var0);
   }

   public static void yC() {
      RW = true;
   }

   public static List yD() {
      return RV;
   }
}
