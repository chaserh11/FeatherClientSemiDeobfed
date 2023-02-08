package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh133;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile486;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.block.BlockPortal;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({BlockPortal.class})
public class FeatherSourceFile58 {
   @Unique
   private static final FeatherSourceFile465 VD = FeatherSourceFile665.nc(FeatherSourceFile486.class);

   @Redirect(
      method = {"randomDisplayTick"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/World;playSound(DDDLjava/lang/String;FFZ)V"
)
   )
   public void lh(World var1, double var2, double var4, double var6, String var8, float var9, float var10, boolean var11) {
      if (((FeatherSourceFile$lh133)((FeatherSourceFile486)VD.ag()).pr()).uC) {
         var1.func_72980_b(var2, var4, var6, var8, var9, var10, var11);
      }

   }
}
