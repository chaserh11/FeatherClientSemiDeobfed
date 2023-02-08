package net.digitalingot.feather;

import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile507 implements FeatherSourceFile117 {
   public void lh(FeatherSourceFile$lh110 var1, int var2, int var3, int var4, Color var5) {
      boolean var6 = GL11.glIsEnabled(2848);
      if (var6) {
         GL11.glDisable(2848);
      }

      boolean var7 = GL11.glIsEnabled(2832);
      if (var7) {
         GL11.glDisable(2832);
      }

      FeatherSourceFile843.hE();
      FeatherSourceFile843.jz();
      float var8 = 1.0F;
      if (var1.xX) {
         var8 = (float)var1.xS + (float)var1.kN;
         if (var8 != 1.0F) {
            FeatherSourceFile843.gr(var8);
         }

         FeatherSourceFile561.lh(var2 - var1.size, var3 + var1.size, var2, var3, var1.xY);
         FeatherSourceFile561.lh(var2, var3, var2 + var1.size, var3 + var1.size, var1.xY);
      }

      if (var8 != (float)var1.xS) {
         var8 = (float)var1.xS;
         FeatherSourceFile843.gr(var8);
      }

      FeatherSourceFile561.lh(var2 - var1.size, var3 + var1.size, var2, var3, var5);
      FeatherSourceFile561.lh(var2, var3, var2 + var1.size, var3 + var1.size, var5);
      if (var8 != 1.0F) {
         FeatherSourceFile843.gr(1.0F);
      }

      if (var7) {
         GL11.glEnable(2832);
      }

      if (var6) {
         GL11.glEnable(2848);
      }

   }
}
