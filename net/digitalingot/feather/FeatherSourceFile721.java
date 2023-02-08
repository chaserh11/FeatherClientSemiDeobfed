package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FeatherSourceFile721 {
   private static final boolean yj;
   public static final int lz = 56;
   private static Method aa;
   private static Method pf;
   private static Class el;
   private static Class sj;
   private static Method np;
   private static Field yc;
   private static Method dv;
   private static Method fm;
   private static Method kv;
   private static Method au;
   private static Method ln;
   private static Method ij;
   private static Method ec;
   private static Method ic;
   public static int wv = 10;
   public static final int mb = 11;
   public static final int ew = 12;

   public static void yq() {
      if (yj) {
         Object var0 = null;

         try {
            String var1 = "Config";
            el = Class.forName(var1);
            FeatherSourceFile311.Sb.info("Feather: Detected OptiFine! Disabling patches...");
         } catch (Throwable var2) {
            FeatherSourceFile311.Sb.info("Feather: Couldn't get Optifine config");
         }

      }
   }

   public static boolean nw() {
      return yj;
   }

   public static boolean es() {
      try {
         return (Boolean)np.invoke((Object)null);
      } catch (Throwable var1) {
         return false;
      }
   }

   public static boolean vw() {
      try {
         return yc.getBoolean((Object)null);
      } catch (Throwable var1) {
         var1.printStackTrace();
         return false;
      }
   }

   public static void mn() {
      try {
         ij.invoke((Object)null);
      } catch (Throwable var1) {
         FeatherSourceFile311.Sb.error("Feather: pushProgram fail");
         var1.printStackTrace();
      }

   }

   public static void ea() {
      try {
         ec.invoke((Object)null);
      } catch (Throwable var1) {
         FeatherSourceFile311.Sb.error("Feather: popProgram fail");
         var1.printStackTrace();
      }

   }

   public static void km(boolean var0) {
      try {
         ic.invoke((Object)null, var0);
      } catch (Throwable var2) {
         FeatherSourceFile311.Sb.error("Feather: setFlushRenderBuffers fail");
         var2.printStackTrace();
      }

   }

   public static String km(int var0) {
      switch (var0) {
         case 0:
            return "Sampler0";
         case 1:
            return "Sampler1";
         case 2:
            return "Sampler2";
         case 3:
            return "Sampler3";
         case 4:
            return "Sampler4";
         case 5:
            return "Sampler5";
         case 6:
            return "Sampler6";
         case 7:
            return "Sampler7";
         case 8:
            return "Sampler8";
         case 9:
            return "Sampler9";
         case 10:
            return "Sampler10";
         case 11:
            return "Sampler11";
         default:
            return "Sampler" + var0;
      }
   }

   public static boolean wh() {
      if (!yj) {
         return false;
      } else {
         if (aa == null) {
            try {
               aa = Class.forName("Config").getDeclaredMethod("isCustomColors");
               aa.setAccessible(true);
            } catch (NoSuchMethodException | ClassNotFoundException var2) {
               return false;
            }
         }

         try {
            return (Boolean)aa.invoke((Object)null);
         } catch (InvocationTargetException | IllegalAccessException var1) {
            return false;
         }
      }
   }

   public static int mq(int var0) {
      if (!yj) {
         return var0;
      } else {
         if (pf == null) {
            try {
               pf = Class.forName("net.optifine.CustomColors").getDeclaredMethod("getExpBarTextColor", Integer.TYPE);
               pf.setAccessible(true);
            } catch (NoSuchMethodException | ClassNotFoundException var3) {
               return var0;
            }
         }

         try {
            return (Integer)pf.invoke((Object)null, var0);
         } catch (InvocationTargetException | IllegalAccessException var2) {
            return var0;
         }
      }
   }

   static {
      boolean var0 = false;

      try {
         Class.forName("optifine.OptiFineClassTransformer", false, FeatherSourceFile721.class.getClassLoader());
         var0 = true;
      } catch (ClassNotFoundException var2) {
      }

      yj = var0;
      FeatherSourceFile311.Sb.info("Feather: Optifine dectected? " + var0);
   }
}
