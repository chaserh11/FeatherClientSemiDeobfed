package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile760 implements FeatherSourceFile518 {
   @NotNull
   public @NotNull @NotNull @NotNull Boolean xj(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      if (var1.equalsIgnoreCase("true")) {
         return true;
      } else if (var1.equalsIgnoreCase("false")) {
         return false;
      } else {
         throw new FeatherSourceFile277("Input was neither true nor false.");
      }
   }

   @NotNull
   public @NotNull @NotNull String oe(@NotNull @NotNull Boolean var1) {
      return var1.toString();
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.oe((Boolean)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.xj(var1, var2);
   }
}
