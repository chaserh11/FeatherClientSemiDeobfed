package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.digitalingot.feather.FeatherSourceFile768;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class FeatherSourceFile13 {
   @Unique
   private static final FeatherSourceFile465 VS = FeatherSourceFile665.nc(FeatherSourceFile768.class);
   @Unique
   private Entity VT = null;
   @Unique
   private float VU;
   @Unique
   private float VV;
   @Unique
   private float VW;
   @Unique
   private float VX;
   @Unique
   private float VY;
   @Shadow
   @Final
   private Minecraft field_78531_r;
   @Shadow
   private float field_78496_H;
   @Shadow
   private float field_78497_I;
   @Shadow
   private float field_78498_J;
   @Shadow
   private float field_78499_K;
   @Shadow
   private float field_78492_L;
   @Shadow
   private boolean field_175078_W;

   @Inject(
      method = {"updateCameraAndRender"},
      at = {@At("HEAD")}
   )
   private void lh(float var1, long var2, CallbackInfo var4) {
      this.VY = var1;
   }

   @Redirect(
      method = {"updateCameraAndRender"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/client/Minecraft;inGameHasFocus:Z",
   opcode = 180,
   ordinal = 0
),
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lorg/lwjgl/input/Mouse;setGrabbed(Z)V",
   remap = false
)
),
      require = 1,
      allow = 1
   )
   private boolean mr(Minecraft var1) {
      boolean var2 = var1.field_71415_G;
      if (var2) {
         FeatherSourceFile768 var3 = (FeatherSourceFile768)VS.ag();
         if (var3.uj() && var3.cy()) {
            this.lh(var3);
            return false;
         }
      }

      return var2;
   }

   @Inject(
      method = {"orientCamera"},
      at = {@At("HEAD")}
   )
   private void km(CallbackInfo var1) {
      FeatherSourceFile768 var2 = (FeatherSourceFile768)VS.ag();
      if (var2.uj() && var2.cy()) {
         Entity var3 = this.field_78531_r.func_175606_aa();
         this.VU = var3.field_70126_B;
         this.VV = var3.field_70177_z;
         this.VW = var3.field_70127_C;
         this.VX = var3.field_70125_A;
         var3.field_70126_B = var3.field_70177_z = var2.fi();
         var3.field_70127_C = var3.field_70125_A = var2.ld();
         this.VT = var3;
      }

   }

   @Inject(
      method = {"orientCamera"},
      at = {@At("RETURN")}
   )
   private void mq(CallbackInfo var1) {
      if (this.VT != null) {
         Entity var2 = this.VT;
         this.VT = null;
         var2.field_70126_B = this.VU;
         var2.field_70177_z = this.VV;
         var2.field_70127_C = this.VW;
         var2.field_70125_A = this.VX;
      }

   }

   @Unique
   private void lh(FeatherSourceFile768 var1) {
      float var2 = this.field_78531_r.field_71474_y.field_74341_c * 0.6F + 0.2F;
      var2 = var2 * var2 * var2 * 8.0F;
      float var3 = (float)Mouse.getDX() * var2;
      float var4 = (float)Mouse.getDY() * var2;
      if (this.field_78531_r.field_71474_y.field_74326_T) {
         this.field_78496_H += var3;
         this.field_78497_I += var4;
         float var5 = this.VY - this.field_78492_L;
         this.field_78492_L = this.VY;
         var3 = this.field_78498_J * var5;
         var4 = this.field_78499_K * var5;
      } else {
         this.field_78496_H = 0.0F;
         this.field_78497_I = 0.0F;
      }

      var1.nc(var3, var4);
      if (Math.abs(var3) + Math.abs(var4) > 10.0F) {
         this.field_78531_r.field_71438_f.func_174979_m();
      }

   }
}
