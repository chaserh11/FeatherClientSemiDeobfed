package net.digitalingot.feather;

import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SATURATION,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.saturation",
   jl = "https://assets.feathercdn.net/game/mods/saturation.svg",
   od = "feather.moduledescription.saturation",
   wr = {}
)
)
public class FeatherSourceFile579 extends FeatherSourceFile495 {
   private static final int Iu = 3;
   private static final int Iv = -3;
   private static final int Iw = 3;
   private static final int pL = FeatherSourceFile766.fh(16).ol();
   private static final int Ix = FeatherSourceFile766.fh(10016).ol();
   private static final Potion Iy = Potion.func_180142_b("hunger");
   public static final ResourceLocation Iz = new ResourceLocation("feather:textures/saturation.png");
   private final Minecraft minecraft;
   private float IA = 0.0F;

   @Inject
   FeatherSourceFile579(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile380.ws.oe((var1, var2) -> {
         if (this.uj()) {
            if (var1 != null) {
               FeatherSourceFile$lh$lh1 var3 = ((FeatherSourceFile$lh131)this.fS).IC;
               if (var3 != FeatherSourceFile$lh$lh1.NEVER && (var3 != FeatherSourceFile$lh$lh1.SHIFT_ONLY || FeatherSourceFile704.lh(pL) || FeatherSourceFile704.lh(Ix))) {
                  if (var1.func_77973_b() instanceof ItemFood) {
                     var2.add("           ");
                     var2.add("           ");
                  }
               }
            }
         }
      });
      FeatherSourceFile598.bf.oe((var1, var2, var3, var4, var5, var6) -> {
         if (this.uj()) {
            if (var2 != null) {
               FeatherSourceFile$lh$lh1 var7 = ((FeatherSourceFile$lh131)this.fS).IC;
               if (var7 != FeatherSourceFile$lh$lh1.NEVER && var7 != FeatherSourceFile$lh$lh1.SHIFT_ONLY || FeatherSourceFile60.ck(FeatherSourceFile766.fh(16).ol()) || FeatherSourceFile60.ck(FeatherSourceFile766.fh(10016).ol())) {
                  GuiScreen var8 = this.minecraft.field_71462_r;
                  if (var8 != null) {
                     if (var2.func_77973_b() instanceof ItemFood) {
                        int var9 = var5 - 6;
                        int var10 = var6 - 26;
                        FeatherSourceFile$lh51 var11 = FeatherSourceFile691.mq(var2);
                        FeatherSourceFile$lh51 var12 = FeatherSourceFile691.mr(var2);
                        if (!var11.equals(var12) || var11.Is != 0) {
                           int var13 = Math.max(var11.Is, var12.Is);
                           float var14 = Math.max(var11.dU(), var12.dU());
                           int var15 = (int)Math.ceil((double)((float)Math.abs(var13) / 2.0F));
                           boolean var16 = var15 > 10;
                           String var17 = var16 ? (var13 < 0 ? -1 : 1) * var15 + "x " : null;
                           if (var16) {
                              var15 = 1;
                           }

                           int var18 = (int)Math.max(1.0, Math.ceil((double)(Math.abs(var14) / 2.0F)));
                           boolean var19 = var18 > 10;
                           String var20 = var19 ? (var14 < 0.0F ? -1 : 1) * var18 + "x " : null;
                           if (var19) {
                              var18 = 1;
                           }

                           int var21 = var4 + var10 + 1 + 3;
                           int var22 = var3 + var9 + 1 + 3;
                           int var23 = FeatherSourceFile851.iM();
                           boolean var24 = var21 + 20 < var23 - 3;
                           int var25 = var22 - 3;
                           int var26 = var24 ? var21 : var4 - 20 + -3;
                           int var27 = var26 + 19;
                           FeatherSourceFile843.hH();
                           FeatherSourceFile843.hJ();
                           int var28 = var25 - 2;
                           int var30 = var27 - 18;
                           FeatherSourceFile843.lh(0, Gui.field_110324_m);

                           for(int var31 = 0; var31 < var15 * 2; var31 += 2) {
                              var28 -= 9;
                              if (var12.Is < 0) {
                                 FeatherSourceFile323.lh(var28, var30, 34, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              } else if (var12.Is > var11.Is && var11.Is <= var31) {
                                 FeatherSourceFile323.lh(var28, var30, 133, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              } else if (var12.Is <= var31 + 1 && var11.Is != var12.Is) {
                                 if (var12.Is == var31 + 1) {
                                    FeatherSourceFile323.lh(var28, var30, 124, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                                 } else {
                                    FeatherSourceFile323.lh(var28, var30, 34, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                                 }
                              } else {
                                 FeatherSourceFile323.lh(var28, var30, 16, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              }

                              FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 0.25F);
                              FeatherSourceFile323.lh(var28, var30, var11.Is - 1 == var31 ? 115 : 106, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
                              if (var12.Is > var31) {
                                 FeatherSourceFile323.lh(var28, var30, var12.Is - 1 == var31 ? 61 : 52, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              }
                           }

                           if (var17 != null) {
                              FeatherSourceFile843.hS();
                              FeatherSourceFile843.nc(0.75, 0.75, 0.75);
                              FeatherSourceFile841.vL().func_175065_a(var17, (float)var28 * 4.0F / 3.0F - (float)this.minecraft.field_71466_p.func_78256_a(var17) + 2.0F, (float)var30 * 4.0F / 3.0F + 2.0F, -2236963, true);
                              FeatherSourceFile843.hT();
                           }

                           var30 += 10;
                           var28 = var28;
                           float var36 = var12.dU();
                           float var32 = Math.abs(var36);
                           FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
                           FeatherSourceFile843.lh(0, Iz);

                           for(int var33 = 0; var33 < var18 * 2; var33 += 2) {
                              float var34 = (var32 - (float)var33) / 2.0F;
                              var28 -= 6;
                              boolean var35 = var32 <= (float)var33;
                              if (var35) {
                                 FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 0.5F);
                              }

                              FeatherSourceFile323.lh(var28, var30, var34 >= 1.0F ? 21 : ((double)var34 > 0.5 ? 14 : ((double)var34 > 0.25 ? 7 : (var34 > 0.0F ? 0 : 28))), ((FeatherSourceFile$lh131)this.fS).IL ? 34 : 27, 7, 7, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
                              if (var35) {
                                 FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
                              }
                           }

                           if (var20 != null) {
                              FeatherSourceFile843.hS();
                              FeatherSourceFile843.nc(0.75, 0.75, 0.75);
                              FeatherSourceFile841.vL().func_175065_a(var20, (float)var28 * 4.0F / 3.0F - (float)this.minecraft.field_71466_p.func_78256_a(var20) + 2.0F, (float)var30 * 4.0F / 3.0F + 1.0F, -2236963, true);
                              FeatherSourceFile843.hT();
                           }

                           FeatherSourceFile843.jz();
                           FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
                           RenderHelper.func_74518_a();
                           FeatherSourceFile843.hH();
                           FeatherSourceFile843.hJ();
                        }
                     }
                  }
               }
            }
         }
      });
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (var1 == FeatherSourceFile$xj20.START) {
               int var2 = 15000 / ((FeatherSourceFile$lh131)this.fS).IB;
               float var3 = (float)(System.currentTimeMillis() % (long)var2) * 1.0F / (float)var2;
               this.IA = var3 < 0.66F ? var3 * 3.0F : 3.0F - var3 * 3.0F;
            }
         }
      });
      FeatherSourceFile364.vi.oe((var1, var2) -> {
         if (!this.uj()) {
            return FeatherSourceFile133.PASS;
         } else if (((FeatherSourceFile$lh131)this.fS).IF && var2 == FeatherSourceFile$xj19.FOOD) {
            FoodStats var3 = this.minecraft.field_71439_g.func_71024_bL();
            int var4 = FeatherSourceFile851.iL() / 2 + 91;
            int var5 = FeatherSourceFile851.iM() - 39;
            this.lh(((net.digitalingot.feather.mixin.core.FeatherSourceFile12)var3).getFoodExhaustionLevel(), var4, var5);
            return FeatherSourceFile133.PASS;
         } else {
            return FeatherSourceFile133.PASS;
         }
      });
      FeatherSourceFile364.ya.oe((var1, var2) -> {
         if (this.uj()) {
            if (var2 == FeatherSourceFile$xj19.FOOD) {
               EntityPlayerSP var3 = this.minecraft.field_71439_g;
               if (!var3.field_71075_bZ.field_75098_d) {
                  ItemStack var4 = var3.func_70694_bm();
                  FoodStats var5 = var3.func_71024_bL();
                  int var6 = FeatherSourceFile851.iL() / 2 + 91;
                  int var7 = FeatherSourceFile851.iM() - 39;
                  if (((FeatherSourceFile$lh131)this.fS).IO) {
                     this.lh(0.0F, var5.func_75115_e(), var6, var7, 1.0F, ((FeatherSourceFile$lh131)this.fS).IK);
                  }

                  if (var4 != null && var4.func_77973_b() instanceof ItemFood) {
                     FeatherSourceFile$lh51 var8 = FeatherSourceFile691.mr(var4);
                     if (((FeatherSourceFile$lh131)this.fS).IH) {
                        this.nc(var8.Is, var5.func_75116_a(), var6, var7, this.IA);
                     }

                     if (((FeatherSourceFile$lh131)this.fS).IN) {
                        int var9 = var5.func_75116_a() + var8.Is;
                        float var10 = var5.func_75115_e() + var8.dU();
                        float var11 = var10 > (float)var9 ? (float)var9 - var5.func_75115_e() : var8.dU();
                        this.lh(var11, var5.func_75115_e(), var6, var7, this.IA, ((FeatherSourceFile$lh131)this.fS).IJ);
                     }

                  } else {
                     this.IA = 0.0F;
                  }
               }
            }
         }
      });
   }

   public void lh(float var1, int var2, int var3) {
      FeatherSourceFile843.hF();
      FeatherSourceFile843.nc((float)((double)((FeatherSourceFile$lh131)this.fS).IE.getRed() / 255.0), (float)((double)((FeatherSourceFile$lh131)this.fS).IE.getGreen() / 255.0), (float)((double)((FeatherSourceFile$lh131)this.fS).IE.getBlue() / 255.0), (float)((double)((FeatherSourceFile$lh131)this.fS).IE.getAlpha() / 255.0));
      FeatherSourceFile843.lh(0, Iz);
      float var4 = 4.0F;
      float var5 = var1 / var4;
      int var6 = (int)(var5 * 81.0F);
      byte var7 = 9;
      GuiIngame var8 = this.minecraft.field_71456_v;
      FeatherSourceFile323.lh(var2 - var6, var3, 81 - var6, 18, var6, var7, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var8).getBlitOffset()));
      FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      FeatherSourceFile843.lh(0, Gui.field_110324_m);
   }

   public void nc(int var1, int var2, int var3, int var4, float var5) {
      if (var1 != 0) {
         int var6 = var2 / 2;
         int var7 = (int)Math.ceil((double)((float)Math.min(20, var2 + var1) / 2.0F));
         int var8 = var7 - var6;
         FeatherSourceFile843.lh(0, Gui.field_110324_m);
         this.sm(var5);

         for(int var9 = var6; var9 < var6 + var8; ++var9) {
            int var10 = var9 * 2 + 1;
            float var11 = (float)(var3 - var9 * 8 - 9);
            int var12 = 16;
            byte var13 = 13;
            if (this.minecraft.field_71439_g.func_70644_a(Iy)) {
               var12 += 36;
               var13 = 13;
            }

            GuiIngame var14 = this.minecraft.field_71456_v;
            FeatherSourceFile323.lh((int)var11, var4, 16 + var13 * 9, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
            int var15 = var12 + (var10 < var2 + var1 ? 36 : 45);
            FeatherSourceFile323.lh((int)var11, var4, var15, 27, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
         }

         this.ly(var5);
      }
   }

   public void lh(float var1, float var2, int var3, int var4, float var5, boolean var6) {
      if (!(var2 + var1 < 0.0F)) {
         int var7 = var1 != 0.0F ? Math.max(0, (int)var2 / 2) : 0;
         int var8 = (int)Math.ceil((double)(Math.min(20.0F, var2 + var1) / 2.0F));
         int var9 = var8 - var7;
         FeatherSourceFile843.lh(0, Iz);
         this.sm(var5);
         int var10 = var6 ? 9 : 0;

         for(int var11 = var7; var11 < var7 + var9; ++var11) {
            int var12 = var3 - var11 * 8 - 9;
            float var13 = (var2 + var1) / 2.0F - (float)var11;
            GuiIngame var14 = this.minecraft.field_71456_v;
            if (var13 >= 1.0F) {
               FeatherSourceFile323.lh(var12, var4, 27, var10, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
            } else if ((double)var13 > 0.5) {
               FeatherSourceFile323.lh(var12, var4, 18, var10, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
            } else if ((double)var13 > 0.25) {
               FeatherSourceFile323.lh(var12, var4, 9, var10, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
            } else if (var13 > 0.0F) {
               FeatherSourceFile323.lh(var12, var4, 0, var10, 9, 9, (float)((int)((net.digitalingot.feather.mixin.core.FeatherSourceFile8)var14).getBlitOffset()));
            }
         }

         this.ly(var5);
         FeatherSourceFile843.lh(0, Gui.field_110324_m);
      }
   }

   public void sm(float var1) {
      FeatherSourceFile843.wq();
      if (var1 != 1.0F) {
         FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, var1);
         FeatherSourceFile843.ly(770, 771);
      }
   }

   public void ly(float var1) {
      FeatherSourceFile843.jz();
      if (var1 != 1.0F) {
         FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public ResourceLocation dV() {
      return Iz;
   }
}
