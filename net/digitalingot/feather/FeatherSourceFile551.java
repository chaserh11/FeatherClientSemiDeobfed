package net.digitalingot.feather;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile551 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(ItemTooltipEvent var1) {
      ItemStack var2 = var1.itemStack;
      List var3 = var1.toolTip;
      ((FeatherSourceFile380)FeatherSourceFile380.ws.sx()).showTooltip(var2, var3);
   }
}
