package net.digitalingot.feather;

import java.util.Iterator;

public class FeatherSourceFile523 extends FeatherSourceFile74 {
   public FeatherSourceFile523(FeatherSourceFile475 var1) {
      super(var1, 0, false);
   }

   protected void ux(float var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      FeatherSourceFile713 var6;
      for(Iterator var5 = this.u.iterator(); var5.hasNext(); var2 += var6.aw()) {
         var6 = (FeatherSourceFile713)var5.next();
         if (var2 + var6.aw() > this.ah()) {
            var3 = var2 + var6.aw();
            var2 = 0;
            var4 += var6.zn();
         }

         var6.as(var2);
         var6.vt(var4);
         var6.pq(var1);
      }

      if (var4 != 0) {
         this.xm(var3);
      } else {
         this.xm(var2);
      }

      this.ku(var4 + this.ma().zn());
   }
}
