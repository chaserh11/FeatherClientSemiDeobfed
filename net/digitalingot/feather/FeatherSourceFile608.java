package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile608 implements FeatherSourceFile706 {
   @SerializedName("sidebar")
   @NotNull
   private final @NotNull Map fP;

   public FeatherSourceFile608(@NotNull @NotNull Map var1) {
      this.fP = var1;
   }

   @NotNull
   public @NotNull Map ta() {
      return this.fP;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_SIDEBAR_SETTINGS;
   }
}
