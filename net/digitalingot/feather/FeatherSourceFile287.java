package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.TOGGLE_SPRINT,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.togglesprint",
   jl = "https://assets.feathercdn.net/game/mods/togglesprint.svg",
   od = "feather.moduledescription.togglesprint",
   wr = {FeatherSourceFile$lh3.PVP}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh54.class
)}
)
public class FeatherSourceFile287 extends FeatherSourceFile360 {
   private final Minecraft minecraft;
   private final KeyBinding Fb;
   private final KeyBinding Fc;
   private boolean Fd;
   private boolean Fe;
   private boolean Ff;
   private boolean Fg;

   @Inject
   FeatherSourceFile287(Minecraft var1) {
      this.minecraft = var1;
      this.Fb = FeatherSourceFile93.ly().xm();
      this.Fc = FeatherSourceFile93.ly().ku();
   }

   public void ex() {
      FeatherSourceFile609.cm.oe((var1, var2, var3, var4) -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               boolean var5 = this.Fb.func_151463_i() == var1;
               if (var5 && var3 == 1 && this.minecraft.field_71439_g.field_71075_bZ.field_75100_b) {
                  this.Ff = ((FeatherSourceFile$nc21)this.fS).Fk && !this.Ff;
                  this.Fg = !this.Fg;
               }

            }
         }
      });
      FeatherSourceFile623.iw.oe((var1) -> {
         if (!this.uj()) {
            return var1;
         } else {
            if (this.Fd) {
               this.Fd = false;
               this.Fe = true;
            }

            return var1;
         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (var1 == FeatherSourceFile$xj20.START) {
               if (this.Fe && Minecraft.func_71410_x().field_71462_r == null) {
                  this.Fd = true;
                  this.Fe = false;
               }

            }
         }
      });
   }

   public void pu() {
      super.pu();
      if (!((FeatherSourceFile$nc21)this.fS).Fj) {
         this.Fd = false;
         this.Fe = false;
      }

      this.Ff = ((FeatherSourceFile$nc21)this.fS).Fk;
   }

   public void ze() {
      this.Ff = false;
      this.Fd = false;
   }

   public boolean cH() {
      return this.uj() && this.Ff;
   }

   public boolean cI() {
      return this.uj() && this.Fd;
   }

   public void qn(boolean var1) {
      this.Fd = var1;
   }

   public boolean cJ() {
      return !this.uj() || !((FeatherSourceFile$nc21)this.fS).Fm;
   }

   public boolean cK() {
      boolean var10000;
      label27: {
         if (this.minecraft.field_71439_g != null && this.minecraft.field_71439_g.field_71075_bZ.field_75098_d) {
            if (((FeatherSourceFile$nc21)this.fS).Fn) {
               if (this.Fg) {
                  break label27;
               }
            } else if (this.Fb.func_151470_d()) {
               break label27;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public int cL() {
      return ((FeatherSourceFile$nc21)this.fS).Fo;
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile287 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static KeyBinding xj(FeatherSourceFile287 var0) {
      return var0.Fb;
   }

   // $FF: synthetic method
   static boolean lh(FeatherSourceFile287 var0, boolean var1) {
      return var0.Ff = var1;
   }

   // $FF: synthetic method
   static boolean oe(FeatherSourceFile287 var0) {
      return var0.Ff;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static KeyBinding ou(FeatherSourceFile287 var0) {
      return var0.Fc;
   }

   // $FF: synthetic method
   static boolean nc(FeatherSourceFile287 var0, boolean var1) {
      return var0.Fd = var1;
   }

   // $FF: synthetic method
   static boolean pq(FeatherSourceFile287 var0) {
      return var0.Fd;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lt(FeatherSourceFile287 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hb(FeatherSourceFile287 var0) {
      return var0.fS;
   }
}
