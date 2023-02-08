package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerControllerMP.class})
public abstract class FeatherSourceFile120 {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   @Inject(
      method = {"getIsHittingBlock()Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void ou(CallbackInfoReturnable var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      if (var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).jS) {
         var1.setReturnValue(false);
      }

   }
}
