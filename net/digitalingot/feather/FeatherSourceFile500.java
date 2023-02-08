package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

@Singleton
class FeatherSourceFile500 {
   private final FeatherSourceFile776 wz;
   private final FeatherSourceFile635 on;
   private final FeatherSourceFile489 dm;
   private final FeatherSourceFile596 fy;
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile207 hf;
   private final FeatherSourceFile308 yz;
   private final FeatherSourceFile143 lk;
   private List jx = Lists.newArrayList();
   private int zb;
   private int pp;
   private FeatherSourceFile413 rj = null;
   private int sk = -1;
   private double wt;
   private double vz;
   private double ro;
   private double rc;
   private double fu;
   private int ct;
   private int eq;
   private double fl;
   private double nz;
   private FeatherSourceFile$nc39 ub;
   private FeatherSourceFile$lh96 bk;
   private FeatherSourceFile$ou2 dj;
   private FeatherSourceFile$qy3 bm;
   private FeatherSourceFile$nc39 ji;
   private boolean ur = false;
   private int nx = -1;
   private int hl = 5;
   private final Set rv = EnumSet.noneOf(FeatherSourceFile$xj11.class);
   private final Set pi = EnumSet.noneOf(FeatherSourceFile$xj11.class);
   private final Set vg = EnumSet.noneOf(FeatherSourceFile$xj11.class);

   @Inject
   FeatherSourceFile500(FeatherSourceFile776 var1, FeatherSourceFile635 var2, FeatherSourceFile489 var3, FeatherSourceFile596 var4, FeatherSourceFile665 var5, FeatherSourceFile207 var6, FeatherSourceFile308 var7, FeatherSourceFile143 var8) {
      this.wz = var1;
      this.on = var2;
      this.dm = var3;
      this.fy = var4;
      this.hb = var5;
      this.hf = var6;
      this.yz = var7;
      this.lk = var8;
      this.pf();
   }

   public boolean eh() {
      return this.bk != null;
   }

   public void pt() {
      this.jx = (List)this.du().filter(FeatherSourceFile495::uj).flatMap((var0) -> {
         return var0.hh().stream();
      }).filter((var0) -> {
         return var0.hk().ca();
      }).collect(Collectors.toList());
   }

   private Stream du() {
      return this.hb.dx().stream().filter((var0) -> {
         return var0 instanceof FeatherSourceFile360;
      }).map((var0) -> {
         return (FeatherSourceFile360)var0;
      });
   }

   public void km(int var1, int var2) {
      this.zb = var1;
      this.pp = var2;
      this.pt();
      this.yz.bs();
      this.wz.xj(FeatherSourceFile683.MOD_LAYOUT);
   }

   public void hn() {
      this.de();
      this.jx.clear();
      this.on.ir();
      this.yz.wk();
      this.fy.rp();
   }

   public void mq(int var1, int var2) {
      FeatherSourceFile841.vK().xj(0, 0, this.zb, this.pp, 1056964608);
      FeatherSourceFile$xj11.access$000(this);
      boolean var3 = false;

      for(int var4 = 0; var4 < this.jx.size(); ++var4) {
         if (var4 != this.sk) {
            FeatherSourceFile413 var5 = (FeatherSourceFile413)this.jx.get(var4);
            if (var4 == this.nx && var5 instanceof FeatherSourceFile479) {
               this.ji = FeatherSourceFile$nc39.access$100(var5, var1, var2);
               var3 = true;
            }

            this.lh(var5, var4 == this.nx ? FeatherSourceFile$lh41.SELECTED : FeatherSourceFile$lh41.UNSELECTED);
         }
      }

      if (this.av()) {
         if (this.bk == FeatherSourceFile$lh96.MOVE) {
            this.on.lh(this.rj, this.jx);
            this.on.oe(this.rj);
         } else if (this.rj instanceof FeatherSourceFile479) {
            this.ji = FeatherSourceFile$nc39.access$100(this.rj, var1, var2);
         }

         this.lh(this.rj, FeatherSourceFile$lh41.SELECTED);
         if (this.bk == FeatherSourceFile$lh96.MOVE) {
            this.on.rh();
         }
      } else if (!var3) {
         this.ji = null;
         FeatherSourceFile337.yB();
      }

      FeatherSourceFile337.gr(var1, var2);
   }

