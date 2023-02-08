package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile79 implements FeatherSourceFile706 {
   @SerializedName("id")
   @NotNull
   private final @NotNull UUID wb;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID me;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String jv;
   @SerializedName("status")
   @NotNull
   private final @NotNull FeatherSourceFile33 cK;

   public FeatherSourceFile79(@NotNull @NotNull UUID var1, @NotNull @NotNull UUID var2, @NotNull @NotNull String var3, @NotNull @NotNull FeatherSourceFile33 var4) {
      this.wb = var1;
      this.me = var2;
      this.jv = var3;
      this.cK = var4;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PLAYER_STATUS_UPDATE;
   }

   @NotNull
   public @NotNull String hz() {
      return this.jv;
   }

   @NotNull
   public @NotNull FeatherSourceFile33 tm() {
      return this.cK;
   }

   @NotNull
   public @NotNull UUID re() {
      return this.wb;
   }

   @NotNull
   public @NotNull UUID bx() {
      return this.me;
   }
}
