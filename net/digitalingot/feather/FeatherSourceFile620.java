package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile620 implements FeatherSourceFile706 {
   @SerializedName("categories")
   @NotNull
   private final @NotNull FeatherSourceFile$lh3[] eC = FeatherSourceFile$lh3.values();
   @SerializedName("mods")
   @NotNull
   private final @NotNull List eD;

   public FeatherSourceFile620(@NotNull @NotNull List var1) {
      this.eD = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh3[] wx() {
      return this.eC;
   }

   @NotNull
   public @NotNull List tw() {
      return this.eD;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.BUILD_MOD_SETTINGS;
   }
}
