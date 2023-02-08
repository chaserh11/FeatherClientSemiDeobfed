package net.digitalingot.feather;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.Nullable;

public class FeatherSourceFile390 {
   @Nullable
   private static final @Nullable Class av;
   private static final Method xn;

   public static boolean nw() {
      return av != null;
   }

   public static void gn() {
      if (xn != null) {
         try {
            boolean var0 = ((FeatherSourceFile143)FeatherSourceFile487.mq().getInstance(FeatherSourceFile143.class)).kj();
            GuiScreen var1 = (GuiScreen)xn.invoke((Object)null, var0 ? new GuiMainMenu() : null);
            Minecraft.func_71410_x().func_147108_a(var1);
         } catch (IllegalAccessException | InvocationTargetException var2) {
         }

      }
   }

   static {
      Class var0;
      Method var1;
      try {
         var0 = Class.forName("com.terraformersmc.modmenu.api.ModMenuApi", false, FeatherSourceFile390.class.getClassLoader());
         var1 = var0.getDeclaredMethod("createModsScreen", GuiScreen.class);
      } catch (NoSuchMethodException | ClassNotFoundException var3) {
         var0 = null;
         var1 = null;
      }

      av = var0;
      xn = var1;
   }
}
