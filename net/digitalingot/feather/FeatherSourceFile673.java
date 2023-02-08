package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile673 {
   @NotNull
   private final @NotNull FeatherSourceFile336 ut;
   @NotNull
   private final @NotNull FeatherSourceFile636 we;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile673(@NotNull @NotNull FeatherSourceFile336 var1, @NotNull @NotNull FeatherSourceFile636 var2, FeatherSourceFile253 var3) {
      this.ut = var1;
      this.we = var2;
      this.nc = var3;
   }

   public void tk() {
      List var1 = this.ut();
      FeatherSourceFile504 var2 = new FeatherSourceFile504(var1);
      this.nc.nc(var2);
   }

   @NotNull
   private @NotNull List ut() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.ut.dz().values().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile165 var3 = (FeatherSourceFile165)var2.next();
         Class var5 = (Class)FeatherSourceFile636.hq.get(var3.getSlug());
         List var4;
         if (var5 != null) {
            Object var6 = this.we.lh(var3.getSlug(), var5);
            var4 = FeatherSourceFile595.mr(var6);
         } else {
            var4 = null;
         }

         FeatherSourceFile612 var7 = new FeatherSourceFile612(var3.getName(), var3.getSlug(), var3.getIcon(), var3.ud(), var4);
         var1.add(var7);
      }

      return var1;
   }
}
