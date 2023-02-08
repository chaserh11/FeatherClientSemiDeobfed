package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

public class FeatherSourceFile578 extends MessageToMessageDecoder {
   private final FeatherSourceFile$lh27 Ms;
   private FeatherSourceFile749 Mp;
   private FeatherSourceFile$lh68 Mv;

   public FeatherSourceFile578(FeatherSourceFile$lh27 var1) {
      this.Ms = (FeatherSourceFile$lh27)Preconditions.checkNotNull(var1, "direction");
      this.lh(FeatherSourceFile749.LOGIN);
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      if (var2.isReadable()) {
         ByteBuf var4 = var2.slice();
         int var5 = FeatherSourceFile590.lh(var2);
         FeatherSourceFile305 var6 = this.Mv.se(var5);
         if (var6 == null) {
            var2.skipBytes(var2.readableBytes());
            var3.add(var4.retain());
         } else {
            try {
               var6.lh(var2, this.Ms);
            } catch (Exception var8) {
               throw new CorruptedFrameException(String.format("Error decoding %s. Direction=%s, State=%s, ID=%x", var6.getClass(), this.Ms, this.Mp, var5), var8);
            }

            if (var2.isReadable()) {
               throw new CorruptedFrameException(String.format("Did not read full packet for %s. Direction=%s, State=%s, ID=%x", var6.getClass(), this.Ms, this.Mp, var5));
            }

            var3.add(var6);
         }

      }
   }

   public void lh(FeatherSourceFile749 var1) {
      this.Mp = var1;
      this.Mv = this.Ms.getPacketRegistry(var1);
   }
}
