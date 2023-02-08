package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile502 implements FeatherSourceFile706 {
   @SerializedName("settings")
   @NotNull
   private final @NotNull Map cP;
   @SerializedName("equipped")
   @NotNull
   private final @NotNull Map cQ;

   public FeatherSourceFile502(@NotNull @NotNull Map var1, @NotNull @NotNull Map var2) {
      this.cP = var1;
      this.cQ = var2;
   }

   @NotNull
   public @NotNull Map fq() {
      return this.cP;
   }

   @NotNull
   public @NotNull Map hj() {
      return this.cQ;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_COSMETICS_SETTINGS;
   }
}
