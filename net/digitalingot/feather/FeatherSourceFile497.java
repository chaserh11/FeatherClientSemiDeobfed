package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent.Post;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FeatherSourceFile497 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(Post var1) {
      GuiScreen var2 = var1.gui;
      ((FeatherSourceFile134)FeatherSourceFile134.je.sx()).render(var2);
   }
}
