package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh47;
import net.digitalingot.feather.FeatherSourceFile462;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.entity.player.InventoryPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InventoryPlayer.class})
public class FeatherSourceFile100 {
   @Unique
   private static final FeatherSourceFile465 WS = FeatherSourceFile665.nc(FeatherSourceFile462.class);

   @Inject(
      method = {"changeCurrentItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void nc(int var1, CallbackInfo var2) {
      FeatherSourceFile462 var3 = (FeatherSourceFile462)WS.ag();
      if (var3.uj() && var3.fb() && ((FeatherSourceFile$lh47)var3.pr()).qV) {
         var2.cancel();
      }

   }
}
