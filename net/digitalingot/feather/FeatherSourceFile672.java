package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile672 implements FeatherSourceFile706 {
   @SerializedName("sidebar")
   @NotNull
   private final @NotNull FeatherSourceFile243 fR;
   @SerializedName("settings")
   @NotNull
   private final @NotNull Map eK;

   public FeatherSourceFile672(@NotNull @NotNull FeatherSourceFile243 var1, @NotNull @NotNull Map var2) {
      this.fR = var1;
      this.eK = var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile243 bb() {
      return this.fR;
   }

   @NotNull
   public @NotNull Map cq() {
      return this.eK;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_SIDEBAR_SETTINGS;
   }
}
