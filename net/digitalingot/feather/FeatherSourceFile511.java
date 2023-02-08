package net.digitalingot.feather;

import net.minecraft.client.Minecraft;

public class FeatherSourceFile511 extends FeatherSourceFile713 {
   private boolean k;
   private FeatherSourceFile$lh136 l;
   protected float m;
   protected float n = 500.0F;

   public FeatherSourceFile511(FeatherSourceFile475 var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3);
      this.k = var4;
      if (var4) {
         this.l = new FeatherSourceFile$lh136(this, 3, 0);
         this.l.as(1);
         this.l.iy();
         this.l.lh(false, true);
         this.l.xj(this);
         this.l.wz(0, 2);
         this.l.sm(true);
         this.l.lh(new FeatherSourceFile538(100L, 0.0F, 1.0F), true);
      }

   }

   protected void ux(float var1) {
      this.yk();
      if (this.L) {
         this.l.lh(this.zn(), this.ma().zn(), this.m);
         this.l.pq(var1);
      }

      if (this.k) {
         this.ma().vt(-1 * (int)this.m);
      }

      this.ma().pq(var1);
   }

   protected void yk() {
      if (this.L) {
         int var1 = FeatherSourceFile845.ig();
         if (var1 > 0) {
            this.m -= this.n * (((net.digitalingot.feather.mixin.core.FeatherSourceFile9)Minecraft.func_71410_x()).getTimer().field_74279_e / 20.0F);
         } else if (var1 < 0) {
            this.m += this.n * (((net.digitalingot.feather.mixin.core.FeatherSourceFile9)Minecraft.func_71410_x()).getTimer().field_74279_e / 20.0F);
         }
      }

      this.m = FeatherSourceFile363.mq(this.m, 0.0F, (float)(this.ma().zn() - this.zn()));
   }
}
