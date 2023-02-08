package net.digitalingot.feather.mixin.client;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.RegionRenderCache;
import net.minecraft.util.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({RegionRenderCache.class})
public abstract class FeatherSourceFile157 extends ChunkCache {
   @Shadow
   @Final
   private static IBlockState field_175632_f;
   @Shadow
   private IBlockState[] field_175635_i;

   public FeatherSourceFile157(World var1, BlockPos var2, BlockPos var3, int var4) {
      super(var1, var2, var3, var4);
      throw new AssertionError();
   }

   @Inject(
      method = {"getBlockState"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/client/renderer/RegionRenderCache;blockStates:[Lnet/minecraft/block/state/IBlockState;",
   ordinal = 0
)},
      locals = LocalCapture.CAPTURE_FAILSOFT,
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void lh(BlockPos var1, CallbackInfoReturnable var2, int var3) {
      if (var3 < 0 || var3 >= this.field_175635_i.length) {
         var2.setReturnValue(field_175632_f);
      }

   }
}
