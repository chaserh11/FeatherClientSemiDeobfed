package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile162 implements FeatherSourceFile706 {
   @SerializedName("macro")
   @Nullable
   private final @Nullable String cH;
   @SerializedName("payload")
   @NotNull
   private final @NotNull FeatherSourceFile340 cI;

   public FeatherSourceFile162(@Nullable @Nullable String var1, @NotNull @NotNull FeatherSourceFile340 var2) {
      this.cH = var1;
      this.cI = var2;
   }

   @Nullable
   public @Nullable String nu() {
      return this.cH;
   }

   @NotNull
   public @NotNull FeatherSourceFile340 iu() {
      return this.cI;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_MACRO;
   }
}
