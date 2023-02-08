package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile385;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   targets = {"net.minecraft.client.gui.GuiLanguage$List"}
)
public class FeatherSourceFile$lh {
   @Redirect(
      method = {"elementClicked"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/Minecraft;refreshResources()V"
)
   )
   private void ux(Minecraft var1) {
      Minecraft.func_71410_x().func_135016_M().func_110549_a(Minecraft.func_71410_x().func_110442_L());
      FeatherSourceFile385.SQ.uq();
   }

   @Inject(
      method = {"elementClicked"},
      at = {@At("TAIL")}
   )
   private void lh(int var1, boolean var2, int var3, int var4, CallbackInfo var5) {
      Minecraft.func_71410_x().func_71370_a(Display.getWidth(), Display.getHeight());
   }
}
