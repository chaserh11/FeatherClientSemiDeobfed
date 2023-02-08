package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile141 implements FeatherSourceFile706 {
   @SerializedName("keys")
   private final int[] aC;
   @SerializedName("display")
   @NotNull
   private final @NotNull String cW;

   public FeatherSourceFile141(int[] var1, @NotNull String var2) {
      this.aC = var1;
      this.cW = var2;
   }

   public int[] va() {
      return this.aC;
   }

   @NotNull
   public @NotNull String kw() {
      return this.cW;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CALLBACK;
   }
}
