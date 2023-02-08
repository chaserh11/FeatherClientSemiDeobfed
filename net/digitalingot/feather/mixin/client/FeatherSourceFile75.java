package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh135;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile522;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ItemRenderer.class})
public class FeatherSourceFile75 {
   private static final FeatherSourceFile465 VI = FeatherSourceFile665.nc(FeatherSourceFile522.class);

   @Inject(
      method = {"renderFireInFirstPerson"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V"
)}
   )
   private void gr(CallbackInfo var1) {
      GlStateManager.func_179137_b(0.0, -0.4000000059604645 * (1.0 - ((FeatherSourceFile$lh135)((FeatherSourceFile522)VI.ag()).pr()).mC), 0.0);
   }
}
