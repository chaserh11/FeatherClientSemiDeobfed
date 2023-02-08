package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;

public class FeatherSourceFile621 {
   @SerializedName("lat")
   private final double JG;
   @SerializedName("lon")
   private final double JH;

   public static FeatherSourceFile621 eD() {
      return (FeatherSourceFile621)FeatherSourceFile815.xz("https://geo.feathermc.com/geolocation").km(FeatherSourceFile621.class);
   }

   public FeatherSourceFile621(double var1, double var3) {
      this.JG = var1;
      this.JH = var3;
   }

   public double eE() {
      return this.JG;
   }

   public double eF() {
      return this.JH;
   }
}
