package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SERVER_ADDRESS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.serveraddress",
   jl = "https://assets.feathercdn.net/game/mods/serveraddress.svg",
   od = "feather.moduledescription.serveraddress",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh24.class
)}
)
public class FeatherSourceFile47 extends FeatherSourceFile360 {
   private static final ResourceLocation EE = new ResourceLocation("textures/misc/unknown_server.png");
   private final Minecraft minecraft;
   private String EF;

   @Inject
   FeatherSourceFile47(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile149.oc.oe((var0) -> {
         if (var0 == FeatherSourceFile$xj20.END) {
            FeatherSourceFile292.wY();
         }

      });
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile47 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile47 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile47 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile47 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile47 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static String ou(FeatherSourceFile47 var0) {
      return var0.EF;
   }

   // $FF: synthetic method
   static String lh(FeatherSourceFile47 var0, String var1) {
      return var0.EF = var1;
   }

   // $FF: synthetic method
   static ResourceLocation cA() {
      return EE;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile47 var0) {
      return var0.fS;
   }
}
