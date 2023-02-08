package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile86 implements FeatherSourceFile706 {
   @SerializedName("macros")
   @NotNull
   private final @NotNull Set cJ;

   public FeatherSourceFile86(@NotNull @NotNull Set var1) {
      this.cJ = var1;
   }

   @NotNull
   public @NotNull Set ip() {
      return this.cJ;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_MACROS;
   }
}
