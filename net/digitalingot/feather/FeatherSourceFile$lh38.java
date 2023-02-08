package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

class FeatherSourceFile$lh38 {
   @NotNull
   private final @NotNull List Rq;
   @NotNull
   private final @NotNull List Rr;

   public FeatherSourceFile$lh38(@NotNull @NotNull List var1, @NotNull @NotNull List var2) {
      this.Rq = var1;
      this.Rr = var2;
   }

   public @NotNull boolean ys(@NotNull @NotNull String var1) {
      Iterator var2 = this.Rq.iterator();

      Pattern var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (Pattern)var2.next();
      } while(!var3.matcher(var1).matches());

      return true;
   }

   @NotNull
   public @NotNull List xO() {
      return this.Rq;
   }

   @NotNull
   public @NotNull List xP() {
      return this.Rr;
   }
}
