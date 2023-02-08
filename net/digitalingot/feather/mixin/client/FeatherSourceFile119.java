package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.util.EnumWorldBlockLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({ListedRenderChunk.class})
public class FeatherSourceFile119 {
   @Redirect(
      method = {"deleteGlResources"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumWorldBlockLayer;values()[Lnet/minecraft/util/EnumWorldBlockLayer;"
)
   )
   private EnumWorldBlockLayer[] Av() {
      return FeatherSourceFile327.Sa;
   }
}
