package net.digitalingot.feather.mixin.client;

import net.digitalingot.feather.FeatherSourceFile465;
import net.digitalingot.feather.FeatherSourceFile649;
import net.digitalingot.feather.FeatherSourceFile665;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.network.play.server.S3EPacketTeams;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetHandlerPlayClient.class})
public abstract class FeatherSourceFile111 implements INetHandlerPlayClient {
   @Unique
   private static final FeatherSourceFile465 WO = FeatherSourceFile665.nc(FeatherSourceFile649.class);

   @Inject(
      method = {"handleScoreboardObjective"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void nc(S3BPacketScoreboardObjective var1, CallbackInfo var2) {
      int var3 = var1.func_149338_e();
      if (var3 != 0) {
         FeatherSourceFile649 var4 = (FeatherSourceFile649)WO.ag();
         if (var4.uj()) {
            var4.bZ();
         }
      }

   }

   @Inject(
      method = {"handleUpdateScore"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void lh(S3CPacketUpdateScore var1, CallbackInfo var2) {
      FeatherSourceFile649 var3 = (FeatherSourceFile649)WO.ag();
      if (var3.uj()) {
         var3.bZ();
      }

   }

   @Inject(
      method = {"handleDisplayScoreboard"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void lh(S3DPacketDisplayScoreboard var1, CallbackInfo var2) {
      int var3 = var1.func_149371_c();
      if (var3 == 1 || var3 >= 3) {
         FeatherSourceFile649 var4 = (FeatherSourceFile649)WO.ag();
         if (var4.uj()) {
            var4.bZ();
         }
      }

   }

   @Inject(
      method = {"handleTeams"},
      at = {@At("TAIL")},
      require = 1,
      allow = 1
   )
   private void lh(S3EPacketTeams var1, CallbackInfo var2) {
      FeatherSourceFile649 var3 = (FeatherSourceFile649)WO.ag();
      if (var3.uj()) {
         var3.bZ();
      }

   }
}
