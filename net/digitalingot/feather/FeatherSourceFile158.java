package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile158 {
   @SerializedName("updateClientPreferences")
   @NotNull
   private @NotNull FeatherSourceFile171 kr;
   @SerializedName("colorPickerPreferences")
   @NotNull
   private @NotNull FeatherSourceFile8 db;

   public FeatherSourceFile158(@NotNull @NotNull FeatherSourceFile171 var1, @NotNull @NotNull FeatherSourceFile8 var2) {
      this.kr = var1;
      this.db = var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile171 af() {
      return this.kr;
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile171 var1) {
      this.kr = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile8 pv() {
      return this.db;
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile8 var1) {
      this.db = var1;
   }
}
