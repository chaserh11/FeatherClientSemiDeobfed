package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile239;
import net.digitalingot.feather.FeatherSourceFile311;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderPlayer.class})
public abstract class FeatherSourceFile90 extends RendererLivingEntity {
   @Inject(
      method = {"<init>(Lnet/minecraft/client/renderer/entity/RenderManager;Z)V"},
      at = {@At("RETURN")}
   )
   public void lh(RenderManager var1, boolean var2, CallbackInfo var3) {
      this.func_177094_a(new FeatherSourceFile239());
   }

   @Redirect(
      method = {"<init>*"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderPlayer;addLayer(Lnet/minecraft/client/renderer/entity/layers/LayerRenderer;)Z",
   ordinal = 4
)
   )
   private boolean lh(RenderPlayer var1, LayerRenderer var2) {
      if (var2 instanceof LayerCape) {
         this.func_177094_a(new net.digitalingot.feather.FeatherSourceFile5(var1));
         FeatherSourceFile311.Sb.info("[Cosmetics] Normal Feather Cape was created");
         return true;
      } else {
         FeatherSourceFile311.Sb.error("[Cosmetics] Normal Feather Cape was not created!!!");
         this.func_177094_a(var2);
         return true;
      }
   }

   public FeatherSourceFile90(RenderManager var1, ModelBase var2, float var3) {
      super(var1, var2, var3);
   }
}
