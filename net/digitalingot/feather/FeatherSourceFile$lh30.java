package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.util.UUID;

public class FeatherSourceFile$lh30 {
   @SerializedName("email")
   private final String sM;
   @SerializedName("uuid")
   private final UUID aq;
   @SerializedName("name")
   private final String name;
   @SerializedName("authToken")
   private final String sN;

   public FeatherSourceFile$lh30(String var1, UUID var2, String var3, String var4) {
      this.sM = var1;
      this.aq = var2;
      this.name = var3;
      this.sN = var4;
   }

   public String jb() {
      return this.sM;
   }

   public UUID sd() {
      return this.aq;
   }

   public String getName() {
      return this.name;
   }

   public String ry() {
      return this.sN;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile$lh30 var2 = (FeatherSourceFile$lh30)var1;
         return Objects.equals(this.sM, var2.sM) && Objects.equals(this.aq, var2.aq) && Objects.equals(this.name, var2.name) && Objects.equals(this.sN, var2.sN);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.sM, this.aq, this.name, this.sN});
   }
}
