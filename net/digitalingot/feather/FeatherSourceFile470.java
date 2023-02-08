package net.digitalingot.feather;

import net.minecraft.item.ItemStack;

class FeatherSourceFile470 {
   protected int km(ItemStack var1) {
      byte var2 = 1;
      if (var1.field_77994_a > 48) {
         var2 = 5;
      } else if (var1.field_77994_a > 32) {
         var2 = 4;
      } else if (var1.field_77994_a > 16) {
         var2 = 3;
      } else if (var1.field_77994_a > 1) {
         var2 = 2;
      }

      return var2;
   }
}
