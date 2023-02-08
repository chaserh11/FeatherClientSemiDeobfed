package net.digitalingot.feather.mixin.client;

import net.minecraftforge.fml.common.FMLCommonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {FMLCommonHandler.class},
   priority = 1000000
)
public class FeatherSourceFile138 {
   @Inject(
      method = {"getModName"},
      at = {@At("HEAD")},
      remap = false,
      cancellable = true
   )
   private void pq(CallbackInfoReturnable var1) {
      var1.setReturnValue("Feather Forge");
   }
}
