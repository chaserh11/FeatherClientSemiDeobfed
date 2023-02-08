package net.digitalingot.feather;

import java.awt.Color;
import java.nio.FloatBuffer;
import net.digitalingot.vendor.com.google.inject.Singleton;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.DAMAGE_INDICATOR,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.damageindicator",
   jl = "https://assets.feathercdn.net/game/mods/damageindicator.svg",
   od = "feather.moduledescription.damageindicator",
   wr = {}
)
)
public class FeatherSourceFile73 extends FeatherSourceFile495 {
   public void lh(FloatBuffer var1) {
      FeatherSourceFile225 var2 = ((FeatherSourceFile$lh137)this.fS).lF;
      Color var3 = var2.dm();
      if (var2.on()) {
         Color var4 = new Color(FeatherSourceFile841.vK().vM());
         var1.put((float)var4.getRed() / 255.0F);
         var1.put((float)var4.getGreen() / 255.0F);
         var1.put((float)var4.getBlue() / 255.0F);
      } else {
         var1.put((float)var3.getRed() / 255.0F);
         var1.put((float)var3.getGreen() / 255.0F);
         var1.put((float)var3.getBlue() / 255.0F);
      }

      var1.put((float)var3.getAlpha() / 255.0F);
   }
}
