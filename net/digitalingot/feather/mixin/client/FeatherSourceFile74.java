package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile325;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreen.class})
public class FeatherSourceFile74 implements FeatherSourceFile325 {
   @Inject(
      method = {"setWorldAndResolution"},
      at = {@At("TAIL")}
   )
   private void lh(Minecraft var1, int var2, int var3, CallbackInfo var4) {
      this.initGuiPost();
   }

   public void initGuiPost() {
   }
}
