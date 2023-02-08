package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile53 implements FeatherSourceFile706 {
   @SerializedName("colorPicker")
   @NotNull
   private final @NotNull FeatherSourceFile8 dH;
   @SerializedName("modMenu")
   @NotNull
   private final @NotNull FeatherSourceFile171 dI;
   @SerializedName("militaryTime")
   private boolean dJ;
   @SerializedName("version")
   @NotNull
   private final @NotNull String dK;

   public FeatherSourceFile53(@NotNull @NotNull FeatherSourceFile8 var1, @NotNull @NotNull FeatherSourceFile171 var2, boolean var3, @NotNull @NotNull String var4) {
      this.dH = var1;
      this.dI = var2;
      this.dJ = var3;
      this.dK = var4;
   }

   @NotNull
   public @NotNull FeatherSourceFile8 by() {
      return this.dH;
   }

   @NotNull
   public @NotNull FeatherSourceFile171 ci() {
      return this.dI;
   }

   public boolean ss() {
      return this.dJ;
   }

   @NotNull
   public @NotNull String zs() {
      return this.dK;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_CLIENT_PREFERENCES;
   }
}
