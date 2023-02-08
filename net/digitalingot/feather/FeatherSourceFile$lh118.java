package net.digitalingot.feather;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile$lh118 {
   @NotNull
   private final @NotNull FeatherSourceFile275 bD;
   private final int id;

   FeatherSourceFile$lh118(@NotNull @NotNull FeatherSourceFile275 var1, int var2) {
      this.bD = var1;
      this.id = var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile$lh118 var2 = (FeatherSourceFile$lh118)var1;
         return this.id == var2.id && this.bD == var2.bD;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.bD, this.id});
   }
}
