package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh$lh12;
import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class FeatherSourceFile30 {
   private static final FeatherSourceFile465 VJ = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   @ModifyArg(
      method = {"hurtCameraEffect"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;rotate(FFFF)V"
),
      index = 0,
      require = 4
   )
   private float gy(float var1) {
      return (float)(((FeatherSourceFile$lh12)((FeatherSourceFile515)VJ.ag()).pr()).kG * (double)var1);
   }

   @Inject(
      method = {"hurtCameraEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void qy(CallbackInfo var1) {
      if (Am()) {
         var1.cancel();
      }

   }

   private static boolean Am() {
      FeatherSourceFile515 var0 = (FeatherSourceFile515)VJ.ag();
      if (!var0.uj()) {
         return false;
      } else {
         FeatherSourceFile$lh12 var1 = (FeatherSourceFile$lh12)var0.pr();
         if (var1.kF == FeatherSourceFile$lh$lh12.DEFAULT) {
            return false;
         } else {
            return var1.kF == FeatherSourceFile$lh$lh12.OFF || var1.kG == 0.0;
         }
      }
   }
}
