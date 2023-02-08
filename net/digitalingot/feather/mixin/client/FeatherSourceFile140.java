package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile$lh12;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile515;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public class FeatherSourceFile140 {
   @Unique
   private static final FeatherSourceFile465 Ws = FeatherSourceFile665.nc(FeatherSourceFile515.class);
   @Unique
   private static final int Wy = 6;

   @Unique
   private static void As() {
      Minecraft var0 = Minecraft.func_71410_x();
      EntityPlayerSP var1 = var0.field_71439_g;
      if (var1.func_71052_bv() != 0) {
         GameSettings var2 = var0.field_71474_y;
         if (var2.field_74312_F.func_151470_d() && var2.field_74313_G.func_151470_d()) {
            MovingObjectPosition var3 = var0.field_71476_x;
            if (var3 != null && var3.field_72313_a == MovingObjectType.BLOCK) {
               xj(var1);
            }
         }
      }

   }

   @Unique
   private static void xj(EntityLivingBase var0) {
      if (!var0.field_82175_bq || var0.field_110158_av >= oe(var0) / 2 || var0.field_110158_av < 0) {
         var0.field_110158_av = -1;
         var0.field_82175_bq = true;
      }

   }

   @Unique
   private static int oe(EntityLivingBase var0) {
      int var1 = 6;
      PotionEffect var2 = var0.func_70660_b(Potion.field_76422_e);
      if (var2 != null) {
         var1 -= var2.func_76458_c() + 1;
      }

      PotionEffect var3 = var0.func_70660_b(Potion.field_76419_f);
      if (var3 != null) {
         var1 += (var3.func_76458_c() + 1) * 2;
      }

      return var1;
   }

   @Inject(
      method = {"renderWorldPass(IFJ)V"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void eg(CallbackInfo var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      if (var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).jS) {
         As();
      }

   }

   @Inject(
      method = {"renderWorldDirections(F)V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1,
      allow = 1
   )
   private void oy(CallbackInfo var1) {
      FeatherSourceFile515 var2 = (FeatherSourceFile515)Ws.ag();
      if (var2.uj() && ((FeatherSourceFile$lh12)var2.pr()).kD) {
         var1.cancel();
      }

   }
}
