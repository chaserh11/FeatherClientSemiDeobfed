package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile667 implements FeatherSourceFile706 {
   @SerializedName("level")
   private final double dD;

   public FeatherSourceFile667(double var1) {
      this.dD = var1;
   }

   public double zg() {
      return this.dD;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.SET_SCALE_PERCENTAGE;
   }
}
