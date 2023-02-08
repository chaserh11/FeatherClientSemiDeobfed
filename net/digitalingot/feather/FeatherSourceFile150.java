package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile150 implements FeatherSourceFile706 {
   @SerializedName("account")
   @NotNull
   private final @NotNull UUID cB;

   public FeatherSourceFile150(@NotNull @NotNull UUID var1) {
      this.cB = var1;
   }

   @NotNull
   public @NotNull UUID ka() {
      return this.cB;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CHANGE_ACCOUNT;
   }
}
