package net.digitalingot.feather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile748 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile253 nc;
   @NotNull
   private final @NotNull FeatherSourceFile336 ut;
   @NotNull
   private final @NotNull FeatherSourceFile636 we;

   @Inject
   FeatherSourceFile748(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile253 var2, @NotNull @NotNull FeatherSourceFile336 var3, @NotNull @NotNull FeatherSourceFile636 var4) {
      this.minecraft = var1;
      this.nc = var2;
      this.ut = var3;
      this.we = var4;
   }

   public void tk() {
      Map var1 = this.we.qk();
      Map var2 = this.tq();
      FeatherSourceFile502 var3 = new FeatherSourceFile502(var1, var2);
      this.nc.nc(var3);
   }

   @NotNull
   private @NotNull Map tq() {
      UUID var1 = this.minecraft.func_110432_I().func_148256_e().getId();
      List var2 = (List)this.ut.qp().get(var1);
      if (var2 == null) {
         return new HashMap();
      } else {
         HashMap var3 = new HashMap(var2.size());
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            FeatherSourceFile165 var5 = (FeatherSourceFile165)var4.next();
            var3.put(var5.ud(), var5.getSlug());
         }

         return var3;
      }
   }
}
