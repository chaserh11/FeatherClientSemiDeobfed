package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh133;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile486;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.gui.inventory.GuiContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiContainer.class})
public class FeatherSourceFile80 {
   @Unique
   private static final FeatherSourceFile465 VD = FeatherSourceFile665.nc(FeatherSourceFile486.class);

   @Redirect(
      method = {"keyTyped"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/inventory/GuiContainer;isCtrlKeyDown()Z"
)
   )
   public boolean At() {
      FeatherSourceFile486 var1 = (FeatherSourceFile486)VD.ag();
      return var1 == null ? false : ((FeatherSourceFile$lh133)var1.pr()).uE.eb();
   }
}
