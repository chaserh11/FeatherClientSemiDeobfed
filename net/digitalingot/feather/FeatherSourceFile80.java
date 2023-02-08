package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile80 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(GuiOpenEvent var1) {
      GuiScreen var2 = var1.gui;
      if (var2 == null) {
         ((FeatherSourceFile$lh105)FeatherSourceFile623.ir.sx()).closeScreen();
      } else {
         GuiScreen var3 = ((FeatherSourceFile$nc44)FeatherSourceFile623.iw.sx()).openScreen(var2);
         var1.gui = var3;
      }
   }
}
