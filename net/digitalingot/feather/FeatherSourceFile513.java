package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile513 implements FeatherSourceFile706 {
   @SerializedName("settings")
   @Nullable
   private final @Nullable FeatherSourceFile$lh72 cR;
   @SerializedName("equipped")
   @Nullable
   private final @Nullable FeatherSourceFile$nc28 cS;

   public FeatherSourceFile513(@Nullable @Nullable FeatherSourceFile$lh72 var1, @Nullable @Nullable FeatherSourceFile$nc28 var2) {
      this.cR = var1;
      this.cS = var2;
   }

   @Nullable
   public @Nullable FeatherSourceFile$lh72 sr() {
      return this.cR;
   }

   @Nullable
   public @Nullable FeatherSourceFile$nc28 bi() {
      return this.cS;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_COSMETICS;
   }
}
