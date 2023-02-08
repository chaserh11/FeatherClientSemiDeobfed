package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.minecraft.client.gui.GuiOptions;

public class FeatherSourceFile703 {
   private static String vD;
   private final Provider vE;
   private final FeatherSourceFile41 vF;
   FeatherSourceFile434 bh;
   private boolean vG = false;

   @Inject
   FeatherSourceFile703(Provider var1, FeatherSourceFile434 var2, FeatherSourceFile41 var3) {
      this.vE = var1;
      this.bh = var2;
      this.vF = var3;
   }

   public void fe() {
      FeatherSourceFile490.je.oe((var1) -> {
         if (!this.vG && var1 instanceof FeatherSourceFile143 && vD == null) {
            FeatherSourceFile194.ai(FeatherSourceFile194.ak());
            vD = FeatherSourceFile194.ak();
            ((FeatherSourceFile229)this.vE.get()).d();
            this.vG = true;
            this.vF.tk();
         }

      });
      FeatherSourceFile623.iw.oe((var1) -> {
         if (var1 instanceof GuiOptions) {
            String var2 = FeatherSourceFile194.ak();
            if (!var2.equals(vD)) {
               vD = var2;
               FeatherSourceFile194.ai(var2);
               ((FeatherSourceFile229)this.vE.get()).d();
               this.vF.tk();
            }
         }

         return var1;
      });
   }
}
