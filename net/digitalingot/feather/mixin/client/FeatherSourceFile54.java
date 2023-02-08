package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh111;
import net.digitalingot.feather.FeatherSourceFile321;
import net.digitalingot.feather.FeatherSourceFile347;
import net.digitalingot.feather.FeatherSourceFile843;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(
   value = {RendererLivingEntity.class},
   priority = 999
)
public abstract class FeatherSourceFile54 extends Render implements FeatherSourceFile321 {
   protected FeatherSourceFile54(RenderManager var1) {
      super(var1);
   }

   @Shadow
   protected abstract boolean func_177070_b(EntityLivingBase var1);

   @ModifyVariable(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      ordinal = 0,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/Tessellator;getInstance()Lnet/minecraft/client/renderer/Tessellator;",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int hc(int var1) {
      return this.feather$setRenderPosX(var1);
   }

   @Inject(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/Tessellator;getInstance()Lnet/minecraft/client/renderer/Tessellator;",
   ordinal = 0
)},
      locals = LocalCapture.CAPTURE_FAILHARD,
      require = 1,
      allow = 1
   )
   private void lh(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      if (var1 instanceof AbstractClientPlayer) {
         this.feather$setRenderArguments(new FeatherSourceFile$lh111(this.feather$getRenderPosX(), this.feather$getRenderPosY()));
         ((net.digitalingot.feather.FeatherSourceFile159)net.digitalingot.feather.FeatherSourceFile159.vi.sx()).render(var1, this.feather$getRenderArguments());
      }

   }

   @ModifyVariable(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      ordinal = 0,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/Tessellator;getInstance()Lnet/minecraft/client/renderer/Tessellator;",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int bj(int var1) {
      if (this.feather$getRenderArguments() != null) {
         var1 = this.feather$getRenderArguments().qf();
      }

      return var1;
   }

   @Inject(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;enableTexture2D()V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void nc(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      if (var1 instanceof AbstractClientPlayer && var1.func_145748_c_().func_150254_d().equals(var1.func_145748_c_().func_150254_d())) {
         ((net.digitalingot.feather.FeatherSourceFile159)net.digitalingot.feather.FeatherSourceFile159.ya.sx()).render(var1, this.feather$getRenderArguments());
         FeatherSourceFile843.hI();
      }

   }

   @ModifyArg(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"
),
      index = 1
   )
   private int qk(int var1) {
      if (this.feather$getRenderArguments() != null) {
         var1 += this.feather$getRenderArguments().kt();
         FeatherSourceFile347.SH = false;
      }

      return var1;
   }

   @Inject(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void xj(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      if (this.feather$getRenderArguments() != null) {
         GlStateManager.func_179109_b(0.0F, (float)this.feather$getRenderArguments().mi(), 0.0F);
      }

   }

   @Inject(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;popMatrix()V"
)},
      require = 1,
      allow = 1
   )
   private void oe(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      this.feather$setRenderArguments((FeatherSourceFile$lh111)null);
      FeatherSourceFile347.SH = true;
   }
}
