package net.digitalingot.feather;

import java.awt.geom.Point2D;

public class FeatherSourceFile89 {
   @FeatherSourceFile571(
      lb = "hudEnabled",
      jc = "feather.commonterm.enabled",
      jm = @FeatherSourceFile655(
   kz = 0
)
   )
   public boolean gF;
   @FeatherSourceFile571(
      lb = "hudAnchor",
      jc = "AnchorPoint",
      kd = "top_left",
      jm = @FeatherSourceFile655(
   kz = -99
)
   )
   public transient FeatherSourceFile637 gG;
   @FeatherSourceFile571(
      lb = "hudRelativeX",
      jc = "Relative X",
      jm = @FeatherSourceFile655(
   kz = -98
)
   )
   public transient double gH;
   @FeatherSourceFile571(
      lb = "hudRelativeY",
      jc = "Relative Y",
      jm = @FeatherSourceFile655(
   kz = -97
)
   )
   public transient double gI;
   @FeatherSourceFile571(
      lb = "hudScale",
      jc = "Scale",
      jm = @FeatherSourceFile655(
   kz = -96
)
   )
   public transient double gJ;

   public double getX(double var1) {
      return this.gG.getX((double)FeatherSourceFile851.iL()) + this.gH - this.gG.getX(var1);
   }

   public double getY(double var1) {
      return this.gG.getY((double)FeatherSourceFile851.iM()) + this.gI - this.gG.getY(var1);
   }

   public double qy(FeatherSourceFile413 var1) {
      return this.gG.getX((double)FeatherSourceFile851.iL()) - this.gG.getX(var1.nt());
   }

   public double ou(FeatherSourceFile413 var1) {
      return this.gG.getY((double)FeatherSourceFile851.iM()) - this.gG.getY(var1.jf());
   }

   public void ui() {
      double var1 = this.gG.getX((double)FeatherSourceFile851.iL()) + this.gH;
      double var3 = this.gG.getY((double)FeatherSourceFile851.iM()) + this.gI;
      FeatherSourceFile637 var5 = FeatherSourceFile637.TOP_LEFT;
      double var6 = -1.0;
      FeatherSourceFile637[] var8 = FeatherSourceFile637.values();
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         FeatherSourceFile637 var11 = var8[var10];
         double var12 = Point2D.distance(var1, var3, var11.getX((double)FeatherSourceFile851.iL()), var11.getY((double)FeatherSourceFile851.iM()));
         if (var6 == -1.0 || var12 < var6) {
            var5 = var11;
            var6 = var12;
         }
      }

      this.gH = var1 - var5.getX((double)FeatherSourceFile851.iL());
      this.gI = var3 - var5.getY((double)FeatherSourceFile851.iM());
      this.gG = var5;
   }

   public void lh(FeatherSourceFile413 var1, double var2, double var4) {
      double var6;
      double var8;
      label31: {
         this.ui();
         var6 = var2 - this.qy(var1);
         var8 = var4 - this.ou(var1);
         if (this.gG.isLeft()) {
            if (!(var6 < 0.0)) {
               break label31;
            }
         } else if (!this.gG.isRightSide() || !(var6 > 0.0)) {
            break label31;
         }

         var6 = 0.0;
      }

      label23: {
         if (this.gG.isTop()) {
            if (!(var8 < 0.0)) {
               break label23;
            }
         } else if (!this.gG.isBottomSide() || !(var8 > 0.0)) {
            break label23;
         }

         var8 = 0.0;
      }

      this.gH = var6;
      this.gI = var8;
   }

   public void lh(FeatherSourceFile637 var1, double var2, double var4) {
      this.gG = var1;
      this.gH = var2;
      this.gI = var4;
   }

   public void nc(FeatherSourceFile413 var1, double var2, double var4) {
      double var6 = 0.0;
      double var8 = 0.0;
      if (this.gG.isLeft()) {
         var6 = var1.nt() / 2.0;
      }

      if (this.gG.isRightSide()) {
         var6 = -var1.nt() / 2.0;
      }

      if (this.gG.isTop()) {
         var8 = var1.jf() / 2.0;
      } else if (this.gG.isBottomSide()) {
         var8 = -var1.jf() / 2.0;
      }

      this.gH = var2 - this.gG.getX((double)FeatherSourceFile851.iL()) - var6;
      this.gI = var4 - this.gG.getY((double)FeatherSourceFile851.iM()) - var8;
   }

   public void lh(FeatherSourceFile637 var1, double var2, double var4, double var6) {
      this.gG = var1;
      this.gH = var2;
      this.gI = var4;
      this.gJ = var6;
   }

   public double ee() {
      return this.gJ;
   }

   public boolean ca() {
      return this.gF;
   }
}
