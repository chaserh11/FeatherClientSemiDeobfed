package net.digitalingot.feather;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile849 {
   public static final AttributeKey NB = AttributeKey.valueOf("unauthenticated-redstone-connection");
   @NotNull
   private static final @NotNull String NC = FeatherSourceFile339.lt("FEATHER_REDSTONE", "redstone.feathermc.com");
   private static final int ND = 1668;
   @NotNull
   private final @NotNull Map NE = new HashMap();
   @NotNull
   private final @NotNull FeatherSourceFile689 jr;
   @NotNull
   private final @NotNull NioEventLoopGroup NF;
   @Nullable
   private @Nullable Channel vt;
   @Nullable
   private @Nullable FeatherSourceFile848 NG;
   private final FeatherSourceFile434 xj;

   @Inject
   FeatherSourceFile849(@NotNull @NotNull FeatherSourceFile689 var1, FeatherSourceFile434 var2) {
      this.jr = var1;
      this.xj = var2;
      this.NF = new NioEventLoopGroup(1);
   }

   public void iS() {
      if (this.vt != null) {
         this.vt.close();
      }

   }

   public void fe() {
      FeatherSourceFile370.ws.oe(this::iS);
   }

   public void yh() {
      Bootstrap var1 = new Bootstrap();
      var1.group(this.NF);
      var1.channel(NioSocketChannel.class);
      var1.option(ChannelOption.SO_KEEPALIVE, true);
      var1.remoteAddress(NC, 1668);
      var1.handler(new ChannelInitializer() {
         protected void initChannel(Channel var1) {
            FeatherSourceFile828 var2 = FeatherSourceFile828.oe(var1);
            var1.attr(FeatherSourceFile849.NB).set(var2);
            ChannelPipeline var3 = var1.pipeline();
            var3.addLast("frame-decoder", new FeatherSourceFile234());
            var3.addLast("frame-encoder", new FeatherSourceFile232());
            var3.addLast("packet-decoder", new FeatherSourceFile240());
            var3.addLast("packet-encoder", new FeatherSourceFile238());
            var3.addLast("redstone-decoder", new FeatherSourceFile830());
            var3.addLast("unauthenticated-handler", new FeatherSourceFile837(var2));
            var3.addLast("inbound-exception-handler", new FeatherSourceFile$lh42());
            var3.addLast("outbound-exception-handler", new FeatherSourceFile$nc23());
         }
      });
      ChannelFuture var2 = var1.connect();
      var2.addListener((var2x) -> {
         if (!var2x.isSuccess()) {
            FeatherSourceFile311.Sb.warn("Couldn't establish connection to Redstone", var2x.cause());
         } else {
            String var3 = this.jr.rn();
            if (var3 == null) {
               throw new IllegalArgumentException("Game token couldn't be fetched");
            } else {
               this.vt = var2.channel();
               this.vt.config().setOption(ChannelOption.SO_RCVBUF, 65536);
               this.vt.config().setOption(ChannelOption.SO_SNDBUF, 65536);
               this.vt.config().setOption(ChannelOption.AUTO_READ, true);
               FeatherSourceFile311.Sb.info("Established Redstone connection to " + this.vt.remoteAddress());
               FeatherSourceFile828 var4 = (FeatherSourceFile828)this.vt.attr(NB).get();
               var4.xg(this.jr.rn());
            }
         }
      });
      var2.channel().closeFuture().addListener((var1x) -> {
         FeatherSourceFile311.Sb.info("Redstone connection stopped.", var1x.cause());
         this.vt = null;
         if (this.NG != null) {
            this.NG = null;
         }

         this.xj.xj(() -> {
            ((FeatherSourceFile603)FeatherSourceFile603.ws.sx()).disconnect();
         });
         if (!this.NF.isShuttingDown()) {
            this.NF.schedule(() -> {
               FeatherSourceFile311.Sb.info("Reconnecting to Redstone...");
               this.yh();
            }, 5L, TimeUnit.SECONDS);
         }

      });
   }

   @NotNull
   public @NotNull Map iT() {
      return this.NE;
   }

   @Nullable
   public @Nullable FeatherSourceFile848 iU() {
      return this.NG;
   }

   public @NotNull void nc(@NotNull @NotNull FeatherSourceFile848 var1) {
      this.NG = var1;
   }
}
