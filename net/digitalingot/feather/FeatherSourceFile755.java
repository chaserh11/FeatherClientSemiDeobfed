package net.digitalingot.feather;

import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile755 {
   private final Path uK;
   private FeatherSourceFile$lh70 vO;
   private Set vP = new HashSet();

   @Inject
   FeatherSourceFile755(@FeatherSourceFile$xj15 Path var1) {
      this.uK = var1.resolve("mod_ordering.json");
      FeatherSourceFile$lh70 var2 = null;

      try {
         if (this.uK.toFile().exists()) {
            var2 = (FeatherSourceFile$lh70)FeatherSourceFile815.ou(this.uK).km(FeatherSourceFile$lh70.class);
         }
      } catch (Exception var4) {
      }

      this.vO = var2 != null ? var2 : new FeatherSourceFile$lh70();
   }

   private void rp() {
      FeatherSourceFile815.ou(this.uK).wz(this.vO);
   }

   public List eu() {
      return this.vO;
   }

   public void xj(Set var1) {
      this.vP = var1;
   }

   public void mq(List var1) {
      FeatherSourceFile$lh70 var2 = new FeatherSourceFile$lh70();
      var2.addAll((Collection)var1.stream().filter((var1x) -> {
         return !this.vP.contains(var1x);
      }).collect(Collectors.toList()));
      this.vO = var2;
      this.rp();
   }
}
