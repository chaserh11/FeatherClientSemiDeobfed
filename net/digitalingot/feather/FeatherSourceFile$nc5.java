package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;

class FeatherSourceFile$nc5 {
   private final List GR;
   private double GS;

   private FeatherSourceFile$nc5() {
      this.GR = new ArrayList();
   }

   private void pq(long var1) {
      this.GR.add(var1);
   }

   private double as(long var1) {
      this.GR.removeIf((var2) -> {
         return var2 < var1;
      });
      double var3 = (double)this.GR.size();
      if (var3 != this.GS) {
         double var5 = var3 - this.GS;
         if (Math.abs(var5) > 0.01) {
            this.GS = var3;
            return var5;
         }
      }

      return 0.0;
   }

   // $FF: synthetic method
   FeatherSourceFile$nc5(Object var1) {
      this();
   }

   // $FF: synthetic method
   static double lh(FeatherSourceFile$nc5 var0, long var1) {
      return var0.as(var1);
   }

   // $FF: synthetic method
   static List lh(FeatherSourceFile$nc5 var0) {
      return var0.GR;
   }

   // $FF: synthetic method
   static void nc(FeatherSourceFile$nc5 var0, long var1) {
      var0.pq(var1);
   }
}
