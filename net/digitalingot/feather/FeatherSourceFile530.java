package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile530 implements Comparable {
   @SerializedName("name")
   @NotNull
   private final @NotNull String name;
   @SerializedName("slug")
   @NotNull
   private final @NotNull FeatherSourceFile243 eG;
   @SerializedName("icon")
   @NotNull
   private final @NotNull String icon;
   @SerializedName("description")
   @NotNull
   private final @NotNull String eL;
   @SerializedName("renderMod")
   private final Boolean eJ;
   @SerializedName("categories")
   @NotNull
   private final @NotNull FeatherSourceFile$lh3[] eC;
   @SerializedName("alias")
   @NotNull
   private final @NotNull String[] eM;
   @SerializedName("form")
   @NotNull
   private final @NotNull List cU;
   private final transient boolean eN;
   private final transient String eO;

   public FeatherSourceFile530(@NotNull @NotNull String var1, @NotNull @NotNull String var2, @NotNull @NotNull FeatherSourceFile243 var3, @NotNull @NotNull String var4, @NotNull @NotNull String var5, Boolean var6, @NotNull @NotNull FeatherSourceFile$lh3[] var7, @NotNull @NotNull String[] var8, @NotNull @NotNull List var9) {
      this.name = var1;
      this.eG = var3;
      this.icon = var4;
      this.eL = var5;
      this.eJ = var6;
      this.eC = var7;
      this.eM = var8;
      this.cU = var9;
      this.eN = Arrays.stream(var7).anyMatch((var0) -> {
         return var0 == FeatherSourceFile$lh3.NEW;
      });
      this.eO = var2;
   }

   @NotNull
   public @NotNull String getName() {
      return this.name;
   }

   @NotNull
   public @NotNull FeatherSourceFile243 rs() {
      return this.eG;
   }

   @NotNull
   public @NotNull String getIcon() {
      return this.icon;
   }

   @NotNull
   public @NotNull String wc() {
      return this.eL;
   }

   public boolean wo() {
      return this.eJ;
   }

   public boolean fp() {
      return this.eN;
   }

   @NotNull
   public @NotNull String[] pn() {
      return this.eM;
   }

   @NotNull
   public @NotNull String qa() {
      return this.eO;
   }

   @NotNull
   public @NotNull FeatherSourceFile$lh3[] wx() {
      return this.eC;
   }

   @NotNull
   public @NotNull List hu() {
      return this.cU;
   }

   public @NotNull int lh(@NotNull @NotNull FeatherSourceFile530 var1) {
      if (this.eN && !var1.eN) {
         return -1;
      } else {
         return !this.eN && var1.eN ? 1 : this.eO.compareTo(var1.qa());
      }
   }

   // $FF: synthetic method
   public @NotNull int compareTo(@NotNull @NotNull Object var1) {
      return this.lh((FeatherSourceFile530)var1);
   }
}
