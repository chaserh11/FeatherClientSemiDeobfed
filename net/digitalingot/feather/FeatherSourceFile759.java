package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.MOUSE_STROKES,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.mousestrokes",
   jl = "https://assets.feathercdn.net/game/mods/mousestrokes.svg",
   od = "feather.moduledescription.mousestrokes",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh109.class
)}
)
public class FeatherSourceFile759 extends FeatherSourceFile360 {
   private static final FeatherSourceFile465 Dm = FeatherSourceFile665.nc(FeatherSourceFile759.class);
   private static double Dn;
   private static double Do;
   private final FeatherSourceFile445 gi = new FeatherSourceFile445();
   private final FeatherSourceFile445 ey = new FeatherSourceFile445();
   private float Dp;
   private float Dq;

   public void ex() {
      FeatherSourceFile149.oc.oe((var1) -> {
         long var2 = System.currentTimeMillis();
         if (this.gi.mr(var2)) {
            Dn = 0.0;
         }

         if (this.ey.mr(var2)) {
            Do = 0.0;
         }

         this.an();
      });
   }

   public void an() {
      if (Minecraft.func_71410_x().field_71462_r == null) {
         int var1 = this.rl() / 2 - 7;
         int var2 = this.fv() / 2 - 7;
         double var3 = 0.25;
         var3 *= ((FeatherSourceFile$nc45)this.fS).Ds;
         double var5 = FeatherSourceFile363.as(Dn * 3.0 * var3, (double)(-var1), (double)var1);
         double var7 = FeatherSourceFile363.as(Do * 1.75 * var3, (double)(-var2), (double)var2);
         long var9 = System.currentTimeMillis();
         if ((double)this.Dp != var5 && (this.gi.RJ == null || this.gi.RJ.doubleValue() != var5)) {
            this.gi.lh(var9, 150L, this.Dp, (var0) -> {
               return var0;
            }, var5);
         }

         if ((double)this.Dq != var7 && (this.ey.RJ == null || this.ey.RJ.doubleValue() != var7)) {
            this.ey.lh(var9, 150L, this.Dq, (var0) -> {
               return var0;
            }, var7);
         }

      }
   }

   public int rl() {
      return ((FeatherSourceFile$nc45)this.pr()).zb;
   }

   public int fv() {
      return ((FeatherSourceFile$nc45)this.pr()).pp;
   }

   public static void qy(double var0, double var2) {
      Dn = var0;
      Do = var2;
      ((FeatherSourceFile759)Dm.ag()).an();
   }

   // $FF: synthetic method
   static float lh(FeatherSourceFile759 var0, float var1) {
      return var0.Dp = var1;
   }

   // $FF: synthetic method
   static FeatherSourceFile445 lh(FeatherSourceFile759 var0) {
      return var0.gi;
   }

   // $FF: synthetic method
   static float nc(FeatherSourceFile759 var0, float var1) {
      return var0.Dq = var1;
   }

   // $FF: synthetic method
   static FeatherSourceFile445 nc(FeatherSourceFile759 var0) {
      return var0.ey;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile759 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile759 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static float qy(FeatherSourceFile759 var0) {
      return var0.Dp;
   }

   // $FF: synthetic method
   static float ou(FeatherSourceFile759 var0) {
      return var0.Dq;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile759 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile759 var0) {
      return var0.fS;
   }
}
