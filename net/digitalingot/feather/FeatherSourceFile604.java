package net.digitalingot.feather;

import java.awt.Color;

public class FeatherSourceFile604 implements FeatherSourceFile117 {
   public void lh(FeatherSourceFile$lh110 var1, int var2, int var3, int var4, Color var5) {
      int var6 = var1.xR / 2;
      int var7 = var1.xR / 2;
      int var8;
      int var9;
      if (var1.xX) {
         var8 = var1.xS / 2 + var1.kN;
         var9 = (var1.xS + 1) / 2 + var1.kN;
         FeatherSourceFile561.nc(var2 - var1.size - var6 - var1.kN, var3 - var8, var2 - var6 + var1.kN, var3 + var9, var1.xY);
         FeatherSourceFile561.nc(var2 + var7 - var1.kN, var3 - var8, var2 + var1.size + var7 + var1.kN, var3 + var9, var1.xY);
         FeatherSourceFile561.nc(var2 - var8, var3 - var6 - var1.size - var1.kN, var2 + var9, var3 - var6 + var1.kN, var1.xY);
         FeatherSourceFile561.nc(var2 - var8, var3 + var7 - var1.kN, var2 + var9, var3 + var7 + var1.size + var1.kN, var1.xY);
      }

      var8 = var1.xS / 2;
      var9 = (var1.xS + 1) / 2;
      FeatherSourceFile561.nc(var2 - var1.size - var6, var3 - var8, var2 - var6, var3 + var9, var5);
      FeatherSourceFile561.nc(var2 + var7, var3 - var8, var2 + var1.size + var7, var3 + var9, var5);
      FeatherSourceFile561.nc(var2 - var8, var3 - var6 - var1.size, var2 + var9, var3 - var6, var5);
      FeatherSourceFile561.nc(var2 - var8, var3 + var7, var2 + var9, var3 + var7 + var1.size, var5);
   }
}
