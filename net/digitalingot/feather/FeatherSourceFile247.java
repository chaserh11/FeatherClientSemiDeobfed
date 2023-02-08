package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile247 {
   @SerializedName("type")
   @NotNull
   private final @NotNull FeatherSourceFile$lh29 eW;
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @Nullable
   private final @Nullable String slug;
   @SerializedName("parent")
   @Nullable
   private final @Nullable FeatherSourceFile7 eX;
   @SerializedName("value")
   @Nullable
   private final @Nullable FeatherSourceFile105 eY;
   @SerializedName("chroma")
   @Nullable
   private final @Nullable Boolean eZ;
   @SerializedName("opacity")
   @Nullable
   private final @Nullable Boolean fA;

   public FeatherSourceFile247(@NotNull @NotNull FeatherSourceFile$lh29 var1, @NotNull @NotNull String var2, @Nullable @Nullable String var3, @Nullable @Nullable FeatherSourceFile7 var4, @Nullable @Nullable FeatherSourceFile105 var5, @Nullable @Nullable Boolean var6, @Nullable @Nullable Boolean var7) {
      this.eW = var1;
      this.name = var2;
      this.slug = var3;
      this.eX = var4;
      this.eY = var5;
      this.eZ = var6;
      this.fA = var7;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh29 sg() {
      return this.eW;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @Nullable
   public @Nullable String getSlug() {
      return this.slug;
   }

   @Nullable
   public @Nullable FeatherSourceFile7 uf() {
      return this.eX;
   }

   @Nullable
   public @Nullable FeatherSourceFile105 nq() {
      return this.eY;
   }

   @Nullable
   public @Nullable Boolean jo() {
      return this.eZ;
   }

   @Nullable
   public @Nullable Boolean ih() {
      return this.fA;
   }
}
