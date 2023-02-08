package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile713 {
   protected FeatherSourceFile713 t;
   protected List u;
   protected FeatherSourceFile475 v;
   protected FeatherSourceFile538 w;
   protected boolean x;
   private int zb;
   private int pp;
   protected int pm;
   protected int y;
   protected int z;
   protected int A;
   protected boolean B;
   protected boolean C;
   protected boolean D;
   protected boolean E;
   protected boolean F;
   protected boolean G;
   protected int H;
   protected int I;
   protected FeatherSourceFile290 J;
   protected FeatherSourceFile290 K;
   protected boolean L;
   protected boolean M;
   protected Consumer N;
   protected Consumer O;
   protected boolean P;
   protected boolean Q;
   protected static int R;

   public FeatherSourceFile713() {
      this.u = new ArrayList();
   }

   public FeatherSourceFile713(FeatherSourceFile475 var1, int var2, int var3) {
      this.v = var1;
      this.zb = var2;
      this.pp = var3;
      this.u = new ArrayList();
   }

   public void nc(FeatherSourceFile713 var1) {
      var1.oe(this);
      this.u.add(var1);
   }

   public void xj(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile713 var3 = (FeatherSourceFile713)var2.next();
         this.nc(var3);
      }

   }

   public final void pq(float var1) {
      if (var1 != 0.0F) {
         this.zx();
         this.lc();
         this.ab();
         this.sh();
         this.am();
         this.ke();
         this.hr();
         float var2 = this.lt(var1);
         this.si(var2);
         this.wz(var2);
         if (this.x) {
            var1 = var2;
         }

         this.ux(var1);
         this.gw();
      }
   }

   protected void co() {
      if (this.L) {
         FeatherSourceFile843.wq();
         FeatherSourceFile841.vK().xj(this.z, this.A + this.zn(), this.z + this.aw(), this.A, FeatherSourceFile341.mq(50, 200, 0, 0));
         StringBuilder var1 = new StringBuilder();
         var1.append(this.getClass().getName()).append(' ').append(this.z).append(' ').append(this.A).append(' ').append(this.aw()).append(' ').append(this.zn()).append(' ');
         FeatherSourceFile843.lh((String)var1.toString(), 0, R, -1);
         R += FeatherSourceFile843.hV();
         FeatherSourceFile843.jz();
      }
   }

   protected void zx() {
      if (this.F) {
         this.zb = this.ah() - this.H - this.pm;
      }

      if (this.G) {
         this.pp = this.yo() - this.I - this.y;
      }

   }

   protected void ke() {
      if (this.L && !this.P && FeatherSourceFile845.kx(0)) {
         this.Q = true;
      }

      if (this.Q && !FeatherSourceFile845.kx(0) && this.O != null) {
         this.O.accept(this);
      }

      if (!FeatherSourceFile845.kx(0)) {
         this.Q = false;
      }

      this.P = FeatherSourceFile845.kx(0);
   }

   protected void am() {
      float var1 = (float)FeatherSourceFile198.as(Minecraft.func_71410_x());
      int var2 = (int)(FeatherSourceFile845.zm() / (double)var1);
      int var3 = (int)(FeatherSourceFile845.rq() / (double)var1);
      if (!this.db() && !this.M) {
         this.L = false;
      } else {
         this.L = this.lh(var2, var3, this.z, this.A, this.aw(), this.zn());
         if (this.L && this.N != null) {
            this.N.accept(this);
         }

      }
   }

   protected void hr() {
      if (this.K != null) {
         GL11.glEnable(3089);
         int var1 = FeatherSourceFile198.mq(Minecraft.func_71410_x());
         double var2 = FeatherSourceFile198.as(Minecraft.func_71410_x());
         this.K.dB = (int)((double)this.z * var2);
         this.K.dC = var1 - (int)((double)(this.A + this.pp) * var2);
         this.K.zb = (int)((double)this.aw() * var2);
         this.K.pp = (int)((double)this.zn() * var2);
         this.K.zW();
      }

   }

   protected void gw() {
      this.gt();
      if (this.K != null) {
         if (this.J != null) {
            this.J.zW();
            return;
         }

         GL11.glDisable(3089);
      }

   }

   protected void ux(float var1) {
      Iterator var2 = this.u.iterator();

      while(var2.hasNext()) {
         FeatherSourceFile713 var3 = (FeatherSourceFile713)var2.next();
         var3.pq(var1);
      }

   }

   protected boolean tj() {
      return this.L;
   }

   protected float lt(float var1) {
      if (this.w == null) {
         return var1;
      } else {
         long var2 = System.currentTimeMillis();
         if (!this.w.f && this.tj()) {
            this.w.d = var2;
            this.w.e = -1L;
         } else if (this.w.f && !this.tj()) {
            this.w.e = var2;
            this.w.d = -1L;
         }

         var1 = this.w.i;
         if (this.w.d != -1L) {
            var1 = FeatherSourceFile363.mr(FeatherSourceFile363.zd((float)(var2 - this.w.d) / (float)this.w.g), this.w.i, this.w.j);
         } else if (this.w.e != -1L) {
            var1 = FeatherSourceFile363.mr(FeatherSourceFile363.zd((float)(var2 - this.w.e) / (float)this.w.h), this.w.j, this.w.i);
         }

         this.w.f = this.tj();
         return var1;
      }
   }

   protected void si(float var1) {
      if (this.v != null) {
         this.v.lh(this.z, this.A, this.aw(), this.zn(), var1);
      }
   }

   protected void wz(float var1) {
   }

   public void lg() {
      this.K = new FeatherSourceFile290();
   }

   protected void sh() {
      if (this.D) {
         this.z = this.cu() + (this.ah() - this.aw()) / 2;
      }

      if (this.E) {
         this.A = this.en() + (this.yo() - this.zn()) / 2;
      }

   }

   protected void ab() {
      if (!this.C) {
         this.A = this.en() + this.y;
      } else {
         int var1 = this.yo();
         this.A = this.en() + var1 - this.pp - this.y;
      }
   }

   protected void lc() {
      if (!this.B) {
         this.z = this.cu() + this.pm;
      } else {
         int var1 = this.ah();
         this.z = this.cu() + var1 - this.zb - this.pm;
      }
   }

   public void iy() {
      this.B = true;
   }

   public void uk() {
      this.C = false;
   }

   public void oz() {
      this.B = false;
   }

   public void kr() {
      this.C = true;
   }

   protected boolean db() {
      return this.t.L;
   }

   protected void gt() {
      this.J = this.t.K;
   }

   protected int cu() {
      return this.t.z;
   }

   protected int en() {
      return this.t.A;
   }

   protected int yo() {
      return this.t.zn();
   }

   protected int ah() {
      return this.t.aw();
   }

   public void lh(Consumer var1) {
      this.O = var1;
   }

   public boolean lj() {
      return this.L;
   }

   public void nc(Consumer var1) {
      this.N = var1;
   }

   public void ap() {
      this.u.clear();
   }

   public FeatherSourceFile713 ma() {
      return (FeatherSourceFile713)this.u.get(0);
   }

   public FeatherSourceFile713 ps(int var1) {
      return (FeatherSourceFile713)this.u.get(var1);
   }

   public void xj(FeatherSourceFile713 var1) {
      this.t = var1;
   }

   public void lh(FeatherSourceFile475 var1) {
      this.v = var1;
   }

   public void hv(boolean var1) {
      this.D = var1;
   }

   public void sm(boolean var1) {
      this.E = var1;
   }

   private void oe(FeatherSourceFile713 var1) {
      this.t = var1;
   }

   public int aw() {
      return this.zb;
   }

   public void xm(int var1) {
      this.zb = var1;
   }

   public int zn() {
      return this.pp;
   }

   public void ku(int var1) {
      this.pp = var1;
   }

   public void si(int var1, int var2) {
      this.pm = var1;
      this.y = var2;
   }

   public int kt() {
      return this.pm;
   }

   public void as(int var1) {
      this.pm = var1;
   }

   public int th() {
      return this.y;
   }

   public void vt(int var1) {
      this.y = var1;
   }

   public void lh(FeatherSourceFile538 var1, boolean var2) {
      this.w = var1;
      this.x = var2;
   }

   public FeatherSourceFile538 gd() {
      return this.w;
   }

   public void lh(boolean var1, boolean var2) {
      this.F = var1;
      this.G = var2;
   }

   public void wz(int var1, int var2) {
      this.H = var1;
      this.I = var2;
   }

   public void ge() {
      this.M = true;
   }

   protected boolean lh(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 < var3 + var5 && var2 >= var4 && var2 < var4 + var6;
   }
}
