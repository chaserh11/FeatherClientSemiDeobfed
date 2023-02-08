package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile62 implements FeatherSourceFile706 {
   @SerializedName("tabs")
   @NotNull
   private final @NotNull List cN;

   public FeatherSourceFile62(@NotNull @NotNull List var1) {
      this.cN = var1;
   }

   @NotNull
   public @NotNull List sc() {
      return this.cN;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.BUILD_SIDEBAR_SETTINGS;
   }
}
