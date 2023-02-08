package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({Minecraft.class})
public class FeatherSourceFile49 {
   @ModifyVariable(
      method = {"dispatchKeypresses"},
      at = @At("STORE")
   )
   private int gj(int var1) {
      return Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
   }
}
