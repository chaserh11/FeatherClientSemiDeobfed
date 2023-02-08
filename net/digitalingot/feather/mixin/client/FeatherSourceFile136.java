package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh2;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiContainerCreative.class})
public abstract class FeatherSourceFile136 extends InventoryEffectRenderer {
   public FeatherSourceFile136(Container var1) {
      super(var1);
   }

   @Inject(
      method = {"renderToolTip"},
      at = {@At("HEAD")}
   )
   private void lh(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      FeatherSourceFile$lh2.le = var1;
   }

   @Inject(
      method = {"renderToolTip"},
      at = {@At("TAIL")}
   )
   private void nc(ItemStack var1, int var2, int var3, CallbackInfo var4) {
      FeatherSourceFile$lh2.le = null;
   }
}
