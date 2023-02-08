package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FeatherSourceFile$nc11 {
   private static Method uU;

   private FeatherSourceFile$nc11() {
   }

   public static boolean r() {
      try {
         return (Boolean)uU.invoke((Object)null);
      } catch (InvocationTargetException | IllegalAccessException var1) {
         return false;
      }
   }

   private static boolean p() {
      try {
         Class var0 = Class.forName("jdk.jfr.FlightRecorder");
         uU = FeatherSourceFile43.nc(var0, "isAvailable", new Class[0]);
         return true;
      } catch (NoSuchMethodException | ClassNotFoundException var1) {
         return false;
      }
   }

   // $FF: synthetic method
   static boolean s() {
      return p();
   }
}
