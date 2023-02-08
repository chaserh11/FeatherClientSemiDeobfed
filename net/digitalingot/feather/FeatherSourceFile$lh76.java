package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh76 {
   private final List Sq;

   private FeatherSourceFile$lh76(List var1) {
      this.Sq = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile$nc32 fw(int var1) {
      Iterator var2 = this.Sq.iterator();

      FeatherSourceFile$nc32 var3;
      do {
         if (!var2.hasNext()) {
            return FeatherSourceFile$nc32.yK();
         }

         var3 = (FeatherSourceFile$nc32)var2.next();
      } while(var1 < FeatherSourceFile$nc32.xj(var3) || var1 >= FeatherSourceFile$nc32.oe(var3));

      return var3;
   }

   // $FF: synthetic method
   FeatherSourceFile$lh76(List var1, Object var2) {
      this(var1);
   }
}
