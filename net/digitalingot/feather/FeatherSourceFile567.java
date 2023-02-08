package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile567 implements FeatherSourceFile167 {
   @NotNull
   private final @NotNull FeatherSourceFile336 ut;
   @NotNull
   private final @NotNull FeatherSourceFile87 pg;

   @Inject
   FeatherSourceFile567(@NotNull @NotNull FeatherSourceFile336 var1, @NotNull @NotNull FeatherSourceFile87 var2) {
      this.ut = var1;
      this.pg = var2;
   }

   public void lh(UUID var1, FeatherSourceFile739 var2) {
   }

   public void lh(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile$lh120 var3 = (FeatherSourceFile$lh120)var2.next();
         this.ut.qp().put(var3.sd(), var3.jy());
      }

      if (var1.stream().anyMatch((var0) -> {
         return var0.sd().toString().replace("-", "").equals(Minecraft.func_71410_x().func_110432_I().func_148255_b());
      })) {
         this.pg.gj();
      }

   }
}
