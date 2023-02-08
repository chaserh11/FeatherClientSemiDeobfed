package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile332 implements FeatherSourceFile706 {
   @SerializedName("code")
   @NotNull
   private final @NotNull String code;
   @SerializedName("profile")
   @NotNull
   private final @NotNull String eR;

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DOWNLOAD_MOD_PROFILE;
   }

   public FeatherSourceFile332(@NotNull @NotNull String var1, @NotNull @NotNull String var2) {
      this.code = var1;
      this.eR = var2;
   }

   @NotNull
   public @NotNull String vc() {
      return this.eR;
   }

   @NotNull
   public @NotNull String getCode() {
      return this.code;
   }
}
