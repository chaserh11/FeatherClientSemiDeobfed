package net.digitalingot.feather;

import java.util.Objects;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
public class FeatherSourceFile75 {
   @NotNull
   private final @NotNull FeatherSourceFile549 JV;
   @NotNull
   private final @NotNull FeatherSourceFile633 JP;
   @NotNull
   private final @NotNull FeatherSourceFile698 KJ;
   private final FeatherSourceFile70 JT;
   private final FeatherSourceFile111 JU;
   private final FeatherSourceFile297 KK;
   private final FeatherSourceFile717 KL;

   @Inject
   FeatherSourceFile75(@NotNull @NotNull FeatherSourceFile549 var1, @NotNull @NotNull FeatherSourceFile633 var2, @NotNull @NotNull FeatherSourceFile698 var3, FeatherSourceFile70 var4, FeatherSourceFile717 var5, FeatherSourceFile111 var6, FeatherSourceFile297 var7) {
      this.JV = var1;
      this.JP = var2;
      this.KJ = var3;
      this.JT = var4;
      this.KL = var5;
      this.JU = var6;
      this.KK = var7;
   }

   public void fe() {
      FeatherSourceFile519 var10000 = FeatherSourceFile653.ws;
      FeatherSourceFile297 var10001 = this.KK;
      Objects.requireNonNull(var10001);
      var10000.oe(var10001::lh);
      this.JV.fe();
      this.JP.fe();
      this.KL.fe();
   }

   public @Nullable @Nullable void mr(@Nullable @Nullable String var1, @Nullable @Nullable String var2) {
      if (!this.KL.ch()) {
         FeatherSourceFile311.Sb.info("Starting voice...");
         this.KJ.si(var1, var2);
         this.KL.yh();
         this.JU.fY();
      }
   }

   public void eU() {
      if (this.KL.ch()) {
         this.JT.eJ();
         this.KL.vr();
         this.JU.fZ();
      }
   }

   public @NotNull @NotNull void ux(@NotNull @NotNull String var1, @NotNull @NotNull String var2) {
      this.KJ.si(var1, var2);
   }

   @NotNull
   public @NotNull FeatherSourceFile633 eV() {
      return this.JP;
   }
}
