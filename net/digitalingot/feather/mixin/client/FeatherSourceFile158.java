package net.digitalingot.feather.mixin.client;

import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({GuiOptions.class})
public class FeatherSourceFile158 extends GuiScreen {
   @Shadow
   @Final
   private GameSettings field_146443_h;

   public void func_146281_b() {
      this.field_146443_h.func_74303_b();
   }
}
