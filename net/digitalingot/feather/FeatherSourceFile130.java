package net.digitalingot.feather;

import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile130 {
   private static boolean du;
   private static boolean hn;

   public static boolean nw() {
      return du;
   }

   public static boolean md() {
      return hn;
   }

   public static @NotNull boolean lh(@NotNull @NotNull GuiScreen var0) {
      return var0.getClass().getName().startsWith("gg.essential.gui");
   }

   static {
      try {
         Class.forName("gg.essential.Essential");
         du = true;
      } catch (Throwable var2) {
         du = false;
      }

      try {
         Class.forName("gg.essential.elementa.ElementaVersion");
         hn = true;
      } catch (Throwable var1) {
         hn = false;
      }

   }
}
