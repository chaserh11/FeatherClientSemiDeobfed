package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile123 implements FeatherSourceFile706 {
   @SerializedName("waypoint")
   @NotNull
   private final @NotNull String fT;

   public FeatherSourceFile123(@NotNull @NotNull String var1) {
      this.fT = var1;
   }

   @NotNull
   public @NotNull String ky() {
      return this.fT;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_WAYPOINT;
   }
}
