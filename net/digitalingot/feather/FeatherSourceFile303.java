package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile303 implements FeatherSourceFile706 {
   @SerializedName("mods")
   @NotNull
   private final @NotNull Collection eE;

   public FeatherSourceFile303(@NotNull @NotNull Collection var1) {
      this.eE = var1;
   }

   @NotNull
   public @NotNull Collection ua() {
      return this.eE;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DISABLED_MODS;
   }
}
