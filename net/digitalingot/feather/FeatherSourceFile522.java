package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.GRAPHICS_OPTIONS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.graphics",
   jl = "https://assets.feathercdn.net/game/sidebar/graphics.svg",
   od = "feather.moduledescription.graphics",
   wr = {},
   ds = @FeatherSourceFile$lh55(
   jc = "Graphics",
   jm = @FeatherSourceFile655(
   kz = 4
)
)
)
)
public class FeatherSourceFile522 extends FeatherSourceFile495 {
   public final Minecraft minecraft;
   private boolean lY;
   private boolean lZ;

   @Inject
   FeatherSourceFile522(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      this.lY = ((FeatherSourceFile$lh135)this.fS).mD;
      this.lZ = ((FeatherSourceFile$lh135)this.fS).mE;
   }

   public void pu() {
      if (((FeatherSourceFile$lh135)this.fS).mD != this.lY || ((FeatherSourceFile$lh135)this.fS).mE != this.lZ) {
         this.minecraft.func_110436_a();
         this.lY = ((FeatherSourceFile$lh135)this.fS).mD;
         this.lZ = ((FeatherSourceFile$lh135)this.fS).mE;
      }

   }
}
