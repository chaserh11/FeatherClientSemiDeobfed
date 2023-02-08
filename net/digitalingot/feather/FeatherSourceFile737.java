package net.digitalingot.feather;

import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile737 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(FOVUpdateEvent var1) {
      float var2 = var1.fov;
      float var3 = var1.newfov;
      var3 = ((FeatherSourceFile396)FeatherSourceFile396.ws.sx()).updateFOV(var2, var3);
      var1.newfov = var3;
   }
}
