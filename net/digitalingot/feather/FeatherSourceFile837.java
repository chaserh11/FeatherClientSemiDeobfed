package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile837 extends ChannelInboundHandlerAdapter {
   @NotNull
   private final @NotNull FeatherSourceFile828 NP;

   public FeatherSourceFile837(@NotNull @NotNull FeatherSourceFile828 var1) {
      this.NP = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      FeatherSourceFile$wz$oe1 var3 = (FeatherSourceFile$wz$oe1)var2;
      if (var3.nZ().lN() != FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS) {
         FeatherSourceFile311.Sb.error("received packet type {} while still unauthenticated", new Object[]{var3.nZ()});
      } else {
         this.NP.jA();
      }
   }
}
