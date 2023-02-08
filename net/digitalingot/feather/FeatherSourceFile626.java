package net.digitalingot.feather;

import com.google.common.base.Preconditions;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker13;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile626 {
   private static final int xy;
   private static final int fh;
   private static final int xi = 512;
   private static final int cg = 16384;
   private final Set sb = new HashSet();
   @NotNull
   private final @NotNull FeatherSourceFile689 jr;
   private final EventLoopGroup rt;
   private final SslContext nb;
   private FeatherSourceFile36 gy;
   private final FeatherSourceFile434 bh;
   private boolean mm = false;
   @NotNull
   private static final @NotNull String xe;

   @Inject
   FeatherSourceFile626(@NotNull @NotNull FeatherSourceFile689 var1, FeatherSourceFile434 var2) {
      this.jr = var1;
      this.rt = new NioEventLoopGroup(1);
      this.nb = SslContext.newClientContext();
      this.bh = var2;
   }

   public void lh(FeatherSourceFile574 var1) {
      this.sb.add(var1);
   }

   public void yh() {
      Preconditions.checkState(this.gy == null, "Already connected");

      try {
         final URI var1 = new URI(xe);
         final WebSocketClientHandshaker13 var2 = new WebSocketClientHandshaker13(var1, WebSocketVersion.V13, "", false, (new DefaultHttpHeaders(false)).add("User-Agent", "Feather Client"), 64000);
         this.gy = new FeatherSourceFile36(this);
         ((Bootstrap)this.rb().handler(new ChannelInitializer() {
            protected void initChannel(Channel var1x) {
               var1x.pipeline().addLast("read-timeout", new ReadTimeoutHandler((long)FeatherSourceFile626.fh, TimeUnit.MILLISECONDS)).addLast("ssl-handler", FeatherSourceFile626.this.nb.newHandler(var1x.alloc(), var1.getHost(), 443)).addLast("http-codec", new HttpClientCodec(512, 512, 512)).addLast("http-agregator", new HttpObjectAggregator(16384)).addLast("websocket-client-protocol", new WebSocketClientProtocolHandler(var2)).addLast("chat-handler", FeatherSourceFile626.this.gy).addLast("inbound-exception", new FeatherSourceFile$lh42()).addLast("outbound-exception", new FeatherSourceFile$nc23());
            }
         })).connect(var1.getHost(), 443).addListener((var1x) -> {
            if (!var1x.isSuccess()) {
               var1x.channel().close();
               var1x.channel().eventLoop().schedule(() -> {
                  this.lh(var1x.cause());
               }, 1L, TimeUnit.SECONDS);
            }

         });
      } catch (URISyntaxException var3) {
         throw new IllegalStateException(var3);
      }
   }

   private Bootstrap rb() {
      Bootstrap var1 = new Bootstrap();
      var1.channel(NioSocketChannel.class);
      var1.group(this.rt);
      var1.option(ChannelOption.TCP_NODELAY, true);
      var1.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, xy);
      return var1;
   }

   private void ej() {
      if (!this.rt.isShuttingDown()) {
         if (this.mm) {
            this.rt.shutdownGracefully().addListener((var0) -> {
               if (var0.isSuccess()) {
                  FeatherSourceFile311.Sb.info("Chat server socket shutdown due to duplicate connection.");
               }

            });
         } else {
            int var1 = (int)Math.floor(Math.random() * 286.0 + 15.0);
            FeatherSourceFile311.Sb.info(String.format("Reconnecting to chat server in %d seconds", var1));
            this.bh.nc(this::yh, (long)var1 * 20L);
         }
      }
   }

   private void lh(Throwable var1) {
      FeatherSourceFile311.Sb.info("Failed to connect to chat server");
      this.gy = null;
      this.ej();
   }

   public boolean vr() {
      if (this.gy != null) {
         this.gy.close();
         return true;
      } else {
         return false;
      }
   }

   void oe(String var1) {
      if (var1.equals("ping")) {
         this.gy.nc(new TextWebSocketFrame("pong"));
      } else if (var1.startsWith("[\"duplicateConnection")) {
         this.mm = true;
      } else {
         Iterator var2 = this.sb.iterator();

         while(var2.hasNext()) {
            FeatherSourceFile574 var3 = (FeatherSourceFile574)var2.next();
            var3.oe(var1);
         }

      }
   }

   void kx() {
      FeatherSourceFile311.Sb.info("Connected to chat server");
      this.ii();
      Iterator var1 = this.sb.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile574 var2 = (FeatherSourceFile574)var1.next();
         var2.kx();
      }

   }

   public boolean ch() {
      return this.gy != null && this.gy.se();
   }

   void yz() {
      FeatherSourceFile311.Sb.info("Disconnected from chat server");
      this.gy = null;
      Iterator var1 = this.sb.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile574 var2 = (FeatherSourceFile574)var1.next();
         var2.yz();
      }

      this.ej();
   }

   void ii() {
      this.gy.as(true);
      this.gy.nc(new TextWebSocketFrame(qy(this.jr.ru())));
   }

   private static String qy(String var0) {
      return String.format("[\"auth\", \"%s\"]", var0);
   }

   static {
      xy = (int)TimeUnit.SECONDS.toMillis(5L);
      fh = (int)TimeUnit.SECONDS.toMillis(120L);
      xe = FeatherSourceFile339.lt("FEATHER_CHAT", "wss://chat.feathermc.com/v1/websocket");
   }
}
