package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh111;
import net.digitalingot.feather.FeatherSourceFile321;
import net.digitalingot.feather.FeatherSourceFile347;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(
   value = {Render.class},
   priority = 999
)
public abstract class FeatherSourceFile52 implements FeatherSourceFile321 {
   @Unique
   private int Wl;
   @Unique
   private int Wm;
   @Unique
   private boolean Wn;
   @Unique
   private FeatherSourceFile$lh111 arguments;

   @Inject(
      method = {"renderOffsetLivingLabel"},
      at = {@At("HEAD")}
   )
   private void lh(Entity var1, double var2, double var4, double var6, String var8, float var9, double var10, CallbackInfo var12) {
      this.Wn = true;
   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 2,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int hc(int var1) {
      return this.Wl = var1;
   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 1,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int qd(int var1) {
      return this.Wm = var1;
   }

   @Inject(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
)},
      locals = LocalCapture.CAPTURE_FAILHARD,
      require = 1,
      allow = 1
   )
   private void lh(Entity var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      if (var1 instanceof AbstractClientPlayer && this.Wn) {
         this.arguments = FeatherSourceFile347.arguments = new FeatherSourceFile$lh111(this.Wl, this.Wm);
         ((net.digitalingot.feather.FeatherSourceFile159)net.digitalingot.feather.FeatherSourceFile159.vi.sx()).render(var1, this.arguments);
      }

   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 1,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int ot(int var1) {
      return this.arguments != null ? this.arguments.mi() : var1;
   }

   @ModifyVariable(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      ordinal = 2,
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableTexture2D()V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private int bj(int var1) {
      if (this.arguments != null) {
         var1 = this.arguments.qf();
      }

      return var1;
   }

   @Inject(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;enableTexture2D()V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void nc(Entity var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      if (var1 instanceof AbstractClientPlayer && this.Wn) {
         ((net.digitalingot.feather.FeatherSourceFile159)net.digitalingot.feather.FeatherSourceFile159.ya.sx()).render(var1, this.arguments);
      }

   }

   @Inject(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;popMatrix()V"
)},
      require = 1,
      allow = 1
   )
   private void xj(Entity var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      FeatherSourceFile347.arguments = null;
      this.arguments = null;
      this.Wn = false;
      FeatherSourceFile347.SH = true;
   }

   public int feather$getRenderPosX() {
      return this.Wl;
   }

   public int feather$getRenderPosY() {
      return this.Wm;
   }

   public FeatherSourceFile$lh111 feather$getRenderArguments() {
      return this.arguments;
   }

   public int feather$setRenderPosX(int var1) {
      return this.Wl = var1;
   }

   public int feather$setRenderPosY(int var1) {
      return this.Wm = var1;
   }

   public void feather$setRenderArguments(FeatherSourceFile$lh111 var1) {
      FeatherSourceFile347.arguments = var1;
      this.arguments = var1;
   }
}
