package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile7 {
   @SerializedName("field")
   @NotNull
   private final @NotNull String fB;
   @SerializedName("values")
   @Nullable
   private final @Nullable List fC;

   public FeatherSourceFile7(@NotNull @NotNull String var1, @Nullable @Nullable List var2) {
      this.fB = var1;
      this.fC = var2;
   }

   @NotNull
   public @NotNull String hx() {
      return this.fB;
   }

   @Nullable
   public @Nullable List ra() {
      return this.fC;
   }
}
