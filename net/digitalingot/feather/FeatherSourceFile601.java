package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile601 implements FeatherSourceFile706 {
   @SerializedName("selected")
   @NotNull
   private final @NotNull String eU;
   @SerializedName("list")
   @NotNull
   private final @NotNull List eV;

   public FeatherSourceFile601(@NotNull @NotNull String var1, @NotNull @NotNull List var2) {
      this.eU = var1;
      this.eV = var2;
   }

   @NotNull
   public @NotNull String pz() {
      return this.eU;
   }

   @NotNull
   public @NotNull List lw() {
      return this.eV;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_MOD_PROFILE_LIST;
   }
}
