package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile23 implements FeatherSourceFile706 {
   @SerializedName("primary-contrast-color")
   @NotNull
   private final @NotNull String dE;
   @SerializedName("primary-contrast-active-color")
   @NotNull
   private final @NotNull String dF;
   @SerializedName("secondary-contrast-color")
   @NotNull
   private final @NotNull String dG;

   public FeatherSourceFile23(@NotNull @NotNull String var1, @NotNull @NotNull String var2, @NotNull @NotNull String var3) {
      this.dE = var1;
      this.dF = var2;
      this.dG = var3;
   }

   @NotNull
   public @NotNull String sz() {
      return this.dE;
   }

   @NotNull
   public @NotNull String ri() {
      return this.dF;
   }

   @NotNull
   public @NotNull String pb() {
      return this.dG;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SET_UI_COLORS;
   }
}
