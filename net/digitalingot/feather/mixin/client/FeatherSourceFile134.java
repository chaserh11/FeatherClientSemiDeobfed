package net.digitalingot.feather.mixin.client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiVideoSettings;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({GuiVideoSettings.class})
public class FeatherSourceFile134 extends GuiScreen {
   @Shadow
   private GameSettings field_146499_g;

   public void func_146281_b() {
      this.field_146499_g.func_74303_b();
   }
}
