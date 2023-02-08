package net.digitalingot.feather;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile508 {
   @NotNull
   private final @NotNull Map bC = new ConcurrentHashMap();

   @Inject
   FeatherSourceFile508() {
   }

   public @NotNull void lh(int var1, @NotNull @NotNull FeatherSourceFile275 var2, FeatherSourceFile174 var3) {
      FeatherSourceFile$lh118 var4 = new FeatherSourceFile$lh118(var2, var1);
      this.bC.put(var4, var3);
   }

   public @NotNull FeatherSourceFile174 lh(int var1, @NotNull @NotNull FeatherSourceFile275 var2) {
      FeatherSourceFile$lh118 var3 = new FeatherSourceFile$lh118(var2, var1);
      return (FeatherSourceFile174)this.bC.remove(var3);
   }
}
