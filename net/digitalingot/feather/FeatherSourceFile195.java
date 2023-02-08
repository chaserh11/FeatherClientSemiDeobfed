package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile195 implements FeatherSourceFile706 {
   @SerializedName("waypoint")
   @Nullable
   private final @Nullable String fT;
   @SerializedName("payload")
   @NotNull
   private final @NotNull FeatherSourceFile201 fU;

   public FeatherSourceFile195(@Nullable @Nullable String var1, @NotNull @NotNull FeatherSourceFile201 var2) {
      this.fT = var1;
      this.fU = var2;
   }

   @Nullable
   public @Nullable String ky() {
      return this.fT;
   }

   @NotNull
   public @NotNull FeatherSourceFile201 to() {
      return this.fU;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_WAYPOINT;
   }
}
