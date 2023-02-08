package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile202 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(InitGuiEvent var1) {
      GuiScreen var2 = var1.gui;
      if (var2 != null) {
         ((FeatherSourceFile490)FeatherSourceFile490.je.sx()).postInitialization(var2);
      }
   }
}
