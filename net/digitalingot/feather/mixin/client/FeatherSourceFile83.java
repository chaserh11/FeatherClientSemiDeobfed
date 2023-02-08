package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile428;
import net.digitalingot.feather.FeatherSourceFile429;
import net.digitalingot.feather.FeatherSourceFile487;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public class FeatherSourceFile83 {
   @Shadow
   private int field_71429_W;

   @Inject(
      method = {"clickMouse"},
      at = {@At("HEAD")}
   )
   private void jh(CallbackInfo var1) {
      if ((Boolean)((FeatherSourceFile428)FeatherSourceFile487.mq().getInstance(FeatherSourceFile428.class)).xL().map(FeatherSourceFile429::xI).orElse(false)) {
         this.field_71429_W = 0;
      }

   }
}
