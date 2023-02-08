package net.digitalingot.feather;

import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile429 {
   @NotNull
   private final @NotNull FeatherSourceFile424 Rk;
   @NotNull
   private @NotNull List Rl = Collections.emptyList();
   private boolean Rm;

   public FeatherSourceFile429(@NotNull @NotNull FeatherSourceFile424 var1) {
      this.Rk = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile424 xG() {
      return this.Rk;
   }

   @NotNull
   public @NotNull List xH() {
      return this.Rl;
   }

   public @NotNull void ep(@NotNull @NotNull List var1) {
      this.Rl = Collections.unmodifiableList(var1);
   }

   public boolean xI() {
      return this.Rm;
   }

   public void cg(boolean var1) {
      this.Rm = var1;
   }
}
