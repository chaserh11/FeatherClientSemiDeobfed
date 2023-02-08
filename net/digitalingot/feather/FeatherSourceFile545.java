package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.PARTICLES,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.particles",
   jl = "https://assets.feathercdn.net/game/mods/particles.svg",
   od = "feather.moduledescription.particles",
   wr = {FeatherSourceFile$lh3.PVP}
)
)
public class FeatherSourceFile545 extends FeatherSourceFile495 {
   private static final Potion oQ = Potion.func_180142_b("blindness");

   public void ex() {
      FeatherSourceFile670.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (var2 instanceof EntityLivingBase) {
               boolean var3 = var1.field_70143_R > 0.0F && !var1.field_70122_E && !var1.func_70617_f_() && !var1.func_70090_H() && !var1.func_70644_a(oQ) && var1.field_70154_o == null;
               float var4 = EnchantmentHelper.func_152377_a(var1.func_70694_bm(), ((EntityLivingBase)var2).func_70668_bt());
               if (((FeatherSourceFile$lh63)this.fS).oR && !(var4 > 0.0F)) {
                  var1.func_71047_c(var2);
               }

               if (var3 || var4 > 0.0F || ((FeatherSourceFile$lh63)this.fS).oR) {
                  for(int var5 = 1; var5 < ((FeatherSourceFile$lh63)this.fS).multiplier; ++var5) {
                     if (var3) {
                        var1.func_71009_b(var2);
                     }

                     if (var4 > 0.0F || ((FeatherSourceFile$lh63)this.fS).oR) {
                        var1.func_71047_c(var2);
                     }
                  }
               }

            }
         }
      });
   }
}
