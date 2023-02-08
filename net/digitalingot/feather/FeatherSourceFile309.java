package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile309 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(EntityJoinWorldEvent var1) {
      Entity var2 = var1.entity;
      World var3 = var1.world;
      ((FeatherSourceFile555)FeatherSourceFile555.ws.sx()).joinLevel(var2, var3);
   }
}
