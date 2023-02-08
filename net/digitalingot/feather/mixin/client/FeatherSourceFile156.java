package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayer.class})
public abstract class FeatherSourceFile156 extends EntityLivingBase {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);
   @Unique
   private static final float Wt = 1.62F;
   @Unique
   private static final float Wu = 1.54F;
   @Unique
   private static final int Wv = 16;
   @Unique
   private float Ww = 1.62F;
   @Unique
   private long Wx = System.currentTimeMillis();

   public FeatherSourceFile156(World var1) {
      super(var1);
   }

   @Inject(
      method = {"getEyeHeight()F"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void qy(CallbackInfoReturnable var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      if (var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).jW) {
         var1.setReturnValue(this.Ar());
      }

   }

   @Unique
   private float Ar() {
      long var1;
      long var3;
      if (this.func_70093_af()) {
         if (this.Ww > 1.54F) {
            var1 = System.currentTimeMillis();
            var3 = var1 - this.Wx;
            if (var3 > 16L) {
               this.Ww -= 0.012F;
               this.Wx = var1;
            }
         }
      } else if (this.Ww < 1.62F && this.Ww > 0.2F) {
         var1 = System.currentTimeMillis();
         var3 = var1 - this.Wx;
         if (var3 > 16L) {
            this.Ww += 0.012F;
            this.Wx = var1;
         }
      } else {
         this.Ww = 1.62F;
      }

      if (this.func_70608_bn()) {
         this.Ww = 0.2F;
      }

      return this.Ww;
   }
}
