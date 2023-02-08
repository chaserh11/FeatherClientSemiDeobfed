package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh72 {
   @SerializedName("cosmetic")
   @NotNull
   private final @NotNull String slug;
   @SerializedName("settings")
   @NotNull
   private final @NotNull FeatherSourceFile406 cT;

   public FeatherSourceFile$lh72(@NotNull @NotNull String var1, @NotNull @NotNull FeatherSourceFile406 var2) {
      this.slug = var1;
      this.cT = var2;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   @NotNull
   public @NotNull FeatherSourceFile406 fj() {
      return this.cT;
   }
}
