package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile164 implements FeatherSourceFile706 {
   @SerializedName("id")
   private final int id;

   public FeatherSourceFile164(int var1) {
      this.id = var1;
   }

   public int qg() {
      return this.id;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CLOSE_P2P;
   }
}
