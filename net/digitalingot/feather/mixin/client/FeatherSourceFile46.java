package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh98;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile649;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.scoreboard.ScoreObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngame.class})
public class FeatherSourceFile46 {
   @Unique
   private static final FeatherSourceFile465 WO = FeatherSourceFile665.nc(FeatherSourceFile649.class);

   @Inject(
      method = {"renderScoreboard"},
      at = {@At("HEAD")},
      cancellable = true
   )
   protected void lh(ScoreObjective var1, ScaledResolution var2, CallbackInfo var3) {
      var3.cancel();
      FeatherSourceFile649 var4 = (FeatherSourceFile649)WO.ag();
      ((FeatherSourceFile$lh98)var4.vb()).cd();
   }
}
