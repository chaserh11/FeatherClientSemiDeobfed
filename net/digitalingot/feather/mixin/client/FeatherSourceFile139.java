package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.client.renderer.chunk.ChunkRenderWorker;
import net.minecraft.util.EnumWorldBlockLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({ChunkRenderWorker.class})
public class FeatherSourceFile139 {
   @Redirect(
      method = {"processTask"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumWorldBlockLayer;values()[Lnet/minecraft/util/EnumWorldBlockLayer;"
)
   )
   private EnumWorldBlockLayer[] Av() {
      return FeatherSourceFile327.Sa;
   }
}
