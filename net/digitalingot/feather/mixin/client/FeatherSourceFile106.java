package net.digitalingot.feather.mixin.client;

import java.util.Random;
import net.digitalingot.feather.FeatherSourceFile$lh45;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile710;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.util.vector.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderEntityItem.class})
public abstract class FeatherSourceFile106 extends Render {
   @Unique
   private static final FeatherSourceFile465 WI = FeatherSourceFile665.nc(FeatherSourceFile710.class);
   @Shadow
   @Final
   private RenderItem field_177080_a;
   @Shadow
   private Random field_177079_e;

   protected FeatherSourceFile106(RenderManager var1) {
      super(var1);
   }

   @Shadow
   protected abstract int func_177078_a(ItemStack var1);

   @Inject(
      method = {"doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void lh(EntityItem var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      FeatherSourceFile710 var11 = (FeatherSourceFile710)WI.ag();
      if (var11.uj()) {
         var10.cancel();
         ItemStack var12 = var1.func_92059_d();
         if (var12 != null) {
            Item var13 = var12.func_77973_b();
            if (var13 != null) {
               int var14 = Item.func_150891_b(var13) + var12.func_77952_i();
               this.field_177079_e.setSeed((long)var14);
               boolean var15 = false;
               if (this.func_180548_c(var1)) {
                  this.field_76990_c.field_78724_e.func_110581_b(this.func_110775_a(var1)).func_174936_b(false, false);
                  var15 = true;
               }

               GlStateManager.func_179091_B();
               GlStateManager.func_179092_a(516, 0.1F);
               GlStateManager.func_179147_l();
               RenderHelper.func_74519_b();
               GlStateManager.func_179120_a(770, 771, 1, 0);
               GlStateManager.func_179094_E();
               IBakedModel var16 = this.field_177080_a.func_175037_a().func_178089_a(var12);
               boolean var17 = var16.func_177556_c();
               GlStateManager.func_179109_b((float)var2, (float)var4, (float)var6);
               if (var17) {
                  GlStateManager.func_179139_a(0.5, 0.5, 0.5);
               }

               GlStateManager.func_179114_b(90.01167F, 1.0F, 0.0F, 0.0F);
               GlStateManager.func_179114_b(var1.field_70177_z, 0.0F, 0.0F, 1.0F);
               if (var17) {
                  GlStateManager.func_179137_b(0.0, 0.0, -0.08);
               } else {
                  GlStateManager.func_179137_b(0.0, 0.0, -0.04);
               }

               if (!var1.field_70122_E && !var1.func_70090_H()) {
                  float var18 = ((float)var1.func_174872_o() + var9) / 20.0F + var1.func_70047_e();
                  var18 *= (float)((FeatherSourceFile$lh45)var11.pr()).Ir / 10.0F;
                  var1.field_70177_z += var18;
                  GlStateManager.func_179114_b(var1.field_70177_z, 0.0F, 0.0F, 1.0F);
               }

               Vector3f var27 = var16.func_177552_f().func_181688_b(TransformType.GROUND).field_178363_d;
               float var19 = var27.x;
               float var20 = var27.y;
               float var21 = var27.z;
               int var22 = this.func_177078_a(var12);
               float var24;
               float var25;
               if (!var17) {
                  float var23 = -0.0F * (float)var22 * 0.5F * var19;
                  var24 = -0.0F * (float)var22 * 0.5F * var20;
                  var25 = -0.09375F * (float)var22 * 0.5F * var21;
                  GlStateManager.func_179109_b(var23, var24, var25);
               }

               for(int var28 = 0; var28 < var22; ++var28) {
                  GlStateManager.func_179094_E();
                  if (var28 > 0) {
                     if (var17) {
                        var24 = (this.field_177079_e.nextFloat() * 2.0F - 1.0F) * 0.15F;
                        var25 = (this.field_177079_e.nextFloat() * 2.0F - 1.0F) * 0.15F;
                        float var26 = (this.field_177079_e.nextFloat() * 2.0F - 1.0F) * 0.15F;
                        GlStateManager.func_179109_b(var24, var25, var26);
                     } else {
                        var24 = (this.field_177079_e.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
                        var25 = (this.field_177079_e.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
                        GlStateManager.func_179137_b((double)var24, (double)var25, 0.0);
                        GlStateManager.func_179114_b(this.field_177079_e.nextFloat(), 0.0F, 0.0F, 1.0F);
                     }
                  }

                  var16 = ForgeHooksClient.handleCameraTransforms(var16, TransformType.GROUND);
                  this.field_177080_a.func_180454_a(var12, var16);
                  GlStateManager.func_179121_F();
                  if (!var17) {
                     GlStateManager.func_179109_b(0.0F * var19, 0.0F * var20, 0.0625F * var21);
                  }
               }

               GlStateManager.func_179121_F();
               GlStateManager.func_179101_C();
               GlStateManager.func_179084_k();
               this.func_180548_c(var1);
               if (var15) {
                  this.field_76990_c.field_78724_e.func_110581_b(this.func_110775_a(var1)).func_174935_a();
               }

               super.func_76986_a(var1, var2, var4, var6, var8, var9);
            }
         }
      }
   }
}
