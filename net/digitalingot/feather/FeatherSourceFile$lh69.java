package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public enum FeatherSourceFile$lh69 {
   @SerializedName("ide")
   IDE(4),
   @SerializedName("development")
   DEVELOPMENT(3),
   @SerializedName("beta")
   BETA(2),
   @SerializedName("release")
   RELEASE(1);

   private final int priority;

   private FeatherSourceFile$lh69(int var3) {
      this.priority = var3;
   }

   public int getPriority() {
      return this.priority;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$lh69[] $values() {
      return new FeatherSourceFile$lh69[]{IDE, DEVELOPMENT, BETA, RELEASE};
   }
}
