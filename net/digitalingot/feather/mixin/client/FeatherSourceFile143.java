package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile410;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;

@Mixin({FontRenderer.class})
public abstract class FeatherSourceFile143 {
   @Unique
   private static final FeatherSourceFile465 WM = FeatherSourceFile665.nc(FeatherSourceFile410.class);

   @ModifyVariable(
      method = {"renderString(Ljava/lang/String;FFIZ)I"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/gui/FontRenderer;bidiFlag:Z",
   ordinal = 0,
   shift = Shift.BEFORE
),
      argsOnly = true,
      ordinal = 0,
      require = 1,
      allow = 1
   )
   private String sx(String var1) {
      return this.zl(var1);
   }

   @ModifyVariable(
      method = {"getStringWidth(Ljava/lang/String;)I"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 1,
      allow = 1
   )
   private String qs(String var1) {
      return this.zl(var1);
   }

   private String zl(String var1) {
      FeatherSourceFile410 var2 = (FeatherSourceFile410)WM.ag();
      return var2 != null && var2.ou() ? var2.sb(var1) : var1;
   }
}
