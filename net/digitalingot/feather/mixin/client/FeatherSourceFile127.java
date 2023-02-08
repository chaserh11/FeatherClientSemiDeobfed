package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({GuiIngame.class})
public abstract class FeatherSourceFile127 extends Gui {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   @ModifyConstant(
      method = {"showCrosshair()Z"},
      constant = {@Constant(
   intValue = 0,
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private int qs(int var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      return var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).kD ? 1 : var1;
   }
}
