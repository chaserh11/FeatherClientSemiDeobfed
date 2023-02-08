package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile392 implements FeatherSourceFile706 {
   @SerializedName("create")
   private final boolean fW;
   @SerializedName("nextFields")
   @NotNull
   private final @NotNull FeatherSourceFile$lh103 fX;

   public FeatherSourceFile392(boolean var1, @NotNull @NotNull FeatherSourceFile$lh103 var2) {
      this.fW = var1;
      this.fX = var2;
   }

   public boolean dn() {
      return this.fW;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh103 gf() {
      return this.fX;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.OPEN_WAYPOINTS_MENU;
   }
}
