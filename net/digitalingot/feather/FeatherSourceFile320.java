package net.digitalingot.feather;

import com.google.common.collect.ImmutableSet;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.CustomPacketRegistrationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class FeatherSourceFile320 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(CustomPacketRegistrationEvent var1) {
      Side var2 = var1.side;
      if (var2.isClient()) {
         ImmutableSet var3 = var1.registrations;
         ((FeatherSourceFile$lh86)FeatherSourceFile83.gp.sx()).onChannelRegister(var3);
      }

   }
}
