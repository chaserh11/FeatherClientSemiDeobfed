package net.digitalingot.feather;

import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile337 {
   private static final ResourceLocation RR = new ResourceLocation("feather:textures/gui/modlayout/cursor.png");
   private static boolean RS;
   private static boolean k;
   private static int RT;
   private static int RU;

   public static void sb(boolean var0) {
      if (!RS) {
      }

      k = var0;
   }

   public static void yB() {
      if (RS) {
      }

      RS = false;
   }

   public static void gr(int var0, int var1) {
      if (RS) {
         RT = (int)((double)var0 * FeatherSourceFile851.iN());
         RU = (int)((double)var1 * FeatherSourceFile851.iN());
         int var2 = k ? 3 : 7;
         int var3 = k ? 7 : 3;
         FeatherSourceFile843.wq();
         FeatherSourceFile843.ou(770, 771, 1, 0);
         FeatherSourceFile843.lh(0, RR);
         FeatherSourceFile443 var4 = FeatherSourceFile443.RM;
         var4.nc(7, DefaultVertexFormats.field_181707_g);
         if (k) {
            var4.pq((double)var0 - (double)var2 / 2.0, (double)var1 + (double)var3 / 2.0, 0.0).ou(1.0F, 1.0F).xZ();
            var4.pq((double)var0 + (double)var2 / 2.0, (double)var1 + (double)var3 / 2.0, 0.0).ou(1.0F, 0.0F).xZ();
            var4.pq((double)var0 + (double)var2 / 2.0, (double)var1 - (double)var3 / 2.0, 0.0).ou(0.0F, 0.0F).xZ();
            var4.pq((double)var0 - (double)var2 / 2.0, (double)var1 - (double)var3 / 2.0, 0.0).ou(0.0F, 1.0F).xZ();
         } else {
            var4.pq((double)var0 - (double)var2 / 2.0, (double)(var1 + var3), 0.0).ou(0.0F, 1.0F).xZ();
            var4.pq((double)var0 + (double)var2 / 2.0, (double)(var1 + var3), 0.0).ou(1.0F, 1.0F).xZ();
            var4.pq((double)var0 + (double)var2 / 2.0, (double)var1, 0.0).ou(1.0F, 0.0F).xZ();
            var4.pq((double)var0 - (double)var2 / 2.0, (double)var1, 0.0).ou(0.0F, 0.0F).xZ();
         }

         var4.lx();
         FeatherSourceFile843.jz();
      }
   }
}
