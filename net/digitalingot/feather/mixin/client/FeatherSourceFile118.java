package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.FeatherSourceFile287;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({EntityPlayerSP.class})
public class FeatherSourceFile118 extends AbstractClientPlayer {
   @Unique
   private static final FeatherSourceFile465 WQ = FeatherSourceFile665.nc(FeatherSourceFile287.class);

   public FeatherSourceFile118(World var1, GameProfile var2) {
      super(var1, var2);
   }

   @ModifyVariable(
      method = {"onLivingUpdate()V"},
      at = @At(
   value = "STORE",
   ordinal = 0,
   opcode = 54
),
      ordinal = 3
   )
   private boolean rt(boolean var1) {
      if ((float)this.func_71024_bL().func_75116_a() > 6.0F && !this.field_71075_bZ.field_75100_b) {
         return true;
      } else {
         FeatherSourceFile287 var2 = (FeatherSourceFile287)WQ.ag();
         if (!this.field_71075_bZ.field_75101_c) {
            return false;
         } else {
            return var2 == null || var2.cJ();
         }
      }
   }

   @Redirect(
      method = {"onLivingUpdate()V"},
      slice = @Slice(
   from = @At(
   value = "CONSTANT",
   opcode = 16,
   args = {"intValue=7"}
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z"
)
   )
   private boolean xj(KeyBinding var1) {
      if (var1.func_151470_d()) {
         return true;
      } else {
         FeatherSourceFile287 var2 = (FeatherSourceFile287)WQ.ag();
         return var2 != null && var2.cH();
      }
   }

   @Redirect(
      method = {"onLivingUpdate()V"},
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;isCurrentViewEntity()Z"
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;isRidingHorse()Z"
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/entity/player/PlayerCapabilities;getFlySpeed()F",
   opcode = 180
),
      allow = 2
   )
   private float nc(PlayerCapabilities var1) {
      FeatherSourceFile287 var2 = (FeatherSourceFile287)WQ.ag();
      return var2 == null ? var1.func_75093_a() : 0.05F * (var2.cK() ? (float)var2.cL() : 1.0F);
   }
}
