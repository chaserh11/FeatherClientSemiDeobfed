package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile220;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiOptions.class})
public class FeatherSourceFile116 extends GuiScreen {
   @Redirect(
      method = {"actionPerformed"},
      at = @At(
   value = "NEW",
   target = "Lnet/minecraft/client/gui/GuiScreenResourcePacks;"
)
   )
   private GuiScreenResourcePacks km(GuiScreen var1) {
      return new FeatherSourceFile220(var1);
   }
}
