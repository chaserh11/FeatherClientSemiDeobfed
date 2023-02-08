package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile708 {
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile708(FeatherSourceFile665 var1, FeatherSourceFile253 var2) {
      this.hb = var1;
      this.nc = var2;
   }

   public @NotNull void tk() {
      Collection var1 = this.hb.dx();
      TreeMap var2 = new TreeMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile495 var4 = (FeatherSourceFile495)var3.next();
         FeatherSourceFile414 var5 = var4.li().kl();
         if (!var5.ds().jc().isEmpty()) {
            List var6 = FeatherSourceFile595.mr(var4.pr());
            FeatherSourceFile$lh102 var7 = new FeatherSourceFile$lh102(FeatherSourceFile37.nc(var5.jc()), var4.fg(), var5.ds().jc(), var5.jl(), FeatherSourceFile37.nc(var5.od()), var6);
            var2.put(var5.ds().jm().kz(), var7);
         }
      }

      FeatherSourceFile62 var8 = new FeatherSourceFile62(new ArrayList(var2.values()));
      this.nc.nc(var8);
   }
}
