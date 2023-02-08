package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile471 implements FeatherSourceFile706 {
   @SerializedName("profile")
   @NotNull
   private final @NotNull String eR;
   @SerializedName("newName")
   @NotNull
   private final @NotNull String eS;

   public FeatherSourceFile471(@NotNull @NotNull String var1, @NotNull @NotNull String var2) {
      this.eR = var1;
      this.eS = var2;
   }

   @NotNull
   public @NotNull String vc() {
      return this.eR;
   }

   @NotNull
   public @NotNull String da() {
      return this.eS;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RENAME_MOD_PROFILE;
   }
}
