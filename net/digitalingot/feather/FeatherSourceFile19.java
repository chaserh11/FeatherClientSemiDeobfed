package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile19 implements FeatherSourceFile706 {
   @SerializedName("mod")
   @NotNull
   private final @NotNull FeatherSourceFile243 cX;
   @SerializedName("box")
   @NotNull
   private final @NotNull FeatherSourceFile$lh89 cY;

   public FeatherSourceFile19(@NotNull @NotNull FeatherSourceFile243 var1, @NotNull @NotNull FeatherSourceFile$lh89 var2) {
      this.cX = var1;
      this.cY = var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile243 xb() {
      return this.cX;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh89 kg() {
      return this.cY;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.RENDER_MOD;
   }
}
