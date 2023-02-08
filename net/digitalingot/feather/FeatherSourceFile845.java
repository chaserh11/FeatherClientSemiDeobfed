package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;

public final class FeatherSourceFile845 {
   public static final int Ng = 0;
   public static final int Nh = 1;
   public static final int Ni = 2;
   public static final int Nj = 3;
   public static final int Nk = 4;
   public static final int Nl = 5;
   public static final int Nm = 6;
   public static final int Nn = 7;
   public static final int No = 7;
   public static final int Np = 0;
   public static final int Nq = 1;
   public static final int Nr = 2;
   private static final Minecraft minecraft = Minecraft.func_71410_x();

   private FeatherSourceFile845() {
      throw new AssertionError();
   }

   public static boolean kx(int var0) {
      return var0 > 7 ? false : Mouse.isButtonDown(var0);
   }

   public static double zm() {
      return (double)Mouse.getX();
   }

   public static double rq() {
      return (double)(FeatherSourceFile198.mq(Minecraft.func_71410_x()) - Mouse.getY());
   }

   public static double hW() {
      return (double)Mouse.getDX();
   }

   public static double hX() {
      return (double)Mouse.getDY();
   }

   public static double hY() {
      return (double)Mouse.getEventDX();
   }

   public static double hZ() {
      return (double)Mouse.getEventDY();
   }

   public static int ig() {
      return Mouse.getDWheel();
   }

   public static boolean iA() {
      return Mouse.isGrabbed();
   }

   public static void fh(boolean var0) {
      Mouse.setGrabbed(var0);
   }

   public static void tx(int var0, int var1) {
      Mouse.setCursorPosition(var0, var1);
   }
}
