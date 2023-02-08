package net.digitalingot.feather.mixin.client;

import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({Chunk.class})
public class FeatherSourceFile91 {
   @ModifyArg(
      method = {"setBlockState"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/chunk/Chunk;relightBlock(III)V",
   ordinal = 0
),
      index = 1
   )
   private int tq(int var1) {
      return var1 - 1;
   }
}
