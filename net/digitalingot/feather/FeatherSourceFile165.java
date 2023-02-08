package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile165 {
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @NotNull
   private final @NotNull String slug;
   @SerializedName("icon")
   @NotNull
   private final @NotNull String icon;
   @SerializedName("type")
   @NotNull
   private final @NotNull FeatherSourceFile$lh62 fw;
   @SerializedName("defaultSettings")
   @Nullable
   private final @Nullable JsonElement mx;

   public FeatherSourceFile165(@NotNull @NotNull String var1, @NotNull @NotNull String var2, @NotNull @NotNull String var3, @NotNull @NotNull FeatherSourceFile$lh62 var4, @Nullable @Nullable JsonElement var5) {
      this.name = var1;
      this.slug = var2;
      this.icon = var3;
      this.fw = var4;
      this.mx = var5;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull String getSlug() {
      return this.slug;
   }

   @NotNull
   public @NotNull String getIcon() {
      return this.icon;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh62 ud() {
      return this.fw;
   }

   @Nullable
   public @Nullable JsonElement pg() {
      return this.mx;
   }

   public String toString() {
      return this.slug;
   }
}
