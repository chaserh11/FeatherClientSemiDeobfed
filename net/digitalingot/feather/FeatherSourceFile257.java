package net.digitalingot.feather;

import java.awt.Color;

public class FeatherSourceFile257 implements FeatherSourceFile117 {
   public void lh(FeatherSourceFile$lh110 var1, int var2, int var3, int var4, Color var5) {
      float var6 = 1.0F;
      if (var1.xX) {
         var6 = (float)var1.xS + (float)var1.kN;
         if (var6 != 1.0F) {
            FeatherSourceFile843.gr(var6);
         }

         FeatherSourceFile561.lh((float)var2 + 0.5F, (float)var3 + 0.5F, var4 - var1.kN / 2 + 1, var1.xY);
         FeatherSourceFile561.lh((float)var2 + 0.5F, (float)var3 + 0.5F, var4 + var1.kN / 2 + 1, var1.xY);
      }

      if (var6 != (float)var1.xS) {
         var6 = (float)var1.xS;
         FeatherSourceFile843.gr(var6);
      }

      FeatherSourceFile561.lh((float)var2 + 0.5F, (float)var3 + 0.5F, var4 + 1, var5);
      if (var6 != 1.0F) {
         FeatherSourceFile843.gr(1.0F);
      }

   }
}