   private void lh(FeatherSourceFile413 var1, FeatherSourceFile$lh41 var2) {
      GL11.glPushMatrix();
      GL11.glTranslated(var1.zm(), var1.rq(), 0.0);
      this.dm.lh(var1);
      this.dm.tx(var2.background);
      this.dm.oo();
      this.nc(var1);
      this.dm.lh(var1.zm(), var1.rq(), var2.border, var2.corner, this.nx != this.jx.indexOf(var1) && this.rj != var1 ? FeatherSourceFile$nc39.NONE : this.ji);
      this.dm.rk();
      this.dm.lx();
      GL11.glPopMatrix();
   }

   private void nc(FeatherSourceFile413 var1) {
      FeatherSourceFile852 var2 = var1.yb();
      var2.xj();
      float var3 = (float)var1.hk().ee();
      GL11.glPushMatrix();
      GL11.glScalef(var3, var3, 1.0F);
      var1.lh(FeatherSourceFile683.MOD_LAYOUT);
      GL11.glPopMatrix();
      var2.vO();
   }

   public void lh(char var1, int var2) {
   }

   public boolean qy(int var1, int var2, int var3) {
      this.ur = var3 == 0;
      if (this.ur) {
         int var4 = -1;

         for(int var5 = 0; var5 < this.jx.size(); ++var5) {
            if (this.lh((FeatherSourceFile413)this.jx.get(var5), var1, var2)) {
               var4 = var5;
               break;
            }
         }

         if (var4 != -1) {
            this.jh(var4);
            this.ct = var1;
            this.eq = var2;
            switch (this.bk) {
               case DISABLE:
                  this.tb();
                  return true;
               case OPEN_SETTINGS:
                  this.sn();
                  return true;
            }
         } else {
            this.de();
         }
      }

      return false;
   }

   public void ou(int var1, int var2, int var3) {
      if (var3 == 0) {
         if (this.rj instanceof FeatherSourceFile479) {
            this.hf.jx();
         }

         if (this.av()) {
            this.lz();
         }

         this.vu();
         this.ur = false;
      }

   }

