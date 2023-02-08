package net.digitalingot.feather;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.net.URI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.Sys;

public final class FeatherSourceFile844 {
   private static final Minecraft minecraft = Minecraft.func_71410_x();
   private static final FeatherSourceFile$lh94 Ns = FeatherSourceFile$lh94.access$000();

   private FeatherSourceFile844() {
      throw new AssertionError();
   }

   public static boolean iB() {
      return Ns == FeatherSourceFile$lh94.WINDOWS;
   }

   public static boolean iC() {
      return Ns == FeatherSourceFile$lh94.LINUX;
   }

   public static boolean iD() {
      return Ns == FeatherSourceFile$lh94.MACOS;
   }

   public static boolean lh(URI var0) {
      return nc(var0) || ib(var0.toString());
   }

   public static boolean mq(File var0) {
      return mr(var0) || ib(var0.getPath());
   }

   private static boolean ib(String var0) {
      return FeatherSourceFile$lh94.access$100(Ns, var0);
   }

   private static boolean mr(File var0) {
      Desktop var1 = lh(Action.OPEN);
      if (var1 != null) {
         try {
            var1.open(var0);
            return true;
         } catch (IOException var3) {
         }
      }

      return false;
   }

   private static boolean nc(URI var0) {
      Desktop var1 = lh(Action.BROWSE);
      if (var1 != null) {
         try {
            var1.browse(var0);
            return true;
         } catch (IOException var3) {
         }
      }

      return false;
   }

   private static Desktop lh(Action var0) {
      if (!Desktop.isDesktopSupported()) {
         return null;
      } else {
         Desktop var1 = Desktop.getDesktop();
         return !var1.isSupported(var0) ? null : var1;
      }
   }

   private static boolean zt(String var0) {
      try {
         Process var1 = (new ProcessBuilder(new String[]{var0})).redirectInput(Redirect.DISCARD).redirectOutput(Redirect.DISCARD).redirectError(Redirect.DISCARD).start();
         return var1.isAlive();
      } catch (IOException var2) {
         return false;
      }
   }

   public static String iE() {
      return GuiScreen.func_146277_j();
   }

   public static void ik(String var0) {
      GuiScreen.func_146275_d(var0);
   }

   public static long iF() {
      return Sys.getTime() * 1000000000L / Sys.getTimerResolution();
   }

   public static long iG() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   // $FF: synthetic method
   static boolean mf(String var0) {
      return zt(var0);
   }
}
