package net.digitalingot.feather;

import java.io.BufferedInputStream;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile418 implements FeatherSourceFile809 {
   @NotNull
   private final @NotNull FeatherSourceFile809 QR;
   @Nullable
   private @Nullable BufferedInputStream QS;

   public FeatherSourceFile418(@NotNull @NotNull FeatherSourceFile809 var1) {
      this.QR = var1;
   }

   @NotNull
   public @NotNull InputStream wO() {
      this.QS = new BufferedInputStream(this.QR.wO());
      return this.QS;
   }

   public void close() {
      FeatherSourceFile810.lh(this.QS);
      this.QR.close();
   }
}
