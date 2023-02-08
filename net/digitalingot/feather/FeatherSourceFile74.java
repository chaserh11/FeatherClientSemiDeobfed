package net.digitalingot.feather;

import java.util.Iterator;

public class FeatherSourceFile74 extends FeatherSourceFile713 {
   public FeatherSourceFile74(FeatherSourceFile475 var1, int var2, boolean var3) {
      super(var1, 0, var2);
   }

   protected void ux(float var1) {
      int var2 = 0;
      Iterator var3 = this.u.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile713 var4 = (FeatherSourceFile713)var3.next();
         var4.as(var2);
         var4.pq(var1);
         var2 += var4.aw();
         this.xm(var2);
      }

   }
}
