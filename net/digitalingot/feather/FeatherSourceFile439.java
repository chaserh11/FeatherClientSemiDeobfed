package net.digitalingot.feather;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile439 implements FeatherSourceFile814 {
   @NotNull
   private final @NotNull FeatherSourceFile814 QT;
   @Nullable
   private @Nullable BufferedOutputStream QU;

   public FeatherSourceFile439(@NotNull @NotNull FeatherSourceFile814 var1) {
      this.QT = var1;
   }

   @NotNull
   public @NotNull OutputStream wT() {
      this.QU = new BufferedOutputStream(this.QT.wT());
      return this.QU;
   }

   public void close() {
      FeatherSourceFile810.lh(this.QU);
      this.QT.close();
   }
}
