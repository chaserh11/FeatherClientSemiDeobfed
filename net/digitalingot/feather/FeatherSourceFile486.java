package net.digitalingot.feather;

import java.io.IOException;
import java.util.Objects;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.CORE,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.general",
   jl = "https://assets.feathercdn.net/game/sidebar/general.svg",
   od = "feather.moduledescription.general",
   wr = {},
   ds = @FeatherSourceFile$lh55(
   jc = "General",
   jm = @FeatherSourceFile655(
   kz = 0
)
)
)
)
public class FeatherSourceFile486 extends FeatherSourceFile495 {
   public final Minecraft minecraft;
   private final FeatherSourceFile707 sV;
   private final FeatherSourceFile55 kQ;
   private final FeatherSourceFile279 sO;
   private final FeatherSourceFile430 sW;
   private final FeatherSourceFile249 sX;
   private final FeatherSourceFile229 sY;
   private final FeatherSourceFile615 sZ;
   private final FeatherSourceFile66 tv;
   private final FeatherSourceFile700 ch;
   private final FeatherSourceFile63 tA;
   private final FeatherSourceFile718 lg;
   private final FeatherSourceFile43 tB;
   private final FeatherSourceFile693 pl;
   private final FeatherSourceFile200 rn;
   private boolean tC;

   @Inject
   FeatherSourceFile486(Minecraft var1, FeatherSourceFile707 var2, FeatherSourceFile55 var3, FeatherSourceFile279 var4, FeatherSourceFile430 var5, FeatherSourceFile229 var6, FeatherSourceFile615 var7, FeatherSourceFile66 var8, FeatherSourceFile700 var9, FeatherSourceFile63 var10, FeatherSourceFile718 var11, FeatherSourceFile43 var12, FeatherSourceFile249 var13, FeatherSourceFile693 var14, FeatherSourceFile200 var15) {
      this.minecraft = var1;
      this.sV = var2;
      this.kQ = var3;
      this.sO = var4;
      this.sW = var5;
      this.sX = var13;
      this.sY = var6;
      this.sZ = var7;
      this.tv = var8;
      this.ch = var9;
      this.tA = var10;
      this.lg = var11;
      this.tB = var12;
      this.pl = var14;
      this.rn = var15;
   }

   public void ex() {
      try {
         this.ch.fe();
      } catch (FeatherSourceFile28 | IOException var2) {
         FeatherSourceFile311.Sb.error("Error while trying to authenticate with core backend", var2);
         FeatherSourceFile311.Sb.error("For the time being, you need to be authenticated in order to participate in our beta.");
         this.minecraft.func_71400_g();
         return;
      }

      this.sY.lv();
      this.rn.dZ();
      this.kQ.fe();
      this.sO.fe();
      this.sW.fe();
      this.sZ.fe();
      this.tv.fe();
      this.sV.fe();
      FeatherSourceFile747.lh(() -> {
         this.sY.fe();
         this.sY.pq(((FeatherSourceFile$lh133)this.fS).tE);
      });
      this.tA.fe();
      this.pl.fe();
      if (FeatherSourceFile747.pq()) {
         FeatherSourceFile653.ws.oe((var0) -> {
            (new FeatherSourceFile92()).lh(var0);
         });
      }

      FeatherSourceFile519 var10000 = FeatherSourceFile653.ws;
      FeatherSourceFile43 var10001 = this.tB;
      Objects.requireNonNull(var10001);
      var10000.oe(var10001::lh);
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh133)this.fS).tX;
      }, () -> {
         if (this.minecraft.field_71462_r == null) {
            FeatherSourceFile788.xo();
         }
      });
      this.tC = ((FeatherSourceFile$lh133)this.fS).tG;
   }

   public void pu() {
      FeatherSourceFile171 var1 = this.lg.hp().af();
      var1.xj(((FeatherSourceFile$lh133)this.fS).tP);
      var1.xm(((FeatherSourceFile$lh133)this.fS).tQ.getURL());
      this.sY.pq(((FeatherSourceFile$lh133)this.fS).tE);
      if (((FeatherSourceFile$lh133)this.fS).tG != this.tC) {
         this.tC = ((FeatherSourceFile$lh133)this.fS).tG;
         this.minecraft.func_71352_k();
         this.minecraft.func_71352_k();
      }

   }

   @NotNull
   public @NotNull FeatherSourceFile63 a() {
      return this.tA;
   }

   @NotNull
   public @NotNull FeatherSourceFile700 b() {
      return this.ch;
   }

   @NotNull
   public @NotNull FeatherSourceFile615 c() {
      return this.sZ;
   }

   public int gy(int var1) {
      return Math.min(var1 / 2, ((FeatherSourceFile$lh133)this.fS).tN);
   }

   public int oy(int var1, int var2) {
      return Math.min(var2 / 2, var1);
   }
}
