package net.digitalingot.feather;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile697 implements FeatherSourceFile665 {
   @NotNull
   private final @NotNull Map eT = new LinkedHashMap();
   @NotNull
   private final @NotNull Map gV = new HashMap();

   public @NotNull @NotNull void lh(@NotNull @NotNull FeatherSourceFile243 var1, @NotNull @NotNull FeatherSourceFile495 var2) {
      this.eT.put(var1, var2);
      this.gV.put(var2.getClass(), var2);
   }

   @NotNull
   public @NotNull @NotNull FeatherSourceFile495 xj(@NotNull @NotNull FeatherSourceFile243 var1) {
      return (FeatherSourceFile495)this.eT.get(var1);
   }

   @NotNull
   public @NotNull @NotNull FeatherSourceFile495 xj(@NotNull @NotNull Class var1) {
      return (FeatherSourceFile495)this.gV.get(var1);
   }

   @NotNull
   public @NotNull Collection dx() {
      return this.eT.values();
   }
}
