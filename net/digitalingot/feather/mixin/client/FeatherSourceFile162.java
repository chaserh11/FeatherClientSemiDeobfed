package net.digitalingot.feather.mixin.client;

import io.netty.bootstrap.Bootstrap;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   value = {Bootstrap.class},
   remap = false
)
public abstract class FeatherSourceFile162 {
   @Inject(
      method = {"checkAddress"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void lh(SocketAddress var1, CallbackInfoReturnable var2) {
      if (var1 instanceof InetSocketAddress && ((InetSocketAddress)var1).getAddress() == null) {
         var2.setReturnValue((Object)null);
      }

   }
}
