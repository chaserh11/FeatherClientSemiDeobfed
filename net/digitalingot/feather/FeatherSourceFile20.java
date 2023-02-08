package net.digitalingot.feather;

import java.io.Closeable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;

class FeatherSourceFile20 implements Closeable {
   private final List LW;

   @Inject
   FeatherSourceFile20(Set var1) {
      this.LW = (List)var1.stream().sorted(Comparator.comparingInt(FeatherSourceFile22::io).reversed()).collect(Collectors.toList());
   }

   public byte[] pq(byte[] var1) {
      byte[] var2 = var1;

      FeatherSourceFile22 var4;
      for(Iterator var3 = this.LW.iterator(); var3.hasNext(); var2 = var4.pq(var2)) {
         var4 = (FeatherSourceFile22)var3.next();
      }

      return var2;
   }

   public void close() {
      Iterator var1 = this.LW.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile22 var2 = (FeatherSourceFile22)var1.next();
         var2.close();
      }

   }
}
