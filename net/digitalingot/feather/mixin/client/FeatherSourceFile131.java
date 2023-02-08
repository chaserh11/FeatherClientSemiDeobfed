package net.digitalingot.feather.mixin.client;

import java.util.UUID;
import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile486;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetworkPlayerInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({GuiPlayerTabOverlay.class})
public abstract class FeatherSourceFile131 extends Gui {
   @Unique
   private static final FeatherSourceFile465 VD = FeatherSourceFile665.nc(FeatherSourceFile486.class);
   @Unique
   private static UUID VE = null;

   @ModifyArg(
      method = {"renderPlayerlist"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
   ordinal = 1
),
      index = 0,
      require = 1,
      allow = 1
   )
   private NetworkPlayerInfo lh(NetworkPlayerInfo var1) {
      VE = var1.func_178845_a().getId();
      return var1;
   }

   @ModifyVariable(
      method = {"renderPlayerlist"},
      at = @At("STORE"),
      ordinal = 6
   )
   private int cj(int var1) {
      return var1 + 8;
   }

   @ModifyArg(
      method = {"drawScoreboardValues"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawTexturedModalRect(FFIIII)V"
),
      index = 0
   )
   private float nb(float var1) {
      return var1 + 8.0F;
   }

   @ModifyArgs(
      method = {"renderPlayerlist"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"
),
      slice = @Slice(
   from = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;getPlayerName(Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;",
   ordinal = 1
),
   to = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;drawPing(IIILnet/minecraft/client/network/NetworkPlayerInfo;)V"
)
),
      require = 2,
      allow = 2
   )
   private void lh(Args var1) {
      FeatherSourceFile486 var2 = (FeatherSourceFile486)VD.ag();
      if (var2 != null) {
         float var3 = (float)((Float)var1.get(1)).intValue();
         float var4 = (float)((Float)var1.get(2)).intValue();
         int var5 = var2.c().lh(VE, (int)var3, (int)var4);
         if (var5 != 0) {
            var1.set(1, var3 + (float)var5);
         }
      }

   }
}
