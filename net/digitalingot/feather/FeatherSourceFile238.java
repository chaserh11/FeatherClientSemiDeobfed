package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.capnproto.MessageBuilder;
import org.capnproto.SerializePacked;

public class FeatherSourceFile238 extends MessageToByteEncoder {
   protected void lh(ChannelHandlerContext var1, MessageBuilder var2, ByteBuf var3) {
      SerializePacked.writeToUnbuffered(new FeatherSourceFile$lh77(var3), var2);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.lh(var1, (MessageBuilder)var2, var3);
   }
}
