package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile25 implements FeatherSourceFile706 {
   @SerializedName("accounts")
   @NotNull
   private final @NotNull List cG;

   public FeatherSourceFile25(@NotNull @NotNull List var1) {
      this.cG = var1;
   }

   @NotNull
   public @NotNull List bl() {
      return this.cG;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CALLBACK;
   }
}
