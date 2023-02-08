package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile208 implements FeatherSourceFile706 {
   @SerializedName("selection")
   @NotNull
   private final @NotNull String eA;

   public FeatherSourceFile208(@NotNull @NotNull String var1) {
      this.eA = var1;
   }

   @NotNull
   public @NotNull String xt() {
      return this.eA;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PRESS_BUTTON;
   }
}
