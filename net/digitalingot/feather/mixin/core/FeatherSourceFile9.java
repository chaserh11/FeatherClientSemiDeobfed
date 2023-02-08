package net.digitalingot.feather.mixin.core;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Minecraft.class})
public interface FeatherSourceFile9 {
   @Accessor
   @Mutable
   void setSession(Session var1);

   @Accessor("timer")
   Timer getTimer();

   @Accessor("debugFPS")
   static int getFPS() {
      throw new AssertionError();
   }
}
