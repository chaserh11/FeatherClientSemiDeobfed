package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile362 implements FeatherSourceFile706 {
   @SerializedName("mod")
   public FeatherSourceFile243 dX;
   @SerializedName("hudEditButton")
   private boolean dY;

   public FeatherSourceFile362(FeatherSourceFile243 var1, boolean var2) {
      this.dX = var1;
      this.dY = var2;
   }

   public FeatherSourceFile243 vk() {
      return this.dX;
   }

   public boolean nl() {
      return this.dY;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.OPEN_FEATHER_MODS;
   }
}
