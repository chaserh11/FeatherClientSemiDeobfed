package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh$lh5;
import net.digitalingot.feather.FeatherSourceFile$lh73;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile762;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public class FeatherSourceFile126 {
   @Unique
   private static final FeatherSourceFile465 WB = FeatherSourceFile665.nc(FeatherSourceFile762.class);
   @Shadow
   private Minecraft field_78531_r;
   @Shadow
   @Final
   private int[] field_78504_Q;
   @Shadow
   @Final
   private DynamicTexture field_78513_d;
   @Shadow
   private boolean field_78536_aa;

   @Inject(
      method = {"updateLightmap"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/profiler/Profiler;startSection(Ljava/lang/String;)V",
   shift = Shift.BEFORE,
   ordinal = 0
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void rp(CallbackInfo var1) {
      if (this.field_78531_r.field_71441_e != null) {
         FeatherSourceFile$lh73 var2 = (FeatherSourceFile$lh73)((FeatherSourceFile762)WB.ag()).pr();
         if (var2.enabled && var2.kT != FeatherSourceFile$lh$lh5.NORMAL) {
            var1.cancel();
            int var3 = (int)(255.0 * (var2.kT == FeatherSourceFile$lh$lh5.CUSTOMBRIGHTNESS ? (var2.kU + 5.0) / 105.0 : 1.0));
            int var4 = var3 + (var3 << 8) + (var3 << 16) + -16777216;

            for(int var5 = 0; var5 < 256; ++var5) {
               this.field_78504_Q[var5] = var4;
            }

            this.field_78513_d.func_110564_a();
            this.field_78536_aa = false;
         }
      }
   }
}
