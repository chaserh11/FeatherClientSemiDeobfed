package net.digitalingot.feather;

import java.lang.reflect.Method;

public final class FeatherSourceFile510 {
   private static final int br = 0;
   private static final int dw = 0;
   private static final Method sl;

   private FeatherSourceFile510() {
      throw new AssertionError();
   }

   public static int ly(int var0) {
      try {
         return (Integer)sl.invoke((Object)null, var0, 0);
      } catch (Throwable var2) {
         return 0;
      }
   }

   static {
      Class var0;
      try {
         var0 = Class.forName("org.lwjgl.opengl.WindowsKeyboard");
      } catch (Throwable var3) {
         throw new IllegalStateException();
      }

      try {
         sl = var0.getDeclaredMethod("MapVirtualKey", Integer.TYPE, Integer.TYPE);
         sl.setAccessible(true);
      } catch (Throwable var2) {
         throw new IllegalStateException();
      }
   }
}
