package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile197;
import net.digitalingot.feather.FeatherSourceFile478;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({GuiIngame.class})
public class FeatherSourceFile121 {
   @ModifyVariable(
      method = {"displayTitle"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   public String qk(String var1) {
      return ((FeatherSourceFile478)FeatherSourceFile478.dq.sx()).onSetTitle(var1);
   }

   @ModifyVariable(
      method = {"displayTitle"},
      at = @At("HEAD"),
      ordinal = 1,
      argsOnly = true
   )
   public String qf(String var1) {
      return ((net.digitalingot.feather.FeatherSourceFile157)net.digitalingot.feather.FeatherSourceFile157.nk.sx()).onSetSubtitle(var1);
   }

   @ModifyVariable(
      method = {"setRecordPlaying(Ljava/lang/String;Z)V"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   public String mi(String var1) {
      return ((FeatherSourceFile197)FeatherSourceFile197.bd.sx()).onSetMessageOverlay(var1);
   }
}
