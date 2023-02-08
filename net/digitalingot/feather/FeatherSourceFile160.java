package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class FeatherSourceFile160 extends MessageToByteEncoder {
   public static final FeatherSourceFile160 Mw = new FeatherSourceFile160();

   private FeatherSourceFile160() {
   }

   protected void lh(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int var4 = var2.readableBytes();
      int var5 = FeatherSourceFile590.bt(var4);
      var3.ensureWritable(var5 + var4);
      FeatherSourceFile590.lh(var3, var4);
      var3.writeBytes(var2, var2.readerIndex(), var4);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.lh(var1, (ByteBuf)var2, var3);
   }
}
