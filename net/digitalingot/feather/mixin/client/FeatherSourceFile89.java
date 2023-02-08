package net.digitalingot.feather.mixin.client;

import java.util.List;
import net.minecraft.client.gui.GuiResourcePackAvailable;
import net.minecraft.client.gui.GuiResourcePackSelected;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GuiScreenResourcePacks.class})
public interface FeatherSourceFile89 {
   @Accessor
   List getAvailableResourcePacks();

   @Accessor
   void setAvailableResourcePacks(List var1);

   @Accessor
   List getSelectedResourcePacks();

   @Accessor
   void setSelectedResourcePacks(List var1);

   @Accessor
   GuiResourcePackAvailable getAvailableResourcePacksList();

   @Accessor
   void setAvailableResourcePacksList(GuiResourcePackAvailable var1);

   @Accessor
   GuiResourcePackSelected getSelectedResourcePacksList();

   @Accessor
   void setSelectedResourcePacksList(GuiResourcePackSelected var1);

   @Accessor
   boolean isChanged();
}
