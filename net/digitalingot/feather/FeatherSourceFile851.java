package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public final class FeatherSourceFile851 {
   private static final Minecraft minecraft = Minecraft.func_71410_x();
   private static final FeatherSourceFile465 Nt = FeatherSourceFile665.nc(FeatherSourceFile486.class);
   private static ScaledResolution Nu = null;
   private static int Nv = -1;
   private static int Nw = -1;
   private static int Nx = -1;

   private FeatherSourceFile851() {
      throw new AssertionError();
   }

   public static int iH() {
      return minecraft.field_71443_c;
   }

   public static int iI() {
      return minecraft.field_71440_d;
   }

   public static int iJ() {
      return minecraft.field_71443_c;
   }

   public static int iK() {
      return minecraft.field_71440_d;
   }

   public static int iL() {
      return iO().func_78326_a();
   }

   public static int iM() {
      return iO().func_78328_b();
   }

   public static double iN() {
      return (double)iO().func_78325_e();
   }

   private static ScaledResolution iO() {
      if (Nv != iJ() || Nw != iK() || Nx != minecraft.field_71474_y.field_74335_Z || Nu == null) {
         Nv = iJ();
         Nw = iK();
         Nx = minecraft.field_71474_y.field_74335_Z;
         Nu = new ScaledResolution(minecraft);
      }

      return Nu;
   }

   public static float iP() {
      FeatherSourceFile486 var0 = (FeatherSourceFile486)Nt.ag();
      return var0 != null ? ((FeatherSourceFile$lh133)var0.pr()).tV.getScale() : 1.0F;
   }

   public static int iQ() {
      int var0 = iJ();
      return (int)((float)var0 * iP());
   }

   public static int iR() {
      int var0 = iK();
      return (int)((float)var0 * iP());
   }
}
