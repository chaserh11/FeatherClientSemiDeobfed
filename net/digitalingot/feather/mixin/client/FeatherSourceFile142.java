package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh110;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile682;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({GuiIngame.class})
public class FeatherSourceFile142 {
   private static final FeatherSourceFile465 Wa = FeatherSourceFile665.nc(FeatherSourceFile682.class);

   @Inject(
      method = {"showCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void oe(CallbackInfoReturnable var1) {
      if (((FeatherSourceFile682)Wa.ag()).uj() && ((FeatherSourceFile$lh110)((FeatherSourceFile682)Wa.ag()).pr()).yA) {
         Minecraft var2 = Minecraft.func_71410_x();
         if (var2.field_71474_y.field_74320_O != 0) {
            var1.setReturnValue(false);
            var1.cancel();
         }
      }

   }
}
