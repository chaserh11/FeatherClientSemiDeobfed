package net.digitalingot.feather;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

@Singleton
public class FeatherSourceFile736 {
   private final Set vS = new HashSet();
   private final FeatherSourceFile359 vT;
   private final FeatherSourceFile849 pv;
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile736(Minecraft var1, FeatherSourceFile849 var2) {
      this.minecraft = var1;
      this.pv = var2;
      this.vT = FeatherSourceFile361.lh(() -> {
         return (Set)this.vS.stream().filter((var1) -> {
            FeatherSourceFile$lh$xj.nc.xj var2x = (FeatherSourceFile$lh$xj.nc.xj)var2.iT().get(var1);
            return var2x != null && var2x.jM();
         }).collect(Collectors.toSet());
      }, 200L);
      FeatherSourceFile34.zw.oe((var1x) -> {
         if (var1x instanceof EntityPlayer) {
            UUID var2 = var1x.func_110124_au();
            this.vS.add(var2);
         }
      });
      FeatherSourceFile34.yv.oe((var1x) -> {
         if (var1x instanceof EntityPlayer) {
            UUID var2 = var1x.func_110124_au();
            this.vS.remove(var2);
         }
      });
      FeatherSourceFile555.ws.oe((var2x, var3) -> {
         if (var2x == var1.field_71439_g) {
            this.vS.clear();
         }
      });
   }

   public Set F() {
      return (Set)this.vT.call();
   }
}
