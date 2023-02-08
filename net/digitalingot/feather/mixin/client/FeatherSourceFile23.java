package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh15;
import net.digitalingot.feather.FeatherSourceFile$nc4;
import net.digitalingot.feather.FeatherSourceFile233;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile841;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiPlayerTabOverlay.class})
public abstract class FeatherSourceFile23 extends Gui {
   @Unique
   private static final FeatherSourceFile465 VZ = FeatherSourceFile665.nc(FeatherSourceFile233.class);

   @Inject(
      method = {"drawPing"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void lh(int var1, int var2, int var3, NetworkPlayerInfo var4, CallbackInfo var5) {
      FeatherSourceFile233 var6 = (FeatherSourceFile233)VZ.ag();
      if (var6 != null && var6.uj()) {
         FeatherSourceFile$nc4 var7 = (FeatherSourceFile$nc4)var6.pr();
         if (var7.DK) {
            var5.cancel();
            int var8 = var4.func_178853_c();
            if (var8 != 0) {
               String var9 = String.valueOf(var8);
               int var10 = (int)((float)(var2 + var1 - 14) / 0.6F);
               int var11 = (int)((float)var3 / 0.6F) + 1;
               int var12;
               if (var7.DL) {
                  var12 = ((FeatherSourceFile$lh15)var6.vb()).xe(var8);
               } else {
                  var12 = var7.DM.getRGB();
               }

               GlStateManager.func_179094_E();
               GL11.glTranslatef(0.0F, 1.0F, 0.0F);
               GL11.glScalef(0.6F, 0.6F, 0.6F);
               FeatherSourceFile841.vK().lh(var9, (float)var10, (float)var11, var12, true, false);
               GlStateManager.func_179121_F();
            }
         }
      }
   }
}
