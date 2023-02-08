package net.digitalingot.feather;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.COORDINATES,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.coordinates",
   jl = "https://assets.feathercdn.net/game/mods/coordinates.svg",
   od = "feather.moduledescription.coordinates",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc26.class
)}
)
public class FeatherSourceFile382 extends FeatherSourceFile360 {
   private static final int zZ = 4;
   private static final String[] Aa = new String[]{"feather.modules.coordinates.north", "feather.modules.coordinates.northeast", "feather.modules.coordinates.east", "feather.modules.coordinates.southeast", "feather.modules.coordinates.south", "feather.modules.coordinates.southwest", "feather.modules.coordinates.west", "feather.modules.coordinates.northwest"};
   private final Minecraft minecraft;
   private final DecimalFormat Ab = new DecimalFormat("0.00");
   private final String Ac = "Preview in-game";
   private final FeatherSourceFile55 kQ;

   @Inject
   FeatherSourceFile382(Minecraft var1, FeatherSourceFile55 var2, FeatherSourceFile249 var3) {
      this.minecraft = var1;
      this.kQ = var2;
   }

   public void ex() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh59)this.fS).Ad;
      }, () -> {
         if (this.uj() && this.minecraft.field_71439_g != null) {
            FeatherSourceFile844.ik(MessageFormat.format("({0}, {1}, {2})", (int)this.minecraft.field_71439_g.field_70169_q, (int)this.minecraft.field_71439_g.field_70167_r, (int)this.minecraft.field_71439_g.field_70166_s));
            FeatherSourceFile198.lh(this.minecraft.field_71439_g, FeatherSourceFile37.lh("feather.modules.coordinates.coordinatesCopiedToClipboard"));
         }
      });
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile382 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lt(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hb(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ep(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qr(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static DecimalFormat eg(FeatherSourceFile382 var0) {
      return var0.Ab;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oy(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ug(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hv(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 sm(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ly(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 rp(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 tx(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wn(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 jh(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 gr(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static String[] aG() {
      return Aa;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oh(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hg(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 et(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 yl(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ai(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ja(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qn(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 er(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 zd(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ps(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xm(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ku(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 vt(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ck(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xy(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 fh(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xi(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 cg(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 sb(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 jr(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 rt(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nb(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 gy(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 bh(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mm(FeatherSourceFile382 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xe(FeatherSourceFile382 var0) {
      return var0.fS;
   }
}
