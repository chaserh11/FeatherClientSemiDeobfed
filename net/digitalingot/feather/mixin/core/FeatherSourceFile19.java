package net.digitalingot.feather.mixin.core;

import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GuiScreen.class})
public interface FeatherSourceFile19 {
   @Accessor("buttonList")
   List getRenderables();
}
