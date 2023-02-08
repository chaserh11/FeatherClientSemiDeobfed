package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class FeatherSourceFile$lh42 extends ChannelInboundHandlerAdapter {
   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      FeatherSourceFile311.Sb.error("Error during an inbound netty operation", var2);
   }
}
