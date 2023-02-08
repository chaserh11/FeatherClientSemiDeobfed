package net.digitalingot.feather.mixin.core;

import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Gui.class})
public interface FeatherSourceFile8 {
   @Accessor("zLevel")
   float getBlitOffset();
}
