package net.digitalingot.feather;

import java.awt.Color;
import net.minecraft.client.settings.KeyBinding;

class FeatherSourceFile$oe4 {
   protected final FeatherSourceFile$ou1 Cu;
   protected final FeatherSourceFile$qy1 Cv;
   protected final KeyBinding Cw;
   protected final FeatherSourceFile$lh85 Cx;
   protected float Cy;
   protected boolean Cz;
   protected long CA;
   protected boolean CB;
   protected float CC;
   protected float CD;
   protected float CE;
   protected float CF;
   protected String s;
   protected float CG;
   protected float CH;

   public FeatherSourceFile$oe4(FeatherSourceFile$ou1 var1, FeatherSourceFile$qy1 var2, KeyBinding var3) {
      this.Cu = var1;
      this.Cv = var2;
      this.Cw = var3;
      this.Cy = 0.0F;
      this.Cx = new FeatherSourceFile$lh85(this.lh(var1.CR, var1.hH), this.lh(var1.CS, var1.hQ));
      this.ou(System.currentTimeMillis());
   }

   private FeatherSourceFile225 lh(FeatherSourceFile225 var1, FeatherSourceFile225 var2) {
      FeatherSourceFile225 var3 = this.CB ? var1 : var2;
      if (this.Cy != 1.0F) {
         FeatherSourceFile225 var4 = this.CB ? var2 : var1;
         return FeatherSourceFile341.lh(var4, var3, this.Cy);
      } else {
         return var3;
      }
   }

   private Color lh(Color var1, Color var2) {
      Color var3 = this.CB ? var1 : var2;
      if (this.Cy != 1.0F) {
         Color var4 = this.CB ? var2 : var1;
         return FeatherSourceFile341.lh(var4, var3, this.Cy);
      } else {
         return var3;
      }
   }

   public void ou(long var1) {
      boolean var4 = this.Cz;
      boolean var3;
      if (this.CB != var4) {
         this.CB = var4;
         this.CA = var1;
         var3 = true;
      } else {
         var3 = this.Cy != 1.0F;
      }

      if (var3) {
         this.Cy = FeatherSourceFile363.zd((float)((double)(var1 - this.CA) / Math.max(1.0, this.Cu.CM)));
         this.Cx.Cq = this.lh(this.Cu.CS, this.Cu.hQ);
         this.Cx.Cp = this.lh(this.Cu.CR, this.Cu.hH);
      }

   }

   public void x() {
      this.Cx.Cq = this.lh(this.Cu.CS, this.Cu.hQ);
      this.Cx.Cp = this.lh(this.Cu.CR, this.Cu.hH);
      this.s = FeatherSourceFile$qy1.access$2900(this.Cv, this.Cu);
   }

   public void xj(float var1, float var2) {
      this.lh(var1, var2, FeatherSourceFile$xj9.access$3100(FeatherSourceFile$qy1.access$3000(this.Cv)));
   }

   public void lh(float var1, float var2, float var3) {
      this.x();
      FeatherSourceFile$xj9 var4 = FeatherSourceFile$qy1.access$3000(this.Cv);
      this.CC = var1 * (FeatherSourceFile$xj9.access$3200(var4) + FeatherSourceFile$xj9.access$3300(var4));
      this.CD = var2 * (FeatherSourceFile$xj9.access$3100(var4) + 1.0F);
      this.CE = this.CC + FeatherSourceFile$xj9.access$3200(var4);
      this.CF = this.CD + var3;
      this.CG = this.CC + (FeatherSourceFile$xj9.access$3200(var4) - (float)FeatherSourceFile$qy1.access$3400(this.Cv, this.Cu)) / 2.0F;
      this.CH = this.CD + (var3 - 7.0F) / 2.0F;
   }
}
