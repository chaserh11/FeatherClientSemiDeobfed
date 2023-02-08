package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile758 implements FeatherSourceFile706 {
   @SerializedName("profile")
   @NotNull
   private final @NotNull String eR;

   public FeatherSourceFile758(@NotNull @NotNull String var1) {
      this.eR = var1;
   }

   @NotNull
   public @NotNull String vc() {
      return this.eR;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_MOD_PROFILE;
   }
}