   public void pq(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.ct;
         int var5 = var2 - this.eq;
         if (this.av()) {
            double var7;
            switch (this.bk) {
               case MOVE:
                  this.rj.hk().lh(this.rj, (double)var1 - ((double)this.ct - this.wt) - this.ro, (double)var2 - ((double)this.eq - this.vz) - this.rc);
                  break;
               case RESIZE:
                  if (this.rj instanceof FeatherSourceFile479) {
                     FeatherSourceFile479 var15 = (FeatherSourceFile479)this.rj;
                     var7 = (double)var15.rl();
                     double var16 = (double)var15.fv();
                     double var11 = var15.hk().gJ;
                     if (this.fl == 0.0) {
                        this.fl = var7;
                     }

                     if (this.nz == 0.0) {
                        this.nz = var16;
                     }

                     FeatherSourceFile637 var13 = this.bm.toAnchorPoint();
                     FeatherSourceFile637 var14 = var15.hk().gG;
                     if (this.ub != FeatherSourceFile$nc39.LEFT && this.ub != FeatherSourceFile$nc39.RIGHT) {
                        var15.cg((int)FeatherSourceFile363.as(this.nz + (double)(var5 * FeatherSourceFile$qy3.access$200(this.bm)) / var11, (double)var15.xk(), (double)var15.cp()));
                        if (var14.isBottomSide() == var13.isBottomSide()) {
                           var15.hk().lh(this.rj, this.wt - var14.getX(var7 * var11), this.vz - var14.getY(var16 * var11) + (var16 - this.nz) * (double)FeatherSourceFile$qy3.access$200(this.bm));
                        }
                     } else {
                        var15.xi((int)FeatherSourceFile363.as(this.fl + (double)(var4 * FeatherSourceFile$qy3.access$200(this.bm)) / var11, (double)var15.zf(), (double)var15.ok()));
                        if (!var14.isCenter() && var14.isRightSide() == var13.isRightSide()) {
                           var15.hk().lh(this.rj, this.wt - var14.getX(var7 * var11) + (var7 - this.fl) * (double)FeatherSourceFile$qy3.access$200(this.bm), this.vz - var14.getY(var16 * var11));
                        }
                     }
                  }
                  break;
               case SCALE:
                  int var6;
                  switch (this.ub) {
                     case BOTTOM_RIGHT:
                     case TOP_LEFT:
                        var6 = (var4 + var5) / 2;
                        break;
                     case TOP_RIGHT:
                     case BOTTOM_LEFT:
                        var6 = (var4 - var5) / 2;
                        break;
                     default:
                        throw new AssertionError();
                  }

                  var7 = Math.min(5.0, Math.max(0.20000000298023224, this.fu + (double)(var6 * FeatherSourceFile$ou2.access$300(this.dj)) / 100.0));
                  if (this.rj instanceof FeatherSourceFile211) {
                     FeatherSourceFile211 var9 = (FeatherSourceFile211)this.rj;
                     var7 = FeatherSourceFile363.as(var7, var9.mk(), var9.vd());
                  }

                  this.pq(var7);
            }
         }
      }

   }

   public void lh(double var1, double var3) {
      if (this.bk == null) {
         this.nx = this.mr((int)var1, (int)var3);
      }

   }

   private int mr(int var1, int var2) {
      for(int var3 = 0; var3 < this.jx.size(); ++var3) {
         if (FeatherSourceFile$nc39.access$100((FeatherSourceFile413)this.jx.get(var3), var1, var2) != null) {
            return var3;
         }
      }

      return -1;
   }

   private void tb() {
      this.fy.pq(this.rj);
      this.hf.jx();
      this.de();
      this.pt();
   }

   private void sn() {
      FeatherSourceFile243 var1 = this.rj.rf().fg();
      Minecraft.func_71410_x().func_147108_a(this.lk);
      this.yz.lh(var1);
   }

   private void pq(double var1) {
      FeatherSourceFile89 var3 = this.rj.hk();
      var3.gJ = (double)((float)var1);
   }

   private void lz() {
      FeatherSourceFile89 var1 = this.rj.hk();
      this.wt = this.rj.hk().gG.getX((double)FeatherSourceFile851.iL()) + this.rj.hk().gH;
      this.vz = this.rj.hk().gG.getY((double)FeatherSourceFile851.iM()) + this.rj.hk().gI;
      this.ro = this.rj.hk().gG.getX(this.rj.nt());
      this.rc = this.rj.hk().gG.getY(this.rj.jf());
      this.fu = var1.ee();
   }

   private void jh(int var1) {
      this.sk = var1;
      this.rj = (FeatherSourceFile413)this.jx.get(var1);
      this.lz();
   }

   private void de() {
      this.sk = -1;
      this.rj = null;
      this.vu();
   }

   private void vu() {
      this.ub = null;
      this.bk = null;
      this.dj = null;
      this.bm = null;
      this.fl = 0.0;
      this.nz = 0.0;
   }

   private boolean av() {
      return this.sk != -1;
   }

   private boolean lh(FeatherSourceFile413 var1, int var2, int var3) {
      FeatherSourceFile$nc39 var4 = FeatherSourceFile$nc39.access$100(var1, var2, var3);
      if (var4 != null) {
         this.ub = var4;
         this.bk = FeatherSourceFile$lh96.access$400(var4);
         this.dj = FeatherSourceFile$ou2.access$500(var4);
         this.bm = FeatherSourceFile$qy3.access$600(var4);
         this.nx = -1;
      }

      return var4 != null;
   }

   private static double xn() {
      return FeatherSourceFile851.iN();
   }

   private void gr(int var1) {
      if (this.rj != null) {
         FeatherSourceFile89 var2 = this.rj.hk();
         var2.lh(this.rj, this.wt + (double)((float)var1 / 2.0F) - this.ro, this.vz - this.rc);
         this.lz();
      }

   }

   private void oh(int var1) {
      if (this.rj != null) {
         FeatherSourceFile89 var2 = this.rj.hk();
         var2.lh(this.rj, this.wt - this.ro, this.vz + (double)((float)var1 / 2.0F) - this.rc);
         this.lz();
      }

   }

   private void hg(int var1) {
      this.hl = var1;
   }

   private void lh(int var1, long var2) {
      double var4 = Math.max(0.2, Math.min(5.0, this.fu + (double)var1 * 0.02 * (double)var2 / 125.0));
      FeatherSourceFile89 var6 = this.rj.hk();
      var6.gJ = var4;
   }

   private void yj() {
      if (!this.ur && !this.jx.isEmpty()) {
         int var1 = this.jx.size();
         this.jh((this.sk + 1) % var1);
      }
   }

   private void aa() {
      if (!this.ur && !this.jx.isEmpty()) {
         int var1 = this.jx.size();
         this.jh((this.sk + var1 - 1) % var1);
      }
   }

   private void pf() {
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.LEFT, () -> {
         if (!this.ur) {
            this.gr(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.RIGHT, () -> {
         if (!this.ur) {
            this.gr(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.UP, () -> {
         if (!this.ur) {
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.UP_LEFT, () -> {
         if (!this.ur) {
            this.gr(-this.hl);
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.UP_RIGHT, () -> {
         if (!this.ur) {
            this.gr(this.hl);
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.DOWN, () -> {
         if (!this.ur) {
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.DOWN_LEFT, () -> {
         if (!this.ur) {
            this.gr(-this.hl);
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.DOWN_RIGHT, () -> {
         if (!this.ur) {
            this.gr(this.hl);
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.LEFT, (var1) -> {
         if (!this.ur) {
            this.gr(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.RIGHT, (var1) -> {
         if (!this.ur) {
            this.gr(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.UP, (var1) -> {
         if (!this.ur) {
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.UP_LEFT, (var1) -> {
         if (!this.ur) {
            this.gr(-this.hl);
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.UP_RIGHT, (var1) -> {
         if (!this.ur) {
            this.gr(this.hl);
            this.oh(-this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.DOWN, (var1) -> {
         if (!this.ur) {
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.DOWN_LEFT, (var1) -> {
         if (!this.ur) {
            this.gr(-this.hl);
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.DOWN_RIGHT, (var1) -> {
         if (!this.ur) {
            this.gr(this.hl);
            this.oh(this.hl);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.SPEED_UP, () -> {
         this.hg(25);
      });
      FeatherSourceFile$xj11.access$902(FeatherSourceFile$xj11.SPEED_UP, () -> {
         this.hg(5);
      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.SLOW_DOWN, () -> {
         this.hg(1);
      });
      FeatherSourceFile$xj11.access$902(FeatherSourceFile$xj11.SLOW_DOWN, () -> {
         this.hg(5);
      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.INC_SCALE, () -> {
         if (!this.ur && this.rj != null) {
            FeatherSourceFile89 var1 = this.rj.hk();
            double var2 = var1.gJ + 0.02 * (double)this.hl;
            var1.gJ = var2;
            this.fu = var2;
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.INC_SCALE, (var1) -> {
         if (!this.ur && this.rj != null) {
            this.lh(this.hl, var1);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.DEC_SCALE, () -> {
         if (!this.ur && this.rj != null) {
            FeatherSourceFile89 var1 = this.rj.hk();
            double var2 = var1.gJ - 0.02 * (double)this.hl;
            var1.gJ = var2;
            this.fu = var2;
         }

      });
      FeatherSourceFile$xj11.access$802(FeatherSourceFile$xj11.DEC_SCALE, (var1) -> {
         if (!this.ur && this.rj != null) {
            this.lh(-this.hl, var1);
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.RESET_SCALE, () -> {
         if (!this.ur && this.rj != null) {
            FeatherSourceFile89 var1 = this.rj.hk();
            var1.gJ = 1.0;
            this.fu = 1.0;
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.RESET_POS, () -> {
         if (!this.ur && this.rj != null) {
            this.wt = (double)this.zb / 2.0 / xn();
            this.vz = (double)this.pp / 2.0 / xn();
         }

      });
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.NEXT_MOD, this::yj);
      FeatherSourceFile$xj11.access$702(FeatherSourceFile$xj11.PREV_MOD, this::aa);
   }

   // $FF: synthetic method
   static double js() {
      return xn();
   }

   // $FF: synthetic method
   static Set lh(FeatherSourceFile500 var0) {
      return var0.rv;
   }

   // $FF: synthetic method
   static Set nc(FeatherSourceFile500 var0) {
      return var0.pi;
   }

   // $FF: synthetic method
   static Set xj(FeatherSourceFile500 var0) {
      return var0.vg;
   }

   // $FF: synthetic method
   static boolean oe(FeatherSourceFile500 var0) {
      return var0.ur;
   }

   // $FF: synthetic method
   static FeatherSourceFile413 qy(FeatherSourceFile500 var0) {
      return var0.rj;
   }

   // $FF: synthetic method
   static double lh(FeatherSourceFile500 var0, double var1) {
      return var0.fu = var1;
   }
}
