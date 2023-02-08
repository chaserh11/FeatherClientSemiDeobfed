package net.digitalingot.feather;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public class FeatherSourceFile37 {
   public static String nc(String var0) {
      if (var0.startsWith("feather.")) {
         String var1 = FeatherSourceFile194.ns().yl(var0);
         if (var1 == null) {
            String var2 = FeatherSourceFile194.aY.yl(var0);
            return var2 == null ? var0 : var2;
         } else {
            return var1;
         }
      } else {
         return lh(var0).func_150260_c();
      }
   }

   public static IChatComponent un() {
      return new ChatComponentText("");
   }

   public static IChatComponent xj(String var0) {
      return new ChatComponentText(var0);
   }

   public static IChatComponent lh(String var0, Object... var1) {
      return new ChatComponentTranslation(var0, var1);
   }

   public static List lh(IChatComponent var0, int var1) {
      return GuiUtilRenderComponents.func_178908_a(var0, var1, Minecraft.func_71410_x().field_71466_p, false, false);
   }
}
