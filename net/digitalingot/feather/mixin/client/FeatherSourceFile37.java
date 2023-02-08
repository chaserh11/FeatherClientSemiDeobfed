package net.digitalingot.feather.mixin.client;

import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Scoreboard.class})
public class FeatherSourceFile37 {
   @Inject(
      method = {"removeObjective"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(ScoreObjective var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"removeTeam"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(ScorePlayerTeam var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }

   }
}
