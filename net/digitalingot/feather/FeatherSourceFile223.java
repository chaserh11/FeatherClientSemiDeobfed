package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class FeatherSourceFile223 extends MessageToByteEncoder {
   private final FeatherSourceFile$lh27 Ms;
   private FeatherSourceFile749 Mp;
   private FeatherSourceFile$lh68 Mv;

   public FeatherSourceFile223(FeatherSourceFile$lh27 var1) {
      this.Ms = (FeatherSourceFile$lh27)Preconditions.checkNotNull(var1, "direction");
      this.lh(FeatherSourceFile749.LOGIN);
   }

   protected void lh(ChannelHandlerContext var1, FeatherSourceFile305 var2, ByteBuf var3) {
      int var4 = this.Mv.xj(var2);
      FeatherSourceFile590.lh(var3, var4);
      var2.nc(var3, this.Ms);
   }

   public void lh(FeatherSourceFile749 var1) {
      this.Mp = var1;
      this.Mv = this.Ms.getPacketRegistry(var1);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.lh(var1, (FeatherSourceFile305)var2, var3);
   }
}
