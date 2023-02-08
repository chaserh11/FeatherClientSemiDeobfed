package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import org.capnproto.MessageReader;
import org.capnproto.SerializePacked;

public class FeatherSourceFile240 extends MessageToMessageDecoder {
   public boolean acceptInboundMessage(Object var1) {
      return var1 instanceof DatagramPacket ? this.acceptInboundMessage(((DatagramPacket)var1).content()) : var1 instanceof ByteBuf;
   }

   protected void decode(ChannelHandlerContext var1, Object var2, List var3) {
      ByteBuf var4;
      if (var2 instanceof ByteBuf) {
         var4 = (ByteBuf)var2;
      } else {
         if (!(var2 instanceof DatagramPacket)) {
            throw new IllegalArgumentException("Unsupported message type: " + var2.getClass().getName());
         }

         var4 = (ByteBuf)((DatagramPacket)var2).content();
      }

      if (var4.isReadable()) {
         MessageReader var5;
         try {
            var5 = SerializePacked.readFromUnbuffered(new FeatherSourceFile$lh107(var4));
         } catch (Exception var7) {
            throw new CorruptedFrameException("Error decoding", var7);
         }

         if (var4.isReadable()) {
            throw new CorruptedFrameException("Did not read full packet");
         } else {
            var3.add(var5);
         }
      }
   }
}
