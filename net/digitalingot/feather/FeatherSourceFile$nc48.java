package net.digitalingot.feather;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;

@Singleton
public class FeatherSourceFile$nc48 {
   private final FeatherSourceFile$lh116 bV;
   private final Provider bY;

   @Inject
   FeatherSourceFile$nc48(FeatherSourceFile$lh116 var1, Provider var2) {
      this.bV = var1;
      this.bY = var2;
   }

   public void fe() {
      this.bV.xj((var1) -> {
         var1.pipeline().addLast("incomingMessageHandler", new ChannelDuplexHandler() {
            public void channelRead(ChannelHandlerContext var1, Object var2) {
               String var3 = (String)var2;
               if (FeatherSourceFile747.pq()) {
                  FeatherSourceFile311.Sb.info("Rust Channel -> " + var3);
               } else {
                  FeatherSourceFile311.Sb.debug("Rust Channel -> " + var3);
               }

               ((FeatherSourceFile663)FeatherSourceFile$nc48.this.bY.get()).lh(var3, FeatherSourceFile275.RUST_LAUNCHER);
            }
         });
      });
      this.bV.fe();
   }
}
