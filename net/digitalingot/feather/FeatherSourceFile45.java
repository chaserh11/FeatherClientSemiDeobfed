package net.digitalingot.feather;

import java.lang.reflect.Field;

public class FeatherSourceFile45 {
   private static boolean iz;
   private static Class js;
   private static Field wa;

   public static boolean nw() {
      return iz;
   }

   public static void aj() {
      if (iz) {
         try {
            js = Class.forName("club.sk1er.patcher.config.PatcherConfig");
            wa = js.getField("batchModelRendering");
            wa.setAccessible(true);
         } catch (NoSuchFieldException | ClassNotFoundException var1) {
            FeatherSourceFile311.Sb.error("Incompatible Patcher changes!");
         }
      }

   }

   public static void yr() {
      if (iz) {
         try {
            js = Class.forName("club.sk1er.patcher.config.PatcherConfig");
            js.getField("chatPosition").set((Object)null, false);
            js.getField("compactChat").set((Object)null, false);
         } catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException var1) {
            FeatherSourceFile311.Sb.error("Incompatible Patcher changes!");
         }
      }

   }

   public static boolean fs() {
      if (iz) {
         try {
            return wa.getBoolean((Object)null);
         } catch (IllegalAccessException var1) {
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      try {
         Class.forName("club.sk1er.patcher.mixins.plugin.PatcherMixinPlugin");
         iz = true;
         FeatherSourceFile311.Sb.info("Detected PatcherMod! Disabling patches...");
      } catch (ClassNotFoundException var1) {
         iz = false;
      }

   }
}
