package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile721;
import net.minecraftforge.client.GuiIngameForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({GuiIngameForge.class})
public class FeatherSourceFile55 {
   @ModifyVariable(
      method = {"renderExperience"},
      at = @At("STORE"),
      name = {"color"},
      remap = false
   )
   private int px(int var1) {
      return FeatherSourceFile721.wh() ? FeatherSourceFile721.mq(var1) : var1;
   }
}
