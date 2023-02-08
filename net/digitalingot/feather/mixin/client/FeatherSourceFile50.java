package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile725;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.server.S01PacketJoinGame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetHandlerPlayClient.class})
public abstract class FeatherSourceFile50 {
   @Shadow
   private Minecraft field_147299_f;

   @Inject(
      method = {"handleJoinGame"},
      at = {@At("TAIL")}
   )
   public void lh(S01PacketJoinGame var1, CallbackInfo var2) {
      ((FeatherSourceFile725)FeatherSourceFile725.ar.sx()).on(this.field_147299_f.field_71439_g, (NetHandlerPlayClient)this);
   }
}
