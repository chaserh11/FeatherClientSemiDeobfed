package net.digitalingot.feather;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class FeatherSourceFile560 extends GuiScreen {
   private static final Component zv = new Component() {
   };
   protected final FeatherSourceFile625 yt;
   protected final FeatherSourceFile104 nn;
   private boolean us;
   private final FeatherSourceFile517 ns = new FeatherSourceFile517();
   private boolean qo = false;
   private boolean ak = false;
   private boolean ve;
   private static final int tu = 0;
   private static final int za = 1;
   private static final int rm = 2;

   public FeatherSourceFile560(FeatherSourceFile625 var1, FeatherSourceFile104 var2) {
      this.yt = var1;
      this.nn = var2;
   }

   public void cm() {
      this.yt.cm();
   }

   public boolean oq() {
      return this.nn.oq();
   }

   public void qr(boolean var1) {
      if (var1) {
         this.nn.yn();
      } else {
         this.nn.ws();
      }

   }

   public void eg(boolean var1) {
      this.us = var1;
   }

   public void oy(String var1) {
      this.nn.executeJavaScript(var1, "internal", 0);
   }

   protected void wi() {
      this.field_146297_k.func_147108_a((GuiScreen)null);
      if (this.field_146297_k.field_71462_r == null) {
         this.field_146297_k.func_71381_h();
      }

   }

   public @NotNull void func_146280_a(@NotNull @NotNull Minecraft var1, int var2, int var3) {
      super.func_146280_a(var1, var2, var3);
      if (!this.qo) {
         this.uo();
      }

   }

   public void func_146281_b() {
      this.um();
   }

   public @NotNull void func_175273_b(@NotNull @NotNull Minecraft var1, int var2, int var3) {
      this.qo = true;
      super.func_175273_b(var1, var2, var3);
      this.qo = false;
      this.ak = true;
   }

   protected void uo() {
      this.gp();
      if (this.nn.oq()) {
         this.us = true;
      }

      this.nn.ws();
      this.nn.setFocus(true);
      this.zw();
   }

   protected void um() {
      this.nn.setFocus(false);
      if (this.us) {
         this.nn.yn();
         this.us = false;
      }

      this.yv();
   }

   private void zw() {
      Keyboard.enableRepeatEvents(true);
   }

   private void yv() {
      Keyboard.enableRepeatEvents(false);
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.ep(0);
   }

   public void ep(int var1) {
      if (this.ak) {
         this.gp();
         this.ak = false;
      }

      this.nn.oe(this.field_146294_l, this.field_146295_m);
      this.nn.hb(var1);
   }

   public void func_146282_l() {
      if (Keyboard.getEventKeyState()) {
         this.qr(Keyboard.getEventKey());
         char var1 = Keyboard.getEventCharacter();
         if (var1 == '\r' || var1 >= ' ' && (var1 <= '~' || var1 >= 160)) {
            this.lh(var1);
         }
      } else {
         this.eg(Keyboard.getEventKey());
      }

      this.field_146297_k.func_152348_aa();
   }

   protected void qr(int var1) {
      this.lh(var1, true);
   }

   protected void lh(int var1, boolean var2) {
      int var3 = je();
      KeyEvent var4 = new KeyEvent(zv, 401, 0L, var3, 0, '\uffff');
      int var5 = FeatherSourceFile580.rp(var1);
      int var6 = FeatherSourceFile510.ly(var5);
      FeatherSourceFile31.lh(var4, var6);
      this.nn.lh(var4);
      if (var1 == 1 && var2) {
         this.wi();
      }

   }

   protected void eg(int var1) {
      int var2 = je();
      KeyEvent var3 = new KeyEvent(zv, 402, 0L, var2, 0, '\uffff');
      int var4 = FeatherSourceFile580.rp(var1);
      int var5 = FeatherSourceFile510.ly(var4);
      FeatherSourceFile31.lh(var3, var5);
      this.nn.lh(var3);
   }

   protected void lh(char var1) {
      KeyEvent var2 = new KeyEvent(zv, 400, 0L, je(), 0, var1);
      this.nn.lh(var2);
   }

   public void func_146274_d() {
      int var1 = Mouse.getEventX();
      int var2 = this.field_146297_k.field_71440_d - Mouse.getEventY() - 1;
      int var3;
      int var4;
      if (this.ve) {
         Rectangle var5 = this.nn.getRenderHandler().getViewRect(this.nn);
         var3 = (int)((double)var1 * ((double)var5.width / (double)this.field_146297_k.field_71443_c));
         var4 = (int)((double)var2 * ((double)var5.height / (double)this.field_146297_k.field_71440_d));
      } else {
         var3 = var1;
         var4 = var2;
      }

      int var7 = Mouse.getEventButton();
      if (var7 == -1) {
         int var6 = Mouse.getEventDWheel();
         if (var6 != 0) {
            this.oe(var3, var4, var6);
         } else {
            this.ou(var3, var4);
         }
      } else if (Mouse.getEventButtonState()) {
         this.nc(var3, var4, var7);
      } else {
         this.xj(var3, var4, var7);
      }

   }

   protected void nc(int var1, int var2, int var3) {
      int var4 = oy(var3);
      if (var4 != 0) {
         this.ns.lh(var1, var2, var4);
         MouseEvent var5 = new MouseEvent(zv, 501, 0L, ya(), var1, var2, this.ns.sf(), false, var4);
         this.nn.lh(var5);
      }
   }

   protected void xj(int var1, int var2, int var3) {
      int var4 = oy(var3);
      if (var4 != 0) {
         MouseEvent var5 = new MouseEvent(zv, 502, 0L, ya(), var1, var2, this.ns.sf(), false, var4);
         this.nn.lh(var5);
      }
   }

   protected void oe(int var1, int var2, int var3) {
      MouseWheelEvent var4 = new MouseWheelEvent(zv, 507, 0L, ya(), var1, var2, 0, false, 1, 0, var3);
      this.nn.lh(var4);
   }

   protected void ou(int var1, int var2) {
      this.ns.xj(var1, var2);
      MouseEvent var3 = new MouseEvent(zv, 503, 0L, ya(), var1, var2, 0, false, 0);
      this.nn.lh(var3);
   }

   public void gp() {
      float var3 = this.vi();
      this.ve = var3 != 1.0F;
      int var1;
      int var2;
      if (this.ve) {
         var1 = (int)((float)this.field_146297_k.field_71443_c * var3);
         var2 = (int)((float)this.field_146297_k.field_71440_d * var3);
      } else {
         var1 = this.field_146297_k.field_71443_c;
         var2 = this.field_146297_k.field_71440_d;
      }

      Rectangle var4 = this.nn.getRenderHandler().getViewRect(this.nn);
      if (var4.width != var1 || var4.height != var2) {
         this.pq(var1, var2);
      }

   }

   protected float vi() {
      return 1.0F;
   }

   protected void pq(int var1, int var2) {
      this.nn.qy(var1, var2);
      this.nn.xh();
   }

   private static int oy(int var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 3;
         case 2:
            return 2;
         default:
            return 0;
      }
   }

   private static int je() {
      int var0 = 0;
      if (func_175283_s()) {
         var0 |= 512;
      }

      if (func_146271_m()) {
         var0 |= 128;
      }

      if (func_146272_n()) {
         var0 |= 64;
      }

      return var0;
   }

   private static int ya() {
      int var0 = je();
      if (Mouse.isButtonDown(0)) {
         var0 |= 1024;
      }

      if (Mouse.isButtonDown(1)) {
         var0 |= 4096;
      }

      if (Mouse.isButtonDown(2)) {
         var0 |= 2048;
      }

      return var0;
   }
}
