package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import net.digitalingot.featherserverapi.proto.models.Waypoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile201 {
   @SerializedName("name")
   @NotNull
   private @NotNull String name;
   @SerializedName("toggled")
   private boolean pQ;
   @SerializedName("color")
   @NotNull
   private @NotNull FeatherSourceFile225 fZ;
   @SerializedName("server")
   @Nullable
   private @Nullable String MC;
   @SerializedName("world")
   private String MD;
   @SerializedName("location")
   @NotNull
   private @NotNull FeatherSourceFile$lh100 fY;
   @SerializedName("direction")
   public double MF;

   public FeatherSourceFile201(@NotNull @NotNull String var1, boolean var2, @NotNull @NotNull FeatherSourceFile225 var3, @NotNull @NotNull FeatherSourceFile$lh100 var4) {
      this.name = var1;
      this.pQ = var2;
      this.fZ = var3;
      this.fY = var4;
   }

   public @NotNull boolean lh(@NotNull @NotNull FeatherSourceFile358 var1) {
      String var2 = var1.gT();
      if (var2 == null) {
         return false;
      } else if (!var2.equals(this.MD)) {
         return false;
      } else {
         String var3 = var1.gU();
         return var3 == null ? true : var3.equals(this.MC);
      }
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   public @NotNull void xe(@NotNull @NotNull String var1) {
      this.name = var1;
   }

   public void er(boolean var1) {
      this.pQ = var1;
   }

   public boolean cy() {
      return this.pQ;
   }

   public @NotNull void nc(@NotNull @NotNull FeatherSourceFile225 var1) {
      this.fZ = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile225 qm() {
      return this.fZ;
   }

   public @Nullable void hy(@Nullable @Nullable String var1) {
      this.MC = var1;
   }

   @Nullable
   public @Nullable String gP() {
      return this.MC;
   }

   public void ue(String var1) {
      this.MD = var1;
   }

   public String gQ() {
      return this.MD;
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile$lh100 var1) {
      this.fY = var1;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh100 ei() {
      return this.fY;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FeatherSourceFile201 var2 = (FeatherSourceFile201)var1;
         return this.name.equals(var2.name);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.name});
   }

   @NotNull
   public static @NotNull @NotNull FeatherSourceFile201 lh(@NotNull @NotNull Waypoint var0) {
      return new FeatherSourceFile201(var0.getName(), true, FeatherSourceFile225.lh(var0.getColor()), FeatherSourceFile$lh100.lh(var0.getLocation()));
   }
}
