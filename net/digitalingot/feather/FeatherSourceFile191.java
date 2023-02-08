package net.digitalingot.feather;

import java.io.File;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile191 {
   static @NotNull @NotNull IChatComponent lh(@NotNull @NotNull File var0, @NotNull @NotNull FeatherSourceFile$lh99 var1) {
      ChatComponentText var2 = new ChatComponentText("");
      ChatComponentText var3 = new ChatComponentText("Screenshot saved");
      ChatStyle var4 = var3.func_150256_b().func_150228_d(true);
      var3.func_150255_a(var4);
      var2.func_150257_a(var3);
      ChatComponentText var5;
      ChatStyle var6;
      if (var1.Jd) {
         var5 = new ChatComponentText("[Open]");
         var6 = var5.func_150256_b().func_150227_a(true).func_150238_a(EnumChatFormatting.GOLD).func_150241_a(new ClickEvent(Action.OPEN_FILE, var0.getAbsolutePath())).func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Open")));
         var5.func_150255_a(var6);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var5);
      }

      if (var1.Je) {
         var5 = new ChatComponentText("[Copy]");
         var6 = var5.func_150256_b().func_150227_a(true).func_150238_a(EnumChatFormatting.BLUE).func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot copy " + var0.getAbsolutePath())).func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Copy")));
         var5.func_150255_a(var6);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var5);
      }

      if (var1.Jf) {
         var5 = new ChatComponentText("[Upload]");
         var6 = var5.func_150256_b().func_150227_a(true).func_150238_a(EnumChatFormatting.GREEN).func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot upload " + var0.getAbsolutePath())).func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Upload & Open")));
         var5.func_150255_a(var6);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var5);
      }

      if (var1.Jg) {
         var5 = new ChatComponentText("[Tweet]");
         var6 = var5.func_150256_b().func_150227_a(true).func_150238_a(EnumChatFormatting.AQUA).func_150241_a(new ClickEvent(Action.RUN_COMMAND, "/featherscreenshot tweet " + var0.getAbsolutePath())).func_150209_a(new HoverEvent(net.minecraft.event.HoverEvent.Action.SHOW_TEXT, new ChatComponentText("Upload & Tweet")));
         var5.func_150255_a(var6);
         var2.func_150257_a(new ChatComponentText(" ")).func_150257_a(var5);
      }

      return var2;
   }
}
