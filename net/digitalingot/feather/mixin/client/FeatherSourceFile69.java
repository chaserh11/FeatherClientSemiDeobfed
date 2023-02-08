package net.digitalingot.feather.mixin.client;

import java.nio.FloatBuffer;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RendererLivingEntity.class})
public abstract class FeatherSourceFile69 extends Render {
   @Unique
   private static final FeatherSourceFile465 WD = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile73.class);
   @Shadow
   protected FloatBuffer field_177095_g;

   protected FeatherSourceFile69(RenderManager var1) {
      super(var1);
   }

   @Inject(
      method = {"setBrightness(Lnet/minecraft/entity/EntityLivingBase;FZ)Z"},
      at = {@At(
   value = "INVOKE",
   target = "Ljava/nio/FloatBuffer;put(F)Ljava/nio/FloatBuffer;",
   remap = false,
   ordinal = 3,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void lh(EntityLivingBase var1, float var2, boolean var3, CallbackInfoReturnable var4) {
      net.digitalingot.feather.FeatherSourceFile73 var5 = (net.digitalingot.feather.FeatherSourceFile73)WD.ag();
      if (var5.uj()) {
         this.field_177095_g.position(0);
         var5.lh(this.field_177095_g);
      }

   }
}
