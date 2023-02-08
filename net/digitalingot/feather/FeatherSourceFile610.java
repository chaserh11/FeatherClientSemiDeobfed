package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile610 implements FeatherSourceFile706 {
   @SerializedName("sidebar")
   @NotNull
   private final @NotNull List fQ;

   public FeatherSourceFile610(@NotNull @NotNull List var1) {
      this.fQ = var1;
   }

   @NotNull
   public @NotNull List jk() {
      return this.fQ;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RESET_SIDEBAR_SETTINGS;
   }
}
