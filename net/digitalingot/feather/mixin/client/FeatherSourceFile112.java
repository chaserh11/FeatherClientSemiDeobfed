package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile249;
import net.digitalingot.feather.FeatherSourceFile487;
import net.minecraft.client.gui.achievement.GuiAchievement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiAchievement.class})
public class FeatherSourceFile112 {
   @Inject(
      method = {"updateAchievementWindow"},
      at = {@At("HEAD")}
   )
   private void hg(CallbackInfo var1) {
      ((FeatherSourceFile249)FeatherSourceFile487.mq().getInstance(FeatherSourceFile249.class)).render();
   }
}
