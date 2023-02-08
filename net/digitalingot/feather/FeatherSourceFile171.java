package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FeatherSourceFile171 {
   @SerializedName("compact")
   private Boolean dO;
   @SerializedName("favorites")
   private Boolean dP;
   @SerializedName("favoriteMods")
   private List dQ;
   @SerializedName("renderMods")
   private List dR;
   @SerializedName("modPreview")
   private Boolean dS;
   @SerializedName("modPreviewImage")
   private String dT;

   public FeatherSourceFile171(boolean var1, boolean var2, List var3, List var4, boolean var5, String var6) {
      this.dO = var1;
      this.dP = var2;
      this.dQ = var3;
      this.dR = var4;
      this.dS = var5;
      this.dT = var6;
   }

   public Boolean kk() {
      return this.dO;
   }

   public void lh(Boolean var1) {
      this.dO = var1;
   }

   public Boolean qc() {
      return this.dP;
   }

   public void nc(Boolean var1) {
      this.dP = var1;
   }

   public List sq() {
      return this.dQ;
   }

   public void ou(List var1) {
      this.dQ = var1;
   }

   public List hw() {
      return this.dR;
   }

   public void pq(List var1) {
      this.dR = var1;
   }

   public Boolean br() {
      return this.dS;
   }

   public void xj(Boolean var1) {
      this.dS = var1;
   }

   public String dw() {
      return this.dT;
   }

   public void xm(String var1) {
      this.dT = var1;
   }
}
