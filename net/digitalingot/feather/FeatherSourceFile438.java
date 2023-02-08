package net.digitalingot.feather;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile438 implements FeatherSourceFile809 {
   @NotNull
   private final @NotNull String op;
   @Nullable
   private @Nullable InputStream ka;

   public FeatherSourceFile438(@NotNull @NotNull String var1) {
      this.op = var1;
   }

   @NotNull
   public @NotNull InputStream wO() {
      this.ka = this.getClass().getResourceAsStream(this.op);
      return this.ka;
   }

   public void close() {
      FeatherSourceFile810.lh(this.ka);
      this.ka = null;
   }
}
