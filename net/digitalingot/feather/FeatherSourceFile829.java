package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public abstract class FeatherSourceFile829 {
   @NotNull
   protected @NotNull Channel vt;
   @NotNull
   protected final @NotNull FeatherSourceFile849 pv;

   protected FeatherSourceFile829(@NotNull @NotNull FeatherSourceFile849 var1) {
      this.pv = var1;
   }

   @NotNull
   protected @NotNull FeatherSourceFile$ep.xj.lh lh(MessageBuilder var1) {
      FeatherSourceFile$ep.lh var2 = (FeatherSourceFile$ep.lh)var1.initRoot(FeatherSourceFile$ep.Pz);
      return var2.sL();
   }

   protected void nc(MessageBuilder var1) {
      if (this.vt.eventLoop().inEventLoop()) {
         this.vt.writeAndFlush(var1).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.vt.eventLoop().submit(() -> {
            this.vt.writeAndFlush(var1).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      }

   }
}
