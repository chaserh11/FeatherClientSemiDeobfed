package net.digitalingot.feather.mixin.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({Render.class})
public abstract class FeatherSourceFile17 {
   @Shadow
   @Final
   protected RenderManager field_76990_c;

   @ModifyArg(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;rotate(FFFF)V",
   ordinal = 1
),
      index = 0
   )
   private float bh(float var1) {
      return this.field_76990_c.field_78733_k.field_74320_O == 2 ? -var1 : var1;
   }
}
