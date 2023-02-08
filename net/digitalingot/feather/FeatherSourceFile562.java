package net.digitalingot.feather;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile562 {
   private final Minecraft minecraft;
   private final FeatherSourceFile253 nc;

   @Inject
   FeatherSourceFile562(Minecraft var1, FeatherSourceFile253 var2) {
      this.minecraft = var1;
      this.nc = var2;
   }

   public @NotNull void lh(boolean var1, @NotNull @NotNull Collection var2) {
      EntityPlayerSP var3 = this.minecraft.field_71439_g;
      FeatherSourceFile$lh100 var4 = new FeatherSourceFile$lh100((int)Math.floor(var3.field_70169_q), (int)Math.floor(var3.field_70167_r), (int)Math.floor(var3.field_70166_s));
      FeatherSourceFile201 var5 = null;

      FeatherSourceFile201 var7;
      for(Iterator var6 = var2.iterator(); var6.hasNext(); var5 = var7) {
         var7 = (FeatherSourceFile201)var6.next();
      }

      FeatherSourceFile225 var9 = var5 != null ? var5.qm() : new FeatherSourceFile225(false, new Color(191, 0, 32, 223));
      FeatherSourceFile$lh103 var10 = new FeatherSourceFile$lh103(var4, var9);
      FeatherSourceFile392 var8 = new FeatherSourceFile392(var1, var10);
      this.nc.nc(var8);
   }
}
