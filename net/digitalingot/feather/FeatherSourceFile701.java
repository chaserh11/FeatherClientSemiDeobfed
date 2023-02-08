package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.GLINT,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.glint",
   jl = "https://assets.feathercdn.net/game/mods/glint.svg",
   od = "feather.moduledescription.glint",
   wr = {}
)
)
public class FeatherSourceFile701 extends FeatherSourceFile495 {
   private static final int yB = -8372020;
   private final Minecraft minecraft;
   private final FeatherSourceFile420 ux;

   @Inject
   FeatherSourceFile701(Minecraft var1, FeatherSourceFile420 var2) {
      this.minecraft = var1;
      this.ux = var2;
   }

   public int oe(ItemStack var1) {
      boolean var2 = qy(var1);
      FeatherSourceFile$lh$lh16 var3 = var2 ? ((FeatherSourceFile$lh88)this.fS).yF : ((FeatherSourceFile$lh88)this.fS).yI;
      switch (var3) {
         case OFF:
            return 0;
         case DEFAULT_COLOR:
            return -8372020;
         case CUSTOM_COLOR:
            return var2 ? ((FeatherSourceFile$lh88)this.fS).yG.getRGB() : ((FeatherSourceFile$lh88)this.fS).yJ.getRGB();
         default:
            return FeatherSourceFile841.vK().vM();
      }
   }

   public static boolean qy(ItemStack var0) {
      return var0 == null ? false : var0.func_77973_b() instanceof ItemArmor;
   }

   public boolean ou(ItemStack var1) {
      return this.uj() && ((FeatherSourceFile$lh88)this.fS).yD && this.oe(var1) != 0 && var1.func_77973_b() instanceof ItemPotion;
   }

   public boolean lh(FeatherSourceFile$lh$lh16 var1) {
      return var1 == FeatherSourceFile$lh$lh16.DEFAULT_COLOR;
   }

   public void ex() {
      super.ex();
   }
}
