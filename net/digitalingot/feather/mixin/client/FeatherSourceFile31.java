package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile820;
import net.minecraft.client.renderer.OpenGlHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({OpenGlHelper.class})
public class FeatherSourceFile31 {
   @Shadow
   public static boolean field_176083_O;
   @Shadow
   private static boolean field_176090_Y;

   @Inject(
      method = {"initializeTextures"},
      at = {@At("TAIL")}
   )
   private static void ai(CallbackInfo var0) {
      FeatherSourceFile820.PY = field_176083_O;
      FeatherSourceFile820.PX = field_176090_Y;
   }
}
