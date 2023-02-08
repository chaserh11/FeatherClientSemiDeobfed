package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LayerHeldItem.class})
public abstract class FeatherSourceFile16 implements LayerRenderer {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);
   @Shadow
   @Final
   private RendererLivingEntity field_177206_a;

   @Redirect(
      method = {"doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/model/ModelBiped;postRenderArm(F)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void lh(ModelBiped var1, float var2) {
   }

   @Redirect(
      method = {"doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V",
   ordinal = 1
),
      require = 1,
      allow = 1
   )
   private void hb(float var1, float var2, float var3) {
   }

   @Inject(
      method = {"doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V",
   ordinal = 1,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void lh(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, CallbackInfo var9) {
      if (!(var1 instanceof EntityPlayer)) {
         ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625F);
         GlStateManager.func_179109_b(-0.0625F, 0.4375F, 0.0625F);
      } else {
         FeatherSourceFile515 var10 = (FeatherSourceFile515)Ws.ag();
         boolean var11 = var10.uj();
         if (var11 && ((FeatherSourceFile$lh12)var10.pr()).jY) {
            if (((EntityPlayer)var1).func_70632_aY()) {
               if (var1.func_70093_af()) {
                  ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0325F);
                  GlStateManager.func_179152_a(1.05F, 1.05F, 1.05F);
                  GlStateManager.func_179109_b(-0.58F, 0.32F, -0.07F);
                  GlStateManager.func_179114_b(-24405.0F, 137290.0F, -2009900.0F, -2654900.0F);
               } else {
                  ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0325F);
                  GlStateManager.func_179152_a(1.05F, 1.05F, 1.05F);
                  GlStateManager.func_179109_b(-0.45F, 0.25F, -0.07F);
                  GlStateManager.func_179114_b(-24405.0F, 137290.0F, -2009900.0F, -2654900.0F);
               }
            } else {
               ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625F);
            }
         } else {
            ((ModelBiped)this.field_177206_a.func_177087_b()).func_178718_a(0.0625F);
         }

         if (var11 && ((FeatherSourceFile$lh12)var10.pr()).jZ) {
            boolean var12 = ((EntityPlayer)var1).func_70632_aY();
            boolean var13 = var1.func_70093_af();
            if (!var12 && !var13) {
               GlStateManager.func_179109_b(-0.0855F, 0.4775F, 0.1585F);
               GlStateManager.func_179114_b(-19.0F, 20.0F, 0.0F, -6.0F);
            } else if (var13 && !var12) {
               GlStateManager.func_179109_b(-0.0525F, 0.32F, 0.0725F);
               GlStateManager.func_179114_b(16.0F, -8.0F, 0.0F, 5.0F);
               GlStateManager.func_179109_b(0.0F, 0.1F, 0.09523F);
            } else {
               GlStateManager.func_179109_b(-0.0625F, 0.4375F, 0.0625F);
            }
         } else {
            GlStateManager.func_179109_b(-0.0625F, 0.4375F, 0.0625F);
         }

      }
   }
}
