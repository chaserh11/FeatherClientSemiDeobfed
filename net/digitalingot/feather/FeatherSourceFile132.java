package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile132 {
   @NotNull
   private static final @NotNull ImmutableMap sh = ImmutableMap.builder().put(0, 6).put(1, 2).put(2, 4).put(3, 0).put(4, 1).put(5, 3).put(6, 5).put(7, 7).build();
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;
   private final FeatherSourceFile426 ab;

   @Inject
   FeatherSourceFile132(FeatherSourceFile665 var1, FeatherSourceFile253 var2, FeatherSourceFile426 var3) {
      this.hb = var1;
      this.nc = var2;
      this.ab = var3;
   }

   public void tk() {
      FeatherSourceFile307 var1 = new FeatherSourceFile307(this.kb());
      this.nc.nc(var1);
   }

   @NotNull
   private @NotNull Map kb() {
      TreeMap var1 = new TreeMap();
      Iterator var2 = this.hb.dx().iterator();

      while(true) {
         FeatherSourceFile495 var3;
         FeatherSourceFile136 var4;
         FeatherSourceFile575 var6;
         do {
            do {
               do {
                  do {
                     do {
                        FeatherSourceFile368 var5;
                        do {
                           if (!var2.hasNext()) {
                              HashMap var8 = new HashMap(var1.size());
                              var8.put((Integer)sh.get(0), new FeatherSourceFile$lh34("cosmetics", "Cosmetics", "https://assets.feathercdn.net/game/hudselection/cosmetics.svg"));
                              var8.put((Integer)sh.get(1), new FeatherSourceFile$lh34("social", "Social", "https://assets.feathercdn.net/game/homepageicons/chat.svg"));
                              int var9 = 2;
                              Iterator var10 = var1.values().iterator();

                              while(var10.hasNext()) {
                                 FeatherSourceFile$lh34 var11 = (FeatherSourceFile$lh34)var10.next();
                                 var8.put((Integer)sh.get(var9++), var11);
                              }

                              return var8;
                           }

                           var3 = (FeatherSourceFile495)var2.next();
                           var4 = var3.pr();
                           var5 = (FeatherSourceFile368)var4.getClass().getDeclaredAnnotation(FeatherSourceFile368.class);
                        } while(var5 == null);

                        var6 = var5.qj();
                     } while(var6.bv().isEmpty());
                  } while(!var3.uj());
               } while(!var4.hL);
            } while(this.ab.oe(var3.fg()));
         } while(var3 instanceof FeatherSourceFile39 && !((FeatherSourceFile$lh14)var4).FY);

         FeatherSourceFile$lh34 var7 = new FeatherSourceFile$lh34(var6.bv(), var6.jc(), var6.jl());
         var1.put(var6.io(), var7);
      }
   }
}
