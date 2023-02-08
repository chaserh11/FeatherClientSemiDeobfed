package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.BLOCK_OVERLAY,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.blockoverlay",
   jl = "https://assets.feathercdn.net/game/mods/blockoverlay.svg",
   od = "feather.moduledescription.blockoverlay",
   wr = {}
)
)
public class FeatherSourceFile477 extends FeatherSourceFile495 {
   private final Minecraft minecraft;

   @Inject
   FeatherSourceFile477(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile299.oq.oe(() -> {
         if (!this.uj()) {
            return FeatherSourceFile133.PASS;
         } else if (!this.ro()) {
            return FeatherSourceFile133.FAIL;
         } else if (((FeatherSourceFile$lh46)this.fS).kI == FeatherSourceFile$lh$lh9.NONE) {
            return FeatherSourceFile133.FAIL;
         } else {
            MovingObjectPosition var1 = this.minecraft.field_71476_x;
            EnumFacing var2 = null;
            BlockPos var3 = var1.func_178782_a();
            if (var3 == null) {
               return FeatherSourceFile133.FAIL;
            } else {
               if (((FeatherSourceFile$lh46)this.fS).kJ) {
                  var2 = var1.field_178784_b;
               }

               WorldClient var4 = this.minecraft.field_71441_e;
               IBlockState var5 = var4.func_180495_p(var3);
               Block var6 = var5.func_177230_c();
               if (var6 != null && var6 != Blocks.field_150350_a && var6 != Blocks.field_150355_j && var6 != Blocks.field_150353_l) {
                  if (var6 != Blocks.field_150358_i && var6 != Blocks.field_150356_k) {
                     RenderManager var7 = this.minecraft.func_175598_ae();
                     double var8 = var7.field_78730_l;
                     double var10 = var7.field_78731_m;
                     double var12 = var7.field_78728_n;
                     FeatherSourceFile843.wq();
                     FeatherSourceFile843.ou(770, 771, 1, 0);
                     FeatherSourceFile843.hO();
                     FeatherSourceFile843.ck(false);
                     var6.func_180654_a(var4, var3);
                     AxisAlignedBB var14 = var6.func_180646_a(var4, var3);
                     var14 = var14.func_72321_a(-0.002, -0.002, -0.002).func_72321_a(0.002, 0.002, 0.002).func_72317_d(-var8, -var10, -var12);
                     Color var16;
                     float var17;
                     float var18;
                     float var19;
                     float var20;
                     if (((FeatherSourceFile$lh46)this.fS).kI == FeatherSourceFile$lh$lh9.FULL) {
                        Color var15 = ((FeatherSourceFile$lh46)this.fS).kK.dm();
                        var16 = ((FeatherSourceFile$lh46)this.fS).kK.on() ? new Color(FeatherSourceFile841.vK().vM()) : var15;
                        var17 = (float)var16.getRed() / 255.0F;
                        var18 = (float)var16.getGreen() / 255.0F;
                        var19 = (float)var16.getBlue() / 255.0F;
                        var20 = (float)var16.getAlpha() / 255.0F;
                        lh(var14, var2, var17, var18, var19, var20);
                     }

                     if (((FeatherSourceFile$lh46)this.fS).kI == FeatherSourceFile$lh$lh9.FULL && ((FeatherSourceFile$lh46)this.fS).kP || ((FeatherSourceFile$lh46)this.fS).kI == FeatherSourceFile$lh$lh9.OUTLINE) {
                        float var21 = (float)((FeatherSourceFile$lh46)this.fS).kN / 20.0F;
                        if (var21 != 1.0F) {
                           FeatherSourceFile843.gr(var21);
                        }

                        var16 = ((FeatherSourceFile$lh46)this.fS).kO.on() ? new Color(FeatherSourceFile841.vK().vM()) : ((FeatherSourceFile$lh46)this.fS).kO.dm();
                        var17 = (float)var16.getRed() / 255.0F;
                        var18 = (float)var16.getGreen() / 255.0F;
                        var19 = (float)var16.getBlue() / 255.0F;
                        var20 = (float)((FeatherSourceFile$lh46)this.fS).kO.dm().getAlpha() / 255.0F;
                        FeatherSourceFile843.nc(var17, var18, var19, var20);
                        RenderGlobal.func_181561_a(var14);
                        if (var21 != 1.0F) {
                           FeatherSourceFile843.gr(1.0F);
                        }
                     }

                     FeatherSourceFile843.ck(true);
                     FeatherSourceFile843.hP();
                     FeatherSourceFile843.jz();
                     return FeatherSourceFile133.FAIL;
                  } else {
                     return FeatherSourceFile133.FAIL;
                  }
               } else {
                  return FeatherSourceFile133.FAIL;
               }
            }
         }
      });
   }

   private static void lh(AxisAlignedBB var0, EnumFacing var1, float var2, float var3, float var4, float var5) {
      FeatherSourceFile443 var6 = FeatherSourceFile443.RM;
      var6.nc(5, DefaultVertexFormats.field_181706_f);
      lh(var6, var1, (float)var0.field_72340_a, (float)var0.field_72338_b, (float)var0.field_72339_c, (float)var0.field_72336_d, (float)var0.field_72337_e, (float)var0.field_72334_f, var2, var3, var4, var5);
      var6.lx();
   }

   private static void lh(FeatherSourceFile443 var0, EnumFacing var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11) {
      if (var1 == null || var1 == EnumFacing.WEST) {
         var0.as(var2, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var6, var7).qy(var8, var9, var10, var11).xZ();
      }

      if (var1 == EnumFacing.EAST) {
         var0.as(var5, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var4).qy(var8, var9, var10, var11).xZ();
      }

      if (var1 == null || var1 == EnumFacing.SOUTH) {
         var0.as(var2, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var4).qy(var8, var9, var10, var11).xZ();
      }

      if (var1 == null || var1 == EnumFacing.NORTH) {
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var4).qy(var8, var9, var10, var11).xZ();
      }

      if (var1 == null || var1 == EnumFacing.DOWN) {
         var0.as(var2, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var3, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var6, var4).qy(var8, var9, var10, var11).xZ();
      }

      if (var1 == null || var1 == EnumFacing.UP) {
         var0.as(var2, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var2, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var4).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
         var0.as(var5, var6, var7).qy(var8, var9, var10, var11).xZ();
      }

   }

   private boolean ro() {
      if (!((FeatherSourceFile$lh46)this.fS).kL) {
         return true;
      } else {
         Entity var1 = this.minecraft.func_175606_aa();
         boolean var2 = var1 instanceof EntityPlayer && !this.minecraft.field_71474_y.field_74319_N;
         if (var2 && !((EntityPlayer)var1).field_71075_bZ.field_75099_e) {
            MovingObjectPosition var3 = this.minecraft.field_71476_x;
            if (var3 != null && var3.field_72313_a == MovingObjectType.BLOCK) {
               BlockPos var4 = var3.func_178782_a();
               WorldClient var5 = this.minecraft.field_71441_e;
               if (var5 == null) {
                  return false;
               }

               IBlockState var6 = var5.func_180495_p(var4);
               if (this.minecraft.field_71442_b.func_78747_a()) {
                  var2 = var6.func_177230_c().hasTileEntity(var6) && var5.func_175625_s(var4) instanceof IInventory;
               }
            }
         }

         return var2;
      }
   }
}
