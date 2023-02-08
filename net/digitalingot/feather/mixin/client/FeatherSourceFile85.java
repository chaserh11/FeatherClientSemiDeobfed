package net.digitalingot.feather.mixin.client;

import java.io.IOException;
import javax.annotation.Nullable;
import net.digitalingot.feather.FeatherSourceFile560;
import net.digitalingot.feather.FeatherSourceFile788;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Minecraft.class})
public abstract class FeatherSourceFile85 {
   @Shadow
   public GameSettings field_71474_y;
   @Shadow
   @Nullable
   public GuiScreen field_71462_r;

   @Inject(
      method = {"getLimitFramerate"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void lh(CallbackInfoReturnable var1) {
      if (this.Ak()) {
         var1.setReturnValue(120);
         var1.cancel();
      }

   }

   @Inject(
      method = {"updateDisplay"},
      at = {@At(
   value = "INVOKE",
   target = "Lorg/lwjgl/opengl/Display;update()V",
   remap = false,
   ordinal = 0
)}
   )
   private void lh(CallbackInfo var1) {
      if (this.Ak()) {
         try {
            this.field_71462_r.func_146269_k();
         } catch (IOException var3) {
         }
      }

   }

   private boolean Ak() {
      return this.field_71462_r != null && (this.field_71462_r instanceof FeatherSourceFile560 || this.field_71462_r instanceof FeatherSourceFile788);
   }
}
