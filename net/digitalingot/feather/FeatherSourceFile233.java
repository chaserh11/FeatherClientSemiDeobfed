package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.entity.player.EntityPlayer;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.PING,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.ping",
   jl = "https://assets.feathercdn.net/game/mods/ping.svg",
   od = "feather.moduledescription.ping",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh15.class
)},
   ms = FeatherSourceFile$lh87.ONLY_HUD_ELEMENT
)
public class FeatherSourceFile233 extends FeatherSourceFile360 {
   private final FeatherSourceFile298 DE;

   @Inject
   FeatherSourceFile233(FeatherSourceFile298 var1) {
      this.DE = var1;
   }

   public int bL() {
      return this.DE.bL();
   }

   public int qy(EntityPlayer var1) {
      return this.DE.qy(var1);
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile233 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile233 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile233 var0) {
      return var0.fS;
   }
}
