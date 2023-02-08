package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class FeatherSourceFile385 {
   public static FeatherSourceFile385 SQ;
   private static final Minecraft minecraft = Minecraft.func_71410_x();
   private static final FeatherSourceFile465 SR = FeatherSourceFile665.nc(FeatherSourceFile125.class);
   private final String SS = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000";
   private final FeatherSourceFile383 ST;
   private FeatherSourceFile818 SU;
   private FeatherSourceFile387 SV;
   private float SW;
   private float SX;

   public FeatherSourceFile385() {
      SQ = this;
      Objects.requireNonNull(this);
      this.ST = new FeatherSourceFile383("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000");
      FeatherSourceFile335.lh(() -> {
         return "[Feather Font] Allocated: " + this.ST.Tc + ", Free: " + this.ST.Tb.size() + ", Obf: " + this.ST.Ta.size();
      });
      FeatherSourceFile335.yC();
   }

   public void yO() {
      this.uq();
      if (((FeatherSourceFile$lh52)((FeatherSourceFile125)SR.ag()).pr()).oW != FeatherSourceFile$lh$lh13.VANILLA) {
         this.yP();
      } else {
         this.yQ();
      }

   }

   public void uq() {
      this.ST.uq();
   }

   public void yP() {
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var1 = this.yR();
      this.yQ();

      for(int var2 = 0; var2 < 256; ++var2) {
         FeatherSourceFile825.lh(new ResourceLocation(String.format("textures/font/unicode_page_%02x.png", var2)), String.valueOf(var2));
      }

      FeatherSourceFile825.lh(var1.getLocationFontTexture(), "default");
      this.SU = FeatherSourceFile825.nh("font");
   }

   public void yQ() {
      if (this.SU != null) {
         this.SU.vV();
         this.SU = null;
      }

   }

   public void lh(String var1, int var2, boolean var3) {
      FeatherSourceFile125 var4 = (FeatherSourceFile125)SR.ag();
      if (((FeatherSourceFile$lh52)var4.pr()).oW == FeatherSourceFile$lh$lh13.DIRECT) {
         this.nc(var1, var2, var3);
      } else {
         this.xj(var1, var2, var3);
      }

   }

   private void nc(String var1, int var2, boolean var3) {
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var4 = this.yR();
      if (this.SU == null) {
         this.yP();
      }

      var4.setRandomStyle(false);
      var4.setBoldStyle(false);
      var4.setItalicStyle(false);
      var4.setUnderlineStyle(false);
      var4.setStrikethroughStyle(false);
      this.SU.vU();
      this.lh(var4, var1, var2, var3, -1);
      GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void xj(String var1, int var2, boolean var3) {
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var4 = this.yR();
      if (this.SU == null) {
         this.yP();
      }

      var4.setRandomStyle(false);
      var4.setBoldStyle(false);
      var4.setItalicStyle(false);
      var4.setUnderlineStyle(false);
      var4.setStrikethroughStyle(false);
      this.SU.vU();
      int var5 = FeatherSourceFile387.lh(var1, var4.getRed(), var4.getGreen(), var4.getBlue(), var4.getAlpha(), var3);
      if (this.ST.Ta.contains(var5)) {
         this.lh(var4, var1, var2, var3, -1);
      } else {
         float var6 = var4.getPosX();
         float var7 = var4.getPosY();
         this.SW = var6;
         this.SX = var7;
         var4.setPosX(0.0F);
         var4.setPosY(0.0F);
         GlStateManager.func_179109_b(var6, var7, 0.0F);
         FeatherSourceFile387 var8 = (FeatherSourceFile387)this.ST.yT().get(var5);
         if (var8 != null) {
            GlStateManager.func_179148_o(var8.yN());
            GlStateManager.func_179109_b(-var6, -var7, 0.0F);
            var4.setPosX(var6 + var8.yL());
            var4.setPosY(var7 + var8.yM());
            GlStateManager.func_179117_G();
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         } else {
            int var9 = this.ST.lh((var1x) -> {
               return var1x == null ? this.ST.yS() : var1x;
            });
            var8 = new FeatherSourceFile387(var4.getPosX() - var6, var4.getPosY() - var7, var9);
            this.SV = var8;
            this.ST.ud(var9);
            this.lh(var4, var1, var2, var3, var5);
            this.ST.lh(var5, var8);
            var8.ps(var4.getPosX());
            var4.setPosX(var6 + var8.yL());
            var4.setPosY(var7 + var8.yM());
            GlStateManager.func_179109_b(-var6, -var7, 0.0F);
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   private void lh(net.digitalingot.feather.mixin.client.FeatherSourceFile114 var1, String var2, int var3, boolean var4, int var5) {
      FeatherSourceFile819.lh(7, DefaultVertexFormats.field_181709_i);
      List var6 = null;
      String var7 = var2.toLowerCase(Locale.ENGLISH);
      boolean var8 = false;

      for(int var9 = 0; var9 < var2.length(); ++var9) {
         char var10 = var2.charAt(var9);
         int var11;
         int var12;
         if (var10 == 167 && var9 + 1 < var2.length()) {
            var11 = "0123456789abcdefklmnor".indexOf(var7.charAt(var9 + 1));
            if (var11 < 16) {
               var1.setRandomStyle(false);
               var1.setBoldStyle(false);
               var1.setStrikethroughStyle(false);
               var1.setUnderlineStyle(false);
               var1.setItalicStyle(false);
               if (var11 < 0) {
                  var11 = 15;
               }

               if (var4) {
                  var11 += 16;
               }

               var12 = var1.getColorCode()[var11];
               var3 = FeatherSourceFile821.oe((float)(var12 >> 16) / 255.0F, (float)(var12 >> 8 & 255) / 255.0F, (float)(var12 & 255) / 255.0F, var1.getAlpha());
            } else if (var11 == 16) {
               var8 = true;
               var1.setRandomStyle(true);
            } else if (var11 == 17) {
               var1.setBoldStyle(true);
            } else if (var11 == 18) {
               var1.setStrikethroughStyle(true);
               var6 = this.eg(var6);
            } else if (var11 == 19) {
               var1.setUnderlineStyle(true);
               var6 = this.eg(var6);
            } else if (var11 == 20) {
               var1.setItalicStyle(true);
            } else {
               var1.setRandomStyle(false);
               var1.setBoldStyle(false);
               var1.setStrikethroughStyle(false);
               var1.setUnderlineStyle(false);
               var1.setItalicStyle(false);
               var3 = FeatherSourceFile821.oe(var1.getRed(), var1.getBlue(), var1.getGreen(), var1.getAlpha());
            }

            ++var9;
         } else {
            Objects.requireNonNull(this);
            var11 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".indexOf(var10);
            if (var1.isRandomStyle() && var11 != -1) {
               var12 = minecraft.field_71466_p.func_78263_a(var10);

               char var13;
               do {
                  Random var10000 = var1.getFontRandom();
                  Objects.requireNonNull(this);
                  var11 = var10000.nextInt(256);
                  Objects.requireNonNull(this);
                  var13 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".charAt(var11);
               } while(var12 != minecraft.field_71466_p.func_78263_a(var13));

               var10 = var13;
            }

            float var19 = var11 != -1 && !var1.isUnicodeFlag() ? getOffsetBold() : 0.5F;
            boolean var20 = (var10 == 0 || var11 == -1 || var1.isUnicodeFlag()) && var4;
            if (var20) {
               var1.setPosX(var1.getPosX() - var19);
               var1.setPosY(var1.getPosY() - var19);
            }

            float var14 = this.lh(var10, var3, var1.isItalicStyle());
            if (var20) {
               var1.setPosX(var1.getPosX() + var19);
               var1.setPosY(var1.getPosY() + var19);
            }

            if (var1.isBoldStyle()) {
               var1.setPosX(var1.getPosX() + var19);
               if (var20) {
                  var1.setPosX(var1.getPosX() - var19);
                  var1.setPosY(var1.getPosY() - var19);
               }

               this.lh(var10, var3, var1.isItalicStyle());
               var1.setPosX(var1.getPosX() - var19);
               if (var20) {
                  var1.setPosX(var1.getPosX() + var19);
                  var1.setPosY(var1.getPosY() + var19);
               }

               ++var14;
            }

            int var15 = var6 == null ? 0 : var6.size() - 1;
            FeatherSourceFile379 var16 = null;
            if (var1.isStrikethroughStyle()) {
               if (var15 >= 0 && (var16 = (FeatherSourceFile379)var6.get(var15)).yV() == var1.getPosX()) {
                  var16.xm(var1.getPosX() + var14);
               } else {
                  var6.add(new FeatherSourceFile379(var1.getPosX(), var1.getPosY() + (float)(var1.getFontHeight() / 2), var1.getPosX() + var14, var3));
               }
            }

            if (var1.isUnderlineStyle()) {
               if (var15 >= 0 && (var16 != null ? var16 : (var16 = (FeatherSourceFile379)var6.get(var15))).yV() == var1.getPosX() - 1.0F) {
                  var16.xm(var1.getPosX() + var14);
               } else {
                  var6.add(new FeatherSourceFile379(var1.getPosX() - 1.0F, var1.getPosY() + (float)var1.getFontHeight(), var1.getPosX() + var14, var3));
               }
            }

            var1.setPosX(var1.getPosX() + (float)((int)var14));
         }
      }

      FeatherSourceFile819.rh();
      if (var6 != null && var6.size() > 0) {
         GlStateManager.func_179090_x();
         FeatherSourceFile819.lh(7, DefaultVertexFormats.field_181706_f);
         Iterator var17 = var6.iterator();

         while(var17.hasNext()) {
            FeatherSourceFile379 var18 = (FeatherSourceFile379)var17.next();
            FeatherSourceFile819.nc(var18.yV(), var18.yW(), var18.bM());
            FeatherSourceFile819.nc(var18.yX(), var18.yW(), var18.bM());
            FeatherSourceFile819.nc(var18.yX(), var18.yW() - 1.0F, var18.bM());
            FeatherSourceFile819.nc(var18.yV(), var18.yW() - 1.0F, var18.bM());
         }

         FeatherSourceFile819.rh();
         GlStateManager.func_179098_w();
      }

      if (var8 && var5 != -1) {
         if (this.ST.Ta.size() >= 100) {
            this.ST.Ta.clear();
         }

         this.ST.Ta.add(var5);
      }

   }

   private float lh(char var1, int var2, boolean var3) {
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var4 = this.yR();
      if (var1 != ' ' && var1 != 160) {
         Objects.requireNonNull(this);
         int var5 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".indexOf(var1);
         return var5 != -1 && !var4.isUnicodeFlag() ? this.lh(var5, var2, var3) : this.nc(var1, var2, var3);
      } else {
         return var4.isUnicodeFlag() ? 4.0F : (FeatherSourceFile721.nw() ? xl(var1) : qy(var1));
      }
   }

   protected float lh(int var1, int var2, boolean var3) {
      FeatherSourceFile824 var4 = this.SU.pg("default");
      float var5 = (float)(var1 % 16 * 8 * var4.rl()) / 128.0F + 0.01F;
      float var6 = (float)(var1 / 16 * 8 * var4.fv()) / 128.0F + 0.01F;
      float var7 = (float)var4.rl();
      float var8 = (float)var4.fv();
      float var9 = 7.99F * (float)var4.rl() / 128.0F;
      float var10 = 7.99F * (float)var4.fv() / 128.0F;
      float var11 = var3 ? 1.0F : 0.0F;
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var12 = this.yR();
      FeatherSourceFile819.lh(var12.getPosX() + var11, var12.getPosY(), var4.ja(var5 / var7), var4.qn(var6 / var8), var2);
      FeatherSourceFile819.lh(var12.getPosX() - var11, var12.getPosY() + 7.99F, var4.ja(var5 / var7), var4.qn((var6 + var10) / var8), var2);
      FeatherSourceFile819.lh(var12.getPosX() - var11 + 7.99F, var12.getPosY() + 7.99F, var4.ja((var5 + var9) / var7), var4.qn((var6 + var10) / var8), var2);
      FeatherSourceFile819.lh(var12.getPosX() + var11 + 7.99F, var12.getPosY(), var4.ja((var5 + var9) / var7), var4.qn(var6 / var8), var2);
      return xl(var1);
   }

   public static float xl(int var0) {
      FeatherSourceFile381 var1 = (FeatherSourceFile381)minecraft.field_71466_p;
      return FeatherSourceFile721.nw() ? var1.charWidthFloat()[var0] : (float)var1.charWidth()[var0];
   }

   public static float qy(char var0) {
      FeatherSourceFile381 var1 = (FeatherSourceFile381)minecraft.field_71466_p;
      return FeatherSourceFile721.nw() ? var1.invokeCharWidthFloat(var0) : (float)var1.invokeCharWidth(var0);
   }

   public static float getOffsetBold() {
      return ((FeatherSourceFile381)minecraft.field_71466_p).getOffsetBold();
   }

   protected float nc(char var1, int var2, boolean var3) {
      net.digitalingot.feather.mixin.client.FeatherSourceFile114 var4 = this.yR();
      if (var4.getGlyphWidth()[var1] == 0) {
         return 0.0F;
      } else {
         int var5 = var1 / 256;
         int var6 = var4.getGlyphWidth()[var1] >>> 4;
         int var7 = var4.getGlyphWidth()[var1] & 15;
         float var8 = (float)(var1 % 16 * 16) + (float)var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         FeatherSourceFile824 var10 = this.SU.pg(String.valueOf(var5));
         int var11 = var3 ? 1 : 0;
         float var12 = (float)(var7 + 1) - (float)var6;
         FeatherSourceFile819.lh(var4.getPosX() + (float)var11, var4.getPosY(), var10.ja(var8 / 256.0F), var10.qn(var9 / 256.0F), var2);
         FeatherSourceFile819.lh(var4.getPosX() - (float)var11, var4.getPosY() + 7.99F, var10.ja(var8 / 256.0F), var10.qn((var9 + 15.98F) / 256.0F), var2);
         FeatherSourceFile819.lh(var4.getPosX() + var12 / 2.0F - (float)var11, var4.getPosY() + 7.99F, var10.ja((var8 + var12) / 256.0F), var10.qn((var9 + 15.98F) / 256.0F), var2);
         FeatherSourceFile819.lh(var4.getPosX() + var12 / 2.0F + (float)var11, var4.getPosY(), var10.ja((var8 + var12) / 256.0F), var10.qn(var9 / 256.0F), var2);
         return ((float)(var7 + 1) - (float)var6) / 2.0F + 1.0F;
      }
   }

   public int qd(String var1) {
      return (Integer)this.ST.yU().get(var1);
   }

   private List eg(List var1) {
      return (List)(var1 == null ? Lists.newArrayList() : var1);
   }

   private net.digitalingot.feather.mixin.client.FeatherSourceFile114 yR() {
      return (net.digitalingot.feather.mixin.client.FeatherSourceFile114)minecraft.field_71466_p;
   }
}
