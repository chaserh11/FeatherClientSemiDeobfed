package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile759;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {ForgeHooksClient.class},
   remap = false
)
public class FeatherSourceFile113 {
   @Inject(
      method = {"postMouseEvent"},
      at = {@At("HEAD")}
   )
   private static void xj(CallbackInfoReturnable var0) {
      FeatherSourceFile759.qy((double)Mouse.getEventDX(), (double)(-Mouse.getEventDY()));
   }
}
