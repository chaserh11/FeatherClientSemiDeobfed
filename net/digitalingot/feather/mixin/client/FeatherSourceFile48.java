package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderFish;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({RenderFish.class})
public abstract class FeatherSourceFile48 extends Render {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   protected FeatherSourceFile48(RenderManager var1) {
      super(var1);
   }

   @ModifyArgs(
      method = {"doRender(Lnet/minecraft/entity/projectile/EntityFishHook;DDDFF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/Vec3;<init>(DDD)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void nc(Args var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      if (var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).jU) {
         var1.set(0, -0.5);
         var1.set(1, 0.03);
         var1.set(2, 0.8);
      }

   }
}
