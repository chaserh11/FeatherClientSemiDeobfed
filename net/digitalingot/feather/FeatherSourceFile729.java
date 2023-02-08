package net.digitalingot.feather;

import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FeatherSourceFile729 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(RenderWorldLastEvent var1) {
      ((FeatherSourceFile792)FeatherSourceFile792.je.sx()).render();
   }
}
