package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile738 implements FeatherSourceFile706 {
   @SerializedName("profile")
   @NotNull
   private final @NotNull String eR;

   public FeatherSourceFile738(@NotNull @NotNull String var1) {
      this.eR = var1;
   }

   @NotNull
   public @NotNull String vc() {
      return this.eR;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_MOD_PROFILE;
   }
}
