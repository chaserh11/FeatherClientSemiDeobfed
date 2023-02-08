package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraftforge.client.GuiIngameForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;

@Mixin({GuiIngameForge.class})
public abstract class FeatherSourceFile3 extends GuiIngame {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);

   public FeatherSourceFile3(Minecraft var1) {
      super(var1);
   }

   @Redirect(
      method = {"renderHUDText(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawRect(IIIII)V"
),
      require = 2,
      allow = 2
   )
   private void qy(int var1, int var2, int var3, int var4, int var5) {
      FeatherSourceFile515 var6 = (FeatherSourceFile515)Ws.ag();
      if (!var6.uj() || !((FeatherSourceFile$lh12)var6.pr()).kD) {
         func_73734_a(var1, var2, var3, var4, var5);
      }

   }

   @Redirect(
      method = {"renderHUDText(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"
),
      require = 2,
      allow = 2
   )
   private int lh(FontRenderer var1, String var2, int var3, int var4, int var5) {
      FeatherSourceFile515 var6 = (FeatherSourceFile515)Ws.ag();
      boolean var7 = var6.uj() && ((FeatherSourceFile$lh12)var6.pr()).kD;
      return var1.func_175065_a(var2, (float)var3, (float)var4, var5, var7);
   }

   @Redirect(
      method = {"renderHealth(II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V"
),
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V",
   shift = Shift.AFTER,
   ordinal = 0
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V",
   shift = Shift.BEFORE,
   ordinal = 3
)
),
      require = 2,
      allow = 2
   )
   private void lh(GuiIngameForge var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      FeatherSourceFile515 var8 = (FeatherSourceFile515)Ws.ag();
      if (!var8.uj() || !((FeatherSourceFile$lh12)var8.pr()).kC) {
         this.func_73729_b(var2, var3, var4, var5, var6, var7);
      }

   }
}
