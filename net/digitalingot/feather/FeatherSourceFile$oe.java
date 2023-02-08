package net.digitalingot.feather;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;

class FeatherSourceFile$oe {
   private static Constructor uW;
   private static Method uX;
   private static Method uY;
   private static Method uZ;
   private static Method vA;
   private static Method vB;
   private final Object vC;

   private FeatherSourceFile$oe(Object var1) {
      this.vC = var1;
   }

   public long t() {
      try {
         return (Long)uX.invoke(this.vC);
      } catch (InvocationTargetException | IllegalAccessException var2) {
         return -1L;
      }
   }

   public void qy(Path var1) {
      try {
         uY.invoke(this.vC, var1);
      } catch (IllegalAccessException var4) {
      } catch (InvocationTargetException var5) {
         Throwable var3 = var5.getCause();
         if (var3 instanceof IOException) {
            throw (IOException)var3;
         }

         if (var3 instanceof RuntimeException) {
            throw (RuntimeException)var3;
         }
      }

   }

   public void xj() {
      try {
         uZ.invoke(this.vC);
      } catch (IllegalAccessException var3) {
      } catch (InvocationTargetException var4) {
         Throwable var2 = var4.getCause();
         if (var2 instanceof RuntimeException) {
            throw (RuntimeException)var2;
         }
      }

   }

   public boolean u() {
      try {
         return (Boolean)vA.invoke(this.vC);
      } catch (IllegalAccessException var3) {
      } catch (InvocationTargetException var4) {
         Throwable var2 = var4.getCause();
         if (var2 instanceof RuntimeException) {
            throw (RuntimeException)var2;
         }
      }

      return false;
   }

   public void close() {
      try {
         vB.invoke(this.vC);
      } catch (InvocationTargetException | IllegalAccessException var2) {
      }

   }

   public static FeatherSourceFile$oe nc(FeatherSourceFile$lh28 var0) {
      try {
         return new FeatherSourceFile$oe(uW.newInstance(FeatherSourceFile$lh28.lh(var0)));
      } catch (IllegalAccessException | InstantiationException var3) {
      } catch (InvocationTargetException var4) {
         Throwable var2 = var4.getCause();
         if (var2 instanceof RuntimeException) {
            throw (RuntimeException)var2;
         }
      }

      return null;
   }

   private static boolean p() {
      try {
         Class var0 = Class.forName("jdk.jfr.Recording");
         uW = FeatherSourceFile43.nc(var0, new Class[]{FeatherSourceFile$lh28.n()});
         uX = FeatherSourceFile43.nc(var0, "getId", new Class[0]);
         uY = FeatherSourceFile43.nc(var0, "setDestination", new Class[]{Path.class});
         uZ = FeatherSourceFile43.nc(var0, "start", new Class[0]);
         vA = FeatherSourceFile43.nc(var0, "stop", new Class[0]);
         vB = FeatherSourceFile43.nc(var0, "close", new Class[0]);
         return true;
      } catch (NoSuchMethodException | ClassNotFoundException var1) {
         return false;
      }
   }

   // $FF: synthetic method
   static boolean v() {
      return p();
   }
}
