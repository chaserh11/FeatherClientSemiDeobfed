package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public abstract class FeatherSourceFile65 {
   @Inject(
      method = {"resize"},
      at = {@At("HEAD")},
      require = 1,
      allow = 1
   )
   private void lh(int var1, int var2, CallbackInfo var3) {
      ((net.digitalingot.feather.FeatherSourceFile48)net.digitalingot.feather.FeatherSourceFile48.ws.sx()).resize(var1, var2);
   }
}
