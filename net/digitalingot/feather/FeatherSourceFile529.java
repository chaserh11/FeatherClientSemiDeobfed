package net.digitalingot.feather;

import java.util.Iterator;

public class FeatherSourceFile529 extends FeatherSourceFile713 {
   public FeatherSourceFile529(FeatherSourceFile475 var1, int var2, boolean var3) {
      super(var1, var2, 0);
   }

   protected void ux(float var1) {
      int var2 = 0;
      Iterator var3 = this.u.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile713 var4 = (FeatherSourceFile713)var3.next();
         var4.vt(var2);
         var4.pq(var1);
         var2 += var4.zn();
         this.ku(var2);
      }

   }
}
