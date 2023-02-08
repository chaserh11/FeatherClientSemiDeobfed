package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile385;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiLanguage.class})
public abstract class FeatherSourceFile73 extends GuiScreen {
   @Shadow
   public abstract void func_73866_w_();

   @Inject(
      method = {"actionPerformed"},
      slice = {@Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/settings/GameSettings;setOptionValue(Lnet/minecraft/client/settings/GameSettings$Options;I)V"
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiLanguage;setWorldAndResolution(Lnet/minecraft/client/Minecraft;II)V"
)
)},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/settings/GameSettings;setOptionValue(Lnet/minecraft/client/settings/GameSettings$Options;I)V",
   shift = Shift.AFTER
)}
   )
   private void xj(GuiButton var1, CallbackInfo var2) {
      FeatherSourceFile385.SQ.uq();
   }

   public void func_146281_b() {
      Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146245_b();
   }
}
