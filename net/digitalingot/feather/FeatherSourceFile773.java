package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SNAPLOOK,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.snaplook",
   jl = "https://assets.feathercdn.net/game/mods/snaplook.svg",
   od = "feather.moduledescription.snaplook",
   wr = {FeatherSourceFile$lh3.PVP}
)
)
public class FeatherSourceFile773 extends FeatherSourceFile495 {
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private boolean pQ;
   private int pG = 0;

   @Inject
   FeatherSourceFile773(Minecraft var1, FeatherSourceFile55 var2) {
      this.minecraft = var1;
      this.kQ = var2;
   }

   public void ex() {
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         if (this.uj()) {
            this.pQ = false;
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh74)this.fS).pR;
      }, () -> {
         if (this.uj()) {
            this.pQ = true;
            GameSettings var1 = this.minecraft.field_71474_y;
            this.pG = var1.field_74320_O;
            var1.field_74320_O = ((FeatherSourceFile$lh74)this.fS).pS == FeatherSourceFile$lh$lh7.THIRD ? 1 : 2;
            this.xd();
         }
      }, () -> {
         if (this.uj() && this.pQ) {
            GameSettings var1 = this.minecraft.field_71474_y;
            this.pQ = false;
            var1.field_74320_O = this.pG;
            this.xd();
         }
      });
   }

   private void xd() {
      GameSettings var1 = this.minecraft.field_71474_y;
   }
}
