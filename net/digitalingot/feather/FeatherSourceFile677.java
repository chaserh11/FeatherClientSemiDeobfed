package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile677 {
   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;

   public FeatherSourceFile677(@NotNull @NotNull String var1, @NotNull @NotNull String var2) {
      this.slug = var1;
      this.name = var2;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }
}
