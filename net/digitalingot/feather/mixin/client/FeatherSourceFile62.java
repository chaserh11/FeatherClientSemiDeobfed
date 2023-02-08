package net.digitalingot.feather.mixin.client;

import io.netty.channel.ChannelHandlerContext;
import net.digitalingot.feather.FeatherSourceFile725;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetworkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetworkManager.class})
public abstract class FeatherSourceFile62 {
   @Shadow
   private INetHandler field_150744_m;

   @Inject(
      method = {"channelInactive"},
      at = {@At("HEAD")}
   )
   private void lh(ChannelHandlerContext var1, CallbackInfo var2) {
      if (this.field_150744_m instanceof NetHandlerPlayClient) {
         ((FeatherSourceFile725)FeatherSourceFile725.wi.sx()).on(Minecraft.func_71410_x().field_71439_g, (NetHandlerPlayClient)this.field_150744_m);
      }

   }
}
