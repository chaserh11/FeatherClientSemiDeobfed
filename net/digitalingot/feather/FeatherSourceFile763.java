package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile763 {
   @SerializedName("enabled")
   private final boolean enabled;
   @SerializedName("favorite")
   private final boolean eP;
   @SerializedName("settings")
   @NotNull
   private final @NotNull JsonElement eQ;

   public FeatherSourceFile763(boolean var1, boolean var2, JsonElement var3) {
      this.enabled = var1;
      this.eP = var2;
      this.eQ = var3;
   }

   public boolean vy() {
      return this.enabled;
   }

   public boolean pj() {
      return this.eP;
   }

   @NotNull
   public @NotNull JsonElement tc() {
      return this.eQ;
   }
}
