package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile828 extends FeatherSourceFile829 {
   private final FeatherSourceFile434 xj;
   private final Provider NJ;

   @Inject
   FeatherSourceFile828(@NotNull @NotNull FeatherSourceFile849 var1, FeatherSourceFile434 var2, Provider var3) {
      super(var1);
      this.xj = var2;
      this.NJ = var3;
   }

   public static @NotNull FeatherSourceFile828 oe(@NotNull @NotNull Channel var0) {
      FeatherSourceFile828 var1 = (FeatherSourceFile828)FeatherSourceFile487.mq().getInstance(FeatherSourceFile828.class);
      var1.vt = var0;
      return var1;
   }

   public @NotNull void xg(@NotNull @NotNull String var1) {
      FeatherSourceFile311.Sb.info("Authenticating with Redstone...");
      MessageBuilder var2 = new MessageBuilder();
      FeatherSourceFile$ep.xj.lh var3 = this.lh(var2);
      FeatherSourceFile$qy.lh1 var4 = var3.sQ();
      var4.bx(var1);
      this.nc(var2);
   }

   public void jA() {
      FeatherSourceFile311.Sb.info("Authenticated with Redstone");
      FeatherSourceFile848 var1 = FeatherSourceFile848.xj(this.vt);
      this.pv.nc(var1);
      this.vt.pipeline().replace("unauthenticated-handler", "authenticated-handler", (ChannelHandler)this.NJ.get());
      this.xj.xj(() -> {
         ((FeatherSourceFile400)FeatherSourceFile400.ws.sx()).connect(var1);
      });
   }
}
