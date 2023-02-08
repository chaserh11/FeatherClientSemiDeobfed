package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

public class FeatherSourceFile788 extends GuiScreen {
   private final FeatherSourceFile500 lm;
   private final FeatherSourceFile143 lk;
   private boolean qo;

   @Inject
   FeatherSourceFile788(FeatherSourceFile500 var1, FeatherSourceFile143 var2) {
      this.lm = var1;
      this.lk = var2;
   }

   public static void xo() {
      Minecraft.func_71410_x().func_147108_a((GuiScreen)FeatherSourceFile487.mq().getInstance(FeatherSourceFile788.class));
   }

   public void func_73866_w_() {
      this.lm.km(this.field_146294_l, this.field_146295_m);
   }

   public @NotNull void func_146280_a(@NotNull @NotNull Minecraft var1, int var2, int var3) {
      super.func_146280_a(var1, var2, var3);
      if (this.qo) {
         this.lk.func_175273_b(var1, var2, var3);
      } else {
         this.lk.func_146280_a(var1, var2, var3);
      }

   }

   public void func_146281_b() {
      this.lm.hn();
      this.lk.func_146281_b();
   }

   public @NotNull void func_175273_b(@NotNull @NotNull Minecraft var1, int var2, int var3) {
      this.qo = true;
      super.func_175273_b(var1, var2, var3);
      this.qo = false;
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.lm.mq(var1, var2);
      this.lk.func_73863_a(var1, var2, var3);
   }

   protected void func_73869_a(char var1, int var2) {
      super.func_73869_a(var1, var2);
      this.lm.lh(var1, var2);
   }

   protected void func_73864_a(int var1, int var2, int var3) {
      this.lm.qy(var1, var2, var3);
   }

   protected void func_146286_b(int var1, int var2, int var3) {
      this.lm.ou(var1, var2, var3);
   }

   protected void func_146273_a(int var1, int var2, int var3, long var4) {
      this.lm.pq(var1, var2, var3);
   }

   public void func_146274_d() {
      super.func_146274_d();
      if (Mouse.getEventButton() == -1 && Mouse.getEventDWheel() == 0) {
         int var1 = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
         int var2 = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
         this.lm.lh((double)var1, (double)var2);
      }

      if (this.ek()) {
         this.lk.func_146274_d();
      }

   }

   private boolean ek() {
      return !this.lm.eh();
   }

   public boolean func_73868_f() {
      return false;
   }
}
