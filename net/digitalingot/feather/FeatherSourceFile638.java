package net.digitalingot.feather;

import java.text.DecimalFormat;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.entity.item.EntityTNTPrimed;
import org.apache.commons.lang3.StringUtils;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.TNT_TIMER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.tnttimer",
   jl = "https://assets.feathercdn.net/game/mods/tnttime.svg",
   od = "feather.moduledescription.tnttimer",
   wr = {FeatherSourceFile$lh3.HYPIXEL}
)
)
public class FeatherSourceFile638 extends FeatherSourceFile495 {
   private static DecimalFormat pT = new DecimalFormat("0.00");

   public void pu() {
      if (((FeatherSourceFile$lh11)this.fS).pU > 0) {
         pT = new DecimalFormat("0." + StringUtils.repeat("0", ((FeatherSourceFile$lh11)this.fS).pU));
      } else {
         pT = new DecimalFormat("0");
      }

   }

   public static String lh(EntityTNTPrimed var0, float var1) {
      boolean var2 = ((FeatherSourceFile428)FeatherSourceFile487.mq().getInstance(FeatherSourceFile428.class)).xK();
      int var3 = var2 ? 27 : 0;
      return pT.format((double)(((float)(var0.field_70516_a - var3) - var1) / 20.0F));
   }

   public int nc(EntityTNTPrimed var1) {
      boolean var2 = ((FeatherSourceFile428)FeatherSourceFile487.mq().getInstance(FeatherSourceFile428.class)).xK();
      int var3 = var2 ? 27 : 0;
      if (!((FeatherSourceFile$lh11)this.fS).pV) {
         int var4 = var1.field_70516_a - var3;
         float var5 = (float)var4 / (80.0F - (float)var3);
         return FeatherSourceFile341.km(1.0F - var5, var5, 0.0F);
      } else {
         return ((FeatherSourceFile$lh11)this.fS).pW.on() ? FeatherSourceFile841.vK().vM() : ((FeatherSourceFile$lh11)this.fS).pW.lm();
      }
   }

   public boolean ed() {
      return ((FeatherSourceFile$lh11)this.fS).hR;
   }
}
