package net.digitalingot.feather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile41 {
   @NotNull
   private final @NotNull FeatherSourceFile253 af;

   @Inject
   FeatherSourceFile41(@NotNull @NotNull FeatherSourceFile253 var1) {
      this.af = var1;
   }

   public void tk() {
      Map var1 = FeatherSourceFile194.ns().us();
      HashMap var2 = new HashMap(var1.size());
      Iterator var3 = var1.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (((String)var4.getKey()).startsWith("featherui.")) {
            var2.put(((String)var4.getKey()).substring(10), (String)var4.getValue());
         }
      }

      this.af.nc(new FeatherSourceFile448(var2));
   }
}
