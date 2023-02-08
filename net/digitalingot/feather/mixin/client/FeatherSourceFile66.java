package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh$xj3;
import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile802;
import net.digitalingot.feather.FeatherSourceFile804;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({World.class})
public abstract class FeatherSourceFile66 {
   @Unique
   private static final FeatherSourceFile465 PERFORMANCE = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);

   @Shadow
   public abstract World func_175643_b();

   @Redirect(
      method = {"updateEntities", "updateEntityWithOptionalForce"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/Entity;onUpdate()V"
)
   )
   private void si(Entity var1) {
      FeatherSourceFile804 var2 = (FeatherSourceFile804)var1;
      if (var2.isCulled() && ((FeatherSourceFile$lh52)((net.digitalingot.feather.FeatherSourceFile125)PERFORMANCE.ag()).pr()).pC == FeatherSourceFile$lh$xj3.BASIC) {
         ++FeatherSourceFile802.Qn;
      } else {
         var1.func_70071_h_();
      }

   }
}
