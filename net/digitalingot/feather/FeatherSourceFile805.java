package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;

public class FeatherSourceFile805 implements FeatherSourceFile803 {
   private final Minecraft Qf = Minecraft.func_71410_x();

   public boolean wn(int var1, int var2) {
      return this.Qf.field_71441_e.func_72964_e(var1, var2).func_177410_o();
   }

   public boolean oe(double var1, double var3, double var5) {
      return this.Qf.field_71441_e.func_180495_p(new BlockPos(var1, var3, var5)).func_177230_c().func_149662_c();
   }

   public boolean qy(double var1, double var3, double var5) {
      return false;
   }
}
