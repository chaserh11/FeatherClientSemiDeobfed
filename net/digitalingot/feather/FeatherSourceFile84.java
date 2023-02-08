package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.ITEM_COUNTER,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.itemcounter",
   jl = "https://assets.feathercdn.net/game/mods/itemcounter.svg",
   od = "feather.moduledescription.itemcounter",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc50.class
)}
)
public class FeatherSourceFile84 extends FeatherSourceFile360 {
   private static final Item Bd;
   private static final ItemStack Be;
   private static final ItemStack Bf;
   private static final ItemStack Bg;
   private static final ItemStack Bh;
   private static final ItemStack Bi;
   private static final ItemStack Bj;
   private static final int Bk = 16;
   private static final int Bl = 16;
   private static final int Bm = 2;
   private static final int Bn = 2;
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile84(Minecraft var1) {
      this.minecraft = var1;
   }

   @NotNull
   private static @NotNull @NotNull ItemStack lh(@NotNull @NotNull Item var0, int var1) {
      ItemStack var2 = new ItemStack(var0, 1);
      var2.func_77964_b(var1);
      switch (var1) {
         case 8197:
         case 8261:
         case 16389:
         case 16453:
            lh(var2, "minecraft:healing");
            break;
         case 8229:
         case 16421:
            lh(var2, "minecraft:strong_healing");
      }

      return var2;
   }

   private static void lh(ItemStack var0, String var1) {
   }

   public int aT() {
      int var1 = 0;
      boolean[] var2 = new boolean[]{((FeatherSourceFile$lh104)this.fS).Bv, ((FeatherSourceFile$lh104)this.fS).By, ((FeatherSourceFile$lh104)this.fS).BB, ((FeatherSourceFile$lh104)this.fS).BE, ((FeatherSourceFile$lh104)this.fS).BH, ((FeatherSourceFile$lh104)this.fS).BK};
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         boolean var5 = var2[var4];
         if (var5) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile84 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static ItemStack aU() {
      return Bi;
   }

   // $FF: synthetic method
   static ItemStack aV() {
      return Bj;
   }

   // $FF: synthetic method
   static ItemStack aW() {
      return Be;
   }

   // $FF: synthetic method
   static ItemStack aX() {
      return Bf;
   }

   // $FF: synthetic method
   static ItemStack aY() {
      return Bg;
   }

   // $FF: synthetic method
   static ItemStack aZ() {
      return Bh;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xj(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qy(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lt(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hb(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ep(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qr(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 eg(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oy(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ug(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hv(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 sm(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ly(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 rp(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 tx(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wn(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 jh(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 gr(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oh(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hg(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 et(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 yl(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ai(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ja(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qn(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 er(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 zd(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ps(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xm(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ku(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 vt(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ck(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xy(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 fh(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xi(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 cg(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 sb(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 jr(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 rt(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nb(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 gy(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 bh(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mm(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 xe(FeatherSourceFile84 var0) {
      return var0.fS;
   }

   static {
      Bd = Items.field_151068_bn;
      Be = lh(Bd, 8261);
      Bf = lh(Items.field_151068_bn, 8229);
      Bg = lh(Items.field_151068_bn, 16453);
      Bh = lh(Items.field_151068_bn, 16421);
      Bi = lh(Items.field_151153_ao, 0);
      Bj = lh(Items.field_151153_ao, 1);
   }
}
