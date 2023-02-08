package net.digitalingot.feather;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile6 {
   @Nullable
   private static final @Nullable Class my;
   private static final Field rh;
   private static final Method qe;
   private static long tb;
   private static boolean yd;

   public static boolean ha() {
      return my != null;
   }

   public static void xx() {
      Object var0 = rh.get((Object)null);
      Class var1 = Class.forName("com.replaymod.replay.gui.screen.GuiReplayViewer");
      Constructor var2 = var1.getConstructor(my);
      Object var3 = var2.newInstance(var0);
      Method var4 = var1.getMethod("display");
      var4.invoke(var3);
   }

   public static boolean xv() {
      if (my == null) {
         return false;
      } else {
         long var0 = System.currentTimeMillis();
         if (var0 - tb < 1000L) {
            return yd;
         } else {
            try {
               Object var2 = rh.get((Object)null);
               Object var3 = qe.invoke(var2);
               tb = var0;
               yd = var3 != null;
               return yd;
            } catch (InvocationTargetException | IllegalAccessException var4) {
               return false;
            }
         }
      }
   }

   static {
      Class var0;
      Field var1;
      Method var2;
      try {
         var0 = Class.forName("com.replaymod.replay.ReplayModReplay");
         var1 = var0.getDeclaredField("instance");
         var2 = var0.getDeclaredMethod("getReplayHandler");
      } catch (NoSuchFieldException | NoSuchMethodException | ClassNotFoundException var4) {
         var0 = null;
         var1 = null;
         var2 = null;
      }

      my = var0;
      rh = var1;
      qe = var2;
   }
}
