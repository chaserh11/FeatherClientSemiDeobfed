package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh$lh13;
import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile385;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile821;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {FontRenderer.class},
   priority = 10001
)
public abstract class FeatherSourceFile19 {
   @Unique
   private static final FeatherSourceFile465 WY = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);
   @Unique
   private static final FeatherSourceFile385 WZ = new FeatherSourceFile385();
   @Shadow
   private float field_78291_n;
   @Shadow
   private float field_78292_o;
   @Shadow
   private float field_78306_p;
   @Shadow
   private float field_78305_q;

   @Shadow
   protected abstract void func_78255_a(String var1, boolean var2);

   @Shadow
   protected abstract void setColor(float var1, float var2, float var3, float var4);

   @Redirect(
      method = {"renderString"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;setColor(FFFF)V",
   ordinal = 0
)
   )
   private void lh(FontRenderer var1, float var2, float var3, float var4, float var5) {
      if (!this.Au()) {
         this.setColor(var2, var3, var4, var5);
      }

   }

   @Redirect(
      method = {"renderString"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;renderStringAtPos(Ljava/lang/String;Z)V",
   ordinal = 0
)
   )
   private void lh(FontRenderer var1, String var2, boolean var3) {
      if (this.Au()) {
         int var4 = FeatherSourceFile821.oe(this.field_78291_n, this.field_78292_o, this.field_78306_p, this.field_78305_q);
         WZ.lh(var2, var4, var3);
      } else {
         this.func_78255_a(var2, var3);
      }

   }

   @Inject(
      method = {"getStringWidth"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(String var1, CallbackInfoReturnable var2) {
      if (var1 != null && this.Au()) {
         var2.setReturnValue(WZ.qd(var1));
      }

   }

   private boolean Au() {
      net.digitalingot.feather.FeatherSourceFile125 var1 = (net.digitalingot.feather.FeatherSourceFile125)WY.ag();
      return var1 != null && var1.ou() && ((FeatherSourceFile$lh52)var1.pr()).oW != FeatherSourceFile$lh$lh13.VANILLA;
   }
}
