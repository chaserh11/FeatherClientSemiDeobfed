package net.digitalingot.feather;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.ITEM_INFO,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.iteminfo",
   jl = "https://assets.feathercdn.net/game/mods/iteminfo.svg",
   od = "feather.moduledescription.iteminfo",
   wr = {FeatherSourceFile$lh3.PVP, FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$nc34.class
)}
)
public class FeatherSourceFile267 extends FeatherSourceFile360 {
   private static final String BO = "";
   private static final String BP = "14";
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile267(Minecraft var1) {
      this.minecraft = var1;
   }

   private String bB() {
      EntityPlayerSP var1 = this.minecraft.field_71439_g;
      if (var1 == null) {
         return "";
      } else {
         ItemStack var2 = var1.func_70694_bm();
         if (var2 == null) {
            return "";
         } else {
            return var2.func_77973_b() instanceof ItemPotion ? this.as(var2) : this.pq(var2);
         }
      }
   }

   private String pq(ItemStack var1) {
      if (!var1.func_77948_v()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder();
         Iterator var3 = EnchantmentHelper.func_82781_a(var1).entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            int var5 = (Integer)var4.getKey();
            var2.append((String)FeatherSourceFile404.Sg.get(var5)).append(" ").append(var4.getValue()).append(" ");
         }

         return var2.toString().trim();
      }
   }

   private String as(ItemStack var1) {
      ItemPotion var3 = (ItemPotion)var1.func_77973_b();
      List var2 = var3.func_77832_l(var1);
      if (var2 != null && !var2.isEmpty()) {
         StringBuilder var4 = new StringBuilder();
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            PotionEffect var6 = (PotionEffect)var5.next();
            int var7 = var6.func_76459_b() / 20;
            var4.append(StatCollector.func_74838_a(var6.func_76453_d())).append(" ").append(var6.func_76458_c() + 1).append(" (").append(var7 / 60).append(String.format(":%02d", var7 % 60)).append(") ");
         }

         return var4.toString().trim();
      } else {
         return "";
      }
   }

   private int bC() {
      EntityPlayerSP var1 = this.minecraft.field_71439_g;
      if (var1 == null) {
         return -1;
      } else {
         ItemStack var2 = var1.func_70694_bm();
         if (var2 == null) {
            return -1;
         } else {
            Item var3 = var2.func_77973_b();
            int var4 = var2.func_77952_i();
            if (var3 instanceof ItemBow) {
               var3 = Items.field_151032_g;
               var4 = 0;
            }

            int var5 = Item.func_150891_b(var3);
            int var6 = 0;
            ItemStack[] var7 = var1.field_71071_by.field_70462_a;
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               ItemStack var10 = var7[var9];
               if (var10 != null && Item.func_150891_b(var10.func_77973_b()) == var5 && var10.func_77952_i() == var4) {
                  var6 += var10.field_77994_a;
               }
            }

            return var6;
         }
      }
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lh(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 nc(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static String xj(FeatherSourceFile267 var0) {
      return var0.bB();
   }

   // $FF: synthetic method
   static FeatherSourceFile136 oe(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static int qy(FeatherSourceFile267 var0) {
      return var0.bC();
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 wz(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 lt(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 hb(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ep(FeatherSourceFile267 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 qr(FeatherSourceFile267 var0) {
      return var0.fS;
   }
}
