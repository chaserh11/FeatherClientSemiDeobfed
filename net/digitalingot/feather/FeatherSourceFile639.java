package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile639 implements FeatherSourceFile706 {
   @SerializedName("link")
   @NotNull
   private final @NotNull String dL;

   public FeatherSourceFile639(@NotNull @NotNull String var1) {
      this.dL = var1;
   }

   public String gb() {
      return this.dL;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.OPEN_LINK;
   }
}
