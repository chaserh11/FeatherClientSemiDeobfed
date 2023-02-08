package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import org.capnproto.MessageReader;

public class FeatherSourceFile830 extends MessageToMessageDecoder {
   protected void lh(ChannelHandlerContext var1, MessageReader var2, List var3) {
      FeatherSourceFile$wz$oe1 var4 = (FeatherSourceFile$wz$oe1)var2.getRoot(FeatherSourceFile$wz1.OB);
      var3.add(var4);
   }

   // $FF: synthetic method
   protected void decode(ChannelHandlerContext var1, Object var2, List var3) {
      this.lh(var1, (MessageReader)var2, var3);
   }
}
