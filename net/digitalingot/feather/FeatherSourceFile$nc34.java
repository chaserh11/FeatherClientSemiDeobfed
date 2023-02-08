package net.digitalingot.feather;

import java.awt.Color;

public class FeatherSourceFile$nc34 extends FeatherSourceFile413 {
   private String Cb;
   private long Cc;
   private float gX;
   // $FF: synthetic field
   final FeatherSourceFile267 Cd;

   public FeatherSourceFile$nc34(FeatherSourceFile267 var1) {
      this.Cd = var1;
   }

   public void lh(FeatherSourceFile683 var1) {
      this.ja(var1 == FeatherSourceFile683.MOD_LAYOUT);
   }

   public void sy() {
      this.gD.lh("14", 0.0F, 0.0F, ((FeatherSourceFile$lh81)FeatherSourceFile267.lh(this.Cd)).BU, true);
   }

   public int no() {
      return 0;
   }

   public int sv() {
      return 0;
   }

   private void ja(boolean var1) {
      float var2 = this.gX;
      String var3 = null;
      String var4 = null;
      if (((FeatherSourceFile$lh81)FeatherSourceFile267.nc(this.Cd)).BW) {
         if (var1) {
            var3 = "";
         } else {
            var3 = FeatherSourceFile267.xj(this.Cd);
         }
      }

      if (((FeatherSourceFile$lh81)FeatherSourceFile267.oe(this.Cd)).BT) {
         if (var1) {
            var4 = "14";
         } else {
            int var5 = FeatherSourceFile267.qy(this.Cd);
            if (var5 != -1) {
               var4 = String.valueOf(var5);
            }
         }
      }

      float var9 = 1.0F;
      if (!var1 && ((FeatherSourceFile$lh81)FeatherSourceFile267.ou(this.Cd)).BZ) {
         String var6 = var3 + "\n" + var4;
         long var7 = 0L;
         if (var6.equals(this.Cb)) {
            var7 = System.currentTimeMillis() - this.Cc - (long)((FeatherSourceFile$lh81)FeatherSourceFile267.pq(this.Cd)).BR * 100L;
         } else {
            this.Cb = var6;
            this.Cc = System.currentTimeMillis();
         }

         if (var7 >= (long)((FeatherSourceFile$lh81)FeatherSourceFile267.as(this.Cd)).Ca * 100L) {
            return;
         }

         if (var7 > 0L) {
            var9 = 1.0F - (float)var7 / 100.0F / (float)((FeatherSourceFile$lh81)FeatherSourceFile267.km(this.Cd)).Ca;
         }
      }

      Color var10;
      Color var11;
      if (var3 != null) {
         var10 = ((FeatherSourceFile$lh81)FeatherSourceFile267.mq(this.Cd)).BX.dm();
         var11 = new Color(var10.getRed(), var10.getGreen(), var10.getBlue(), Math.max(5, (int)((float)var10.getAlpha() * var9)));
         this.gD.lh(var3, (float)(this.rl() - this.gD.vr(var3)) / 2.0F, var2, var11.getRGB(), true, ((FeatherSourceFile$lh81)FeatherSourceFile267.mr(this.Cd)).BX.on());
         var2 += 16.0F;
      }

      if (var4 != null) {
         var10 = ((FeatherSourceFile$lh81)FeatherSourceFile267.ux(this.Cd)).BU.dm();
         var11 = new Color(var10.getRed(), var10.getGreen(), var10.getBlue(), Math.max(5, (int)((float)var10.getAlpha() * var9)));
         this.gD.lh(var4, (float)(this.rl() - this.gD.vr(var4)) / 2.0F, var2, var11.getRGB(), true, ((FeatherSourceFile$lh81)FeatherSourceFile267.si(this.Cd)).BU.on());
      }

   }

   public int fv() {
      if (((FeatherSourceFile$lh81)FeatherSourceFile267.wz(this.Cd)).BT) {
         return ((FeatherSourceFile$lh81)FeatherSourceFile267.lt(this.Cd)).BW ? 30 : 14;
      } else {
         return ((FeatherSourceFile$lh81)FeatherSourceFile267.hb(this.Cd)).BW ? 14 : 0;
      }
   }

   public int rl() {
      return ((FeatherSourceFile$lh81)FeatherSourceFile267.ep(this.Cd)).BW ? 120 : 30;
   }

   public void pu() {
      float var1 = 8.0F;
      this.gX = ((float)this.fv() - var1) / 2.0F;
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$lh81)FeatherSourceFile267.qr(this.Cd)).yT;
   }
}
