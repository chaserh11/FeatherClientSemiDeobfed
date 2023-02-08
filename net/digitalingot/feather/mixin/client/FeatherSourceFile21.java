package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh80;
import net.digitalingot.feather.FeatherSourceFile233;
import net.digitalingot.feather.FeatherSourceFile304;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderPlayer.class})
public class FeatherSourceFile21 {
   private EntityPlayer WK;
   @Unique
   private static final FeatherSourceFile465 WL = FeatherSourceFile665.nc(FeatherSourceFile304.class);
   @Unique
   private static final FeatherSourceFile465 VZ = FeatherSourceFile665.nc(FeatherSourceFile233.class);

   @Inject(
      method = {"renderOffsetLivingLabel(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;FD)V"},
      at = {@At("HEAD")}
   )
   public void lh(AbstractClientPlayer var1, double var2, double var4, double var6, String var8, float var9, double var10, CallbackInfo var12) {
      this.WK = var1;
   }

   @ModifyVariable(
      method = {"renderOffsetLivingLabel(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;FD)V"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   public String kt(String var1) {
      if (((FeatherSourceFile304)WL.ag()).uj() && ((FeatherSourceFile$lh80)((FeatherSourceFile304)WL.ag()).pr()).nI) {
         int var2 = ((FeatherSourceFile233)VZ.ag()).qy(this.WK);
         if (var2 == 0) {
            return var1;
         } else {
            String var3 = " [" + var2 + " ms]";
            if (var2 > FeatherSourceFile304.nE) {
               var3 = "§c" + var3;
            } else if (var2 > FeatherSourceFile304.nD) {
               var3 = "§e" + var3;
            } else {
               var3 = "§a" + var3;
            }

            return var1 + var3;
         }
      } else {
         return var1;
      }
   }
}
