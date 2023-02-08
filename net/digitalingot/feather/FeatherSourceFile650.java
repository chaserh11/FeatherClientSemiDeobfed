package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class FeatherSourceFile650 extends FeatherSourceFile713 {
   private static int S = 1;
   private FeatherSourceFile$nc55 T;
   private FeatherSourceFile$nc55 U;
   private int V;
   private int W;
   private int X;
   private int Y;

   public FeatherSourceFile650(FeatherSourceFile475 var1, int var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super(var1, var2, var3);
      FeatherSourceFile475 var8 = new FeatherSourceFile475(0.2F, 0.2F, 0.2F, 0.7F);
      var8.ug(true);
      if (var5) {
         this.T = new FeatherSourceFile$lh128(this, var8, 4, 0);
         this.T.lh(false, true);
         this.T.sm(true);
         this.T.as(-2);
         this.T.wz(0, 5);
         this.T.lh(new FeatherSourceFile538(100L, 0.0F, 1.0F), true);
         this.T.ge();
         this.nc(this.T);
      }

      if (var4) {
         this.U = new FeatherSourceFile$xj17(this, var8, 0, 4);
         this.U.lh(true, false);
         this.U.hv(true);
         this.U.vt(-2);
         this.U.wz(5, 0);
         this.U.lh(new FeatherSourceFile538(100L, 0.0F, 1.0F), true);
         this.U.ge();
         this.nc(this.U);
      }

   }

   public FeatherSourceFile650(FeatherSourceFile475 var1, int var2, int var3) {
      this(var1, var2, var3, false, false, false, false);
   }

   protected void zx() {
      super.zx();
      float var1;
      if (this.T != null && this.T.gg()) {
         var1 = (float)FeatherSourceFile198.as(Minecraft.func_71410_x());
         if (!this.B) {
            this.xm((int)(FeatherSourceFile845.zm() / (double)var1) - this.pm);
         } else {
            this.xm(this.ah() - (int)(FeatherSourceFile845.zm() / (double)var1) - this.pm);
         }
      }

      if (this.U != null && this.U.gg()) {
         var1 = (float)FeatherSourceFile198.as(Minecraft.func_71410_x());
         if (!this.C) {
            this.ku((int)(FeatherSourceFile845.rq() / (double)var1) - this.y);
         } else {
            this.ku(this.yo() - (int)(FeatherSourceFile845.rq() / (double)var1) - this.y);
         }
      }

   }

   protected void co() {
      super.co();
      R = 0;
   }

   protected void gt() {
      this.J = null;
   }

   protected boolean db() {
      return true;
   }

   protected int cu() {
      return 0;
   }

   protected int en() {
      return 0;
   }

   protected int yo() {
      return (new ScaledResolution(Minecraft.func_71410_x())).func_78328_b();
   }

   protected int ah() {
      return (new ScaledResolution(Minecraft.func_71410_x())).func_78326_a();
   }

   public void xm(int var1) {
      var1 = FeatherSourceFile363.ep(var1, 0, FeatherSourceFile198.ou(Minecraft.func_71410_x()) - this.pm - 5);
      super.xm(FeatherSourceFile363.ep(var1, this.X, this.V));
   }

   public void ku(int var1) {
      var1 = FeatherSourceFile363.ep(var1, 0, FeatherSourceFile198.pq(Minecraft.func_71410_x()) - this.y - 5);
      super.ku(FeatherSourceFile363.ep(var1, this.Y, this.W));
   }

   public void nc(int var1, int var2, int var3, int var4) {
      this.X = var1;
      this.Y = var2;
      this.V = var3;
      this.W = var4;
   }

   // $FF: synthetic method
   static int if() {
      return S;
   }
}
