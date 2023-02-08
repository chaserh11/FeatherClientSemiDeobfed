package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile504 implements FeatherSourceFile706 {
   @SerializedName("categories")
   @NotNull
   private final @NotNull FeatherSourceFile$lh62[] cO = FeatherSourceFile$lh62.values();
   @SerializedName("cosmetics")
   @NotNull
   private final @NotNull List vv;

   public FeatherSourceFile504(@NotNull @NotNull List var1) {
      this.vv = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh62[] ki() {
      return this.cO;
   }

   @NotNull
   public @NotNull List jy() {
      return this.vv;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.BUILD_COSMETICS_MENU;
   }
}
