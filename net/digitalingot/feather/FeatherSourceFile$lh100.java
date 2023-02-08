package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.Waypoint.Location;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile$lh100 {
   @SerializedName("x")
   private final int dB;
   @SerializedName("y")
   private final int dC;
   @SerializedName("z")
   private final int MG;

   public FeatherSourceFile$lh100(int var1, int var2, int var3) {
      this.dB = var1;
      this.dC = var2;
      this.MG = var3;
   }

   public @NotNull double ux(@NotNull @NotNull Entity var1) {
      double var2 = (double)this.dB - var1.field_70169_q;
      double var4 = (double)this.dC - var1.field_70167_r;
      double var6 = (double)this.MG - var1.field_70166_s;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public int ax() {
      return this.dB;
   }

   public int ob() {
      return this.dC;
   }

   public int gR() {
      return this.MG;
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile$lh100 lh(@NotNull @NotNull Location var0) {
      return new FeatherSourceFile$lh100(var0.getX(), var0.getY(), var0.getZ());
   }
}
