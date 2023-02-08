package net.digitalingot.feather;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile605 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(ClientTickEvent var1) {
      FeatherSourceFile$xj20 var2 = this.lh(var1.phase);
      ((FeatherSourceFile$lh9)FeatherSourceFile149.oc.sx()).tick(var2);
   }

   @SubscribeEvent
   public void lh(WorldTickEvent var1) {
      FeatherSourceFile$xj20 var2 = this.lh(var1.phase);
      ((FeatherSourceFile$nc2)FeatherSourceFile149.rg.sx()).tick(var2, var1.world);
   }

   @SubscribeEvent
   public void lh(PlayerTickEvent var1) {
      FeatherSourceFile$xj20 var2 = this.lh(var1.phase);
      ((FeatherSourceFile$oe1)FeatherSourceFile149.zp.sx()).tick(var2, var1.player);
   }

   @SubscribeEvent
   public void lh(RenderTickEvent var1) {
      FeatherSourceFile$xj20 var2 = this.lh(var1.phase);
      ((FeatherSourceFile$qy6)FeatherSourceFile149.fr.sx()).tick(var2, var1.renderTickTime);
   }

   @NotNull
   private @NotNull FeatherSourceFile$xj20 lh(Phase var1) {
      return var1 == Phase.END ? FeatherSourceFile$xj20.END : FeatherSourceFile$xj20.START;
   }
}
