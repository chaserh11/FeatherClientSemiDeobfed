package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class FeatherSourceFile728 extends ChannelInboundHandlerAdapter {
   private Channel vt;
   private FeatherSourceFile285 Mo;
   private FeatherSourceFile749 Mp;

   public FeatherSourceFile728(FeatherSourceFile285 var1) {
      this.Mp = FeatherSourceFile749.LOGIN;
      this.Mo = var1;
   }

   public void channelRegistered(ChannelHandlerContext var1) {
      this.vt = var1.channel();
      if (this.Mo != null) {
         this.Mo.gJ();
      }

   }

   public void channelUnregistered(ChannelHandlerContext var1) {
      if (this.Mo != null) {
         this.Mo.gD();
      }

      this.vt = null;
   }

   public void channelActive(ChannelHandlerContext var1) {
      if (this.Mo != null) {
         this.Mo.kx();
      }

   }

   public void channelInactive(ChannelHandlerContext var1) {
      if (this.Mo != null) {
         this.Mo.yz();
      }

   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      try {
         if (this.Mo != null) {
            if (var2 instanceof FeatherSourceFile305) {
               FeatherSourceFile305 var3 = (FeatherSourceFile305)var2;
               var3.nc(this.Mo);
            } else if (var2 instanceof ByteBuf) {
               var1.close();
               return;
            }

            return;
         }
      } finally {
         ReferenceCountUtil.release(var2);
      }

   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (var1.channel().isActive()) {
         if (this.Mo != null) {
            try {
               this.Mo.nc(var2);
            } catch (Exception var4) {
            }
         }

         var1.close();
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

   public Channel mt() {
      return this.vt;
   }

   public FeatherSourceFile285 gH() {
      return this.Mo;
   }

   public void lh(FeatherSourceFile285 var1) {
      this.Mo = var1;
   }

   public void lh(FeatherSourceFile749 var1) {
      if (this.vt != null) {
         this.Mp = var1;
         ((FeatherSourceFile223)this.vt.pipeline().get(FeatherSourceFile223.class)).lh(var1);
         ((FeatherSourceFile578)this.vt.pipeline().get(FeatherSourceFile578.class)).lh(var1);
      }

   }

   public FeatherSourceFile749 gI() {
      return this.Mp;
   }
}
