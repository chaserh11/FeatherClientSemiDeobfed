package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile753 implements FeatherSourceFile706 {
   @SerializedName("mods")
   @NotNull
   private final @NotNull List eD;

   public FeatherSourceFile753(@NotNull @NotNull List var1) {
      this.eD = var1;
   }

   @NotNull
   public @NotNull List tw() {
      return this.eD;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_MOD_POSITIONS;
   }
}
