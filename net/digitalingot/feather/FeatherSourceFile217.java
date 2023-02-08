package net.digitalingot.feather;

import net.minecraft.util.MathHelper;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile217 {
   @NotNull
   public static @NotNull @NotNull @NotNull Pair lh(@NotNull @NotNull FeatherSourceFile401 var0, @NotNull @NotNull FeatherSourceFile$lh4 var1) {
      FeatherSourceFile401 var2 = var1.fH();
      FeatherSourceFile401 var3 = FeatherSourceFile401.nc(var0, var2, (FeatherSourceFile401)null);
      var3.oe(var3);
      FeatherSourceFile403 var4 = new FeatherSourceFile403(var3.Td, var3.Ty);
      float var5 = (float)Math.toDegrees((double)FeatherSourceFile403.lh(var4, new FeatherSourceFile403(-1.0F, 0.0F)));
      float var6 = tx(var5 - var1.fJ() % 360.0F);
      float var7 = (float)((double)Math.abs(var2.Te - var0.Te) / 32.0);
      float var8 = var6 / 180.0F;
      float var9 = var8;
      if (var8 < -0.5F) {
         var9 = -(0.5F + var8 + 0.5F);
      } else if (var8 > 0.5F) {
         var9 = 0.5F - (var8 - 0.5F);
      }

      var9 *= 1.0F - var7;
      float var10 = var9 < 0.0F ? Math.abs(var9 * 1.4F) + 0.3F : 0.3F;
      float var11 = var9 >= 0.0F ? var9 * 1.4F + 0.3F : 0.3F;
      float var12 = 1.0F - Math.max(var10, var11);
      var10 += var12;
      var11 += var12;
      return var1.fI() ? new ImmutablePair(var11, var10) : new ImmutablePair(var10, var11);
   }

   private static float tx(float var0) {
      var0 %= 360.0F;
      if (var0 <= -180.0F) {
         var0 += 360.0F;
      } else if (var0 > 180.0F) {
         var0 -= 360.0F;
      }

      return var0;
   }

   private float lh(FeatherSourceFile403 var1, FeatherSourceFile403 var2) {
      return (float)Math.toDegrees(Math.atan2((double)(var1.Td * var2.Td + var1.Te * var2.Te), (double)(var1.Td * var2.Te - var1.Te * var2.Td)));
   }

   private float lh(FeatherSourceFile403 var1) {
      return (float)Math.sqrt(Math.pow((double)var1.Td, 2.0) + Math.pow((double)var1.Te, 2.0));
   }

   private float nc(FeatherSourceFile403 var1, FeatherSourceFile403 var2) {
      return var1.Td * var2.Td + var1.Te * var2.Te;
   }

   private FeatherSourceFile403 lh(FeatherSourceFile403 var1, float var2) {
      return new FeatherSourceFile403(var1.Td * MathHelper.func_76134_b(var2) - var1.Te * MathHelper.func_76126_a(var2), var1.Td * MathHelper.func_76126_a(var2) + var1.Te * MathHelper.func_76134_b(var2));
   }
}
