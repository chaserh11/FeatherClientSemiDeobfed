package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

public class FeatherSourceFile234 extends ByteToMessageDecoder {
   private final FeatherSourceFile230 TC;

   public FeatherSourceFile234() {
      this(FeatherSourceFile230.SHORT);
   }

   public FeatherSourceFile234(FeatherSourceFile230 var1) {
      this.TC = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      if (var2.isReadable()) {
         int var4 = var2.readerIndex();
         int var5;
         switch (this.TC) {
            case SHORT:
               var5 = Short.toUnsignedInt(var2.readShort());
               break;
            case INTEGER:
               var5 = var2.readInt();
               break;
            default:
               throw new IllegalStateException("Unknown packet length type: " + this.TC);
         }

         if (var5 != 0) {
            if (var2.readableBytes() < var5) {
               var2.readerIndex(var4);
            } else {
               var3.add(var2.slice(var2.readerIndex(), var5).retain());
               var2.skipBytes(var5);
            }
         }
      }
   }
}
