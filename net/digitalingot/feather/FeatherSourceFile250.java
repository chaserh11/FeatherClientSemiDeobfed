package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Set;

public class FeatherSourceFile250 implements FeatherSourceFile254 {
   public void lh(FeatherSourceFile$lh130 var1, Set var2) {
      Iterator var3 = var1.zO().iterator();

      while(var3.hasNext()) {
         FeatherSourceFile$lh130 var4 = (FeatherSourceFile$lh130)var3.next();
         this.lh(var4, var2);
      }

      this.nc(var1, var2);
   }

   public void nc(FeatherSourceFile$lh130 var1, Set var2) {
      FeatherSourceFile311.Sb.info("Injected custom pack source for {}", new Object[]{var1.zM()});
   }
}
