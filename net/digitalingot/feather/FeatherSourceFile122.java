package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.FOV_CHANGER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.fovchanger",
   jl = "https://assets.feathercdn.net/game/mods/fovchanger.svg",
   od = "feather.moduledescription.fovchanger",
   wr = {}
)
)
public class FeatherSourceFile122 extends FeatherSourceFile495 {
   public static final Potion lR = Potion.func_180142_b("speed");
   public static final Potion lS = Potion.func_180142_b("slowness");
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile122(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile396.ws.oe((var1, var2) -> {
         if (!this.uj()) {
            return var2;
         } else {
            EntityPlayerSP var3 = this.minecraft.field_71439_g;
            float var4 = 100.0F;
            if (var3.func_70051_ag()) {
               var4 = (float)((double)var4 + ((FeatherSourceFile$lh61)this.fS).lW);
            }

            if (var3.field_71075_bZ.field_75100_b) {
               var4 = (float)((double)var4 + ((FeatherSourceFile$lh61)this.fS).lU);
            }

            if (var3.func_70644_a(lR)) {
               var4 = (float)((double)var4 + ((FeatherSourceFile$lh61)this.fS).lX);
            }

            if (var3.func_70644_a(lS)) {
               var4 = (float)((double)var4 - ((FeatherSourceFile$lh61)this.fS).lV);
            }

            ItemStack var5 = var3.func_70694_bm();
            if (((FeatherSourceFile$lh61)this.fS).lT > 0.0 && var5 != null && var5.func_77973_b() instanceof ItemBow) {
               float var6 = (float)Math.pow((double)((float)(var5.func_77988_m() - var3.func_71052_bv()) / 20.0F), 2.0);
               var4 = (float)((double)var4 - (double)MathHelper.func_76131_a(var6, 0.0F, 1.0F) * ((FeatherSourceFile$lh61)this.fS).lT);
            }

            return var1 * var4 / 100.0F;
         }
      });
   }
}
