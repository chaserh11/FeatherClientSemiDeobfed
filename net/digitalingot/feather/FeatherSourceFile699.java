package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile699 implements FeatherSourceFile706 {
   @SerializedName("colorPicker")
   @Nullable
   private final @Nullable FeatherSourceFile8 dH;
   @SerializedName("modMenu")
   @Nullable
   private final @Nullable FeatherSourceFile171 dI;

   public FeatherSourceFile699(@Nullable @Nullable FeatherSourceFile8 var1, @Nullable @Nullable FeatherSourceFile171 var2) {
      this.dH = var1;
      this.dI = var2;
   }

   @Nullable
   public @Nullable FeatherSourceFile8 by() {
      return this.dH;
   }

   @Nullable
   public @Nullable FeatherSourceFile171 ci() {
      return this.dI;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_CLIENT_PREFERENCES;
   }
}
