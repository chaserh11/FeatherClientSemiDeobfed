package net.digitalingot.feather;

import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile361 {
   public static @NotNull FeatherSourceFile359 lh(@NotNull final @NotNull Callable var0, final long var1) {
      return new FeatherSourceFile359() {
         private long Sc = 0L;
         private Object Sd = null;

         public Object call() {
            long var1x = System.currentTimeMillis();
            if (var1x - this.Sc > var1) {
               try {
                  this.Sd = var0.call();
               } catch (Exception var4) {
                  throw new RuntimeException(var4);
               }

               this.Sc = var1x;
            }

            return this.Sd;
         }
      };
   }
}
