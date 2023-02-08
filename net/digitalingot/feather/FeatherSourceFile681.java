package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile681 implements FeatherSourceFile105 {
   @SerializedName("columns")
   private final int fD;
   @SerializedName("choices")
   @NotNull
   private final @NotNull List fE;

   public FeatherSourceFile681(int var1, @NotNull @NotNull List var2) {
      this.fD = var1;
      this.fE = var2;
   }

   public int bq() {
      return this.fD;
   }

   @NotNull
   public @NotNull List up() {
      return this.fE;
   }
}
