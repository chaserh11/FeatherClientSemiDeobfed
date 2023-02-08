package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh80;
import net.digitalingot.feather.FeatherSourceFile233;
import net.digitalingot.feather.FeatherSourceFile304;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RendererLivingEntity.class})
public abstract class FeatherSourceFile18 extends Render {
   private EntityPlayer WK;
   @Unique
   private static final FeatherSourceFile465 VZ = FeatherSourceFile665.nc(FeatherSourceFile233.class);
   @Unique
   private static final FeatherSourceFile465 WL = FeatherSourceFile665.nc(FeatherSourceFile304.class);

   protected FeatherSourceFile18(RenderManager var1) {
      super(var1);
   }

   @Inject(
      method = {"canRenderName(Lnet/minecraft/entity/EntityLivingBase;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(EntityLivingBase var1, CallbackInfoReturnable var2) {
      FeatherSourceFile304 var3 = (FeatherSourceFile304)WL.ag();
      if (((FeatherSourceFile$lh80)var3.pr()).nG) {
         Minecraft var4 = Minecraft.func_71410_x();
         if (var1 == var4.field_71439_g && var1 == this.field_76990_c.field_78734_h && !var1.func_82150_aj()) {
            var2.setReturnValue(true);
         }
      }

   }

   @Inject(
      method = {"renderName(Lnet/minecraft/entity/EntityLivingBase;DDD)V"},
      at = {@At("HEAD")}
   )
   public void qy(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      if (var1 instanceof EntityPlayer) {
         this.WK = (EntityPlayer)var1;
      }

   }
}
