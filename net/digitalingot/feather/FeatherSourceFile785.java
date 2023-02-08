package net.digitalingot.feather;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FeatherSourceFile785 {
   public static final int lz = 48;
   private static boolean du;
   private static Field de;
   private static Method vu;

   public static boolean nw() {
      return du;
   }

   public static boolean po() {
      try {
         return (Boolean)vu.invoke(de.get((Object)null));
      } catch (Throwable var1) {
         return false;
      }
   }

   static {
      try {
         Class var0 = Class.forName("net.coderbot.iris.block_rendering.BlockRenderingSettings");
         du = true;
         FeatherSourceFile311.Sb.info("Feather: Iris detected");
         de = var0.getField("INSTANCE");
         vu = var0.getMethod("shouldUseExtendedVertexFormat");
      } catch (Throwable var1) {
      }

   }
}
