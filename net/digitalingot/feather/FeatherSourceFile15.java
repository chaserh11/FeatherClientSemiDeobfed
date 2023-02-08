package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile15 implements FeatherSourceFile706 {
   @SerializedName("status")
   @NotNull
   private final @NotNull FeatherSourceFile33 cK;

   public FeatherSourceFile15(@NotNull @NotNull FeatherSourceFile33 var1) {
      this.cK = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SET_STATUS;
   }
}
