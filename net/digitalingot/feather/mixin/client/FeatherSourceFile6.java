package net.digitalingot.feather.mixin.client;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import net.digitalingot.feather.FeatherSourceFile$nc1;
import net.digitalingot.feather.FeatherSourceFile618;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ScreenShotHelper;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({ScreenShotHelper.class})
public abstract class FeatherSourceFile6 {
   @Shadow
   @Final
   private static Logger field_148261_a;
   @Shadow
   private static IntBuffer field_74293_b;
   @Shadow
   private static int[] field_74294_c;

   @Shadow
   private static File func_74290_a(File var0) {
      throw new AssertionError();
   }

   @Overwrite
   public static IChatComponent func_148259_a(File var0, String var1, int var2, int var3, Framebuffer var4) {
      ((FeatherSourceFile$nc1)FeatherSourceFile618.zy.sx()).screenshot();
      BufferedImage var5 = lh(var2, var3, var4);
      (new Thread(() -> {
         File var3 = new File(var0, "screenshots");
         var3.mkdir();
         File var4;
         if (var1 == null) {
            var4 = func_74290_a(var3);
         } else {
            var4 = new File(var3, var1);
         }

         try {
            ImageIO.write(var5, "png", var4);
         } catch (IOException var8) {
            field_148261_a.warn("Couldn't save screenshot", var8);
            Minecraft var6 = Minecraft.func_71410_x();
            var6.func_152344_a(() -> {
               var6.field_71456_v.func_146158_b().func_146227_a(new ChatComponentTranslation("screenshot.failure", new Object[]{var8.getMessage()}));
            });
            return;
         }

         ChatComponentText var5x = new ChatComponentText(var4.getName());
         var5x.func_150256_b().func_150241_a(new ClickEvent(Action.OPEN_FILE, var4.getAbsolutePath()));
         var5x.func_150256_b().func_150228_d(Boolean.TRUE);
         IChatComponent var9 = ((net.digitalingot.feather.FeatherSourceFile$lh)FeatherSourceFile618.je.sx()).screenshot(var4, new ChatComponentTranslation("screenshot.success", new Object[]{var5x}));
         if (var9 != null) {
            Minecraft var7 = Minecraft.func_71410_x();
            var7.func_152344_a(() -> {
               var7.field_71456_v.func_146158_b().func_146227_a(var9);
            });
         }
      })).start();
      return new ChatComponentText("");
   }

   private static BufferedImage lh(int var0, int var1, Framebuffer var2) {
      if (OpenGlHelper.func_148822_b()) {
         var0 = var2.field_147622_a;
         var1 = var2.field_147620_b;
      }

      int var3 = var0 * var1;
      if (field_74293_b == null || field_74293_b.capacity() < var3) {
         field_74293_b = BufferUtils.createIntBuffer(var3);
         field_74294_c = new int[var3];
      }

      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      field_74293_b.clear();
      if (OpenGlHelper.func_148822_b()) {
         GlStateManager.func_179144_i(var2.field_147617_g);
         GL11.glGetTexImage(3553, 0, 32993, 33639, field_74293_b);
      } else {
         GL11.glReadPixels(0, 0, var0, var1, 32993, 33639, field_74293_b);
      }

      field_74293_b.get(field_74294_c);
      TextureUtil.func_147953_a(field_74294_c, var0, var1);
      BufferedImage var4 = new BufferedImage(var0, var1, 1);
      var4.setRGB(0, 0, var0, var1, field_74294_c, 0, var0);
      return var4;
   }
}
