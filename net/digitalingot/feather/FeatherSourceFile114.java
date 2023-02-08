package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile114 {
   @SerializedName("id")
   @NotNull
   private final @NotNull UUID wb;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String jv;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID me;

   public FeatherSourceFile114(@NotNull @NotNull UUID var1, @NotNull @NotNull String var2, @NotNull @NotNull UUID var3) {
      this.wb = var1;
      this.jv = var2;
      this.me = var3;
   }

   public String hz() {
      return this.jv;
   }

   public UUID re() {
      return this.wb;
   }

   public UUID bx() {
      return this.me;
   }
}
