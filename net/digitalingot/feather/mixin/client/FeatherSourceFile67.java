package net.digitalingot.feather.mixin.client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({NetHandlerPlayClient.class})
public class FeatherSourceFile67 {
   @ModifyArg(
      method = {"handleJoinGame"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"
)
   )
   private GuiScreen mq(GuiScreen var1) {
      return null;
   }

   @ModifyArg(
      method = {"handleRespawn"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"
)
   )
   private GuiScreen mr(GuiScreen var1) {
      return null;
   }
}
