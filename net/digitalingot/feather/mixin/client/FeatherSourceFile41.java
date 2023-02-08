package net.digitalingot.feather.mixin.client;

import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.Queue;
import net.digitalingot.feather.FeatherSourceFile$lh133;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile466;
import net.digitalingot.feather.FeatherSourceFile486;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.profiler.IPlayerUsage;
import net.minecraft.util.IThreadListener;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Minecraft.class})
public abstract class FeatherSourceFile41 implements IPlayerUsage, IThreadListener {
   @Unique
   private static final FeatherSourceFile465 VD = FeatherSourceFile665.nc(FeatherSourceFile486.class);
   @Shadow
   public GuiScreen field_71462_r;
   @Shadow
   public EntityPlayerSP field_71439_g;
   @Shadow
   private boolean field_71431_Q;
   private boolean WC;
   @Shadow
   @Final
   private Queue field_152351_aB;

   @Shadow
   public abstract void func_71352_k();

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void tx(CallbackInfo var1) {
      if (VD.ag() == null) {
         var1.cancel();
         this.field_152351_aB.add(ListenableFutureTask.create(this::func_71352_k, (Object)null));
      }

   }

   @Inject(
      method = {"toggleFullscreen()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/client/settings/GameSettings;fullScreen:Z",
   ordinal = 0,
   opcode = 181,
   shift = Shift.AFTER
)},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void wn(CallbackInfo var1) {
      if (!((FeatherSourceFile$lh133)((FeatherSourceFile486)VD.ag()).pr()).tG && (!this.WC || this.field_71431_Q)) {
         this.WC = false;
      } else {
         this.WC = ((FeatherSourceFile$lh133)((FeatherSourceFile486)VD.ag()).pr()).tG;
         FeatherSourceFile466.et(this.field_71431_Q);
         var1.cancel();
      }

   }

   @Redirect(
      method = {"runTick"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiScreen;isCtrlKeyDown()Z"
)
   )
   public boolean At() {
      FeatherSourceFile486 var1 = (FeatherSourceFile486)VD.ag();
      return var1 == null ? false : ((FeatherSourceFile$lh133)var1.pr()).uE.eb();
   }

   @Inject(
      method = {"getLimitFramerate"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void as(CallbackInfoReturnable var1) {
      if (VD.ag() != null) {
         FeatherSourceFile$lh133 var2 = (FeatherSourceFile$lh133)((FeatherSourceFile486)VD.ag()).pr();
         if (!Display.isActive() && var2.uG) {
            var1.setReturnValue(var2.uH);
            var1.cancel();
         }
      }

   }
}
