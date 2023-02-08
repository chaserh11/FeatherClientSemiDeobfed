package net.digitalingot.feather.mixin.client;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.network.play.server.S20PacketEntityProperties;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({NetHandlerPlayClient.class})
public abstract class FeatherSourceFile1 {
   @Shadow
   private WorldClient field_147300_g;
   @Shadow
   private Minecraft field_147299_f;

   @Shadow
   public abstract NetworkPlayerInfo func_175102_a(UUID var1);

   @Inject(
      method = {"handleAnimation"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S0BPacketAnimation var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityTeleport"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S18PacketEntityTeleport var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityMovement"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S14PacketEntity var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityHeadLook"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S19PacketEntityHeadLook var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityProperties"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S20PacketEntityProperties var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityMetadata"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S1CPacketEntityMetadata var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleEntityEquipment"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S04PacketEntityEquipment var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleDestroyEntities"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S13PacketDestroyEntities var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleScoreboardObjective"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S3BPacketScoreboardObjective var1, CallbackInfo var2) {
      this.ep(var2);
   }

   @Inject(
      method = {"handleConfirmTransaction"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/play/server/S32PacketConfirmTransaction;getWindowId()I",
   ordinal = 0
)},
      cancellable = true,
      locals = LocalCapture.CAPTURE_FAILEXCEPTION
   )
   private void lh(S32PacketConfirmTransaction var1, CallbackInfo var2, Container var3, EntityPlayer var4) {
      this.lh((Object)var4, var2);
   }

   @Inject(
      method = {"handleSoundEffect"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S29PacketSoundEffect var1, CallbackInfo var2) {
      this.lh((Object)this.field_147299_f.field_71441_e, var2);
   }

   @Inject(
      method = {"handleTimeUpdate"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S03PacketTimeUpdate var1, CallbackInfo var2) {
      this.lh((Object)this.field_147299_f.field_71441_e, var2);
   }

   @Inject(
      method = {"handleSpawnPlayer"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void lh(S0CPacketSpawnPlayer var1, CallbackInfo var2) {
      this.lh((Object)this.field_147299_f.field_71441_e, var2);
      this.lh((Object)this.func_175102_a(var1.func_179819_c()), var2);
   }

   private void ep(CallbackInfo var1) {
      this.lh((Object)this.field_147300_g, var1);
   }

   private void lh(Object var1, CallbackInfo var2) {
      if (var1 == null) {
         var2.cancel();
      }

   }
}
