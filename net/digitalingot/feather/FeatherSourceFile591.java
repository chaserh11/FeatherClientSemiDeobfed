package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile591 implements FeatherSourceFile706 {
   @SerializedName("cosmetics")
   @NotNull
   private final @NotNull List vv;

   public FeatherSourceFile591(@NotNull @NotNull List var1) {
      this.vv = var1;
   }

   @NotNull
   public @NotNull List jy() {
      return this.vv;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_COSMETICS_SETTINGS;
   }
}
