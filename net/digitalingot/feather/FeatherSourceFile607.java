package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
class FeatherSourceFile607 {
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;
   private final Gson cf;

   @Inject
   FeatherSourceFile607(FeatherSourceFile665 var1, FeatherSourceFile253 var2, @FeatherSourceFile$lh10 Gson var3) {
      this.hb = var1;
      this.nc = var2;
      this.cf = var3;
   }

   public void tk() {
      HashMap var1 = new HashMap(this.hb.dx().size());
      Iterator var2 = this.hb.dx().iterator();

      while(var2.hasNext()) {
         FeatherSourceFile495 var3 = (FeatherSourceFile495)var2.next();
         FeatherSourceFile414 var4 = var3.li().kl();
         if (var4.ds().jc().isEmpty()) {
            FeatherSourceFile136 var5 = var3.pr();
            FeatherSourceFile763 var6 = new FeatherSourceFile763(var5.vy(), var5.pj(), this.ux(var5));
            var1.put(var3.fg(), var6);
         }
      }

      FeatherSourceFile542 var7 = new FeatherSourceFile542(var1);
      this.nc.nc(var7);
   }

   @NotNull
   private @NotNull @NotNull JsonElement ux(@NotNull @NotNull Object var1) {
      JsonObject var2 = this.cf.toJsonTree(var1).getAsJsonObject();
      JsonObject var3 = new JsonObject();
      Iterator var4 = var2.entrySet().iterator();

      while(true) {
         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            String var6 = (String)var5.getKey();
            JsonElement var7 = (JsonElement)var5.getValue();
            if (var6.startsWith("nested_")) {
               String var8 = var6.substring(7);
               var8 = var8.isEmpty() ? "" : var8 + ":";
               JsonElement var9 = this.ux(var7);
               Iterator var10 = var9.getAsJsonObject().entrySet().iterator();

               while(var10.hasNext()) {
                  Entry var11 = (Entry)var10.next();
                  var3.add(var8 + (String)var11.getKey(), (JsonElement)var11.getValue());
               }
            } else {
               var3.add(var6, var7);
            }
         }

         return var3;
      }
   }
}
