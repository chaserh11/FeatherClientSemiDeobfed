package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.init.Blocks;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.CLEAR_WATER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.clearwater",
   jl = "https://assets.feathercdn.net/game/mods/clearwater.svg",
   od = "feather.moduledescription.clearwater",
   wr = {}
)
)
public class FeatherSourceFile680 extends FeatherSourceFile495 {
   private float kV;
   private float kW;

   public void ex() {
      FeatherSourceFile2.xh.oe((var1, var2) -> {
         if (this.uj()) {
            if (((FeatherSourceFile$lh50)this.fS).lp && var1 == Blocks.field_150355_j) {
               return this.kV;
            }

            if (((FeatherSourceFile$lh50)this.fS).kY && var1 == Blocks.field_150353_l) {
               return this.kW;
            }
         }

         return null;
      });
   }

   public void pu() {
      this.kV = sb(((FeatherSourceFile$lh50)this.fS).lA);
      this.kW = sb(((FeatherSourceFile$lh50)this.fS).kZ);
   }

   private static float sb(int var0) {
      return (float)var0 * 0.2F / 100.0F;
   }
}
