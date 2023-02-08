package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.BRIGHTNESS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.brightness",
   jl = "https://assets.feathercdn.net/game/mods/brightness.svg",
   od = "feather.moduledescription.brightness",
   wr = {FeatherSourceFile$lh3.HUD},
   tp = {"Gamma"}
)
)
public class FeatherSourceFile762 extends FeatherSourceFile495 {
   private final FeatherSourceFile55 kQ;
   private final Minecraft minecraft;

   @Inject
   public FeatherSourceFile762(FeatherSourceFile55 var1, Minecraft var2) {
      this.kQ = var1;
      this.minecraft = var2;
   }

   public void ex() {
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh73)this.fS).kS;
      }, () -> {
         if (this.uj()) {
            EntityPlayerSP var1 = this.minecraft.field_71439_g;
            if (var1 != null) {
               Potion var2 = Potion.func_180142_b("night_vision");
               if (!var1.func_70644_a(var2)) {
                  var1.func_70690_d(new PotionEffect(new PotionEffect(16, 72000, 1)));
               } else {
                  var1.func_82170_o(16);
               }

            }
         }
      });
   }
}
