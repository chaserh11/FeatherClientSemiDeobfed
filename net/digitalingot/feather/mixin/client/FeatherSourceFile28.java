package net.digitalingot.feather.mixin.client;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({VertexBuffer.class})
public abstract class FeatherSourceFile28 {
   @Shadow
   private int field_177365_a;

   @Inject(
      method = {"bufferData"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/vertex/VertexBuffer;bindBuffer()V"
)},
      cancellable = true
   )
   private void lh(ByteBuffer var1, CallbackInfo var2) {
      if (this.field_177365_a == -1) {
         var2.cancel();
      }

   }
}
