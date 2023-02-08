package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile287;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EntityPlayer.class})
public class FeatherSourceFile36 {
   @Unique
   private static final FeatherSourceFile465 WQ = FeatherSourceFile665.nc(FeatherSourceFile287.class);

   @Redirect(
      method = {"moveEntityWithHeading"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/player/PlayerCapabilities;getFlySpeed()F"
)
   )
   public float lh(PlayerCapabilities var1) {
      FeatherSourceFile287 var2 = (FeatherSourceFile287)WQ.ag();
      float var3 = var1.func_75093_a();
      if (var2.uj() && var2.cK()) {
         var3 *= (float)var2.cL();
      }

      return var3;
   }

   @ModifyVariable(
      method = {"moveEntityWithHeading"},
      at = @At("STORE"),
      index = 5
   )
   private double wz(double var1) {
      FeatherSourceFile287 var3 = (FeatherSourceFile287)WQ.ag();
      if (var3.uj() && var3.cK()) {
         if (var1 < 0.0) {
            var1 = Math.min(var1, var1 * (double)var3.cL() * 0.2);
         } else {
            var1 = Math.max(var1, var1 * (double)var3.cL() * 0.2);
         }
      }

      return var1;
   }
}
