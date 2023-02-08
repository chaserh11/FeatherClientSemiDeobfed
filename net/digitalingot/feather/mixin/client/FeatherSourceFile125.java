package net.digitalingot.feather.mixin.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({RendererLivingEntity.class})
public abstract class FeatherSourceFile125 extends Render {
   protected FeatherSourceFile125(RenderManager var1) {
      super(var1);
   }

   @ModifyArg(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
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
