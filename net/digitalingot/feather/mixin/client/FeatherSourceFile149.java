package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh46;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile477;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityRenderer.class})
public abstract class FeatherSourceFile149 implements IResourceManagerReloadListener {
   @Unique
   private static final FeatherSourceFile465 Vr = FeatherSourceFile665.nc(FeatherSourceFile477.class);
   @Shadow
   @Final
   private Minecraft field_78531_r;

   @Inject(
      method = {"isDrawBlockOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void nc(CallbackInfoReturnable var1) {
      FeatherSourceFile477 var2 = (FeatherSourceFile477)Vr.ag();
      if (var2.uj() && ((FeatherSourceFile$lh46)var2.pr()).kP) {
         if (this.field_78531_r.func_175606_aa() instanceof EntityPlayer && !this.field_78531_r.field_71474_y.field_74319_N) {
            MovingObjectPosition var3 = this.field_78531_r.field_71476_x;
            MovingObjectType var4 = MovingObjectType.BLOCK;
            if (var3 != null && var3.field_72313_a == var4) {
               var1.setReturnValue(true);
            } else {
               var1.setReturnValue(false);
            }
         } else {
            var1.setReturnValue(false);
         }
      }
   }
}
