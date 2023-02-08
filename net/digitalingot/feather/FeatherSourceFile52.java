package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile52 implements FeatherSourceFile706 {
   @SerializedName("macro")
   @NotNull
   private final @NotNull String cH;

   public FeatherSourceFile52(@NotNull @NotNull String var1) {
      this.cH = var1;
   }

   @NotNull
   public @NotNull String nu() {
      return this.cH;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.DELETE_MACRO;
   }
}
