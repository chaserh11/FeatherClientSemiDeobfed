package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile340 {
   @SerializedName("name")
   @NotNull
   private @NotNull String name;
   @SerializedName("command")
   @NotNull
   private @NotNull String command;
   @SerializedName("key")
   @NotNull
   private @NotNull FeatherSourceFile344 rH;

   public FeatherSourceFile340(@NotNull @NotNull String var1, @NotNull @NotNull String var2, @NotNull @NotNull FeatherSourceFile344 var3) {
      this.name = var1;
      this.command = var2;
      this.rH = var3;
   }

   public void zr() {
      FeatherSourceFile709.lh(this.command);
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   public @NotNull void xe(@NotNull @NotNull String var1) {
      this.name = var1;
   }

   @NotNull
   public @NotNull String gl() {
      return this.command;
   }

   public @NotNull void td(@NotNull @NotNull String var1) {
      this.command = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile344 ay() {
      return this.rH;
   }

   public @NotNull void nc(@NotNull @NotNull FeatherSourceFile344 var1) {
      this.rH = var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile340 var2 = (FeatherSourceFile340)var1;
         return this.name.equals(var2.name);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.name});
   }
}
