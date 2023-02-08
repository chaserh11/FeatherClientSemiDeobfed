package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.resources.I18n;

@Singleton
public class FeatherSourceFile541 {
   private final Minecraft minecraft;
   private final FeatherSourceFile143 lk;
   private final FeatherSourceFile308 yz;
   private final FeatherSourceFile543 vQ;
   private boolean vR;
   private final Provider gw;
   private boolean vG;

   @Inject
   FeatherSourceFile541(Minecraft var1, FeatherSourceFile143 var2, FeatherSourceFile308 var3, FeatherSourceFile543 var4, Provider var5) {
      this.minecraft = var1;
      this.lk = var2;
      this.yz = var3;
      this.vQ = var4;
      this.vR = false;
      this.vG = false;
      this.gw = var5;
   }

   private boolean w() {
      return this.minecraft.func_71356_B() && !this.minecraft.func_71401_C().func_71344_c();
   }

   public void x() {
      this.yz.ux(this.w());
   }

   private boolean y() {
      return ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.gw.get()).pr()).tT || FeatherSourceFile6.ha() || FeatherSourceFile130.nw();
   }

   public void fe() {
      FeatherSourceFile623.iw.oe((var1) -> {
         if (!this.vG) {
            this.x();
            this.vG = true;
         }

         if (var1 instanceof GuiIngameMenu) {
            if (!this.vQ.k() && !this.y()) {
               this.x();
               this.yz.yg();
               this.vR = true;
               return this.lk;
            } else {
               return var1;
            }
         } else {
            if (this.vR) {
               this.yz.gs();
               this.vR = false;
            }

            return var1;
         }
      });
      FeatherSourceFile490.je.oe((var1) -> {
         if (var1 instanceof GuiIngameMenu) {
            net.digitalingot.feather.mixin.core.FeatherSourceFile19 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile19)var1;
            var2.getRenderables().removeIf(FeatherSourceFile541::si);
            int var3 = var1.field_146295_m / 4 + 72 - 16;
            GuiButton var4 = FeatherSourceFile375.ot("Server List").pg(99).nh(var1.field_146294_l / 2 - 100).xz(var3).hg(98, 20).yY();
            FeatherSourceFile198.lh(var1, var4);
            int var5 = var1.field_146294_l / 2;
            var5 += 2;
            GuiButton var6 = FeatherSourceFile375.ot("Feather Settings").pg(100).oh(var5, var3).hg(98, 20).yY();
            FeatherSourceFile198.lh(var1, var6);
            if (!this.y()) {
               GuiButton var7 = FeatherSourceFile375.ot("Feather Pause Screen").pg(101).oh(var1.field_146294_l - 120 - 5, 5).hg(120, 20).yY();
               FeatherSourceFile198.lh(var1, var7);
            }

         }
      });
   }

   private static boolean si(Object var0) {
      if (!(var0 instanceof GuiButton)) {
         return false;
      } else {
         GuiButton var1 = (GuiButton)var0;
         String var2 = var1.field_146126_j;
         return var2.equals(I18n.func_135052_a("menu.shareToLan", new Object[0]));
      }
   }

   public void z() {
      this.vQ.h();
      this.minecraft.func_147108_a(new GuiIngameMenu());
   }

   public void A() {
      this.vQ.i();
      this.minecraft.func_147108_a(new GuiIngameMenu());
   }

   public void disconnect() {
      boolean var1 = this.minecraft.func_71387_A();
      this.minecraft.field_71441_e.func_72882_A();
      this.minecraft.func_71403_a((WorldClient)null);
      if (var1) {
         this.minecraft.func_147108_a(new GuiMainMenu());
      } else {
         this.minecraft.func_147108_a(new GuiMultiplayer(new GuiMainMenu()));
      }

   }
}
