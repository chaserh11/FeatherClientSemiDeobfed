package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile156 implements FeatherSourceFile706 {
   @SerializedName("uuid")
   @NotNull
   private final @NotNull UUID aq;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID ls;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String jv;
   @SerializedName("coreToken")
   @NotNull
   private final @NotNull String cE;
   @SerializedName("microserviceToken")
   @NotNull
   private final @NotNull String cF;

   public FeatherSourceFile156(@NotNull @NotNull UUID var1, @NotNull @NotNull UUID var2, @NotNull @NotNull String var3, @NotNull @NotNull String var4, @NotNull @NotNull String var5) {
      this.aq = var1;
      this.ls = var2;
      this.jv = var3;
      this.cE = var4;
      this.cF = var5;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SET_FEATHER_USER;
   }
}
