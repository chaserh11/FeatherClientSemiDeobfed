package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile306 implements FeatherSourceFile706 {
   @SerializedName("selected")
   @NotNull
   private final @NotNull UUID cC;
   @SerializedName("list")
   @NotNull
   private final @NotNull List cD;

   public FeatherSourceFile306(@NotNull @NotNull UUID var1, @NotNull @NotNull List var2) {
      this.cC = var1;
      this.cD = var2;
   }

   @NotNull
   public @NotNull UUID kq() {
      return this.cC;
   }

   @NotNull
   public @NotNull List eu() {
      return this.cD;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_ACCOUNT_LIST;
   }
}
