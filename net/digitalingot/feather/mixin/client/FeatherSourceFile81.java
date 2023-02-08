package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile539;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChatLine.class})
public class FeatherSourceFile81 implements FeatherSourceFile539 {
   public NetworkPlayerInfo Vs;

   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")}
   )
   public void nc(CallbackInfo var1) {
      this.Vs = net.digitalingot.feather.FeatherSourceFile39.cZ();
      net.digitalingot.feather.FeatherSourceFile39.lh((NetworkPlayerInfo)null, false);
   }

   public NetworkPlayerInfo feather$getPlayerInfo() {
      return this.Vs;
   }
}
