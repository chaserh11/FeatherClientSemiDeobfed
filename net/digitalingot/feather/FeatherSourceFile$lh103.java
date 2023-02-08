package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh103 {
   @SerializedName("location")
   @NotNull
   private final @NotNull FeatherSourceFile$lh100 fY;
   @SerializedName("color")
   @NotNull
   private final @NotNull FeatherSourceFile225 fZ;

   public FeatherSourceFile$lh103(@NotNull @NotNull FeatherSourceFile$lh100 var1, @NotNull @NotNull FeatherSourceFile225 var2) {
      this.fY = var1;
      this.fZ = var2;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh100 ei() {
      return this.fY;
   }

   @NotNull
   public @NotNull FeatherSourceFile225 qm() {
      return this.fZ;
   }
}
