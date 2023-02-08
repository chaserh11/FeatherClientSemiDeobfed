package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile372;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreen.class})
public abstract class FeatherSourceFile7 implements FeatherSourceFile372 {
   @Unique
   @Final
   private boolean Wh;
   @Unique
   @Final
   private boolean Wi;

   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")}
   )
   public void lt(CallbackInfo var1) {
      String var2 = this.getClass().getName();
      this.Wh = var2.startsWith("net.minecraft.");
      this.Wi = var2.startsWith("net.digitalingot.feather.");
   }

   public boolean isMinecraftScreen() {
      return this.Wh;
   }

   public boolean isFeatherScreen() {
      return this.Wi;
   }
}
