package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;

@Singleton
public class FeatherSourceFile568 {
   private final Minecraft minecraft;
   private final FeatherSourceFile308 yz;
   private final FeatherSourceFile543 vQ;
   private final Provider py;
   private final FeatherSourceFile143 lk;

   @Inject
   FeatherSourceFile568(Minecraft var1, FeatherSourceFile308 var2, FeatherSourceFile543 var3, Provider var4, FeatherSourceFile143 var5) {
      this.minecraft = var1;
      this.yz = var2;
      this.vQ = var3;
      this.py = var4;
      this.lk = var5;
   }

   public void fe() {
      this.yz.ph();
      this.lk.oy(true);
      if (this.minecraft.field_71462_r != null && this.minecraft.field_71462_r instanceof GuiMainMenu && (!this.B() || !this.vQ.j())) {
         this.minecraft.func_147108_a(this.lk);
      }

      FeatherSourceFile490.je.oe((var1) -> {
         if (var1 instanceof GuiMainMenu) {
            this.lh((GuiMainMenu)var1);
         }

      });
      FeatherSourceFile623.iw.oe((var1) -> {
         if (var1 instanceof GuiMainMenu) {
            if (this.B() && this.vQ.j()) {
               return var1;
            } else {
               if (!this.lk.kj()) {
                  this.yz.ph();
                  this.lk.oy(true);
               }

               return this.lk;
            }
         } else {
            if (this.lk.kj()) {
               this.yz.ia();
               this.lk.oy(false);
            } else if (var1 instanceof FeatherSourceFile143 && this.minecraft.field_71439_g == null) {
               this.yz.ph();
               this.lk.oy(true);
            }

            return var1;
         }
      });
   }

   private boolean B() {
      return ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.py.get()).pr()).tS || this.C();
   }

   private boolean C() {
      return FeatherSourceFile130.md();
   }

   public void D() {
      this.vQ.f();
      this.minecraft.func_147108_a(new GuiMainMenu());
   }

   public void E() {
      this.vQ.g();
      this.minecraft.func_147108_a(new GuiMainMenu());
   }

   public void x() {
      this.yz.mr(this.B());
   }

   private void lh(GuiMainMenu var1) {
      GuiButton var2 = FeatherSourceFile375.ot("Feather Main Menu").pg(100).oh(var1.field_146294_l - 120 - 5, 5).hg(120, 20).yY();
      FeatherSourceFile198.lh((GuiScreen)var1, (GuiButton)var2);
   }
}
