package net.digitalingot.feather.mixin.core;

import net.minecraft.util.ChatComponentText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ChatComponentText.class})
public interface FeatherSourceFile1 {
   @Accessor("text")
   void setText(String var1);
}
