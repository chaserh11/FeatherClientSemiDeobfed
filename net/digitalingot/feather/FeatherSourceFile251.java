package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile251 implements FeatherSourceFile706 {
   @SerializedName("tab")
   @Nullable
   private final @Nullable String cL;
   @SerializedName("payload")
   @Nullable
   private final @Nullable FeatherSourceFile527 cM;

   public FeatherSourceFile251(@Nullable @Nullable String var1, @Nullable @Nullable FeatherSourceFile527 var2) {
      this.cL = var1;
      this.cM = var2;
   }

   @Nullable
   public @Nullable String tn() {
      return this.cL;
   }

   @Nullable
   public @Nullable FeatherSourceFile527 tl() {
      return this.cM;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CREATE_UPDATE_CHAT_TAB;
   }
}
