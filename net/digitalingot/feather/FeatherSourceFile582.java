package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile582 implements FeatherSourceFile706 {
   @SerializedName("id")
   @NotNull
   private final @NotNull UUID wb;
   @SerializedName("mcID")
   @NotNull
   private final @NotNull UUID me;
   @SerializedName("mcUsername")
   @NotNull
   private final @NotNull String jv;
   @SerializedName("location")
   @Nullable
   private final @Nullable String ej;

   public FeatherSourceFile582(@NotNull @NotNull UUID var1, @NotNull @NotNull UUID var2, @NotNull @NotNull String var3, @Nullable @Nullable String var4) {
      this.wb = var1;
      this.me = var2;
      this.jv = var3;
      this.ej = var4;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PLAYER_LOCATION_UPDATE;
   }

   @NotNull
   public @NotNull String hz() {
      return this.jv;
   }

   @Nullable
   public @Nullable String bo() {
      return this.ej;
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
