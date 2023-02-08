package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile198 {
   public static @NotNull int lh(@NotNull @NotNull Gui var0) {
      return (int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var0).getBlitOffset();
   }

   public static @NotNull Entity lh(@NotNull @NotNull RenderManager var0) {
      return var0.field_78734_h;
   }

   public static @NotNull boolean lh(@NotNull @NotNull Minecraft var0) {
      return var0.field_71474_y.field_74320_O != 0;
   }

   public static @NotNull float nc(@NotNull @NotNull Minecraft var0) {
      return var0.field_71439_g.field_71109_bG;
   }

   public static @NotNull float xj(@NotNull @NotNull Minecraft var0) {
      return var0.field_71439_g.field_70726_aT;
   }

   public static @NotNull boolean lh(@NotNull @NotNull ItemStack var0) {
      return var0.func_77973_b() instanceof ItemFood;
   }

   public static @NotNull boolean lh(@NotNull @NotNull Item var0) {
      return var0 instanceof ItemFood;
   }

   public static @NotNull boolean nc(@NotNull @NotNull EntityPlayer var0) {
      return var0.field_71075_bZ.field_75098_d;
   }

   public static @NotNull void oe(@NotNull @NotNull Minecraft var0) {
      var0.func_175601_h();
   }

   public static @NotNull void lh(@NotNull @NotNull KeyBinding var0, int var1) {
      var0.func_151462_b(var1);
   }

   public static @NotNull boolean lh(@NotNull @NotNull Entity var0) {
      return var0.field_70122_E;
   }

   public static @NotNull boolean nc(@NotNull @NotNull Entity var0) {
      return var0.func_70093_af();
   }

   public static @NotNull int lh(@NotNull @NotNull KeyBinding var0) {
      return var0.func_151463_i();
   }

   public static @NotNull boolean nc(@NotNull @NotNull KeyBinding var0) {
      return var0.func_151463_i() < 0;
   }

   public static @NotNull void lh(@NotNull @NotNull EntityPlayerSP var0, IChatComponent var1) {
      var0.func_145747_a(var1);
   }

   public static @NotNull boolean qy(@NotNull @NotNull Minecraft var0) {
      return var0.field_71415_G;
   }

   public static @NotNull int lh(@NotNull @NotNull Enchantment var0) {
      return var0.field_77352_x;
   }

   public static @NotNull int ou(@NotNull @NotNull Minecraft var0) {
      return (new ScaledResolution(var0)).func_78326_a();
   }

   public static @NotNull int pq(@NotNull @NotNull Minecraft var0) {
      return (new ScaledResolution(var0)).func_78328_b();
   }

   public static @NotNull double as(@NotNull @NotNull Minecraft var0) {
      return (double)(new ScaledResolution(var0)).func_78325_e();
   }

   public static @NotNull int km(@NotNull @NotNull Minecraft var0) {
      return var0.field_71443_c;
   }

   public static @NotNull int mq(@NotNull @NotNull Minecraft var0) {
      return var0.field_71440_d;
   }

   public static @NotNull int nc(@NotNull @NotNull ItemStack var0) {
      return var0.field_77994_a;
   }

   public static @NotNull ItemStack lh(@NotNull @NotNull EntityLivingBase var0) {
      return var0.func_70694_bm();
   }

   public static @NotNull Entity xj(@NotNull @NotNull Entity var0) {
      return var0.field_70154_o;
   }

   public static @NotNull Object xj(@NotNull @NotNull EntityPlayer var0) {
      return var0.field_71075_bZ;
   }

   public static @NotNull void lh(@NotNull @NotNull Entity var0, float var1) {
      var0.field_70125_A = var1;
   }

   public static @NotNull float oe(@NotNull @NotNull Entity var0) {
      return var0.field_70125_A;
   }

   public static @NotNull void nc(@NotNull @NotNull Entity var0, float var1) {
      var0.field_70177_z = var1;
   }

   public static @NotNull float qy(@NotNull @NotNull Entity var0) {
      return var0.field_70177_z;
   }

   public static @NotNull IInventory oe(@NotNull @NotNull EntityPlayer var0) {
      return var0.field_71071_by;
   }

   public static boolean xj(ItemStack var0) {
      return var0 == null;
   }

   public static int lh(EntityTNTPrimed var0) {
      return var0.field_70516_a;
   }

   public static @NotNull GuiButton lh(@NotNull @NotNull GuiScreen var0, GuiButton var1) {
      net.digitalingot.feather.mixin.core.FeatherSourceFile19 var2 = (net.digitalingot.feather.mixin.core.FeatherSourceFile19)var0;
      var2.getRenderables().add(var1);
      return var1;
   }

   private static int lh(GuiButton var0) {
      return var0.field_146128_h;
   }

   private static int nc(GuiButton var0) {
      return var0.field_146129_i;
   }

   private static void lh(GuiButton var0, int var1) {
      var0.field_146128_h = var1;
   }

   private static void nc(GuiButton var0, int var1) {
      var0.field_146129_i = var1;
   }
}
