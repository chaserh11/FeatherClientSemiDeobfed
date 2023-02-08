package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile619 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(AttackEntityEvent var1) {
      boolean var2 = Minecraft.func_71410_x().func_152345_ab();
      if (var2) {
         EntityPlayer var3 = var1.entityPlayer;
         Entity var4 = var1.target;
         ((FeatherSourceFile670)FeatherSourceFile670.ws.sx()).attack(var3, var4);
      }
   }
}
