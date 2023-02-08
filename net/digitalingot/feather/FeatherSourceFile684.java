package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile684 implements FeatherSourceFile706 {
   @SerializedName("waypoints")
   @NotNull
   private final @NotNull Collection fV;

   public FeatherSourceFile684(@NotNull @NotNull Collection var1) {
      this.fV = var1;
   }

   @NotNull
   public @NotNull Collection ba() {
      return this.fV;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_WAYPOINTS;
   }
}
