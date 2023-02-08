package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile287;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MovementInputFromOptions.class})
public abstract class FeatherSourceFile70 extends MovementInput {
   @Unique
   private static final FeatherSourceFile465 WQ = FeatherSourceFile665.nc(FeatherSourceFile287.class);
   @Unique
   private static final Minecraft minecraft = Minecraft.func_71410_x();

   @Inject(
      method = {"updatePlayerMoveState"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/util/MovementInputFromOptions;sneak:Z",
   shift = Shift.AFTER,
   opcode = 181,
   ordinal = 0
)},
      require = 1,
      allow = 1
   )
   private void et(CallbackInfo var1) {
      FeatherSourceFile287 var2 = (FeatherSourceFile287)WQ.ag();
      if (var2 != null) {
         if (minecraft.field_71439_g.field_71075_bZ.field_75100_b) {
            var2.qn(false);
         }

         this.field_78899_d |= var2.cI();
      }

      if (this.field_78899_d) {
         minecraft.field_71439_g.func_70031_b(false);
      }

   }
}
