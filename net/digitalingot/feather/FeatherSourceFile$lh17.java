package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandler.Sharable;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import org.jetbrains.annotations.NotNull;

@Sharable
class FeatherSourceFile$lh17 extends ChannelInboundHandlerAdapter {
   @NotNull
   private final @NotNull FeatherSourceFile453 Rv;

   private FeatherSourceFile$lh17(@NotNull @NotNull FeatherSourceFile453 var1) {
      this.Rv = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      ByteBuf var3 = ((FMLProxyPacket)var2).payload();
      int var4 = var3.readableBytes();
      byte[] var5 = new byte[var4];
      var3.readBytes(var5);
      this.Rv.onMessage(var5);
   }

   // $FF: synthetic method
   FeatherSourceFile$lh17(FeatherSourceFile453 var1, Object var2) {
      this(var1);
   }
}
