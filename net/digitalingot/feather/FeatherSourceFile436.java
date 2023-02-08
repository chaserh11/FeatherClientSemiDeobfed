package net.digitalingot.feather;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile436 implements FeatherSourceFile809 {
   @NotNull
   private final @NotNull InputStream ka;

   public FeatherSourceFile436(@NotNull @NotNull InputStream var1) {
      this.ka = var1;
   }

   @NotNull
   public @NotNull InputStream wO() {
      return this.ka;
   }

   public void close() {
      FeatherSourceFile810.lh(this.ka);
   }
}
