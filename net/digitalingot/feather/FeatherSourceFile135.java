package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile135 implements FeatherSourceFile518 {
   @NotNull
   public @NotNull @NotNull @NotNull Double ou(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      try {
         return Double.parseDouble(var1);
      } catch (NumberFormatException var4) {
         throw new FeatherSourceFile277(var4);
      }
   }

   @NotNull
   public @NotNull @NotNull String lh(@NotNull @NotNull Double var1) {
      return var1.toString();
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.lh((Double)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.ou(var1, var2);
   }
}
