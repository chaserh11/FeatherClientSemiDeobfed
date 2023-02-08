package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({Chunk.class})
public class FeatherSourceFile20 {
   @Redirect(
      method = {"enqueueRelightChecks"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumFacing;values()[Lnet/minecraft/util/EnumFacing;"
)
   )
   private EnumFacing[] Aw() {
      return FeatherSourceFile327.RZ;
   }
}
