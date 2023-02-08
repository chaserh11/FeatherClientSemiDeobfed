package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile321;
import net.minecraft.client.renderer.entity.Render;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({Render.class})
public abstract class FeatherSourceFile26 implements FeatherSourceFile321 {
   @ModifyArg(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"
),
      index = 1
   )
   private int qk(int var1) {
      if (this.feather$getRenderArguments() != null) {
         var1 += this.feather$getRenderArguments().kt();
      }

      return var1;
   }
}
