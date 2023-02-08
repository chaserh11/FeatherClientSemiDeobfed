package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile26 implements FeatherSourceFile706 {
   @SerializedName("main")
   private final List dU;
   @SerializedName("header")
   private final List dV;
   @SerializedName("footer")
   private final List dW;

   public FeatherSourceFile26(@NotNull @NotNull List var1, @NotNull @NotNull List var2, @NotNull @NotNull List var3) {
      this.dU = var1;
      this.dV = var2;
      this.dW = var3;
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
   public @NotNull List bu() {
      return this.dW;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.LOAD_PAUSE_SCREEN_SELECTIONS;
   }
}
