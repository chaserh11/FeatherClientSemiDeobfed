package net.digitalingot.feather;

import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

final class FeatherSourceFile31 {
   private static final Field cu;

   private FeatherSourceFile31() {
      throw new AssertionError();
   }

   public static void lh(KeyEvent var0, int var1) {
      try {
         cu.set(var0, var1);
      } catch (Throwable var3) {
      }

   }

   static {
      try {
         cu = KeyEvent.class.getDeclaredField("scancode");
         cu.setAccessible(true);
      } catch (Throwable var1) {
         throw new IllegalStateException(var1);
      }
   }
}
