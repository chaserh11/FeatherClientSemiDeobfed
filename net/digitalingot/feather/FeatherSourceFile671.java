package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.MouseInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile671 implements FeatherSourceFile189 {
   private static final Minecraft minecraft = Minecraft.func_71410_x();

   @SubscribeEvent
   public void lh(MouseInputEvent var1) {
      int var2 = Mouse.getEventButton();
      int var3 = Mouse.getEventButtonState() ? 1 : 0;
      byte var4 = 0;
      ((FeatherSourceFile$nc14)FeatherSourceFile609.xw.sx()).mouseInput(var2, var3, var4);
   }

   @SubscribeEvent
   public void lh(KeyInputEvent var1) {
      int var2 = Keyboard.getEventKey();
      byte var3 = 0;
      int var4 = Keyboard.getEventKeyState() ? 1 : 0;
      byte var5 = 0;
      ((FeatherSourceFile$lh53)FeatherSourceFile609.cm.sx()).keyInput(var2, var3, var4, var5);
   }
}
