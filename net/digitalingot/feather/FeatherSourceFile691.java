package net.digitalingot.feather;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FeatherSourceFile691 {
   public static FeatherSourceFile$lh51 mq(ItemStack var0) {
      ItemFood var1 = (ItemFood)var0.func_77973_b();
      int var2 = var1.func_150905_g(var0);
      float var3 = var1.func_150906_h(var0);
      return new FeatherSourceFile$lh51(var2, var3);
   }

   public static FeatherSourceFile$lh51 mr(ItemStack var0) {
      return mq(var0);
   }
}
