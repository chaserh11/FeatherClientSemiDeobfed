package net.digitalingot.feather;

import java.awt.Color;

public class FeatherSourceFile472 implements FeatherSourceFile117 {
   public void lh(FeatherSourceFile$lh110 var1, int var2, int var3, int var4, Color var5) {
      int var6 = -var1.xS / 2;
      if (var1.xX) {
         FeatherSourceFile561.lh(var6 + var2 - var1.size - var1.kN, var6 + var3 - var1.size - var1.kN, var6 + var2 + var1.size + var1.xS, var6 + var3 + var1.size + var1.xS, var1.xY, var1.kN);
         FeatherSourceFile561.lh(var6 + var2 - var1.size + var1.xS, var6 + var3 - var1.size + var1.xS, var6 + var2 + var1.size - var1.kN, var6 + var3 + var1.size - var1.kN, var1.xY, var1.kN);
      }

      FeatherSourceFile561.lh(var6 + var2 - var1.size, var6 + var3 - var1.size, var6 + var2 + var1.size, var6 + var3 + var1.size, var5, var1.xS);
   }
}
