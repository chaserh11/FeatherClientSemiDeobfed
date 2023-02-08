package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RenderChunk.class})
public class FeatherSourceFile11 {
   @Redirect(
      method = {"rebuildChunk"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumWorldBlockLayer;values()[Lnet/minecraft/util/EnumWorldBlockLayer;"
)
   )
   private EnumWorldBlockLayer[] Ax() {
      return FeatherSourceFile327.Sa;
   }

   @Redirect(
      method = {"setPosition"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumFacing;values()[Lnet/minecraft/util/EnumFacing;"
)
   )
   private EnumFacing[] Aw() {
      return FeatherSourceFile327.RZ;
   }
}
