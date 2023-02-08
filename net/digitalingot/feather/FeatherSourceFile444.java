package net.digitalingot.feather;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionEffect;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.POTION_EFFECTS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.potioneffects",
   jl = "https://assets.feathercdn.net/game/mods/potioneffects.svg",
   od = "feather.moduledescription.potioneffects",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc38.class
)}
)
public class FeatherSourceFile444 extends FeatherSourceFile360 {
   private static final List DN = Lists.newArrayList(new PotionEffect[]{mr(1, 1000, 1), mr(2, 2456, 7), mr(3, 8456, 12), mr(4, 12456, 6), mr(5, 45456, 17)});
   private static final Set DO = Sets.newHashSet(new Integer[]{9, 12, 13, 14, 15, 16});
   private static final FeatherSourceFile$xj8 DP = FeatherSourceFile$oe8.bT();
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile444(Minecraft var1) {
      this.minecraft = var1;
   }

   private static PotionEffect mr(int var0, int var1, int var2) {
      return new PotionEffect(var0, var1, var2);
   }

   private static String ch(String var0) {
      char[] var1 = var0.toCharArray();
      boolean var2 = true;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var1[var4];
         if (var5 == ' ') {
            var2 = true;
         } else if (var2) {
            var1[var4] = Character.toUpperCase(var5);
            var2 = false;
         }
      }

      return new String(var1);
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile444 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static List bN() {
      return DN;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile$xj8 bO() {
      return DP;
   }

   // $FF: synthetic method
   static String yz(String var0) {
      return ch(var0);
   }

   // $FF: synthetic method
   static Set bP() {
      return DO;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lt(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hb(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ep(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qr(FeatherSourceFile444 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 eg(FeatherSourceFile444 var0) {
      return var0.fS;
   }
}
