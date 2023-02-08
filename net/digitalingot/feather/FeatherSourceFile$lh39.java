package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh39 {
   @SerializedName("id")
   @NotNull
   private final @NotNull UUID ik;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID mf;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String ye;

   public FeatherSourceFile$lh39(@NotNull @NotNull UUID var1, @NotNull @NotNull UUID var2, @NotNull @NotNull String var3) {
      this.ik = var1;
      this.mf = var2;
      this.ye = var3;
   }

   @NotNull
   public @NotNull UUID mf() {
      return this.ik;
   }

   @NotNull
   public @NotNull UUID ye() {
      return this.mf;
   }

   @NotNull
   public @NotNull String me() {
      return this.ye;
   }
}
