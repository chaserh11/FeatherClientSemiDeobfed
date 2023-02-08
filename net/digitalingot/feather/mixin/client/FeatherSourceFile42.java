package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.IChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;

@Mixin({Minecraft.class})
public abstract class FeatherSourceFile42 {
   @Redirect(
      method = {"dispatchKeypresses"},
      slice = @Slice(
   from = @At(
   value = "FIELD",
   opcode = 180,
   target = "Lnet/minecraft/client/settings/GameSettings;keyBindScreenshot:Lnet/minecraft/client/settings/KeyBinding;",
   shift = Shift.AFTER
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/util/ScreenShotHelper;saveScreenshot(Ljava/io/File;IILnet/minecraft/client/shader/Framebuffer;)Lnet/minecraft/util/IChatComponent;",
   shift = Shift.AFTER
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiNewChat;printChatMessage(Lnet/minecraft/util/IChatComponent;)V",
   ordinal = 0
)
   )
   private void lh(GuiNewChat var1, IChatComponent var2) {
   }
}
