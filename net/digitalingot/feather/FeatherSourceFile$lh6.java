package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh6 {
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID aq;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String ye;

   public static FeatherSourceFile$lh6 lh(FeatherSourceFile$lh30 var0) {
      return new FeatherSourceFile$lh6(var0.sd(), var0.getName());
   }

   public FeatherSourceFile$lh6(@NotNull @NotNull UUID var1, @NotNull @NotNull String var2) {
      this.aq = var1;
      this.ye = var2;
   }

   @NotNull
   public @NotNull UUID oa() {
      return this.aq;
   }

   @NotNull
   public @NotNull String me() {
      return this.ye;
   }
}
