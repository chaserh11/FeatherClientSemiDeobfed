package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile384 {
   @SerializedName("uuid")
   @NotNull
   private final @NotNull UUID aq;
   @SerializedName("username")
   @NotNull
   private final @NotNull String ye;

   public FeatherSourceFile384(@NotNull @NotNull UUID var1, @NotNull @NotNull String var2) {
      this.aq = var1;
      this.ye = var2;
   }

   @NotNull
   public @NotNull UUID oa() {
      return this.aq;
   }

   @NotNull
   public @NotNull String me() {
      return this.ye;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile384 var2 = (FeatherSourceFile384)var1;
         return this.aq.equals(var2.aq);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.aq});
   }
}
