package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class FeatherSourceFile843 {
   public static final float Na = 7.0F;
   public static final float Nb = 1.0F;
   public static final float Nc = 1.0F;
   private static final FontRenderer Nd;
   private static final TextureManager Ne;

   private FeatherSourceFile843() {
      throw new AssertionError();
   }

   public static void lh(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Gui.func_152125_a(var0, var1, (float)var4, (float)var5, var6, var7, var2, var3, (float)var8, (float)var9);
   }

   public static void lh(IChatComponent var0, int var1, int var2, int var3) {
      String var4 = var0.func_150254_d();
      Nd.func_78276_b(var4, var1, var2, var3);
   }

   public static void lh(String var0, int var1, int var2, int var3) {
      Nd.func_78276_b(var0, var1, var2, var3);
   }

   public static void hE() {
      GlStateManager.func_179118_c();
   }

   public static void hF() {
      GlStateManager.func_179141_d();
   }

   public static void lh(int var0, float var1) {
      GlStateManager.func_179092_a(var0, var1);
   }

   public static void yh(int var0) {
      GlStateManager.func_179103_j(var0);
   }

   public static void hG() {
      GlStateManager.func_179145_e();
   }

   public static void hH() {
      GlStateManager.func_179140_f();
   }

   public static void hI() {
      GlStateManager.func_179126_j();
   }

   public static void hJ() {
      GlStateManager.func_179097_i();
   }

   public static void rb(int var0) {
      GlStateManager.func_179143_c(var0);
   }

   public static void ck(boolean var0) {
      GlStateManager.func_179132_a(var0);
   }

   public static void hK() {
      GlStateManager.func_179091_B();
   }

   public static void hL() {
      GlStateManager.func_179101_C();
   }

   public static void wq() {
      GlStateManager.func_179147_l();
   }

   public static void jz() {
      GlStateManager.func_179084_k();
   }

   public static void hM() {
      GlStateManager.func_179129_p();
   }

   public static void hN() {
      GlStateManager.func_179089_o();
   }

   public static void ou(int var0, int var1, int var2, int var3) {
      GlStateManager.func_179120_a(var0, var1, var2, var3);
   }

   public static void ly(int var0, int var1) {
      GlStateManager.func_179112_b(var0, var1);
   }

   @Deprecated
   public static void hO() {
      GlStateManager.func_179090_x();
   }

   @Deprecated
   public static void hP() {
      GlStateManager.func_179098_w();
   }

   public static void nc(float var0, float var1, float var2, float var3) {
      GlStateManager.func_179131_c(var0, var1, var2, var3);
   }

   public static void oe(float var0, float var1, float var2) {
      GlStateManager.func_179124_c(var0, var1, var2);
   }

   public static void gr(float var0) {
      GL11.glLineWidth(var0);
   }

   public static float hQ() {
      return GL11.glGetFloat(2849);
   }

   public static int fo(String var0) {
      return Nd.func_78256_a(var0);
   }

   public static float xy(boolean var0) {
      float var1 = 7.0F;
      if (var0) {
         ++var1;
      }

      return var1;
   }

   public static int hR() {
      return GL11.glGetInteger(34016);
   }

   public static void ej(int var0) {
      GlStateManager.func_179138_g(var0);
   }

   private static void vr(int var0) {
      GlStateManager.func_179144_i(var0);
   }

   public static void rp(int var0, int var1) {
      int var2 = hR();
      ej('蓀' + var0);
      vr(var1);
      ej(var2);
   }

   public static void lh(int var0, ResourceLocation var1) {
      rp(var0, xj(var1));
   }

   private static int xj(ResourceLocation var0) {
      Object var1 = Ne.func_110581_b(var0);
      if (var1 == null) {
         var1 = new SimpleTexture(var0);
         Ne.func_110579_a(var0, (ITextureObject)var1);
      }

      return ((ITextureObject)var1).func_110552_b();
   }

   public static void oe(ResourceLocation var0) {
      SimpleTexture var1 = new SimpleTexture(var0);
      Ne.func_110579_a(var0, var1);
   }

   @Deprecated
   public static void hS() {
      FeatherSourceFile847.hS();
   }

   @Deprecated
   public static void hT() {
      FeatherSourceFile847.hT();
   }

   public static void hU() {
   }

   @Deprecated
   public static void qy(float var0, float var1, float var2) {
      FeatherSourceFile847.qy(var0, var1, var2);
   }

   @Deprecated
   public static void lh(double var0, double var2, double var4) {
      FeatherSourceFile847.lh(var0, var2, var4);
   }

   @Deprecated
   public static void xj(float var0, float var1, float var2, float var3) {
      FeatherSourceFile847.xj(var0, var1, var2, var3);
   }

   @Deprecated
   public static void ou(float var0, float var1, float var2) {
      FeatherSourceFile847.ou(var0, var1, var2);
   }

   @Deprecated
   public static void nc(double var0, double var2, double var4) {
      FeatherSourceFile847.nc(var0, var2, var4);
   }

   public static int hV() {
      return Nd.field_78288_b;
   }

   static {
      Nd = Minecraft.func_71410_x().field_71466_p;
      Ne = Minecraft.func_71410_x().func_110434_K();
   }
}
