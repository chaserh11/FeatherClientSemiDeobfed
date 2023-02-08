package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Collection;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile599 {
   @SerializedName("id")
   @Nullable
   private final @Nullable Collection hy;
   @SerializedName("mcID")
   @Nullable
   private final @Nullable Collection ue;
   @SerializedName("mcUsername")
   @Nullable
   private final @Nullable Collection az;
   private final int fo;

   public FeatherSourceFile599(@Nullable @Nullable Collection var1, @Nullable @Nullable Collection var2, @Nullable @Nullable Collection var3) {
      this.hy = var1;
      this.ue = var2;
      this.az = var3;
      this.fo = (var1 != null ? var1.size() : 0) + (var2 != null ? var2.size() : 0) + (var3 != null ? var3.size() : 0);
   }

   @Nullable
   public @Nullable Collection ue() {
      return this.hy;
   }

   @Nullable
   public @Nullable Collection az() {
      return this.ue;
   }

   @Nullable
   public @Nullable Collection fo() {
      return this.az;
   }

   public int ib() {
      return this.fo;
   }
}
