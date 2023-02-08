package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile206 implements FeatherSourceFile706 {
   @SerializedName("selection")
   @NotNull
   private final @NotNull String eA;

   public FeatherSourceFile206(@NotNull @NotNull String var1) {
      this.eA = var1;
   }

   public String xt() {
      return this.eA;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DO_HUD_SELECTION;
   }
}
