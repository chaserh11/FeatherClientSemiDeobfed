package net.digitalingot.feather.mixin.client;

import java.awt.Color;
import net.digitalingot.feather.FeatherSourceFile$lh80;
import net.digitalingot.feather.FeatherSourceFile304;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Render.class})
public abstract class FeatherSourceFile56 {
   @Unique
   private static final FeatherSourceFile465 WJ = FeatherSourceFile665.nc(FeatherSourceFile304.class);

   @Inject(
      method = {"renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void oe(Entity var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      if (((FeatherSourceFile304)WJ.ag()).uj()) {
         if (!((FeatherSourceFile304)WJ.ag()).pi()) {
            var10.cancel();
         }

      }
   }

   @ModifyArgs(
      method = {"Lnet/minecraft/client/renderer/entity/Render;renderLivingLabel(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/WorldRenderer;color(FFFF)Lnet/minecraft/client/renderer/WorldRenderer;"
)
   )
   private void qy(Args var1) {
      if (((FeatherSourceFile304)WJ.ag()).uj()) {
         Color var2 = ((FeatherSourceFile$lh80)((FeatherSourceFile304)WJ.ag()).pr()).hH;
         var1.set(0, (float)var2.getRed() / 255.0F);
         var1.set(1, (float)var2.getGreen() / 255.0F);
         var1.set(2, (float)var2.getBlue() / 255.0F);
         var1.set(3, (float)var2.getAlpha() / 255.0F);
      }
   }
}
