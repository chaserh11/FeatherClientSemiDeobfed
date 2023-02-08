package net.digitalingot.feather.mixin.client;

import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.FeatherSourceFile$lh119;
import net.digitalingot.feather.FeatherSourceFile$nc54;
import net.digitalingot.feather.FeatherSourceFile572;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.S38PacketPlayerListItem.AddPlayerData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({NetHandlerPlayClient.class})
public abstract class FeatherSourceFile161 implements INetHandlerPlayClient {
   @Redirect(
      method = {"handlePlayerListItem"},
      slice = @Slice(
   from = @At(
   value = "FIELD",
   target = "Lnet/minecraft/network/play/server/S38PacketPlayerListItem$Action;REMOVE_PLAYER:Lnet/minecraft/network/play/server/S38PacketPlayerListItem$Action;",
   ordinal = 0
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/play/server/S38PacketPlayerListItem$AddPlayerData;getProfile()Lcom/mojang/authlib/GameProfile;",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private GameProfile lh(AddPlayerData var1) {
      GameProfile var2 = var1.func_179962_a();
      ((FeatherSourceFile$nc54)FeatherSourceFile572.um.sx()).onRemoved(var2.getId());
      return var2;
   }

   @Redirect(
      method = {"handlePlayerListItem"},
      slice = @Slice(
   from = @At(
   value = "FIELD",
   target = "Lnet/minecraft/network/play/server/S38PacketPlayerListItem$Action;ADD_PLAYER:Lnet/minecraft/network/play/server/S38PacketPlayerListItem$Action;",
   ordinal = 0
)
),
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/network/NetworkPlayerInfo;getGameProfile()Lcom/mojang/authlib/GameProfile;",
   ordinal = 0
),
      require = 1,
      allow = 1
   )
   private GameProfile nc(NetworkPlayerInfo var1) {
      GameProfile var2 = var1.func_178845_a();
      ((FeatherSourceFile$lh119)FeatherSourceFile572.uo.sx()).onAdded(var2);
      return var2;
   }
}
