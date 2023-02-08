package net.digitalingot.feather.mixin.client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiContainer.class})
public abstract class FeatherSourceFile15 extends GuiScreen {
   @Shadow
   protected abstract boolean func_146983_a(int var1);

   @Inject(
      method = {"mouseClicked"},
      at = {@At("TAIL")}
   )
   private void nc(int var1, int var2, int var3, CallbackInfo var4) {
      this.func_146983_a(var3 - 100);
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void xj(int var1, int var2, int var3, CallbackInfo var4) {
      if (var3 - 100 == this.field_146297_k.field_71474_y.field_151445_Q.func_151463_i()) {
         this.field_146297_k.field_71439_g.func_71053_j();
         var4.cancel();
      }

   }
}
