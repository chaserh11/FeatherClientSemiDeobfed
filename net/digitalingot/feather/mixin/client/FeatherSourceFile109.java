package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({Minecraft.class})
public interface FeatherSourceFile109 {
   @Invoker("updateFramebufferSize")
   void invokeUpdateFramebufferSize();
}
