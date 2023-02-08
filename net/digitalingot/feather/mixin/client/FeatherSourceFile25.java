package net.digitalingot.feather.mixin.client;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Minecraft.class})
public interface FeatherSourceFile25 {
   @Accessor("timer")
   Timer getTimer();
}
