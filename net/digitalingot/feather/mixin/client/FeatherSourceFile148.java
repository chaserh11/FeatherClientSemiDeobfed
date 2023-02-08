package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh88;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile701;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderItem.class})
public abstract class FeatherSourceFile148 implements IResourceManagerReloadListener {
   @Unique
   private static final FeatherSourceFile465 WE = FeatherSourceFile665.nc(FeatherSourceFile701.class);
   @Unique
   private ItemStack WG = null;
   @Unique
   private int effectRenderColor;
   @Unique
   private boolean WH;

   @Shadow
   public abstract void func_180454_a(ItemStack var1, IBakedModel var2);

   @Inject(
      method = {"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void lh(ItemStack var1, IBakedModel var2, CallbackInfo var3) {
      this.WG = var1;
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void nc(ItemStack var1, IBakedModel var2, CallbackInfo var3) {
      this.WG = null;
   }

   @Redirect(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;depthMask(Z)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void jr(boolean var1) {
   }

   @Redirect(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;depthFunc(I)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void zl(int var1) {
   }

   @Inject(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableLighting()V",
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void lh(IBakedModel var1, CallbackInfo var2) {
      FeatherSourceFile701 var3 = (FeatherSourceFile701)WE.ag();
      if (var3 != null) {
         if (!var3.ou(this.WG)) {
            GlStateManager.func_179132_a(false);
            GlStateManager.func_179143_c(514);
         }

         this.effectRenderColor = var3.uj() ? var3.oe(this.WG) : -8372020;
      }
   }

   @ModifyArg(
      method = {"renderEffect(Lnet/minecraft/client/resources/model/IBakedModel;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderModel(Lnet/minecraft/client/resources/model/IBakedModel;I)V"
),
      require = 2,
      allow = 2,
      index = 1
   )
   private int an(int var1) {
      return this.effectRenderColor;
   }

   @Inject(
      method = {"renderItemModelTransform(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0,
   shift = Shift.BEFORE
)},
      require = 1,
      allow = 1
   )
   private void lh(ItemStack var1, IBakedModel var2, TransformType var3, CallbackInfo var4) {
      FeatherSourceFile701 var5 = (FeatherSourceFile701)WE.ag();
      if (var5 != null) {
         FeatherSourceFile$lh88 var6 = (FeatherSourceFile$lh88)var5.pr();
         this.WH = var6.yD;
         var6.yD = false;
      }
   }

   @Inject(
      method = {"renderItemModelTransform(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/entity/RenderItem;renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V",
   ordinal = 0,
   shift = Shift.AFTER
)},
      require = 1,
      allow = 1
   )
   private void nc(ItemStack var1, IBakedModel var2, TransformType var3, CallbackInfo var4) {
      FeatherSourceFile701 var5 = (FeatherSourceFile701)WE.ag();
      if (var5 != null) {
         FeatherSourceFile$lh88 var6 = (FeatherSourceFile$lh88)var5.pr();
         var6.yD = this.WH;
      }
   }
}
