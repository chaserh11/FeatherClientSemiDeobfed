package net.digitalingot.feather;

import com.google.common.collect.Maps;
import java.util.Map;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

@Singleton
public class FeatherSourceFile420 {
   public static final String QO = "feather_rt";
   private final FeatherSourceFile434 xj;
   private final Map QP = Maps.newHashMap();

   @Inject
   FeatherSourceFile420(FeatherSourceFile434 var1) {
      this.xj = var1;
   }

   public void fe() {
      this.xj.lh(this::wX, 1L);
      FeatherSourceFile660.ws.oe(this::wX);
   }

   public void lh(ResourceLocation var1, FeatherSourceFile421 var2) {
      this.QP.put(var1, var2);
   }

   public FeatherSourceFile421 qy(ResourceLocation var1) {
      return (FeatherSourceFile421)this.QP.get(var1);
   }

   public void ou(ResourceLocation var1) {
      this.QP.remove(var1);
   }

   private void wX() {
      getDomainResourceManagers().put("feather_rt", new FeatherSourceFile422(this));
   }

   public static ResourceLocation gk(String var0) {
      return new ResourceLocation("feather_rt", var0);
   }

   private static Map getDomainResourceManagers() {
      net.digitalingot.feather.mixin.core.FeatherSourceFile6 var0 = (net.digitalingot.feather.mixin.core.FeatherSourceFile6)Minecraft.func_71410_x().func_110442_L();
      return var0.getDomainResourceManagers();
   }
}
