package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;

class FeatherSourceFile$xj14 extends ChannelDuplexHandler {
   private FeatherSourceFile$xj14() {
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      if (var2 instanceof ByteBuf) {
         ByteBuf var3 = (ByteBuf)var2;

         try {
            int var4 = var3.readableBytes();
            byte[] var5 = new byte[var4];
            var3.readBytes(var5);
            String var6 = new String(var5, StandardCharsets.UTF_8);
            var1.fireChannelRead(var6);
         } finally {
            var3.release();
         }

      } else {
         throw new IllegalArgumentException("Don't know how to cast " + var2.getClass() + " to ByteBuf");
      }
   }

   // $FF: synthetic method
   FeatherSourceFile$xj14(Object var1) {
      this();
   }
}
