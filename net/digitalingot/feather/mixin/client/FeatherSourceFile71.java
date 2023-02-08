package net.digitalingot.feather.mixin.client;

import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({RenderGlobal.class})
public class FeatherSourceFile71 {
   @Redirect(
      method = {"renderSky(Lnet/minecraft/client/renderer/WorldRenderer;FZ)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/renderer/RenderGlobal;renderDistance:I",
   opcode = 180,
   remap = false
)
   )
   private int lh(RenderGlobal var1) {
      return 256;
   }

   @Redirect(
      method = {"renderSky(FI)V"},
      slice = @Slice(
   from = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/settings/GameSettings;renderDistanceChunks:I"
)
),
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/renderer/RenderGlobal;vboEnabled:Z",
   ordinal = 0
)
   )
   private boolean nc(RenderGlobal var1) {
      return false;
   }
}
