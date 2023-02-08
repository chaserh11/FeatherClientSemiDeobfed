package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile376 implements FeatherSourceFile518 {
   @NotNull
   public @NotNull @NotNull @NotNull Float as(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      try {
         return Float.parseFloat(var1);
      } catch (NumberFormatException var4) {
         throw new FeatherSourceFile277(var4);
      }
   }

   @NotNull
   public @NotNull @NotNull String xj(@NotNull @NotNull Float var1) {
      return var1.toString();
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull String km(@NotNull @NotNull Object var1) {
      return this.xj((Float)var1);
   }

   // $FF: synthetic method
   @NotNull
   public @NotNull @NotNull @NotNull Object nc(@NotNull @NotNull String var1, @NotNull @NotNull Class var2) {
      return this.as(var1, var2);
   }
}
