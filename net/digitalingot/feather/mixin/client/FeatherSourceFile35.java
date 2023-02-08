package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile641;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile798;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RenderManager.class})
public abstract class FeatherSourceFile35 {
   @Unique
   private static final FeatherSourceFile465 Wk = FeatherSourceFile665.nc(FeatherSourceFile641.class);
   @Shadow
   private boolean field_85095_o;

   @Inject(
      method = {"doRenderEntity"},
      at = {@At("HEAD")},
      require = 1,
      allow = 1
   )
   private void lh(Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10, CallbackInfoReturnable var11) {
      ((FeatherSourceFile798)FeatherSourceFile798.vi.sx()).render(var1, var2, var4, var6);
   }

   @Inject(
      method = {"doRenderEntity"},
      at = {@At(
   value = "FIELD",
   opcode = 180,
   target = "Lnet/minecraft/client/renderer/entity/RenderManager;debugBoundingBox:Z",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void nc(Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10, CallbackInfoReturnable var11) {
      ((FeatherSourceFile798)FeatherSourceFile798.je.sx()).render(var1, var2, var4, var6);
   }

   @Redirect(
      method = {"doRenderEntity"},
      at = @At(
   value = "FIELD",
   opcode = 180,
   target = "Lnet/minecraft/client/renderer/entity/RenderManager;debugBoundingBox:Z",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private boolean nc(RenderManager var1) {
      return !((FeatherSourceFile641)Wk.ag()).uj() && this.field_85095_o;
   }
}
