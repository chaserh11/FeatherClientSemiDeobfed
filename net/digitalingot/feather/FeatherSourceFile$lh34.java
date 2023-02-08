package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh34 {
   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("icon")
   @NotNull
   private final @NotNull String icon;

   public FeatherSourceFile$lh34(@NotNull @NotNull String var1, @NotNull @NotNull String var2, @NotNull @NotNull String var3) {
      this.slug = var1;
      this.name = var2;
      this.icon = var3;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull String getIcon() {
      return this.icon;
   }
}
