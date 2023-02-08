package net.digitalingot.feather;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;

class FeatherSourceFile$lh28 {
   private static Class uQ;
   private static Method uR;
   private static Method uS;
   private final Object uT;

   private FeatherSourceFile$lh28(Object var1) {
      this.uT = var1;
   }

   private Object m() {
      return this.uT;
   }

   public static Class n() {
      return uQ;
   }

   public static FeatherSourceFile$lh28 lh(Reader var0) {
      try {
         return new FeatherSourceFile$lh28(uR.invoke((Object)null, var0));
      } catch (IllegalAccessException var3) {
      } catch (InvocationTargetException var4) {
         Throwable var2 = var4.getCause();
         if (var2 instanceof IOException) {
            throw (IOException)var2;
         }

         if (var2 instanceof ParseException) {
            throw (ParseException)var2;
         }
      }

      return null;
   }

   public static FeatherSourceFile$lh28 se(String var0) {
      try {
         return new FeatherSourceFile$lh28(uS.invoke((Object)null, var0));
      } catch (IllegalAccessException var3) {
      } catch (InvocationTargetException var4) {
         Throwable var2 = var4.getCause();
         if (var2 instanceof IOException) {
            throw (IOException)var2;
         }

         if (var2 instanceof ParseException) {
            throw (ParseException)var2;
         }
      }

      return null;
   }

   public static FeatherSourceFile$lh28 o() {
      return se("default");
   }

   private static boolean p() {
      try {
         uQ = Class.forName("jdk.jfr.Configuration");
         uR = FeatherSourceFile43.nc(uQ, "create", new Class[]{Reader.class});
         uS = FeatherSourceFile43.nc(uQ, "getConfiguration", new Class[]{String.class});
         return true;
      } catch (NoSuchMethodException | ClassNotFoundException var1) {
         return false;
      }
   }

   // $FF: synthetic method
   static boolean q() {
      return p();
   }

   // $FF: synthetic method
   static Object lh(FeatherSourceFile$lh28 var0) {
      return var0.m();
   }
}
