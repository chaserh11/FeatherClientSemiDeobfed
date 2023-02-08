package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile542 implements FeatherSourceFile706 {
   @SerializedName("mods")
   @NotNull
   private final @NotNull Map eT;

   public FeatherSourceFile542(@NotNull @NotNull Map var1) {
      this.eT = var1;
   }

   @NotNull
   public @NotNull Map yf() {
      return this.eT;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_MOD_PROFILE;
   }
}
