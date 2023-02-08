package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile307 implements FeatherSourceFile706 {
   @SerializedName("choices")
   @NotNull
   private final @NotNull Map eB;

   public FeatherSourceFile307(@NotNull @NotNull Map var1) {
      this.eB = var1;
   }

   @NotNull
   public @NotNull Map uu() {
      return this.eB;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_HUD_SELECTION;
   }
}
