package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FeatherSourceFile8 {
   @SerializedName("favorites")
   private List dM;
   @SerializedName("lastUsed")
   private List dN;

   public FeatherSourceFile8(List var1, List var2) {
      this.dM = var1;
      this.dN = var2;
   }

   public List uz() {
      return this.dM;
   }

   public void oe(List var1) {
      this.dM = var1;
   }

   public List hs() {
      return this.dN;
   }

   public void qy(List var1) {
      this.dN = var1;
   }
}
