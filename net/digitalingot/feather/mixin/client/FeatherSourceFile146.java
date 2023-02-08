package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile487;
import net.digitalingot.feather.FeatherSourceFile568;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiMainMenu.class})
public class FeatherSourceFile146 {
   @Inject(
      method = {"actionPerformed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void lh(GuiButton var1, CallbackInfo var2) {
      if (var1.field_146127_k == 100) {
         var2.cancel();
         ((FeatherSourceFile568)FeatherSourceFile487.mq().getInstance(FeatherSourceFile568.class)).E();
      }

   }
}
