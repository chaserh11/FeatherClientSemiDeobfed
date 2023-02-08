package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import java.awt.Color;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.GameSettings.Options;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.WAYPOINTS,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.waypoints",
   jl = "https://assets.feathercdn.net/game/mods/waypoints.svg",
   od = "feather.moduledescriptions.waypoints",
   wr = {}
)
)
public class FeatherSourceFile358 extends FeatherSourceFile495 {
   @NotNull
   private final @NotNull Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile55 kQ;
   @NotNull
   private final @NotNull FeatherSourceFile663 rC;
   @NotNull
   private final @NotNull FeatherSourceFile576 MH;
   @NotNull
   private final @NotNull FeatherSourceFile428 lI;
   private final FeatherSourceFile143 lk;
   @NotNull
   private final @NotNull File MI;
   @NotNull
   public final @NotNull Set MJ = new LinkedHashSet();
   @NotNull
   private final @NotNull List MK = new ArrayList();

   @Inject
   FeatherSourceFile358(@NotNull @NotNull Minecraft var1, @NotNull @NotNull FeatherSourceFile55 var2, @NotNull @NotNull FeatherSourceFile663 var3, @NotNull @NotNull FeatherSourceFile576 var4, @NotNull @NotNull FeatherSourceFile428 var5, @FeatherSourceFile$xj15 Path var6, FeatherSourceFile143 var7) {
      this.minecraft = var1;
      this.kQ = var2;
      this.rC = var3;
      this.MH = var4;
      this.lI = var5;
      this.MI = var6.resolve("waypoints.json").toFile();
      this.lk = var7;
   }

