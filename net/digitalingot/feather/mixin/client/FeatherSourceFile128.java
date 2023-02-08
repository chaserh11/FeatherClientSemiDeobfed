package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile349;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public class FeatherSourceFile128 {
   @Inject(
      method = {"startGame"},
      at = {@At("TAIL")}
   )
   private void yl(CallbackInfo var1) {
      ((IReloadableResourceManager)Minecraft.func_71410_x().func_110442_L()).func_110542_a(new FeatherSourceFile349());
   }
}
