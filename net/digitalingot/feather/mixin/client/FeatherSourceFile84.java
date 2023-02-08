package net.digitalingot.feather.mixin.client;

import java.util.concurrent.Semaphore;
import net.minecraftforge.fml.client.SplashProgress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
   value = {SplashProgress.class},
   remap = false
)
public interface FeatherSourceFile84 {
   @Accessor(
      value = "done",
      remap = false
   )
   static boolean isDone() {
      throw new IllegalStateException();
   }

   @Accessor(
      value = "pause",
      remap = false
   )
   static boolean isPaused() {
      throw new IllegalStateException();
   }

   @Accessor(
      value = "mutex",
      remap = false
   )
   static Semaphore getMutex() {
      throw new IllegalStateException();
   }
}
