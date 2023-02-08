package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile209 implements FeatherSourceFile706 {
   @SerializedName("pages")
   @NotNull
   private final @NotNull List dZ;

   public FeatherSourceFile209(@NotNull @NotNull List var1) {
      this.dZ = var1;
   }

   @NotNull
   public @NotNull List vo() {
      return this.dZ;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.PAGE_UPDATE;
   }
}
