package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.ZOOM,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.zoom",
   jl = "https://assets.feathercdn.net/game/mods/zoom.svg",
   od = "feather.moduledescription.zoom",
   wr = {}
)
)
public class FeatherSourceFile462 extends FeatherSourceFile495 {
   public static float qN = 1.0F;
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private final FeatherSourceFile445 qO = new FeatherSourceFile445();
   private boolean qP;
   private boolean qQ;
   private float qR;
   private double qS;
   private double qT;

   @Inject
   FeatherSourceFile462(Minecraft var1, FeatherSourceFile55 var2) {
      this.minecraft = var1;
      this.kQ = var2;
   }

   public void ex() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh47)this.fS).qU;
      }, () -> {
         if (this.uj()) {
            this.gi();
         }
      }, this::ey);
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (this.qP) {
               this.mp();
            }

         }
      });
      FeatherSourceFile149.fr.oe((var1, var2) -> {
         if (this.uj()) {
            if (this.qQ || this.qP) {
               qN = this.cw();
            }
         }
      });
   }

   private void gi() {
      this.qR = 0.0F;
      FeatherSourceFile93 var1 = FeatherSourceFile93.ly();
      this.qS = 1.0;
      this.qT = var1.gr().td();
      if (((FeatherSourceFile$lh47)this.fS).qX) {
         this.qQ = true;
         this.qO.lh(System.currentTimeMillis(), 250L, (float)this.qS, (var1x) -> {
            return Math.min(1.0F, ((FeatherSourceFile$lh47)this.fS).qY.calculate(var1x));
         }, this.gv());
         this.qO.RL = () -> {
            this.qP = true;
            this.qQ = false;
         };
      } else {
         this.qQ = false;
         this.qP = true;
      }

      var1.xj(((FeatherSourceFile$lh47)this.fS).qZ);
   }

   private void ey() {
      this.qP = false;
      FeatherSourceFile93 var1 = FeatherSourceFile93.ly();
      if (((FeatherSourceFile$lh47)this.fS).qX) {
         this.qQ = true;
         this.qO.lh(System.currentTimeMillis(), 250L, qN, (var1x) -> {
            return Math.min(1.0F, ((FeatherSourceFile$lh47)this.fS).qY.calculate(var1x));
         }, 1.0F);
         this.qO.RL = () -> {
            this.qQ = false;
         };
      } else {
         this.qQ = false;
         qN = 1.0F;
      }

      var1.gr().ou(this.qT);
      var1.xj(false);
   }

   private void mp() {
      if (((FeatherSourceFile$lh47)this.fS).qV) {
         int var1 = FeatherSourceFile845.ig();
         if (var1 > 0) {
            this.qR = (float)((double)this.qR + ((FeatherSourceFile$lh47)this.fS).qW);
         } else if (var1 < 0) {
            this.qR = (float)((double)this.qR - ((FeatherSourceFile$lh47)this.fS).qW);
         }
      }

   }

   private float cw() {
      float var1 = this.gv();
      if (((FeatherSourceFile$lh47)this.fS).qX) {
         float var2 = this.qO.er(1.0F);
         return this.qO.xY() && this.qP ? this.hb(var1) : var2;
      } else if (((FeatherSourceFile$lh47)this.fS).qZ) {
         return this.hb(var1);
      } else {
         FeatherSourceFile93.ly().gr().ou(this.qT * ((FeatherSourceFile$lh47)this.fS).rB / 100.0);
         return this.ep(var1);
      }
   }

   private float hb(float var1) {
      var1 = this.ep(var1);
      this.qr(var1);
      return var1;
   }

   private float ep(float var1) {
      float var2 = (float)Math.min(Math.max((double)(var1 + this.qR), this.qS), 20.0);
      this.qR = var2 - var1;
      return var2;
   }

   private void qr(float var1) {
      double var2 = (double)var1 / this.qS;
      double var4 = ((FeatherSourceFile$lh47)this.fS).qZ ? Math.min(4.0 * var2, 1.0) : Math.min(var2, 1.0);
      FeatherSourceFile93.ly().gr().ou(this.qT * var4);
   }

   private float gv() {
      return (float)((FeatherSourceFile$lh47)this.fS).rA / 95.0F * 15.0F;
   }

   public boolean fb() {
      return this.qP;
   }
}
