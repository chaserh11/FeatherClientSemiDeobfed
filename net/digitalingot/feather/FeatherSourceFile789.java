package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile789 implements FeatherSourceFile105 {
   @SerializedName("dataTypes")
   @NotNull
   private final @NotNull String fF = "decimal";
   @SerializedName("range")
   private final double[] fG;
   @SerializedName("step")
   @Nullable
   private final @Nullable Double fH;

   public FeatherSourceFile789(double var1, double var3, @Nullable @Nullable Double var5) {
      this.fG = new double[]{var1, var3};
      this.fH = var5;
   }

   @NotNull
   public @NotNull String kp() {
      return this.fF;
   }

   public double[] iv() {
      return this.fG;
   }

   @Nullable
   public @Nullable Double dt() {
      return this.fH;
   }
}
