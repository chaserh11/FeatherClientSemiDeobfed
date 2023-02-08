package net.digitalingot.feather;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile$lh97 implements FeatherSourceFile$xj8 {
   private static final ResourceLocation DQ = new ResourceLocation("minecraft:textures/gui/container/inventory.png");

   public int lh(PotionEffect var1) {
      return var1.func_76456_a();
   }

   public String nc(PotionEffect var1) {
      return var1.func_76453_d();
   }

   public int xj(PotionEffect var1) {
      return var1.func_76459_b();
   }

   public boolean oe(PotionEffect var1) {
      return var1.func_100011_g();
   }

   public void lh(PotionEffect var1, int var2, int var3) {
      Potion var4 = Potion.field_76425_a[var1.func_76456_a()];
      if (var4.func_76400_d()) {
         FeatherSourceFile843.lh(0, DQ);
         int var5 = var4.func_76392_e();
         int var6 = var5 % 8 * 18;
         int var7 = 198 + var5 / 8 * 18;
         FeatherSourceFile841.vK().pq(var2, var3, var6, var7, 18, 18);
      }
   }
}
