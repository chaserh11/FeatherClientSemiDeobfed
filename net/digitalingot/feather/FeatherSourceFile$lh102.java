package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh102 {
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @NotNull
   private final @NotNull FeatherSourceFile243 eG;
   @SerializedName("sidebar")
   @NotNull
   private final @NotNull String fO;
   @SerializedName("icon")
   @NotNull
   private final @NotNull String icon;
   @SerializedName("description")
   @NotNull
   private final @NotNull String eL;
   @SerializedName("form")
   @NotNull
   private final @NotNull List cU;

   public FeatherSourceFile$lh102(@NotNull @NotNull String var1, @NotNull @NotNull FeatherSourceFile243 var2, @NotNull @NotNull String var3, @NotNull @NotNull String var4, @NotNull @NotNull String var5, @NotNull @NotNull List var6) {
      this.name = var1;
      this.eG = var2;
      this.fO = var3;
      this.icon = var4;
      this.eL = var5;
      this.cU = var6;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull FeatherSourceFile243 rs() {
      return this.eG;
   }

   @NotNull
   public @NotNull String lq() {
      return this.fO;
   }

   @NotNull
   public @NotNull String getIcon() {
      return this.icon;
   }

   @NotNull
   public @NotNull String wc() {
      return this.eL;
   }

   @NotNull
   public @NotNull List hu() {
      return this.cU;
   }
}
