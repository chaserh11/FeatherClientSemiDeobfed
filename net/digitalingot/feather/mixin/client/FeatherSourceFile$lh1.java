package net.digitalingot.feather.mixin.client;

import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.ResourcePackListEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ResourcePackListEntry.class})
public interface FeatherSourceFile$lh1 {
   @Accessor("resourcePacksGUI")
   GuiScreenResourcePacks getResourcePacksGUI();
}
