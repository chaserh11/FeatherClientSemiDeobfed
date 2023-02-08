package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import org.lwjgl.opengl.GL11;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.CROSSHAIR,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.crosshair",
   jl = "https://assets.feathercdn.net/game/mods/crosshair.svg",
   od = "feather.moduledescription.customcrosshair",
   wr = {FeatherSourceFile$lh3.PVP}
)
)
public class FeatherSourceFile682 extends FeatherSourceFile495 implements FeatherSourceFile685 {
   private final Minecraft minecraft;
   private FeatherSourceFile117 xN = null;

   @Inject
   FeatherSourceFile682(Minecraft var1) {
      this.minecraft = var1;
   }

   public void ex() {
      FeatherSourceFile364.vi.oe((var1, var2) -> {
         if (this.uj() && var2 == FeatherSourceFile$xj19.CROSSHAIRS) {
            if (!this.Z()) {
               return FeatherSourceFile133.FAIL;
            } else {
               if (((FeatherSourceFile$lh110)this.fS).yA) {
                  int var3 = this.minecraft.field_71474_y.field_74320_O;
                  if (var3 != 0) {
                     return FeatherSourceFile133.PASS;
                  }
               }

               float var12 = (float)FeatherSourceFile851.iN();
               int var4 = FeatherSourceFile851.iJ() / 2;
               int var5 = FeatherSourceFile851.iK() / 2;
               GL11.glPushMatrix();
               GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
               Color var6 = ((FeatherSourceFile$lh110)this.fS).fZ.dm();
               int var7 = ((FeatherSourceFile$lh110)this.fS).xR;
               if (((FeatherSourceFile$lh110)this.fS).fZ.on()) {
                  var6 = new Color(FeatherSourceFile841.vK().vM());
               }

               EntityPlayerSP var8 = this.minecraft.field_71439_g;
               if (!var8.func_175149_v()) {
                  ItemStack var9 = var8.func_70694_bm();
                  if (var9 != null) {
                     int var10 = var8.func_71052_bv();
                     if (var9.func_77973_b() == Items.field_151031_f) {
                        float var11 = (float)(var9.func_77973_b().func_77626_a(var9) - var10) / 20.0F;
                        if (var10 == 0 || var11 > 1.0F) {
                           var11 = 1.0F;
                        }

                        var7 = ((FeatherSourceFile$lh110)this.fS).xR + (int)((1.0F - var11) * (float)(((FeatherSourceFile$lh110)this.fS).xR + 5) * 2.0F);
                     }
                  }
               }

               this.aA().lh((FeatherSourceFile$lh110)this.fS, var4, var5, var7, var6);
               if (((FeatherSourceFile$lh110)this.fS).xU && ((FeatherSourceFile$lh110)this.fS).xQ != FeatherSourceFile$lh$lh.DEFAULT) {
                  this.hv(var4, var5);
               }

               FeatherSourceFile843.jz();
               FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glPopMatrix();
               return FeatherSourceFile133.FAIL;
            }
         } else {
            return FeatherSourceFile133.PASS;
         }
      });
   }

   public void sy() {
      float var1 = (float)FeatherSourceFile851.iN();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / var1, 1.0F / var1, 1.0F / var1);
      Color var2 = ((FeatherSourceFile$lh110)this.fS).fZ.dm();
      int var3 = ((FeatherSourceFile$lh110)this.fS).xR;
      if (((FeatherSourceFile$lh110)this.fS).fZ.on()) {
         var2 = new Color(FeatherSourceFile841.vK().vM());
      }

      EntityPlayerSP var4 = this.minecraft.field_71439_g;
      if (var4 != null && !var4.func_175149_v()) {
         ItemStack var5 = var4.func_70694_bm();
         if (var5 != null) {
            int var6 = var4.func_71052_bv();
            if (var5.func_77973_b() == Items.field_151031_f) {
               float var7 = (float)(var5.func_77973_b().func_77626_a(var5) - var6) / 20.0F;
               if (var6 == 0 || var7 > 1.0F) {
                  var7 = 1.0F;
               }

               var3 = ((FeatherSourceFile$lh110)this.fS).xR + (int)((1.0F - var7) * (float)(((FeatherSourceFile$lh110)this.fS).xR + 5) * 2.0F);
            }
         }
      }

      this.aA().lh((FeatherSourceFile$lh110)this.fS, 0, 0, var3, var2);
      if (((FeatherSourceFile$lh110)this.fS).xU && ((FeatherSourceFile$lh110)this.fS).xQ != FeatherSourceFile$lh$lh.DEFAULT) {
         this.hv(0, 0);
      }

      FeatherSourceFile843.jz();
      FeatherSourceFile843.nc(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private boolean Z() {
      if (((FeatherSourceFile$lh110)this.fS).kL && this.minecraft.field_71442_b.func_78747_a()) {
         MovingObjectPosition var1 = this.minecraft.field_71476_x;
         if (var1 == null) {
            return false;
         } else {
            if (this.minecraft.field_147125_j == null) {
               if (var1.field_72313_a != MovingObjectType.BLOCK) {
                  return false;
               }

               BlockPos var2 = var1.func_178782_a();
               IBlockState var3 = this.minecraft.field_71441_e.func_180495_p(var2);
               if (!var3.func_177230_c().hasTileEntity(var3) || !(this.minecraft.field_71441_e.func_175625_s(var2) instanceof IInventory)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public int no() {
      return 0;
   }

   public int sv() {
      return 0;
   }

   public void pu() {
      this.xN = null;
   }

   private FeatherSourceFile117 aA() {
      if (this.xN == null) {
         switch (((FeatherSourceFile$lh110)this.fS).xQ) {
            case CROSS:
               this.xN = new FeatherSourceFile604();
               break;
            case CIRCLE:
               this.xN = new FeatherSourceFile257();
               break;
            case SQUARE:
               this.xN = new FeatherSourceFile472();
               break;
            case ARROW:
               this.xN = new FeatherSourceFile507();
               break;
            case DEFAULT:
               this.xN = new FeatherSourceFile175();
               break;
            default:
               throw new IllegalStateException();
         }
      }

      return this.xN;
   }

   private void hv(int var1, int var2) {
      int var3 = ((FeatherSourceFile$lh110)this.fS).xS / 2;
      int var4 = (((FeatherSourceFile$lh110)this.fS).xS + 1) / 2;
      if (((FeatherSourceFile$lh110)this.fS).xX) {
         FeatherSourceFile561.nc(var1 - var3 - ((FeatherSourceFile$lh110)this.fS).kN, var2 - var3 - ((FeatherSourceFile$lh110)this.fS).kN, var1 + var4 + ((FeatherSourceFile$lh110)this.fS).kN, var2 + var4 + ((FeatherSourceFile$lh110)this.fS).kN, ((FeatherSourceFile$lh110)this.fS).xY);
      }

      Color var5 = ((FeatherSourceFile$lh110)this.fS).fZ.on() ? new Color(FeatherSourceFile841.vK().vM(), true) : ((FeatherSourceFile$lh110)this.fS).xV;
      FeatherSourceFile561.nc(var1 - var3, var2 - var3, var1 + var4, var2 + var4, var5);
   }
}
