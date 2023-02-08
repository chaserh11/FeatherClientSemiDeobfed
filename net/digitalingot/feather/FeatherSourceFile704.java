package net.digitalingot.feather;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class FeatherSourceFile704 {
   public static void wz() {
      Mouse.poll();
   }

   public static boolean lh(int var0) {
      return Keyboard.isKeyDown(var0);
   }

   public static int lt() {
      return Display.getDesktopDisplayMode().getWidth();
   }

   public static int hb() {
      return Display.getDesktopDisplayMode().getHeight();
   }

   public static int ep() {
      return Display.getX();
   }

   public static int qr() {
      return Display.getY();
   }

   public static int eg() {
      return Display.getWidth();
   }

   public static int oy() {
      return Display.getHeight();
   }

   public static boolean ug() {
      return Display.isFullscreen();
   }

   public static boolean hv() {
      String var0 = System.getProperty("org.lwjgl.opengl.Window.undecorated");
      if (var0 == null) {
         System.setProperty("org.lwjgl.opengl.Window.undecorated", "false");
         return hv();
      } else {
         return var0.equals("false");
      }
   }

   public static void lh(boolean var0) {
      System.setProperty("org.lwjgl.opengl.Window.undecorated", Boolean.toString(var0));
   }

   public static void lh(boolean var0, int var1, int var2, int var3, int var4, boolean var5) {
      try {
         Display.setFullscreen(var0);
         Display.setDisplayMode(new DisplayMode(var3, var4));
         Display.setLocation(var1, var2);
         Display.setVSyncEnabled(var5);
      } catch (LWJGLException var7) {
         throw new RuntimeException(var7);
      }
   }

   public static void lh(int var0, int var1) {
      Display.setLocation(var0, var1);
   }

   public static void nc(boolean var0) {
      Display.setResizable(var0);
   }
}
