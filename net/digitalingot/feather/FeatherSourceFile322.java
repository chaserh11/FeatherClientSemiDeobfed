package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile322 implements FeatherSourceFile706 {
   @SerializedName("main")
   private final List dU;
   @SerializedName("header")
   private final List dV;

   public FeatherSourceFile322(@NotNull @NotNull List var1, @NotNull @NotNull List var2) {
      this.dU = var1;
      this.dV = var2;
   }

   @NotNull
   public @NotNull List sl() {
      return this.dU;
   }

   @NotNull
   public @NotNull List vs() {
      return this.dV;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_HOMEPAGE_SELECTIONS;
   }
}
