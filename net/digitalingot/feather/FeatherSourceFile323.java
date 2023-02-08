package net.digitalingot.feather;

import java.util.function.Function;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FeatherSourceFile323 {
   public static int lh(EntityPlayer var0, Item... var1) {
      return lh(var0, (Function)null, var1);
   }

   public static int lh(EntityPlayer var0, Function var1, Item... var2) {
      int var3 = 0;
      ItemStack[] var4 = var0.field_71071_by.field_70462_a;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         ItemStack var7 = var4[var6];
         if (var7 != null) {
            Item[] var8 = var2;
            int var9 = var2.length;

            for(int var10 = 0; var10 < var9; ++var10) {
               Item var11 = var8[var10];
               if (var7.func_77973_b() == var11 && (var1 == null || (Boolean)var1.apply(var7))) {
                  var3 += var7.field_77994_a;
               }
            }
         }
      }

      return var3;
   }

   public static int lh(EntityPlayer var0, ItemStack... var1) {
      int var3 = 0;
      ItemStack[] var5 = var0.field_71071_by.field_70462_a;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         ItemStack var8 = var5[var7];
         if (var8 != null) {
            int var4 = var8.func_77952_i();
            int var2 = var8.field_77994_a;
            ItemStack[] var9 = var1;
            int var10 = var1.length;

            for(int var11 = 0; var11 < var10; ++var11) {
               ItemStack var12 = var9[var11];
               if (var8.func_77973_b() == var12.func_77973_b() && var4 == var12.func_77952_i()) {
                  var3 += var2;
               }
            }
         }
      }

      return var3;
   }

   @Deprecated
   public static void lh(int var0, int var1, int var2, int var3, int var4, int var5, float var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      FeatherSourceFile443 var9 = FeatherSourceFile443.RM;
      var9.nc(7, DefaultVertexFormats.field_181707_g);
      var9.as((float)var0, (float)(var1 + var5), var6).ou((float)var2 * var7, (float)(var3 + var5) * var8).xZ();
      var9.as((float)(var0 + var4), (float)(var1 + var5), var6).ou((float)(var2 + var4) * var7, (float)(var3 + var5) * var8).xZ();
      var9.as((float)(var0 + var4), (float)var1, var6).ou((float)(var2 + var4) * var7, (float)var3 * var8).xZ();
      var9.as((float)var0, (float)var1, var6).ou((float)var2 * var7, (float)var3 * var8).xZ();
      var9.lx();
   }

   @Deprecated
   public static void lh(FontRenderer var0, ItemStack var1, int var2, int var3, boolean var4, boolean var5) {
      if (var1 != null && (var4 || var5)) {
         int var6;
         if (var1.func_77951_h() && var4) {
            var6 = (int)Math.round(13.0 - (double)var1.func_77952_i() * 13.0 / (double)var1.func_77958_k());
            int var7 = (int)Math.round(255.0 - (double)var1.func_77952_i() * 255.0 / (double)var1.func_77958_k());
            FeatherSourceFile843.hH();
            FeatherSourceFile843.hJ();
            FeatherSourceFile843.hO();
            FeatherSourceFile843.hE();
            FeatherSourceFile843.jz();
            int var8 = 255 - var7 << 16 | var7 << 8;
            int var9 = (255 - var7) / 4 << 16 | 16128;
            FeatherSourceFile443 var10 = FeatherSourceFile443.RM;
            lh(var10, var2 + 2, var3 + 13, 13, 2, 0);
            lh(var10, var2 + 2, var3 + 13, 12, 1, var9);
            lh(var10, var2 + 2, var3 + 13, var6, 1, var8);
            FeatherSourceFile843.hF();
            FeatherSourceFile843.hP();
            FeatherSourceFile843.hG();
            FeatherSourceFile843.hI();
            FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
         }

         if (var5) {
            var6 = 0;
            EntityPlayerSP var11 = Minecraft.func_71410_x().field_71439_g;
            if (var1.func_77976_d() > 1) {
               var6 = lh(var11, (ItemStack[])(var1));
            } else if (var1.func_77973_b().equals(Items.field_151031_f)) {
               var6 = lh(var11, (Item[])(Items.field_151032_g));
            }

            if (var6 > 1) {
               String var12 = String.valueOf(var6);
               FeatherSourceFile843.hJ();
               FeatherSourceFile841.vL().func_175065_a(var12, (float)(var2 + 19 - 2 - FeatherSourceFile841.vK().vr(var12)), (float)(var3 + 6 + 3), 16777215, false);
               FeatherSourceFile843.hI();
            }
         }

      }
   }

   public static void lh(FontRenderer var0, ItemStack var1, int var2, int var3) {
      lh(var0, var1, var2, var3, true, true);
   }

   @Deprecated
   public static void lh(FeatherSourceFile443 var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var5 >> 16 & 255;
      int var7 = var5 >> 8 & 255;
      int var8 = var5 & 255;
      var0.nc(7, DefaultVertexFormats.field_181706_f);
      var0.pq((double)var1, (double)var2, 0.0).km(var6, var7, var8, 255).xZ();
      var0.pq((double)var1, (double)(var2 + var4), 0.0).km(var6, var7, var8, 255).xZ();
      var0.pq((double)(var1 + var3), (double)(var2 + var4), 0.0).km(var6, var7, var8, 255).xZ();
      var0.pq((double)(var1 + var3), (double)var2, 0.0).km(var6, var7, var8, 255).xZ();
      var0.lx();
   }

   public static void nc(ItemStack var0, int var1, int var2, boolean var3, boolean var4) {
      if (var0 != null && (var3 || var4)) {
         int var5;
         int var8;
         if (var0.func_77951_h() && var3) {
            var5 = (int)Math.round(13.0 - (double)var0.func_77952_i() * 13.0 / (double)var0.func_77958_k());
            int var6 = (int)Math.round(255.0 - (double)var0.func_77952_i() * 255.0 / (double)var0.func_77958_k());
            int var7 = 255 - var6 << 16 | var6 << 8;
            var8 = (255 - var6) / 4 << 16 | 16128;
            FeatherSourceFile843.hH();
            FeatherSourceFile843.hJ();
            FeatherSourceFile843.hO();
            FeatherSourceFile843.hE();
            FeatherSourceFile843.jz();
            oe(var1 + 2, var2 + 13, 13, 2, 0);
            oe(var1 + 2, var2 + 13, 12, 1, var8);
            oe(var1 + 2, var2 + 13, var5, 1, var7);
            FeatherSourceFile843.hF();
            FeatherSourceFile843.hP();
            FeatherSourceFile843.hG();
            FeatherSourceFile843.hI();
         }

         if (var4) {
            var5 = 0;
            EntityPlayerSP var9 = Minecraft.func_71410_x().field_71439_g;
            if (var0.func_77976_d() > 1) {
               var5 = lh(var9, (ItemStack[])(var0));
            } else if (var0.func_77973_b().equals(Items.field_151031_f)) {
               var5 = lh(var9, (Item[])(Items.field_151032_g));
            }

            if (var5 > 1) {
               String var10 = String.valueOf(var5);
               var8 = FeatherSourceFile843.fo(var10);
               FeatherSourceFile843.hJ();
               FeatherSourceFile841.vK().lh(var10, (float)(var1 + 19 - 2 - var8), (float)(var2 + 6 + 3), -1, false);
               FeatherSourceFile843.hI();
            }
         }

      }
   }

   public static void oe(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var4 >> 16 & 255;
      int var6 = var4 >> 8 & 255;
      int var7 = var4 & 255;
      FeatherSourceFile443 var8 = FeatherSourceFile443.RM;
      var8.nc(7, DefaultVertexFormats.field_181706_f);
      var8.as((float)var0, (float)var1, 0.0F).km(var5, var6, var7, 255).xZ();
      var8.as((float)var0, (float)(var1 + var3), 0.0F).km(var5, var6, var7, 255).xZ();
      var8.as((float)(var0 + var2), (float)(var1 + var3), 0.0F).km(var5, var6, var7, 255).xZ();
      var8.as((float)(var0 + var2), (float)var1, 0.0F).km(var5, var6, var7, 255).xZ();
      var8.lx();
   }
}
