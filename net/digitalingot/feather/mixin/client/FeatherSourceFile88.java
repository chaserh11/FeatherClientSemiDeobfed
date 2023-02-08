package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh111;
import net.digitalingot.feather.FeatherSourceFile347;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Pseudo
@Mixin(
   targets = {"club.sk1er.patcher.hooks.NameTagRenderingHooks"}
)
public class FeatherSourceFile88 {
   @ModifyArg(
      method = {"drawNametagText"},
      at = @At(
   value = "INVOKE",
   target = "Lclub/sk1er/patcher/mixins/accessors/FontRendererAccessor;invokeRenderString(Ljava/lang/String;FFIZ)I",
   remap = false
),
      index = 1,
      remap = false
   )
   @Dynamic("patcher")
   private static float mm(float var0) {
      FeatherSourceFile$lh111 var1 = FeatherSourceFile347.arguments;
      if (var1 != null && FeatherSourceFile347.SH) {
         var0 += (float)var1.kt();
      }

      return var0;
   }
}
