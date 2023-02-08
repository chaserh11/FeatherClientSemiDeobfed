package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class FeatherSourceFile232 extends MessageToByteEncoder {
   private final FeatherSourceFile230 TC;

   public FeatherSourceFile232() {
      this(FeatherSourceFile230.SHORT);
   }

   public FeatherSourceFile232(FeatherSourceFile230 var1) {
      this.TC = var1;
   }

   protected void lh(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int var4 = var2.readableBytes();
      var3.ensureWritable(this.TC.getSize() + var4);
      switch (this.TC) {
         case SHORT:
            var3.writeShort(var4);
            break;
         case INTEGER:
            var3.writeInt(var4);
      }

      var3.writeBytes(var2, var2.readerIndex(), var4);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.lh(var1, (ByteBuf)var2, var3);
   }
}
