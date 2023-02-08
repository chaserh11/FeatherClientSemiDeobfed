package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile487;
import net.digitalingot.feather.FeatherSourceFile541;
import net.digitalingot.feather.FeatherSourceFile788;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngameMenu.class})
public class FeatherSourceFile12 {
   @Inject(
      method = {"actionPerformed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void nc(GuiButton var1, CallbackInfo var2) {
      if (var1.field_146127_k == 99) {
         var2.cancel();
         Minecraft.func_71410_x().func_147108_a(new GuiMultiplayer((GuiScreen)this));
      } else if (var1.field_146127_k == 100) {
         var2.cancel();
         FeatherSourceFile788.xo();
      } else if (var1.field_146127_k == 101) {
         var2.cancel();
         FeatherSourceFile541 var3 = (FeatherSourceFile541)FeatherSourceFile487.mq().getInstance(FeatherSourceFile541.class);
         var3.A();
      }

   }
}
