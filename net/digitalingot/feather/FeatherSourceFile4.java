package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile4 implements FeatherSourceFile706 {
   @SerializedName("msg")
   @NotNull
   private final @NotNull String cA;

   public FeatherSourceFile4(@NotNull @NotNull String var1) {
      this.cA = var1;
   }

   @NotNull
   public @NotNull String op() {
      return this.cA;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CALLBACK;
   }
}
