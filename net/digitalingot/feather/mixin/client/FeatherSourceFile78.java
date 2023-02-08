package net.digitalingot.feather.mixin.client;

import net.minecraft.client.LoadingScreenRenderer;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({Minecraft.class})
public class FeatherSourceFile78 {
   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/LoadingScreenRenderer;resetProgressAndMessage(Ljava/lang/String;)V"
)
   )
   public void lh(LoadingScreenRenderer var1, String var2) {
   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/LoadingScreenRenderer;displayLoadingString(Ljava/lang/String;)V"
)
   )
   public void nc(LoadingScreenRenderer var1, String var2) {
   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/lang/System;gc()V",
   remap = false
)
   )
   public void Ay() {
   }
}
