package net.digitalingot.feather;

import java.awt.Color;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.HITBOX,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.hitbox",
   jl = "https://assets.feathercdn.net/game/mods/hitbox.svg",
   od = "feather.moduledescription.hitbox",
   wr = {}
)
)
public class FeatherSourceFile641 extends FeatherSourceFile495 {
   public void ex() {
      FeatherSourceFile798.je.oe((var1, var2, var4, var6) -> {
         if (this.uj()) {
            if (!var1.func_82150_aj()) {
               Color var8 = this.ou(var1);
               if (var8 != null) {
                  FeatherSourceFile843.ck(false);
                  FeatherSourceFile843.hO();
                  FeatherSourceFile843.hH();
                  FeatherSourceFile843.hM();
                  FeatherSourceFile843.jz();
                  AxisAlignedBB var9 = var1.func_174813_aQ();
                  AxisAlignedBB var10 = new AxisAlignedBB(var9.field_72340_a - var1.field_70165_t + var2, var9.field_72338_b - var1.field_70163_u + var4, var9.field_72339_c - var1.field_70161_v + var6, var9.field_72336_d - var1.field_70165_t + var2, var9.field_72337_e - var1.field_70163_u + var4, var9.field_72334_f - var1.field_70161_v + var6);
                  int var11 = var8.getRed();
                  int var12 = var8.getGreen();
                  int var13 = var8.getBlue();
                  int var14 = var8.getAlpha();
                  RenderGlobal.func_181563_a(var10, var11, var12, var13, var14);
                  FeatherSourceFile843.hP();
                  FeatherSourceFile843.hG();
                  FeatherSourceFile843.hN();
                  FeatherSourceFile843.jz();
                  FeatherSourceFile843.ck(true);
               }
            }
         }
      });
   }

   private Color ou(Entity var1) {
      boolean var2 = var1 instanceof IProjectile;
      FeatherSourceFile225 var3;
      if (var2) {
         var3 = ((FeatherSourceFile$lh22)this.fS).mU ? ((FeatherSourceFile$lh22)this.fS).mV : null;
      } else if (var1 instanceof EntityItem) {
         var3 = ((FeatherSourceFile$lh22)this.fS).mX ? ((FeatherSourceFile$lh22)this.fS).mY : null;
      } else if (var1 instanceof EntityAnimal) {
         var3 = ((FeatherSourceFile$lh22)this.fS).mR ? ((FeatherSourceFile$lh22)this.fS).mS : null;
      } else if (var1 instanceof EntityMob) {
         var3 = ((FeatherSourceFile$lh22)this.fS).mO ? ((FeatherSourceFile$lh22)this.fS).mP : null;
      } else if (var1 instanceof EntityPlayer) {
         var3 = ((FeatherSourceFile$lh22)this.fS).mL ? ((FeatherSourceFile$lh22)this.fS).mM : null;
      } else {
         var3 = ((FeatherSourceFile$lh22)this.fS).mJ;
      }

      if (var3 == null) {
         return null;
      } else {
         return var3.on() ? new Color(FeatherSourceFile841.vK().vM()) : var3.dm();
      }
   }
}
