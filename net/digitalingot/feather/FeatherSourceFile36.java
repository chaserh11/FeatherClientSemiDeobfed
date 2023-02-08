package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile36 extends ChannelInboundHandlerAdapter {
   @NotNull
   private final @NotNull FeatherSourceFile626 ku;
   private Channel vt;
   private boolean ck;

   FeatherSourceFile36(@NotNull @NotNull FeatherSourceFile626 var1) {
      this.ku = var1;
   }

   public void channelRegistered(ChannelHandlerContext var1) {
      this.vt = var1.channel();
   }

   public void channelInactive(ChannelHandlerContext var1) {
      this.ku.yz();
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      if (var2 instanceof TextWebSocketFrame) {
         TextWebSocketFrame var3 = (TextWebSocketFrame)var2;
         this.ku.oe(var3.text());
      }

   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) {
      if (var2 instanceof ClientHandshakeStateEvent) {
         ClientHandshakeStateEvent var3 = (ClientHandshakeStateEvent)var2;
         if (var3 == ClientHandshakeStateEvent.HANDSHAKE_COMPLETE) {
            this.ku.kx();
         }
      }

   }

   public void nc(Object var1) {
      if (!this.bt()) {
         if (this.vt.eventLoop().inEventLoop()) {
            this.vt.writeAndFlush(var1, this.vt.voidPromise());
         } else {
            this.vt.eventLoop().execute(() -> {
               this.vt.writeAndFlush(var1, this.vt.voidPromise());
            });
         }
      }

   }

   public void close() {
      if (!this.bt()) {
         this.vt.close();
      }

   }

   public boolean bt() {
      return this.vt != null && !this.vt.isActive();
   }

   public void as(boolean var1) {
      this.ck = var1;
   }

   public boolean se() {
      return this.ck;
   }
}
