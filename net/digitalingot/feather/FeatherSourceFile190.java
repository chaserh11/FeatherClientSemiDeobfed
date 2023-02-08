package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile190 {
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;

   @Inject
   FeatherSourceFile190(@NotNull @NotNull FeatherSourceFile665 var1) {
      this.hb = var1;
   }

   public void sk() {
      this.hg(true);
      this.oh(true);
   }

   public void wt() {
      this.oh(false);
   }

   private void oh(boolean var1) {
      Iterator var2 = this.hb.dx().iterator();

      while(true) {
         FeatherSourceFile495 var3;
         do {
            if (!var2.hasNext()) {
               return;
            }

            var3 = (FeatherSourceFile495)var2.next();
         } while(var1 && var3.fg().isCore());

         if (var3.pr().vy()) {
            this.load(var3);
         }
      }
   }

   public void vz() {
      this.hg(false);
   }

   private void hg(boolean var1) {
      List var2 = (List)this.hb.dx().stream().collect(Collectors.toList());

      for(int var3 = var2.size() - 1; var3 >= 0; --var3) {
         FeatherSourceFile495 var4 = (FeatherSourceFile495)var2.get(var3);
         if ((!var1 || !var4.fg().isCore()) && var4.uj()) {
            this.unload(var4);
         }
      }

   }

   public @NotNull void load(@NotNull @NotNull FeatherSourceFile495 var1) {
      if (!var1.uj()) {
         if (((FeatherSourceFile$lh134)FeatherSourceFile686.zy.sx()).load(var1) == FeatherSourceFile133.FAIL) {
            FeatherSourceFile311.Sb.debug("Module {} was not loaded because callback was cancelled", new Object[]{var1.fg()});
         } else {
            var1.tx(true);
            if (!var1.ou()) {
               var1.ex();
               var1.wn(true);
            }

            var1.ml();
            var1.pu();
            ((FeatherSourceFile686)FeatherSourceFile686.ws.sx()).load(var1);
         }
      }
   }

   public @NotNull void unload(@NotNull @NotNull FeatherSourceFile495 var1) {
      if (var1.uj()) {
         var1.tx(false);
         var1.ze();
         ((FeatherSourceFile154)FeatherSourceFile154.ws.sx()).unload(var1);
      }
   }
}
