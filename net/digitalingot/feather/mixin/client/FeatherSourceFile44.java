package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh2;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreen.class})
public abstract class FeatherSourceFile44 extends Gui implements GuiYesNoCallback {
   @Inject(
      method = {"renderToolTip"},
      at = {@At("HEAD")},
      require = 1,
      allow = 1
   )
   private void lh(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      FeatherSourceFile$lh2.le = var1;
   }

   @Inject(
      method = {"renderToolTip"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void nc(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      FeatherSourceFile$lh2.le = null;
   }
}
