package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class FeatherSourceFile204 extends ByteToMessageDecoder {
   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      if (var2.isReadable()) {
         int var4 = var2.readerIndex();

         for(int var5 = 0; var5 < 3; ++var5) {
            if (!var2.isReadable()) {
               var2.readerIndex(var4);
               return;
            }

            byte var6 = var2.readByte();
            if (var6 >= 0) {
               var2.readerIndex(var4);
               int var7 = FeatherSourceFile590.lh(var2);
               if (var7 == 0) {
                  return;
               }

               if (var2.readableBytes() < var7) {
                  var2.readerIndex(var4);
                  return;
               }

               var3.add(var2.readSlice(var7).retain());
               return;
            }
         }

         throw new CorruptedFrameException("Malformed VarInt");
      }
   }
}
