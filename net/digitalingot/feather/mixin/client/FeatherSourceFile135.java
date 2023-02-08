package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public abstract class FeatherSourceFile135 {
   @Shadow
   private boolean field_71431_Q;

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lorg/lwjgl/opengl/Display;setVSyncEnabled(Z)V",
   shift = Shift.BEFORE,
   remap = false
)},
      require = 1,
      allow = 1
   )
   private void qr(CallbackInfo var1) {
      if (!this.field_71431_Q) {
         Display.setResizable(false);
         Display.setResizable(true);
      }

   }
}
