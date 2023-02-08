package net.digitalingot.feather;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import net.digitalingot.cef.SharedTextureSupport;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefBrowser_N;
import org.cef.browser.CefRequestContext;
import org.cef.callback.CefDragData;
import org.cef.handler.CefRenderHandler;
import org.cef.handler.CefScreenInfo;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile104 extends CefBrowser_N implements CefRenderHandler {
   private final boolean th;
   private final Rectangle gd = new Rectangle(0, 0, 1600, 900);
   private SharedTextureSupport ge;
   private int if = 0;
   private boolean km = false;
   private int textureWidth = 0;
   private int textureHeight = 0;
   private boolean gg = false;
   private long eb = 0L;
   private int va = 0;
   private boolean uc = false;
   private boolean ef = false;
   private int mw = 0;

   protected FeatherSourceFile104(CefClient var1, String var2, CefRequestContext var3) {
      super(var1, var2, var3, (CefBrowser_N)null, (Point)null);
      this.th = CefApp.getInstance().getSettings().hardware_acceleration;
   }

   private void ex() {
      if (!this.km) {
         this.it();
         this.hi();
         this.km = true;
      }
   }

   private void it() {
      this.if = GL11.glGenTextures();
      GL11.glBindTexture(3553, this.if);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
   }

   private void jn() {
      if (this.if != 0) {
         GL11.glDeleteTextures(this.if);
         this.if = 0;
      }

   }

   private void hi() {
      if (this.th) {
         this.ge = SharedTextureSupport.create();
      }

   }

   private void ll() {
      if (this.ge != null) {
         this.ge.destroy();
         this.ge = null;
      }

   }

   public synchronized void onBeforeClose() {
      super.onBeforeClose();
      Minecraft.func_71410_x().func_152344_a(() -> {
         this.ll();
         this.jn();
      });
   }

   public CefRenderHandler getRenderHandler() {
      return this;
   }

   protected CefBrowser_N createDevToolsBrowser(CefClient var1, String var2, CefRequestContext var3, CefBrowser_N var4, Point var5) {
      return null;
   }

   public void createImmediately() {
      this.createBrowser(this.getClient(), this.getUrl(), this.getRequestContext());
   }

   public Rectangle getViewRect(CefBrowser var1) {
      return this.gd;
   }

   public boolean getScreenInfo(CefBrowser var1, CefScreenInfo var2) {
      var2.Set(1.0, 32, 8, false, this.gd.getBounds(), this.gd.getBounds());
      return true;
   }

   public Point getScreenPoint(CefBrowser var1, Point var2) {
      return null;
   }

   public void onPopupShow(CefBrowser var1, boolean var2) {
   }

   public void onPopupSize(CefBrowser var1, Rectangle var2) {
   }

   public void onPaint(CefBrowser var1, boolean var2, Rectangle[] var3, ByteBuffer var4, int var5, int var6) {
      if (!var2) {
         try {
            Minecraft.func_71410_x().func_152344_a(() -> {
               this.ex();
               GL11.glBindTexture(3553, this.if);
               int var5x = GL11.glGetInteger(3317);
               int var6x = GL11.glGetInteger(3314);
               int var7 = GL11.glGetInteger(3316);
               int var8 = GL11.glGetInteger(3315);
               GL11.glPixelStorei(3317, 1);
               GL11.glPixelStorei(3314, var5);
               if (this.textureWidth == var5 && this.textureHeight == var6) {
                  Rectangle[] var9 = var3;
                  int var10 = var3.length;

                  for(int var11 = 0; var11 < var10; ++var11) {
                     Rectangle var12 = var9[var11];
                     GL11.glPixelStorei(3316, var12.x);
                     GL11.glPixelStorei(3315, var12.y);
                     GL11.glTexSubImage2D(3553, 0, var12.x, var12.y, var12.width, var12.height, 32993, 33639, var4);
                  }
               } else {
                  this.textureWidth = var5;
                  this.textureHeight = var6;
                  GL11.glPixelStorei(3316, 0);
                  GL11.glPixelStorei(3315, 0);
                  GL11.glTexImage2D(3553, 0, 6408, var5, var6, 0, 32993, 33639, var4);
                  this.hq();
               }

               GL11.glPixelStorei(3317, var5x);
               GL11.glPixelStorei(3314, var6x);
               GL11.glPixelStorei(3316, var7);
               GL11.glPixelStorei(3315, var8);
               GL11.glBindTexture(3553, 0);
               this.oi();
            }).get();
         } catch (ExecutionException | InterruptedException var8) {
         }

      }
   }

   public void onAcceleratedPaint(CefBrowser var1, boolean var2, Rectangle[] var3, long var4) {
   }

   public void onAcceleratedPaint2(CefBrowser var1, boolean var2, Rectangle[] var3, long var4, boolean var6) {
      if (!var2) {
         try {
            Minecraft.func_71410_x().func_152344_a(() -> {
               this.lh(var4, var6);
            }).get();
         } catch (ExecutionException | InterruptedException var8) {
         }

      }
   }

   private void lh(long var1, boolean var3) {
      if (var3) {
         this.ex();
         this.ge.unlock();
         this.gg = this.ge.openSharedTexture(var1, this.if);
         if (!this.gg) {
            return;
         }

         this.hq();
      } else if (!this.gg) {
         return;
      }

      this.oi();
      this.ge.unlock();
      this.ge.update();
      this.ge.lock();
   }

   private void hq() {
      if (!this.ef) {
         this.ef = true;
         this.mw = 0;
      }

   }

   private void oi() {
      if (this.ef) {
         if (this.mw > 2) {
            this.ef = false;
            this.setZoomLevel(0.0);
         } else {
            this.setZoomLevel((double)this.mw * 0.005);
         }

         ++this.mw;
      }

   }

   public void oe(int var1, int var2) {
      if (!this.ef) {
         if (this.if != 0) {
            float var3;
            float var4;
            if (this.th) {
               if (!this.gg) {
                  return;
               }

               var3 = 0.0F;
               var4 = 1.0F;
            } else {
               var3 = 1.0F;
               var4 = 0.0F;
            }

            FeatherSourceFile843.hP();
            FeatherSourceFile843.rp(0, this.if);
            FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
            FeatherSourceFile843.wq();
            FeatherSourceFile843.hJ();
            FeatherSourceFile443 var5 = FeatherSourceFile443.RM;
            var5.nc(7, DefaultVertexFormats.field_181707_g);
            var5.pq(0.0, (double)var2, 0.0).ou(0.0F, var3).xZ();
            var5.pq((double)var1, (double)var2, 0.0).ou(1.0F, var3).xZ();
            var5.pq((double)var1, 0.0, 0.0).ou(1.0F, var4).xZ();
            var5.pq(0.0, 0.0, 0.0).ou(0.0F, var4).xZ();
            var5.lx();
            FeatherSourceFile843.rp(0, 0);
            if (!this.th) {
               int var6 = net.digitalingot.feather.mixin.core.FeatherSourceFile9.getFPS();
               if (var6 < 30) {
                  var6 = 30;
               }

               if (var6 > 120) {
                  var6 = 120;
               }

               if (var6 != this.va) {
                  this.setWindowlessFrameRate(var6);
                  this.va = var6;
               }
            }

         }
      }
   }

   public boolean onCursorChange(CefBrowser var1, int var2) {
      return true;
   }

   public boolean startDragging(CefBrowser var1, CefDragData var2, int var3, int var4, int var5) {
      return false;
   }

   public void updateDragCursor(CefBrowser var1, int var2) {
   }

   public final void lh(KeyEvent var1) {
      this.sendKeyEvent(var1);
   }

   public final void lh(MouseEvent var1) {
      this.sendMouseEvent(var1);
   }

   public final void lh(MouseWheelEvent var1) {
      this.sendMouseWheelEvent(var1);
   }

   public final void cx() {
      this.hb(0);
   }

   public final void hb(int var1) {
      if (this.th) {
         if (var1 <= 0) {
            this.sendExternalBeginFrame();
         } else {
            long var2 = FeatherSourceFile844.iF();
            if (var2 >= this.eb) {
               this.sendExternalBeginFrame();
               this.eb = var2 + 1000000000L / (long)var1;
            }
         }

      }
   }

   public final void yn() {
      if (!this.uc) {
         this.setVisibility(false);
         this.uc = true;
      }

   }

   public final void ws() {
      if (this.uc) {
         this.ef = true;
         this.mw = 0;
         this.setVisibility(true);
         this.setZoomLevel(0.003);
         this.uc = false;
      }

   }

   public boolean oq() {
      return this.uc;
   }

   public void qy(int var1, int var2) {
      this.gd.setSize(var1, var2);
   }

   public void xh() {
      if (!this.ef) {
         this.ef = true;
         this.mw = 0;
         this.wasResized(0, 0);
         this.setZoomLevel(0.003);
      }

   }
}
