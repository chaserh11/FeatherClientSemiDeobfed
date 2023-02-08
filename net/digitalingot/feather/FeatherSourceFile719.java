package net.digitalingot.feather;

import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile719 implements FeatherSourceFile189 {
   @SubscribeEvent(
      priority = EventPriority.LOWEST
   )
   public void lh(ClientChatReceivedEvent var1) {
      byte var2 = var1.type;
      if (var2 != 2) {
         IChatComponent var3 = var1.message;
         var3 = ((FeatherSourceFile645)FeatherSourceFile645.ws.sx()).receiveMessage(var3);
         if (var3 == null) {
            var1.setCanceled(true);
         } else {
            var1.message = var3;
         }
      }
   }
}
