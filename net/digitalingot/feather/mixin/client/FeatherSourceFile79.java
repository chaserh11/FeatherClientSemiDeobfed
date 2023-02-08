package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile462;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public class FeatherSourceFile79 {
   @Shadow
   private double field_78503_V;

   @Inject(
      method = {"renderWorldPass"},
      at = {@At(
   value = "INVOKE",
   target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"
)}
   )
   private void lh(int var1, float var2, long var3, CallbackInfo var5) {
      this.field_78503_V = (double)FeatherSourceFile462.qN;
      if (this.field_78503_V != 1.0) {
         GlStateManager.func_179139_a(this.field_78503_V, this.field_78503_V, 1.0);
      }

   }

   @Inject(
      method = {"renderHand"},
      at = {@At(
   value = "INVOKE",
   target = "Lorg/lwjgl/util/glu/Project;gluPerspective(FFFF)V"
)}
   )
   private void lh(float var1, int var2, CallbackInfo var3) {
      this.field_78503_V = (double)FeatherSourceFile462.qN;
      if (this.field_78503_V != 1.0) {
         GlStateManager.func_179139_a(this.field_78503_V, this.field_78503_V, 1.0);
      }

   }
}
