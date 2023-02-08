package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh$nc4;
import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ChunkRenderDispatcher.class})
public class FeatherSourceFile93 {
   @Unique
   private static final FeatherSourceFile465 WT = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);

   @Inject(
      method = {"getNextChunkUpdate"},
      at = {@At("HEAD")}
   )
   private void si(CallbackInfoReturnable var1) {
      net.digitalingot.feather.FeatherSourceFile125 var2 = (net.digitalingot.feather.FeatherSourceFile125)WT.ag();
      if (var2 != null && var2.ou() && ((FeatherSourceFile$lh52)var2.pr()).oY != FeatherSourceFile$lh$nc4.OFF) {
         Thread.sleep((long)((FeatherSourceFile$lh52)var2.pr()).oY.getValue());
      }

   }
}