   public void ex() {
      this.rC.lh(new FeatherSourceFile59(this));
      this.rC.lh(new FeatherSourceFile155(this));
      FeatherSourceFile792.je.oe(() -> {
         if (this.uj()) {
            RenderManager var1 = this.minecraft.func_175598_ae();
            Entity var2 = var1.field_78734_h;
            if (var2 != null) {
               double var3 = (double)this.minecraft.field_71474_y.func_74296_a(Options.RENDER_DISTANCE);
               var3 *= 12.0;
               Iterator var5 = this.gW().iterator();

               while(true) {
                  FeatherSourceFile201 var6;
                  do {
                     if (!var5.hasNext()) {
                        return;
                     }

                     var6 = (FeatherSourceFile201)var5.next();
                  } while(!var6.cy());

                  double var7 = var1.field_78730_l;
                  double var9 = var1.field_78731_m;
                  double var11 = var1.field_78728_n;
                  double var13 = (double)var6.ei().ax() - var7;
                  double var15 = (double)var6.ei().ob() - var9;
                  double var17 = (double)var6.ei().gR() - var11;
                  double var19 = var6.ei().ux(var2);
                  double var21 = var19;
                  if (var19 > var3) {
                     var13 = var13 / var19 * var3;
                     var15 = var15 / var19 * var3;
                     var17 = var17 / var19 * var3;
                     var19 = var3;
                  }

                  float var23 = ((float)var19 * 0.1F + 1.0F) * 0.0266F;
                  GlStateManager.func_179094_E();
                  GlStateManager.func_179137_b(var13, -var9, var17);
                  GlStateManager.func_179114_b(-90.0F, 1.0F, 0.0F, 0.0F);
                  FeatherSourceFile843.hO();
                  FeatherSourceFile843.wq();
                  FeatherSourceFile843.ou(770, 771, 1, 0);
                  FeatherSourceFile843.hE();
                  FeatherSourceFile843.ck(false);
                  byte var24 = 20;
                  float var25 = 0.75F;
                  float var26 = FeatherSourceFile363.mq((float)(var9 + 25.0), 100.0F, 256.0F);
                  float var27 = 6.2831855F / (float)var24;
                  Color var28 = var6.qm().dm();
                  if (var6.qm().on()) {
                     var28 = new Color(FeatherSourceFile841.vK().vM());
                  }

                  float var29 = (float)((double)((float)var28.getRed() / 255.0F) + 0.5);
                  float var30 = (float)((double)((float)var28.getGreen() / 255.0F) + 0.5);
                  float var31 = (float)((double)((float)var28.getBlue() / 255.0F) + 0.5);
                  float var32 = (float)((var19 - 6.0) / 24.0 * ((double)((float)var28.getAlpha() / 255.0F) + 0.5));
                  FeatherSourceFile843.nc(var29, var30, var31, var32);
                  FeatherSourceFile443 var33 = FeatherSourceFile443.RM;
                  var33.nc(5, DefaultVertexFormats.field_181705_e);

                  for(int var34 = 0; var34 <= var24; ++var34) {
                     float var35;
                     float var36;
                     if (var34 == var24) {
                        var35 = (float)Math.sin(0.0);
                        var36 = (float)Math.cos(0.0);
                     } else {
                        var35 = (float)Math.sin((double)((float)var34 * var27));
                        var36 = (float)Math.cos((double)((float)var34 * var27));
                     }

                     var33.as(var35 * var25, var36 * var25, 0.0F).xZ();
                     var33.as(0.0F, 0.0F, var26).xZ();
                  }

                  var33.lx();
                  GlStateManager.func_179114_b(180.0F, 1.0F, 0.0F, 0.0F);
                  GlStateManager.func_179109_b(0.0F, 0.0F, (float)(-var6.ei().ob()) - 0.001F);
                  this.lh(0.85F, -0.07F, 26);
                  FeatherSourceFile843.jz();
                  FeatherSourceFile843.hF();
                  FeatherSourceFile843.hP();
                  GlStateManager.func_179121_F();
                  FeatherSourceFile843.ck(false);
                  FeatherSourceFile843.hJ();
                  String var39 = var6.getName() + " [" + (int)var21 + "m]";
                  GlStateManager.func_179094_E();
                  GlStateManager.func_179137_b(var13, var15 + 2.0, var17);
                  GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                  GlStateManager.func_179114_b(-Minecraft.func_71410_x().func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
                  GlStateManager.func_179114_b(Minecraft.func_71410_x().func_175598_ae().field_78732_j, 1.0F, 0.0F, 0.0F);
                  GlStateManager.func_179152_a(-var23, -var23, var23);
                  GlStateManager.func_179132_a(false);
                  GlStateManager.func_179147_l();
                  GlStateManager.func_179120_a(770, 771, 1, 0);
                  Tessellator var40 = Tessellator.func_178181_a();
                  WorldRenderer var41 = var40.func_178180_c();
                  byte var37 = 0;
                  int var38 = FeatherSourceFile843.fo(var39) / 2;
                  GlStateManager.func_179090_x();
                  var41.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                  var41.func_181662_b((double)(-var38 - 1), (double)(-1 + var37), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
                  var41.func_181662_b((double)(-var38 - 1), (double)(8 + var37), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
                  var41.func_181662_b((double)(var38 + 1), (double)(8 + var37), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
                  var41.func_181662_b((double)(var38 + 1), (double)(-1 + var37), 0.0).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
                  var40.func_78381_a();
                  GlStateManager.func_179098_w();
                  FeatherSourceFile841.vK().lh(var39, (float)(-var38), (float)var37, -1, false);
                  GlStateManager.func_179084_k();
                  GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
                  GlStateManager.func_179121_F();
                  FeatherSourceFile843.ck(true);
                  FeatherSourceFile843.hI();
                  FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
               }
            }
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh122)this.fS).MN;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               this.minecraft.func_147108_a(this.lk);
               this.MH.nc(true, this.MJ);
            }
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh122)this.fS).MO;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71439_g != null) {
               this.minecraft.func_147108_a(this.lk);
               this.MH.nc(false, this.MJ);
            }
         }
      });
      FeatherSourceFile461.ws.oe((var1) -> {
         if (this.uj()) {
            if (var1.equals(FeatherSourceFile243.WAYPOINTS.getSlug())) {
               this.minecraft.func_147108_a(this.lk);
               this.MH.nc(false, this.MJ);
            }

         }
      });
      FeatherSourceFile555.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (var1 == this.minecraft.field_71439_g) {
               this.gS();
               this.MH.oe(this.MK);
            }

         }
      });
   }

   public void ml() {
      if (this.MI.exists()) {
         Set var1 = (Set)FeatherSourceFile815.ux(this.MI).lh((new TypeToken() {
         }).getType());
         if (var1 != null) {
            this.MJ.addAll(var1);
         }
      }

      EntityPlayerSP var2 = this.minecraft.field_71439_g;
      if (var2 != null && var2.field_70170_p != null) {
         this.gS();
         this.MH.oe(this.MK);
      }

   }

   public void ze() {
      this.MJ.clear();
      this.MK.clear();
   }

   public void gS() {
      this.MK.clear();
      Iterator var1 = this.MJ.iterator();

      while(var1.hasNext()) {
         FeatherSourceFile201 var2 = (FeatherSourceFile201)var1.next();
         if (var2.lh(this)) {
            this.MK.add(var2);
         }
      }

   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile201 var1) {
      this.MJ.remove(var1);
      this.MJ.add(var1);
      this.gS();
      this.rp();
   }

   public @NotNull void nc(@NotNull @NotNull FeatherSourceFile201 var1) {
      this.MJ.remove(var1);
      this.gS();
      this.rp();
   }

   private void rp() {
      this.MI.getParentFile().mkdirs();
      FeatherSourceFile815.ux(this.MI).wU().wz(this.MJ);
   }

   @Nullable
   public @Nullable String gT() {
      WorldClient var1 = this.minecraft.field_71441_e;
      return var1 == null ? null : var1.field_73011_w.func_80007_l();
   }

   @Nullable
   public @Nullable String gU() {
      if (this.minecraft.func_71356_B()) {
         return null;
      } else {
         ServerData var1 = this.minecraft.func_147104_D();
         if (var1 == null) {
            return null;
         } else {
            return this.minecraft.func_181540_al() ? var1.field_78847_a : var1.field_78845_b;
         }
      }
   }

   @NotNull
   public @NotNull Set gV() {
      return this.MJ;
   }

   @NotNull
   public @NotNull Stream gW() {
      List var1 = (List)this.lI.xL().map(FeatherSourceFile429::xH).orElse(Collections.emptyList());
      return Stream.concat(this.MK.stream(), var1.stream());
   }

   private void lh(float var1, float var2, int var3) {
      float var4 = (float)(6.283185307179586 / (double)var3);
      FeatherSourceFile443 var5 = FeatherSourceFile443.RM;
      var5.nc(5, DefaultVertexFormats.field_181705_e);

      for(int var6 = 0; var6 <= var3; ++var6) {
         float var7;
         float var8;
         if (var6 == var3) {
            var7 = (float)Math.cos(0.0);
            var8 = (float)Math.sin(0.0);
         } else {
            var7 = (float)Math.cos((double)((float)var6 * var4));
            var8 = (float)Math.sin((double)((float)var6 * var4));
         }

         var5.as(var7 * var1, var8 * var1, 0.0F).xZ();
         var5.as(var7 * (var1 + var2), var8 * (var1 + var2), 0.0F).xZ();
      }

      var5.lx();
   }
}
