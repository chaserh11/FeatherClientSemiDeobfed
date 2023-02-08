package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile537 implements FeatherSourceFile706 {
   @SerializedName("location")
   @Nullable
   private final @Nullable String ej;

   public FeatherSourceFile537(@Nullable @Nullable String var1) {
      this.ej = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SET_LOCATION;
   }
}
