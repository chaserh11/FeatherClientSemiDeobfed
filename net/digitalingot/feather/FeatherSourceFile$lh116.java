package net.digitalingot.feather;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
class FeatherSourceFile$lh116 {
   private final List bW = Collections.synchronizedList(new ArrayList());
   private Channel vt;

   public void fe() {
      Bootstrap var1 = new Bootstrap();
      NioEventLoopGroup var2 = new NioEventLoopGroup(1);
      var1.group(var2);
      var1.channel(NioSocketChannel.class);
      var1.option(ChannelOption.SO_KEEPALIVE, true);
      int var3 = Integer.parseInt(FeatherSourceFile339.lt("FEATHER_MESSAGING_PORT", "1001"));
      var1.remoteAddress("127.0.0.1", var3);
      var1.handler(new ChannelInitializer() {
         protected void initChannel(Channel var1) {
            ChannelPipeline var2 = var1.pipeline();
            var2.addLast("frame-decoder", new FeatherSourceFile234(FeatherSourceFile230.INTEGER));
            var2.addLast("frame-encoder", new FeatherSourceFile232(FeatherSourceFile230.INTEGER));
            var2.addLast("packetProcessor", new FeatherSourceFile$xj14());
            var2.addLast("inboundExceptionHandler", new FeatherSourceFile$lh42());
            var2.addLast("outboundExceptionHandler", new FeatherSourceFile$nc23());
            Iterator var3 = FeatherSourceFile$lh116.this.bW.iterator();

            while(var3.hasNext()) {
               Consumer var4 = (Consumer)var3.next();
               var4.accept(var1);
            }

         }
      });
      ChannelFuture var4 = var1.connect();
      var4.addListener((var3x) -> {
         if (var3x.isSuccess()) {
            FeatherSourceFile311.Sb.info("Initialized rust channel communication. Communicating on port {}.", new Object[]{var3});
         } else {
            FeatherSourceFile311.Sb.warn("Couldn't connect to rust channel. Are we in development mode?");
         }

         this.vt = var4.channel();
      });
   }

   public void xj(Consumer var1) {
      if (this.vt != null) {
         var1.accept(this.vt);
      } else {
         this.bW.add(var1);
      }

   }

   public Channel mt() {
      return this.vt;
   }
}
