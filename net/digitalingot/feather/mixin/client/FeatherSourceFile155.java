package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({VisGraph.class})
public class FeatherSourceFile155 {
   @Redirect(
      method = {"func_178604_a"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/EnumFacing;values()[Lnet/minecraft/util/EnumFacing;"
)
   )
   private EnumFacing[] Aw() {
      return FeatherSourceFile327.RZ;
   }
}
