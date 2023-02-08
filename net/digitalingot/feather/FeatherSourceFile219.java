package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum FeatherSourceFile219 {
   HUD_EDITOR("hudEditor");

   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;

   private FeatherSourceFile219(@NotNull String var3) {
      this.slug = var3;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   // $FF: synthetic method
   private static FeatherSourceFile219[] $values() {
      return new FeatherSourceFile219[]{HUD_EDITOR};
   }
}
