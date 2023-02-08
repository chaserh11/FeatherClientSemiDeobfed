package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile476 implements FeatherSourceFile706 {
   @SerializedName("mod")
   @NotNull
   private final @NotNull FeatherSourceFile243 eG;
   @SerializedName("enabled")
   @Nullable
   private final @Nullable Boolean eH;
   @SerializedName("favorite")
   @Nullable
   private final @Nullable Boolean eI;
   @SerializedName("renderMod")
   @Nullable
   private final @Nullable Boolean eJ;
   @SerializedName("settings")
   @Nullable
   private final @Nullable Map eK;

   public FeatherSourceFile476(@NotNull @NotNull FeatherSourceFile243 var1, @Nullable @Nullable Boolean var2, @Nullable @Nullable Boolean var3, @Nullable @Nullable Boolean var4, @Nullable @Nullable Map var5) {
      this.eG = var1;
      this.eH = var2;
      this.eI = var3;
      this.eJ = var4;
      this.eK = var5;
   }

   @NotNull
   public @NotNull FeatherSourceFile243 rs() {
      return this.eG;
   }

   @Nullable
   public @Nullable Boolean ev() {
      return this.eH;
   }

   @Nullable
   public @Nullable Boolean ft() {
      return this.eI;
   }

   @Nullable
   public @Nullable Boolean ow() {
      return this.eJ;
   }

   @Nullable
   public @Nullable Map cq() {
      return this.eK;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.UPDATE_MOD_SETTINGS;
   }
}
