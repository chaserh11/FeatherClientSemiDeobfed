package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile9 implements FeatherSourceFile105 {
   @SerializedName("dataType")
   @NotNull
   private final @NotNull String fF = "int";
   @SerializedName("range")
   private final int[] fI;
   @SerializedName("step")
   @Nullable
   private final @Nullable Integer fJ;

   public FeatherSourceFile9(int var1, int var2, @Nullable @Nullable Integer var3) {
      this.fI = new int[]{var1, var2};
      this.fJ = var3;
   }

   @NotNull
   public @NotNull String kp() {
      return this.fF;
   }

   public int[] in() {
      return this.fI;
   }

   @Nullable
   public @Nullable Integer ho() {
      return this.fJ;
   }
}
