package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh135;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile522;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BlockRendererDispatcher.class})
public class FeatherSourceFile123 {
   @Unique
   private static final FeatherSourceFile465 VI = FeatherSourceFile665.nc(FeatherSourceFile522.class);

   @Inject(
      method = {"renderBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(IBlockState var1, BlockPos var2, IBlockAccess var3, WorldRenderer var4, CallbackInfoReturnable var5) {
      if (((FeatherSourceFile$lh135)((FeatherSourceFile522)VI.ag()).pr()).mD && (var1.func_177230_c() instanceof BlockGlass || var1.func_177230_c() instanceof BlockStainedGlass)) {
         var5.setReturnValue(false);
      }

   }
}
