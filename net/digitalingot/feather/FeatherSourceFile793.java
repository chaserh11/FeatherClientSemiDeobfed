package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile793 implements FeatherSourceFile706 {
   @SerializedName("ordering")
   @NotNull
   private final @NotNull List eF;

   public FeatherSourceFile793(@NotNull @NotNull List var1) {
      this.eF = var1;
   }

   @NotNull
   public @NotNull List rr() {
      return this.eF;
   }

   public FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SAVE_MOD_ORDERING;
   }
}
