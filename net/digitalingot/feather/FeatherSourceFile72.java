package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile72 implements FeatherSourceFile706 {
   @SerializedName("id")
   @NotNull
   private final @NotNull UUID wb;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID me;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String jv;
   @SerializedName("message")
   @NotNull
   private final @NotNull String cA;

   public FeatherSourceFile72(@NotNull @NotNull UUID var1, @NotNull @NotNull UUID var2, @NotNull @NotNull String var3, @NotNull @NotNull String var4) {
      this.wb = var1;
      this.me = var2;
      this.jv = var3;
      this.cA = var4;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.MESSAGE_RECEIVED;
   }

   @NotNull
   public @NotNull String hz() {
      return this.jv;
   }

   @NotNull
   public @NotNull String op() {
      return this.cA;
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
