package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh135;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile522;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EntityRenderer.class})
public abstract class FeatherSourceFile95 {
   @Unique
   private static final FeatherSourceFile465 VI = FeatherSourceFile665.nc(FeatherSourceFile522.class);

   @Redirect(
      method = {"setupCameraTransform"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/settings/GameSettings;viewBobbing:Z",
   opcode = 180
)
   )
   private boolean lh(GameSettings var1) {
      return ((FeatherSourceFile$lh135)((FeatherSourceFile522)VI.ag()).pr()).mB ? false : var1.field_74336_f;
   }
}
