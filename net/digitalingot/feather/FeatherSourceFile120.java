package net.digitalingot.feather;

import net.minecraft.block.Block;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile120 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(FogDensity var1) {
      Block var2 = var1.block;
      Float var3 = var1.density;
      var3 = ((FeatherSourceFile$lh83)FeatherSourceFile2.xh.sx()).setupFogDensity(var2, var3);
      if (var3 != null) {
         var1.setCanceled(true);
         var1.density = var3;
      }

   }
}
