package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile783 implements FeatherSourceFile706 {
   @SerializedName("id")
   private final int id;
   @SerializedName("info")
   @NotNull
   private final @NotNull FeatherSourceFile449 fM;

   public FeatherSourceFile783(int var1, @NotNull @NotNull FeatherSourceFile449 var2) {
      this.id = var1;
      this.fM = var2;
   }

   public int qg() {
      return this.id;
   }

   @NotNull
   public @NotNull FeatherSourceFile449 jw() {
      return this.fM;
   }

   @NotNull
   public @NotNull FeatherSourceFile754 hc() {
      return FeatherSourceFile754.CALLBACK;
   }
}
