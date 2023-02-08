package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile768;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderGlobal.class})
public abstract class FeatherSourceFile92 {
   @Unique
   private static final FeatherSourceFile465 VS = FeatherSourceFile665.nc(FeatherSourceFile768.class);
   @Shadow
   @Final
   private RenderManager field_175010_j;

   @Inject(
      method = {"renderEntities"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderManager;cacheActiveRenderInfo(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
   ordinal = 0,
   shift = Shift.AFTER
)}
   )
   private void mr(CallbackInfo var1) {
      FeatherSourceFile768 var2 = (FeatherSourceFile768)VS.ag();
      if (var2.uj() && var2.cy()) {
         this.field_175010_j.field_78732_j = var2.ld();
         this.field_175010_j.field_78735_i = var2.fi();
      }

   }
}
