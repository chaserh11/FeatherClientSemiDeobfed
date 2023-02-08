package net.digitalingot.feather;

import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FeatherSourceFile$lh90 {
   @NotNull
   private final @NotNull Supplier aF;
   @Nullable
   private final @Nullable FeatherSourceFile$nc36 aG;
   @Nullable
   private final @Nullable FeatherSourceFile$nc36 aH;
   private boolean aI;

   private FeatherSourceFile$lh90(@NotNull @NotNull Supplier var1, @Nullable @Nullable FeatherSourceFile$nc36 var2, @Nullable @Nullable FeatherSourceFile$nc36 var3) {
      this.aF = var1;
      this.aG = var2;
      this.aH = var3;
   }

   @NotNull
   public @NotNull Supplier ef() {
      return this.aF;
   }

   @Nullable
   public @Nullable FeatherSourceFile$nc36 mw() {
      return this.aG;
   }

   @Nullable
   public @Nullable FeatherSourceFile$nc36 gc() {
      return this.aH;
   }

   public boolean isPressed() {
      return this.aI;
   }

   public void ly(boolean var1) {
      this.aI = var1;
   }

   // $FF: synthetic method
   FeatherSourceFile$lh90(Supplier var1, FeatherSourceFile$nc36 var2, FeatherSourceFile$nc36 var3, Object var4) {
      this(var1, var2, var3);
   }
}
