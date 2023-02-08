package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class FeatherSourceFile$nc23 extends ChannelOutboundHandlerAdapter {
   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      FeatherSourceFile311.Sb.error("Error during an outbound netty operation", var2);
   }
}
