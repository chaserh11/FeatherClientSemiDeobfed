package net.digitalingot.feather;

import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
public class FeatherSourceFile145 {
   @SerializedName("requestId")
   private final int kw;
   @SerializedName("callType")
   @Nullable
   private final @Nullable FeatherSourceFile754 bN;
   @SerializedName("message")
   @Nullable
   private final @Nullable JsonElement bO;
   @SerializedName("success")
   @Nullable
   private final @Nullable JsonElement bP;
   @SerializedName("failure")
   @Nullable
   private final @Nullable JsonElement bQ;

   public FeatherSourceFile145(int var1, @Nullable @Nullable FeatherSourceFile754 var2, @Nullable @Nullable JsonElement var3, @Nullable @Nullable JsonElement var4, @Nullable @Nullable JsonElement var5) {
      this.kw = var1;
      this.bN = var2;
      this.bO = var3;
      this.bP = var4;
      this.bQ = var5;
   }

   public int oj() {
      return this.kw;
   }

   @Nullable
   public @Nullable FeatherSourceFile754 rx() {
      return this.bN;
   }

   @Nullable
   public @Nullable JsonElement dh() {
      return this.bO;
   }

   @Nullable
   public @Nullable JsonElement ks() {
      return this.bP;
   }

   @Nullable
   public @Nullable JsonElement su() {
      return this.bQ;
   }
}
