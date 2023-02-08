package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SCROLLABLE_TOOLTIPS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.scrollabletooltips",
   jl = "https://assets.feathercdn.net/game/mods/scrollabletooltips.svg",
   od = "feather.moduledescription.scrollabletooltips",
   wr = {}
)
)
public class FeatherSourceFile694 extends FeatherSourceFile495 {
   private static final int pL = FeatherSourceFile766.fh(16).ol();
   private final Minecraft minecraft;
   private boolean pM;
   private boolean pN;
   private int pO = 0;
   private int pP = 0;

   @Inject
   FeatherSourceFile694(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ml() {
      FeatherSourceFile598.qw.oe((var1, var2, var3, var4, var5, var6) -> {
         if (this.uj() && this.minecraft.field_71462_r != null) {
            int var7 = this.minecraft.field_71462_r.field_146295_m;
            if (!this.pM && !this.pN) {
               this.pO = 0;
               this.pP = 0;
            }

            this.pM = var4 < 0;
            this.pN = var3 < 0;
            if (this.pM || this.pN) {
               int var8 = FeatherSourceFile845.ig();
               if (FeatherSourceFile704.lh(pL)) {
                  if (var8 < 0) {
                     this.pO += 10;
                  } else if (var8 > 0) {
                     this.pO -= 10;
                  }
               } else if (var8 < 0) {
                  this.pP -= 10;
               } else if (var8 > 0) {
                  this.pP += 10;
               }

               if (this.pM) {
                  if (this.pP + var4 > 6) {
                     this.pP = -var4 + 6;
                  } else if (this.pP + var4 + var6 + 6 < var7) {
                     this.pP = var7 - 6 - var4 - var6;
                  }
               }
            }

            if (this.pO != 0 || this.pP != 0) {
               FeatherSourceFile843.hS();
               FeatherSourceFile843.qy((float)this.pO, (float)this.pP, 0.0F);
            }

         }
      });
      FeatherSourceFile598.je.oe((var1, var2, var3, var4, var5, var6) -> {
         if (this.uj() && (this.pO != 0 || this.pP != 0)) {
            FeatherSourceFile843.hT();
         }

      });
   }
}
