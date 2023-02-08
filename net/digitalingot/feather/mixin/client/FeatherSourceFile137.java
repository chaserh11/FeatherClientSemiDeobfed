package net.digitalingot.feather.mixin.client;

import javax.annotation.Nullable;
import net.digitalingot.feather.FeatherSourceFile$lh52;
import net.digitalingot.feather.FeatherSourceFile317;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile802;
import net.digitalingot.feather.FeatherSourceFile804;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({RenderManager.class})
public abstract class FeatherSourceFile137 {
   @Unique
   private static final FeatherSourceFile465 PERFORMANCE = FeatherSourceFile665.nc(net.digitalingot.feather.FeatherSourceFile125.class);
   @Shadow
   private double field_78725_b;
   @Shadow
   private double field_78726_c;
   @Shadow
   private double field_78723_d;

   @Shadow
   @Nullable
   public abstract Render func_78713_a(Entity var1);

   @Inject(
      method = {"renderEntitySimple"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private boolean lh(Entity var1, float var2, CallbackInfoReturnable var3) {
      FeatherSourceFile804 var4 = (FeatherSourceFile804)var1;
      if (!var4.forceVisible() && var4.isCulled()) {
         FeatherSourceFile802.wB();
         if (!((FeatherSourceFile$lh52)((net.digitalingot.feather.FeatherSourceFile125)PERFORMANCE.ag()).pr()).pB) {
            Render var5 = this.func_78713_a(var1);
            if (var5 != null) {
               double var6 = var1.field_70142_S + (var1.field_70165_t - var1.field_70142_S) * (double)var2;
               double var8 = var1.field_70137_T + (var1.field_70163_u - var1.field_70137_T) * (double)var2;
               double var10 = var1.field_70136_U + (var1.field_70161_v - var1.field_70136_U) * (double)var2;
               if (var1 instanceof EntityPlayer && var1.func_70093_af() && !(var1 instanceof EntityPlayerSP)) {
                  var8 -= 0.125;
               }

               ((FeatherSourceFile317)var5).feather$renderName(var1, var6 - this.field_78725_b, var8 - this.field_78726_c, var10 - this.field_78723_d);
            }
         }

         var3.setReturnValue(false);
      }

      return false;
   }
}
