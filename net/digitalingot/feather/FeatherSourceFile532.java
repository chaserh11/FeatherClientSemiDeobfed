package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;

@Singleton
class FeatherSourceFile532 {
   private final Minecraft minecraft;
   private final Provider gw;
   private final FeatherSourceFile665 hb;
   private final FeatherSourceFile253 nc;
   private final String mr;
   private final FeatherSourceFile718 lg;

   @Inject
   FeatherSourceFile532(Minecraft var1, Provider var2, FeatherSourceFile665 var3, FeatherSourceFile253 var4, @FeatherSourceFile$nc49 String var5, FeatherSourceFile718 var6) {
      this.minecraft = var1;
      this.gw = var2;
      this.hb = var3;
      this.nc = var4;
      this.mr = var5;
      this.lg = var6;
   }

   public void tk() {
      FeatherSourceFile158 var1 = this.lg.hp();
      boolean var2 = ((FeatherSourceFile$lh133)((FeatherSourceFile486)this.gw.get()).pr()).dJ;
      String var3 = "Feather " + this.minecraft.func_175600_c().replace("-feather", "") + " (" + this.mr + ")";
      FeatherSourceFile53 var4 = new FeatherSourceFile53(var1.pv(), var1.af(), var2, var3);
      this.nc.nc(var4);
   }
}
