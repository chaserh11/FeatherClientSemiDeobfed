package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile57 implements FeatherSourceFile706 {
   @SerializedName("port")
   private final int fN;

   public FeatherSourceFile57(int var1) {
      this.fN = var1;
   }

   public int cr() {
      return this.fN;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CALLBACK;
   }
}
