package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.particle.EntityFX;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EntityFX.class})
public abstract class FeatherSourceFile152 {
   @Unique
   private static final FeatherSourceFile465 WT = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);

   @Redirect(
      method = {"renderParticle"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/particle/EntityFX;getBrightnessForRender(F)I"
)
   )
   private int lh(EntityFX var1, float var2) {
      return ((FeatherSourceFile$lh52)((net.digitalingot.feather.FeatherSourceFile125)WT.ag()).pr()).oX ? 15728880 : var1.func_70070_b(var2);
   }
}
