package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile751 implements FeatherSourceFile706 {
   @SerializedName("status")
   @NotNull
   private final @NotNull FeatherSourceFile33 cK;

   public FeatherSourceFile751(@NotNull @NotNull FeatherSourceFile33 var1) {
      this.cK = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CHANGE_STATUS_STATE;
   }

   @NotNull
   public @NotNull FeatherSourceFile33 tm() {
      return this.cK;
   }
}
