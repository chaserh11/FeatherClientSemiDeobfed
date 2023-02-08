package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile181;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({NetHandlerPlayClient.class})
public class FeatherSourceFile107 {
   private static final byte Wj = 2;

   @Redirect(
      method = {"handleEntityStatus"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/Entity;handleStatusUpdate(B)V"
),
      require = 1,
      allow = 1
   )
   private void lh(Entity var1, byte var2) {
      if (var2 == 2) {
         ((FeatherSourceFile181)FeatherSourceFile181.ws.sx()).hurt((EntityLivingBase)var1);
      }

      var1.func_70103_a(var2);
   }
}
