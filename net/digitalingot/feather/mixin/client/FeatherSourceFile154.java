package net.digitalingot.feather.mixin.client;

import java.util.Random;
import net.digitalingot.feather.FeatherSourceFile327;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.EnumFacing.AxisDirection;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({EnumFacing.class})
public class FeatherSourceFile154 {
   @Shadow
   @Final
   private int field_176759_h;

   @Overwrite
   public EnumFacing func_176734_d() {
      return FeatherSourceFile327.RZ[this.field_176759_h];
   }

   @Overwrite
   public static EnumFacing func_82600_a(int var0) {
      return FeatherSourceFile327.RZ[var0 % EnumFacing.field_82609_l.length];
   }

   @Overwrite
   public static EnumFacing func_176741_a(Random var0) {
      return FeatherSourceFile327.RZ[var0.nextInt(FeatherSourceFile327.RZ.length)];
   }

   @Overwrite
   public static EnumFacing func_176737_a(float var0, float var1, float var2) {
      EnumFacing var3 = EnumFacing.NORTH;
      float var4 = Float.MIN_VALUE;
      EnumFacing[] var5 = FeatherSourceFile327.RZ;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         EnumFacing var8 = var5[var7];
         float var9 = var0 * (float)var8.func_176730_m().func_177958_n() + var1 * (float)var8.func_176730_m().func_177956_o() + var2 * (float)var8.func_176730_m().func_177952_p();
         if (var9 > var4) {
            var4 = var9;
            var3 = var8;
         }
      }

      return var3;
   }

   @Overwrite
   public static EnumFacing func_181076_a(AxisDirection var0, Axis var1) {
      EnumFacing[] var2 = FeatherSourceFile327.RZ;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         EnumFacing var5 = var2[var4];
         if (var5.func_176743_c() == var0 && var5.func_176740_k() == var1) {
            return var5;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }
}
