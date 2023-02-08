package net.digitalingot.feather.mixin.client;

import java.nio.ByteBuffer;
import java.util.Iterator;
import net.digitalingot.feather.FeatherSourceFile815;
import net.digitalingot.fwebp.WebPAnimDecoder;
import net.digitalingot.fwebp.WebPAnimFrame;
import net.digitalingot.fwebp.WebPAnimInfo;
import net.digitalingot.fwebp.WebPException;
import net.digitalingot.fwebp.WebPImage;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   targets = {"net.minecraftforge.fml.client.SplashProgress$3"},
   remap = false
)
public abstract class FeatherSourceFile98 implements Runnable {
   private ByteBuffer[] We;
   private int[] Wf;
   private WebPAnimInfo Wg;

   @Shadow
   protected abstract void setGL();

   @Shadow
   protected abstract void clearGL();

   @Inject(
      method = {"run()V"},
      at = {@At("HEAD")},
      remap = false,
      cancellable = true
   )
   private void wz(CallbackInfo var1) {
      var1.cancel();
      this.setGL();
      GL11.glClearColor(0.01176F, 0.06666F, 0.10196F, 1.0F);
      this.Ap();
      ByteBuffer[] var2 = this.We;
      int[] var3 = this.Wf;
      int var4 = this.Wg.getFrameCount();
      int var5 = this.Wg.getCanvasWidth();
      int var6 = this.Wg.getCanvasHeight();
      this.We = null;
      this.Wf = null;
      this.Wg = null;
      int var8 = -1;
      long var9 = 0L;
      boolean var11 = false;
      short var12 = 84;
      int var13 = 212;
      GL11.glEnable(3553);
      int var7 = this.et(var5, var6);
      GL11.glDisable(3553);

      while(true) {
         if (var11) {
            if (var8 == var4 - 1) {
               GL11.glDeleteTextures(var7);
               GlStateManager.func_179090_x();
               GlStateManager.func_179098_w();
               this.clearGL();
               return;
            }
         } else if (FeatherSourceFile84.isDone()) {
            var12 = 212;
            var13 = var4;
            var8 = var12 - 1;
            var11 = true;
         }

         GL11.glClear(16384);
         int var14 = Display.getWidth();
         int var15 = Display.getHeight();
         GL11.glViewport(0, 0, var14, var15);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0, (double)var14, (double)var15, 0.0, -1.0, 1.0);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         GL11.glBindTexture(3553, var7);
         if (var8 == -1 || System.currentTimeMillis() - var9 >= (long)var3[var8]) {
            ++var8;
            if (var8 >= var13) {
               var8 = var12;
            }

            GL11.glTexSubImage2D(3553, 0, 0, 0, var5, var6, 6408, 5121, var2[var8]);
            var9 = System.currentTimeMillis();
         }

         GL11.glBegin(7);
         GL11.glTexCoord2f(0.0F, 0.0F);
         GL11.glVertex2f(0.0F, 0.0F);
         GL11.glTexCoord2f(1.0F, 0.0F);
         GL11.glVertex2f((float)var14, 0.0F);
         GL11.glTexCoord2f(1.0F, 1.0F);
         GL11.glVertex2f((float)var14, (float)var15);
         GL11.glTexCoord2f(0.0F, 1.0F);
         GL11.glVertex2f(0.0F, (float)var15);
         GL11.glEnd();
         GL11.glBindTexture(3553, 0);
         GL11.glDisable(3553);
         FeatherSourceFile84.getMutex().acquireUninterruptibly();
         Display.update();
         FeatherSourceFile84.getMutex().release();
         if (FeatherSourceFile84.isPaused()) {
            this.clearGL();
            this.setGL();
         }

         Display.sync(100);
      }
   }

   private void Ap() {
      WebPAnimDecoder var1;
      try {
         var1 = new WebPAnimDecoder(new WebPImage(FeatherSourceFile815.hm("/assets/feather/textures/loading.webp").wQ()));
      } catch (WebPException var10) {
         throw new AssertionError();
      }

      int var2 = var1.getInfo().getFrameCount();
      ByteBuffer[] var3 = new ByteBuffer[var2];
      int[] var4 = new int[var2];
      int var5 = 0;

      for(Iterator var6 = var1.iterator(); var6.hasNext(); ++var5) {
         WebPAnimFrame var7 = (WebPAnimFrame)var6.next();
         ByteBuffer var8 = var7.getPixels();
         ByteBuffer var9 = ByteBuffer.allocateDirect(var8.capacity());
         var9.put(var8);
         var9.rewind();
         var3[var5] = var9;
         var4[var5] = var7.getDuration();
      }

      this.We = var3;
      this.Wf = var4;
      this.Wg = var1.getInfo();
      var1.close();
   }

   private int et(int var1, int var2) {
      int var3 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var3);
      GL11.glTexParameteri(3553, 33085, 0);
      GL11.glTexParameteri(3553, 33082, 0);
      GL11.glTexParameteri(3553, 33083, 0);
      GL11.glTexParameterf(3553, 34049, 0.0F);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3317, 4);
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 6408, 5121, (ByteBuffer)null);
      GL11.glBindTexture(3553, 0);
      return var3;
   }
}
