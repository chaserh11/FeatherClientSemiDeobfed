package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;

@Singleton
class FeatherSourceFile352 {
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;
   private final FeatherSourceFile755 jF;

   @Inject
   FeatherSourceFile352(FeatherSourceFile665 var1, FeatherSourceFile253 var2, FeatherSourceFile755 var3) {
      this.hb = var1;
      this.nc = var2;
      this.jF = var3;
   }

   public void tk() {
      Collection var1 = this.hb.dx();
      ArrayList var2 = new ArrayList(var1.size());
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile495 var4 = (FeatherSourceFile495)var3.next();
         FeatherSourceFile414 var5 = var4.li().kl();
         if (var5.ds().jc().isEmpty()) {
            Boolean var6 = var4.pr().wg();
            List var7 = FeatherSourceFile595.mr(var4.pr());
            String var9 = Minecraft.func_71410_x().func_135016_M().func_135041_c().func_135034_a();
            FeatherSourceFile530 var8;
            if (!var9.equalsIgnoreCase("en_us")) {
               ArrayList var10 = new ArrayList(Arrays.asList(var5.tp()));
               var10.add(FeatherSourceFile194.aY.yl(var5.jc()));
               var8 = new FeatherSourceFile530(FeatherSourceFile37.nc(var5.jc()), var5.jc(), var4.fg(), var5.jl(), FeatherSourceFile37.nc(var5.od()), var6, var5.wr(), (String[])var10.toArray(new String[0]), var7);
            } else {
               var8 = new FeatherSourceFile530(FeatherSourceFile37.nc(var5.jc()), var5.jc(), var4.fg(), var5.jl(), FeatherSourceFile37.nc(var5.od()), var6, var5.wr(), var5.tp(), var7);
            }

            var2.add(var8);
         }
      }

      Collections.sort(var2);
      Map var12 = (Map)var2.stream().collect(Collectors.toMap((var0) -> {
         return var0.rs().getSlug();
      }, (var0) -> {
         return var0;
      }));
      List var13 = (List)var2.stream().filter(FeatherSourceFile530::fp).collect(Collectors.toList());
      Stream var10000 = this.jF.eu().stream();
      Objects.requireNonNull(var12);
      var10000 = var10000.filter(var12::containsKey);
      Objects.requireNonNull(var12);
      List var14 = (List)var10000.map(var12::get).filter((var1x) -> {
         return !var13.contains(var1x);
      }).collect(Collectors.toList());
      List var15 = (List)var2.stream().filter((var1x) -> {
         return !var1x.fp() && !var14.contains(var1x);
      }).collect(Collectors.toList());
      int var16 = (int)var2.stream().filter(FeatherSourceFile530::fp).count();

      for(int var17 = 0; var17 < var16; ++var17) {
         var14.add(var17, (FeatherSourceFile530)var2.get(var17));
      }

      Iterator var19 = var15.iterator();

      while(var19.hasNext()) {
         FeatherSourceFile530 var18 = (FeatherSourceFile530)var19.next();
         int var22 = var2.indexOf(var18);
         var14.add(var22, var18);
      }

      Map var21 = (Map)var2.stream().collect(Collectors.toMap(FeatherSourceFile530::qa, (var0) -> {
         return var0.rs().getSlug();
      }));
      var10000 = var14.stream().filter((var0) -> {
         return !var0.fp();
      }).map(FeatherSourceFile530::qa);
      Objects.requireNonNull(var21);
      List var20 = (List)var10000.map(var21::get).collect(Collectors.toList());
      this.jF.mq(var20);
      Set var23 = (Set)var13.stream().map((var0) -> {
         return var0.rs().getSlug();
      }).collect(Collectors.toSet());
      this.jF.xj(var23);
      FeatherSourceFile620 var11 = new FeatherSourceFile620(var14);
      this.nc.nc(var11);
   }
}
