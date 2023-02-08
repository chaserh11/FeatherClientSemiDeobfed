package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$nc20;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile570;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.GuiIngameForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngameForge.class})
public class FeatherSourceFile133 {
   @Unique
   private static final FeatherSourceFile465 Wc = FeatherSourceFile665.nc(FeatherSourceFile570.class);

   @Inject(
      method = {"renderTitle(IIF)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;enableBlend()V"
)}
   )
   public void xj(int var1, int var2, float var3, CallbackInfo var4) {
      FeatherSourceFile570 var5 = (FeatherSourceFile570)Wc.ag();
      if (var5.uj()) {
         FeatherSourceFile$nc20 var6 = (FeatherSourceFile$nc20)var5.pr();
         if (var6.yT.gF) {
            float var7 = (float)var6.yT.ee();
            GlStateManager.func_179109_b(-var6.EW, -var6.EX, 0.0F);
            GlStateManager.func_179152_a(var7, var7, 0.0F);
         }

      }
   }
}
