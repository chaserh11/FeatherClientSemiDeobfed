package net.digitalingot.feather.mixin.optifine;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(
   targets = {"Config"},
   remap = false,
   priority = 1001
)
public class FeatherSourceFile {
   @Inject(
      method = {"isFastRender()Z"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private static void disableFastRender(CallbackInfoReturnable var0) {
      var0.setReturnValue(false);
   }
}
