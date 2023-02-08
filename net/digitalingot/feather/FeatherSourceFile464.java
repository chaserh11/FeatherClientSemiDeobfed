package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Set;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.HYPIXEL,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.hypixel",
   jl = "https://assets.feathercdn.net/game/mods/hypixel.svg",
   od = "feather.moduledescription.hypixel",
   wr = {FeatherSourceFile$lh3.HYPIXEL}
)
)
public class FeatherSourceFile464 extends FeatherSourceFile495 {
   private final Set Hg;

   @Inject
   FeatherSourceFile464(Set var1) {
      this.Hg = var1;
   }

   public void ex() {
      Iterator var1 = this.Hg.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile791 var2 = (FeatherSourceFile791)var1.next();
         var2.ex();
      }

   }

   public void pu() {
      FeatherSourceFile791 var2;
      for(Iterator var1 = this.Hg.iterator(); var1.hasNext(); var2.pu()) {
         var2 = (FeatherSourceFile791)var1.next();
         if (var2.dE() && !var2.gg()) {
            var2.ml();
         }

         if (!var2.dE() && var2.gg()) {
            var2.ze();
         }
      }

   }

   public void ml() {
      Iterator var1 = this.Hg.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile791 var2 = (FeatherSourceFile791)var1.next();
         if (var2.dE()) {
            var2.ml();
         }
      }

   }

   public void ze() {
      Iterator var1 = this.Hg.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile791 var2 = (FeatherSourceFile791)var1.next();
         if (var2.gg()) {
            var2.ze();
         }
      }

   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile$lh113 var1) {
      super.lh((FeatherSourceFile136)var1);
      Iterator var2 = this.Hg.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile791 var3 = (FeatherSourceFile791)var2.next();
         var3.lh(var1);
      }

   }
}
