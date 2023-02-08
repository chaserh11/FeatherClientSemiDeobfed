package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile701;
import net.digitalingot.feather.FeatherSourceFile742;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({LayerArmorBase.class})
public abstract class FeatherSourceFile8 implements LayerRenderer {
   @Unique
   private static final FeatherSourceFile465 WE = FeatherSourceFile665.nc(FeatherSourceFile701.class);
   @Unique
   private ItemStack WF = null;

   @ModifyArgs(
      method = {"renderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFI)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/item/ItemArmor;getColor(Lnet/minecraft/item/ItemStack;)I",
   ordinal = 0
),
      allow = 1
   )
   private void xj(Args var1) {
      this.WF = (ItemStack)var1.get(FeatherSourceFile742.nw() ? 1 : 0);
   }

   @ModifyArgs(
      method = {"renderGlint"},
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;disableLighting()V",
   ordinal = 0
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private void oe(Args var1) {
      FeatherSourceFile701 var2 = (FeatherSourceFile701)WE.ag();
      if (var2 != null && var2.uj()) {
         int var3 = var2.oe(this.WF);
         var1.set(0, (float)(var3 >> 16 & 255) / 255.0F);
         var1.set(1, (float)(var3 >> 8 & 255) / 255.0F);
         var1.set(2, (float)(var3 & 255) / 255.0F);
         var1.set(3, (float)(var3 >> 24 & 255) / 255.0F);
      }

   }
}
