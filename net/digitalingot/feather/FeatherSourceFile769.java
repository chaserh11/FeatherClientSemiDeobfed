package net.digitalingot.feather;

import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FeatherSourceFile769 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(DrawBlockHighlightEvent var1) {
      FeatherSourceFile133 var2 = ((FeatherSourceFile299)FeatherSourceFile299.oq.sx()).drawHighlightBlock();
      if (var2 == FeatherSourceFile133.FAIL) {
         var1.setCanceled(true);
      }

   }
}
